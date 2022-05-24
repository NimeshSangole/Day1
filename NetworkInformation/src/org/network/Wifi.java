package org.network;

class Wifi {
	public void wifiName() {
		System.out.println("airtel");
	}

	public static void main(String[] args) {
		Wifi w = new Wifi();
		w.wifiName();

		MobileData m = new MobileData();
		m.dataName();

		Lan l = new Lan();
		l.lanName();

		Wireless r = new Wireless();
		r.modamName();

	}

}
