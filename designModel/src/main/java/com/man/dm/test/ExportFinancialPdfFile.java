package com.man.dm.test;

public class ExportFinancialPdfFile implements ExportFile{

	public boolean export(String data) {
		
		System.out.println("export financial pdf file:"+data);
		return true;
	}

}
