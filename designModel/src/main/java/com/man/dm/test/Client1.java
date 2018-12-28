package com.man.dm.test;

public class Client1 {

	public static void main(String[] args) {
		
		ExportFactory factory=new ExportHtmlFactory();		
		ExportFile file=factory.factory("standard");
		file.export("测试数据");
		
	}
}
