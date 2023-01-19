package utils;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelutils {

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	// constructor
	public Excelutils(String Excelpath, String Sheetname) {

		try {
			workbook = new XSSFWorkbook(Excelpath);
			sheet = workbook.getSheet(Sheetname);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}

	}

	public static void getrowcount() {
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows:" + rowcount);

	}

	public static String getCellData(int rowNum, int ColNum) {
		DataFormatter formatter = new DataFormatter();

		String cellvalue = formatter.formatCellValue(sheet.getRow(rowNum).getCell(ColNum));
		System.out.println(cellvalue);
		return cellvalue;

	}

}

/*
 * String Excelpath = "./ExcelData/TestData.xlsx"; XSSFWorkbook workbook = new
 * XSSFWorkbook(Excelpath); XSSFSheet sheet = workbook.getSheet("Sheet1");
 */
/*
 * String Excelpath = "./ExcelData/TestData.xlsx"; XSSFWorkbook workbook = new
 * XSSFWorkbook(Excelpath); XSSFSheet sheet = workbook.getSheet("Sheet1");
 */
