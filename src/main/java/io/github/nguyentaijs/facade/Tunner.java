package io.github.nguyentaijs.facade;

public class Tunner {
	private Amplifier amplifier;
	private int am = 0;
	private int fm = 0;
	private int frequency = 0;

	public void on() {
		System.out.println("Tunner turned on");
	}
	public void off() {
		System.out.println("Tunner turned off");
	}

	public void setAm(int am) {
		this.am = am;
		System.out.println("Tunner set Am = " + am);
	}

	public void setFm(int fm) {
		this.fm = fm;
		System.out.println("Tunner set Fm = " + fm);
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
		System.out.println("Tunner set frequency = " + frequency);
	}
}
