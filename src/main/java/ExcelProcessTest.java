import java.io.File;
import java.io.IOException;

public class ExcelProcessTest {
    public static void main(String[] args) throws Exception {

        String filePath =System.getProperty("user.dir")+ File.separator+"testdata"+File.separator+"548(3).xlsx";
        String filePath2 =System.getProperty("user.dir")+ File.separator+"testdata"+File.separator+"莲花校区学员(3)(1).xlsx";
                System.out.println(filePath);
//        Object[][] results = ExcelProcess.getTestData(filePath,"sheet1");
//        for (int i=0;i<results.length;i++){
//            for(int j=0;j<results[i].length;j++) {
//                System.out.print(results[i][j]+"\t");
//            }
//            System.out.println();
//        }
        ExcelProcess sheet1 = new ExcelProcess(filePath, "sheet1");
        ExcelProcess sheet2 = new ExcelProcess(filePath2, "会员剩余次数列表");
        System.out.println("sheet2.data" + sheet2.getCellData(1,1));
        sheet1.setCellData(1,1,"111");
        sheet2.transDataTo(sheet2, sheet1);
    }
}
