package com.man.dm.test;

public class ExportStandardHtmlFile implements ExportFile{

	public boolean export(String data) {
		
		
		System.out.println("export Standand Html file:"+data);
		return true;
	}

}
