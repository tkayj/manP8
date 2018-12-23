package com.man.dm.create.factory;

public class ExportFinancialHtmlFile implements ExportFile{

	public boolean export(String data) {
		
		/**
		 * 业务逻辑 
		 * 
		 */
		System.out.println("导出财务html文件:"+data);
		return true;
	}

}
