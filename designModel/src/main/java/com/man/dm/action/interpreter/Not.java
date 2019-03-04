package com.man.dm.action.interpreter;

//代表逻辑“或”操作的Or类，代表由两个布尔表达式通过逻辑“或”操作给出一个新的布尔表达式的操作
public class Not extends Expression {

	private Expression exp;
	
	public Not(Expression exp) {
		this.exp=exp;
	}
	
	@Override
	public boolean interpret(Context ctx) {		
		return !exp.interpret(ctx) ;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null && obj instanceof Not) {
			return exp.equals(((Not)obj).exp) ;
		}
		return false;
	}

	@Override
	public int hashCode() {		
		return this.toString().hashCode();
	}

	@Override
	public String toString() {		
		return "(Not " +exp.toString()+")";
	}

}
