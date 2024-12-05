package utility;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelData {

    private ExcelData() {
    }

    static FileInputStream fileInputStream;
    static XSSFWorkbook xssfWorkbook;
    static XSSFSheet sheet;

    public static String getDataFromCell(String path, String sheetName, int row, int coll) {
        String data;
        try {
            fileInputStream = new FileInputStream(path);
            xssfWorkbook = new XSSFWorkbook(fileInputStream);
        } catch (IOException exception) {
            exception.getMessage();
        }
        sheet = xssfWorkbook.getSheet(sheetName);
        DataFormatter dataFormatter = new DataFormatter();
        data = dataFormatter.formatCellValue(sheet.getRow(row).getCell(coll));
        return data;
    }
}
