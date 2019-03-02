package com.man.dm.action.command;

public class ConcreteCommand implements Command{

	private Receiver receiver;
	
	private String status;
	
	public ConcreteCommand(Receiver receiver) {
		this.receiver=receiver;
	}	
	
	@Override
	public void execute() {	
		receiver.action();
	}

}
