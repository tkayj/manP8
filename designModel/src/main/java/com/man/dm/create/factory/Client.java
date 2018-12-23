package com.man.dm.create.factory;

public class Client {
	
	public static void main(String[] args) {
		
		String data="测试文件内容";
		ExportFactory factoryHtml=new ExportHtmlFactory();
		ExportFile file=factoryHtml.factory("standard");
		file.export(data);
		
		ExportFactory factortHtml=new ExportPdfFactory();
		factortHtml.factory("financial").export(data);
		
	}
}
