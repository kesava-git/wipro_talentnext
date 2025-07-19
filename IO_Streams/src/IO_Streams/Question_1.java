package IO_Streams;

import java.io.FileReader;
import java.io.IOException;

public class Question_1 {
	public static void main(String[] args) {
		System.out.println("Current working directory: " + System.getProperty("user.dir"));
        try {
            FileReader reader = new FileReader("D:\\Documents\\Saduvubidda\\wipro_talentnext\\IO_Streams\\src\\input.txt");
            char searchChar = 'a';
            int charCount = 0;
            int charRead;
            while ((charRead = reader.read()) != -1) {
                if ((char) charRead == searchChar) {
                    charCount++;
                }
            }
            reader.close();
            System.out.println("File 'Input.txt' has " + charCount + " instances of letter '" + searchChar + "'.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}