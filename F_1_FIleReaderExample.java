import java.io.FileReader;
import java.io.IOException;

public class FIleReaderExample {
    public static void main(String[] args){
        String fileName = "java-docs.txt";

        try(FileReader reader = new FileReader(fileName)){
            int readedChar = 0;
            do {
                readedChar = reader.read();
                System.out.print((char) readedChar);
            } while (readedChar != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
