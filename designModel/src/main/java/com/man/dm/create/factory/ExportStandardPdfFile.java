package com.man.dm.create.factory;

public class ExportStandardPdfFile implements ExportFile{

	public boolean export(String data) {		
		/**
		 * 业务逻辑 
		 * 
		 */
		System.out.println("导出标准html文件:"+data);		
		return true;
	}

}
