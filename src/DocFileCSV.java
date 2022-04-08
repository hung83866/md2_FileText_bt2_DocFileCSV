import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocFileCSV {
    public static void docFile(String str) throws IOException {
        File file = new File(str);
        InputStream inputStream = new FileInputStream(file);
        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
        String line = "";
        List<String> strings = new ArrayList<>();
        while ((line = br.readLine())!=null){
            strings.add(phanTichChuoiCSV(line));
        }
        System.out.println(strings);
    }
    public static String phanTichChuoiCSV(String str){
        String arr[] = str.split(",");
        return arr[arr.length-1];
    }

    public static void main(String[] args) throws IOException {
        docFile("File CSV");
    }
}
