package com.man.dm.create.build2;

public class Client {

	public static void main(String[] args) {
		Builder builder=new WelcomeBuilder();
		Director director=new Director(builder);
		director.construct("toAddress@126.com", "tianke@163.com");

	}

}
