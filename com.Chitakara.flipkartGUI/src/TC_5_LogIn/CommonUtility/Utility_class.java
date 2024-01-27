package TC_5_LogIn.CommonUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_class {

	public static String getExcelData(String sheetName,int row,int shell) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//step1 craete a java representation object of external file 
		FileInputStream fis=new FileInputStream("./Data_driven_testing/Test_script_data_practice.xlsx");
		//2n step apeche interface
		Workbook book=WorkbookFactory.create(fis);
		Sheet sheet= book.getSheet(sheetName);
		//sheet using ss type
		Row rows=sheet.getRow(row);
		Cell cells=rows.getCell(shell);
		return cells.getStringCellValue();
		
		
		
		

	}
	public static String getPropertyValue(String key) throws IOException {
		FileInputStream fis = new FileInputStream("./Data_driven_testing/common_data.properties");
		Properties prop = new Properties();
		//property file java utill pakage
		prop.load(fis);
		return prop.getProperty(key);
}

}
