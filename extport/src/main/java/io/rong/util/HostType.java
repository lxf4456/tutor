package io.rong.util;

public enum HostType {

	// Currently use public rong cloud
	// after private im setup finished replace the url
	API("http://im-api.oilup.com:81"), SMS("http://api.sms.ronghub.com");
	private String type;

	private HostType(String type) {
		this.type = type;
	}

	public static HostType getType(String state) {
		for (HostType deviceType : HostType.values()) {
			if (deviceType.type.equalsIgnoreCase(state)) {
				return deviceType;
			}
		}
		throw new RuntimeException(state + " is not a valid Host Type!");
	}

	public String getStrType() {
		return type;
	}
}