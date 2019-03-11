package com.man.dm.action.mediator;

public class ConcreteMediator implements Mediator{

	private ConcreteColleagueA colleagueA;
	
	private ConcreteColleagueB colleagueB;
	
	public void setConcreteColleagueA(ConcreteColleagueA colleague) {
		colleagueA=colleague;
	}
	
	public void setConcreteColleagueB(ConcreteColleagueB colleague) {
		colleagueB=colleague;
	}
	
	@Override
	public void changed(Colleague colleague) {
		//某个同事类发生了变化，通常需要与其他同事交互。
		//具体协调相应的同事对象来实现协作行为。		
	}
}
