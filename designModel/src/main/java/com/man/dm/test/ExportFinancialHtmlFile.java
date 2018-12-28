package com.man.dm.test;

public class ExportFinancialHtmlFile implements ExportFile{

	public boolean export(String data) {
		
		System.out.println("export financial html file:"+data);
		return true;
	}

}
