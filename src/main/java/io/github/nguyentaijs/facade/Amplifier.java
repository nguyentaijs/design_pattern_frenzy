package io.github.nguyentaijs.facade;

public class Amplifier {
	private Tunner tunner;
	private DvdPlayer dvdPlayer;
	private CdPlayer cdPlayer;
	private int volume = 0;

	public void on() {
		System.out.println("Amplifier turned on");
	}

	public void off() {
		System.out.println("Amplifier turned off");
	}

	public void setCD(CdPlayer cd) {
		this.cdPlayer = cd;
	}

	public void setDVD(DvdPlayer dv) {
		this.dvdPlayer = dv;
	}

	public void setTunner(Tunner tunner) {
		this.tunner = tunner;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
}
