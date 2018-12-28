package com.man.dm.test;

public class ExportPdfFactory implements ExportFactory {

	public ExportFile factory(String type) {
		
		if("standard".equals(type)) {
			return new ExportStandardPdfFile();
		}else if("financial".equals(type)) {
			return new ExportFinancialPdfFile();
		}else {
			throw new RuntimeException("没有找到文件");
		}
	}
}
