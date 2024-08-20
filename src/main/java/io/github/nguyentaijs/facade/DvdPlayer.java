package io.github.nguyentaijs.facade;

public class DvdPlayer {
	public void on() {
		System.out.println("DVD Player turned on");
	}
	public void off() {
		System.out.println("DVD Player turned off");
	}

	public void eject() {
		System.out.println("DVD Player ejected");
	}

	public void pause() {
		System.out.println("DVD Player paused");
	}

	public void play(String movie) {
		System.out.println("DVD Player playing " + movie);
	}

	public void stop() {
		System.out.println("DVD Player stoped");
	}
}
