import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args){
        System.out.println("Welcome to File Handling");

        String fileName = "java-docs.txt";

        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("Hey Folks, Welcome to the Diary");
            writer.flush();
            System.out.println("File has been Drafted Successfully.");
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
