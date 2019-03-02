package com.man.dm.action.handler;

public abstract class Handler {
	
	protected Handler handler=null;
	
	public Handler getSuccessor() {
		return handler;
	}
	
	public void setSuccessor(Handler handler) {
		this.handler=handler;		
	}
	
	public abstract String handleFeeRequest(String user,double fee);

}
