import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class DataProvider {
    public static void main(String[] args) throws IOException {

        File file;
        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\nikhil.bhatia\\Downloads\\Untitled spreadsheet.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        int sheets = workbook.getNumberOfSheets();
        for(int i = 0; i< sheets; i++){
            if(workbook.getSheetName(i).equalsIgnoreCase("nikhil")) {
                XSSFSheet xssfsheet = workbook.getSheetAt(i);
               Iterator<Row> rows = xssfsheet.iterator();
               while (rows.hasNext()) {
                   Row firstrow = rows.next();
                   Iterator<Cell> ce = firstrow.iterator();
                   while (ce.hasNext()) {
                       Cell value = ce.next();
                       System.out.println(value);
                   }
               }

            }
        }
    }

}
