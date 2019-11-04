package generic_libraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.Test;



// To fetch the data and giv as an input:

public class ddt_generic {
	
	public String val ;
	public  void write_data(String path,int row,String sheet) throws EncryptedDocumentException, InvalidFormatException, IOException
	{	
			FileInputStream fis=new FileInputStream(path);
			Workbook wb = WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet(sheet);
			Row r = sh.getRow(row);
		Cell c = r.getCell(0);
		 val = c.toString();
		//c.setCellValue(data);	
			

			
			
		}

	}

