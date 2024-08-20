package io.github.nguyentaijs.command.command;

public interface Command {
	void execute();
	void undo();
}