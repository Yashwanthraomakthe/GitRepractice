package qaclickacademy;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	@SuppressWarnings("deprecation")
	public ArrayList<String> getData(String testCaseName) throws IOException {

		ArrayList<String> al = new ArrayList<String>();

		FileInputStream fis = new FileInputStream("C://Users//YashPooja//Desktop//DemoFile.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		int sheets = workbook.getNumberOfSheets();
		System.out.println("Names of sheets " + sheets);

		for (int i = 0; i < sheets; i++) {

			if (workbook.getSheetName(i).equalsIgnoreCase("usefull")) {
				XSSFSheet SheetName = workbook.getSheetAt(i);
				Iterator<Row> rows = SheetName.iterator();
				Row firstrow = rows.next();
				Iterator<Cell> cell = firstrow.cellIterator();

				int k = 0;
				int coloumn = 0;
				while (cell.hasNext()) {
					Cell value = cell.next();
					if (value.getStringCellValue().equalsIgnoreCase("TestCases")) {
						coloumn = k;
					}
					k++;
				}

				while (rows.hasNext()) {
					Row r = rows.next();
					if (r.getCell(coloumn).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						Iterator<Cell> cv = r.cellIterator();
						while (cv.hasNext()) {
							Cell c = cv.next();
							if (c.getCellTypeEnum() == CellType.STRING) {
								al.add(c.getStringCellValue());
							} else {
								al.add(NumberToTextConverter.toText(c.getNumericCellValue()));

							}

						}

					}

				}
			}

		}
		return al;

	}
}
