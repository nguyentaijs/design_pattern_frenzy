package io.github.nguyentaijs.command.command;


import io.github.nguyentaijs.command.receiver.CeilingFan;

public class CeilingFanLowCommand implements Command {

	private CeilingFan ceilingFan;

	private CeilingFanLowCommand() {

	}

	public CeilingFanLowCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.low();

	}

	@Override
	public void undo() {
		ceilingFan.high();
	}
	
}
