package com.joepher.bdlocation;

import android.app.Application;
import android.content.Context;
import android.widget.TextView;

import com.baidu.location.BDLocation;
import com.baidu.location.BDLocationListener;
import com.baidu.location.LocationClient;
import com.joepher.entity.LocationData;
import com.joepher.executor.LocationDataExecutor;

import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * Created by Joepher on 2015/5/7.
 */
public class BDLocationApplication extends Application {
	public LocationClient locationClient;
	public BDLocationListener locationListener;
	private LocationDataExecutor locationDataExecutor;
	private LocationData locationData;

	public TextView locData;

	@Override
	public void onCreate() {
		super.onCreate();

		Context context = this.getApplicationContext();

		locationClient = new LocationClient(context);
		locationListener = new MyLocationListener();
		locationClient.registerLocationListener(locationListener);

		locationDataExecutor = new LocationDataExecutor(context);
		new Thread(locationDataExecutor).start();

		locationData = new LocationData();
	}

	public class MyLocationListener implements BDLocationListener {
		@Override
		public void onReceiveLocation(BDLocation bdLocation) {
			if (bdLocation == null) {
				locData.setText("not received location data");
				return;
			}

			String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime());
			//locationData.setTimeline(bdLocation.getTime());
			locationData.setTimeline(time);
			locationData.setLatitude(bdLocation.getLatitude() + "");
			locationData.setLongitude(bdLocation.getLongitude() + "");
			locationData.setAltitude(bdLocation.getAltitude() + "");
			locationData.setAccuracy(bdLocation.getRadius() + "");
			locationData.setSpeed(bdLocation.getSpeed() + "");
			locationData.setBearing(bdLocation.getDirection() + "");
			locationData.setAddress(bdLocation.getAddrStr());

			locData.setText(locationData.toString());

			locationDataExecutor.addLocationdata(locationData);
		}
	}
}
