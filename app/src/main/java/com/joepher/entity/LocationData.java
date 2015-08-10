package com.joepher.entity;

import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

import java.util.Hashtable;
/**
 * Created by Joepher on 2015/5/11.
 */
public class LocationData implements KvmSerializable {
	private String timeline;
	private String latitude;
	private String longitude;
	private String altitude;
	private String accuracy;
	private String speed;
	private String bearing;
	private String address;

	public LocationData() {
		this.timeline = "";
		this.latitude = "";
		this.longitude = "";
		this.altitude = "";
		this.accuracy = "";
		this.speed = "";
		this.bearing = "";
		this.address = "";
	}

	public String getTimeline() {
		return timeline;
	}

	public void setTimeline(String timeline) {
		this.timeline = timeline;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public String getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(String accuracy) {
		this.accuracy = accuracy;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getBearing() {
		return bearing;
	}

	public void setBearing(String bearing) {
		this.bearing = bearing;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "LocationData{" +
				"\ntimeline='" + timeline + '\'' +
				", \nlatitude='" + latitude + '\'' +
				", \nlongitude='" + longitude + '\'' +
				", \naltitude='" + altitude + '\'' +
				", \naccuracy='" + accuracy + '\'' +
				", \nspeed='" + speed + '\'' +
				", \nbearing='" + bearing + '\'' +
				", \naddress='" + address + '\'' +
				"\n}";
	}

	@Override
	public Object getProperty(int i) {
		if (i == 0) {
			return getTimeline();
		} else if (i == 1) {
			return getLatitude();
		} else if (i == 2) {
			return getLongitude();
		} else if (i == 3) {
			return getAltitude();
		} else if (i == 4) {
			return getAccuracy();
		} else if (i == 5) {
			return getSpeed();
		} else if (i == 6) {
			return getBearing();
		} else if (i == 7) {
			return getAddress();
		} else {
			return null;
		}
	}

	@Override
	public int getPropertyCount() {
		return 8;
	}

	@Override
	public void setProperty(int i, Object o) {
		if (i == 0) {
			setTimeline((String) o);
		} else if (i == 1) {
			setLatitude((String) o);
		} else if (i == 2) {
			setLongitude((String) o);
		} else if (i == 3) {
			setAltitude((String) o);
		} else if (i == 4) {
			setAccuracy((String) o);
		} else if (i == 5) {
			setSpeed((String) o);
		} else if (i == 6) {
			setBearing((String) o);
		} else if (i == 7) {
			setAddress((String) o);
		}
	}

	@Override
	public void getPropertyInfo(int i, Hashtable hashtable, PropertyInfo propertyInfo) {
		if (i == 0) {
			propertyInfo.name = "timeline";
		} else if (i == 1) {
			propertyInfo.name = "latitude";
		} else if (i == 2) {
			propertyInfo.name = "longitude";
		} else if (i == 3) {
			propertyInfo.name = "altitude";
		} else if (i == 4) {
			propertyInfo.name = "accuracy";
		} else if (i == 5) {
			propertyInfo.name = "speed";
		} else if (i == 6) {
			propertyInfo.name = "bearing";
		} else if (i == 7) {
			propertyInfo.name = "address";
		} else {
			return;
		}

		propertyInfo.type = String.class;
	}
}
