package com.man.dm.action.interpreter;

public class Variable extends Expression {

	private String name;
	
	public Variable(String name) {
		this.name=name;
	}
	
	@Override
	public boolean interpret(Context ctx) {		
		return ctx.lookup(this);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Variable) {
			return this.name.equals(((Variable)obj).name);
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.toString().hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}

}
