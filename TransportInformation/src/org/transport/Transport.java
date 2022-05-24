package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
	public void transport() {
		System.out.println("vegitable");
	}

	public static void main(String[] args) {
		Transport t = new Transport();
		t.transport();

		Road r = new Road();
		r.bike();
		r.cycle();
		r.car();
		r.bus();

		Air a = new Air();
		a.aeroPlane();
		a.helicopter();

		Water w = new Water();
		w.boat();
		w.ship();

	}

}
