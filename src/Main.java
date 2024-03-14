import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
        String inputFilePath = "input.txt";
        String outputFilePath = "out.txt";
        
        try {
     
            BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
           
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));
            
            String line;
            
            while ((line = reader.readLine()) != null) {
               
                String replacedLine = line.replaceAll("Nha Trang", "Vũng Tàu");
                
                writer.write(replacedLine);
                
                writer.newLine();
            }
            
            reader.close();
            writer.close();
            
            System.out.println("Thay thế và ghi nội dung thành công.");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi thực hiện thao tác với tệp.");
            e.printStackTrace();
        }
    }
}
