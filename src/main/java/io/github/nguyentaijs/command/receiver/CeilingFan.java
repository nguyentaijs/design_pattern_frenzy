package io.github.nguyentaijs.command.receiver;

public class CeilingFan implements Receiver {

	private static final int MAX_SPEED = 5;
	private static final int MIN_SPEED = 1;
	private int currentSpeed = 0;

	public void high() {
		if (currentSpeed < MAX_SPEED) {
			System.out.println("Ceiling Fan Speed + 1 = " + ++currentSpeed);
		} else {
			System.out.println("Ceiling fan Speed reaches max = " + currentSpeed);
		}
	}

	public void low() {
		if (currentSpeed > MIN_SPEED) {
			System.out.println("Ceiling fan Speed - 1 = " + --currentSpeed);
		} else if (currentSpeed == MIN_SPEED) {
			currentSpeed --;
			System.out.println("Turn of the ceiling fan");
		} else {
			System.out.println("Ceiling fan is already turned off");
		}
	}

	public void max() {
		currentSpeed = MAX_SPEED;
		System.out.println("Ceiling fan Speed reaches max = " + currentSpeed);
	}
	public void off() {
		currentSpeed = 0;
		System.out.println("Turn of the ceiling fan");
	}
}
