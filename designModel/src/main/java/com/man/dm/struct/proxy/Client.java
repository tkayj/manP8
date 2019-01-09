package com.man.dm.struct.proxy;

public class Client {
	
	public static void main(String[] args) {
		Subject sub=new RealSubject();
		Subject proxySubject=new Proxy(sub);
		proxySubject.request();
	}

}
