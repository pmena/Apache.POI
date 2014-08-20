package com.aasa.siccosap.util;

import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRichTextString;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReportePOI {

	private void crearFilaExcel(HSSFWorkbook objA_libro, HSSFSheet objA_hoja, HSSFCellStyle objA_estilo, List<String> objA_lista , int intA_fila, int intA_columna ){					
		HSSFCell objL_celda; 		
		
		int intL_numeroCol = intA_columna;
		HSSFRow objL_fila = objA_hoja.createRow(intA_fila);
		
		for(String objL_texto : objA_lista){
			objL_celda = objL_fila.createCell((short) intL_numeroCol);
			objL_celda.setCellValue(new HSSFRichTextString(objL_texto));		
			objL_celda.setCellStyle(objA_estilo);		
			objA_hoja.autoSizeColumn((short) intL_numeroCol);
			intL_numeroCol++;			
		}		    
	}
	
	
}
