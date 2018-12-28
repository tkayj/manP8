package com.man.dm.test;

public class ExportStandardPdfFile implements ExportFile{

	public boolean export(String data) {
		
		System.out.println("export Standand Pdf file:"+data);
		return true;
	}

}
