package mentorAssignments.writingExcelFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcelFile {

	public static void main(String[] args) {
	
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Employees");
		
		Object[][] employeeData = {
				{"Employee Code","FirstName","LastName"},
				{16140,"Vishal","Jain"},
				{16159,"Ajinkya","Kharatkar"},
				{16157,"Abhishek","Goyal"},
				{11111,"Ajinkya","Jadhav"}
		};
		
		int rowCount = 0;
		for(Object[] empRow : employeeData){
			Row row = sheet.createRow(rowCount++);
			
			int cellCount = 0;
			for(Object empCell : empRow){
				Cell cell = row.createCell(cellCount++);
				
				if(empCell instanceof Integer){
					cell.setCellValue((Integer) empCell);
				}
				else if(empCell instanceof String){
					cell.setCellValue((String) empCell);
				}				
			}
		}
		 
		try {
			FileOutputStream fos = new FileOutputStream("Employee.xslx");
			workbook.write(fos);
			workbook.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}