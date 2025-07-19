package IO_Streams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Question_2 {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("D:\\Documents\\Saduvubidda\\wipro_talentnext\\IO_Streams\\src\\input.txt");
            FileWriter writer = new FileWriter("D:\\Documents\\Saduvubidda\\wipro_talentnext\\IO_Streams\\src\\output.txt");
            int charRead;
            while ((charRead = reader.read()) != -1) {
                writer.write(charRead);
            }
            reader.close();
            writer.close();
            System.out.println("File is copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
