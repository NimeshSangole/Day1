package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.Twowheeler;

public class Vehicle {
	public void vehicleNecessery() {
		System.out.println("eriksha");
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.vehicleNecessery();

		Twowheeler t = new Twowheeler();
		t.bike();
		t.cycle();

		ThreeWheeler d = new ThreeWheeler();
		d.auto();

		FourWheeler f = new FourWheeler();
		f.car();
		f.bus();
		f.lorry();

	}

}
