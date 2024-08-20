package io.github.nguyentaijs.command.receiver;

public class Light implements Receiver {

	private String location;

	public Light() {
		this.location = "no where";
	}

	public Light(String location) {
		this.location = location;
	}

	public void on() {
		System.out.println("The light at " + location + " is on");
	}

	public void off() {
		System.out.println("The light at " + location + " is off");
	}
}
