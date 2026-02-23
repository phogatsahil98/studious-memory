package Challenge_1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FNFExceptionClass {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a File Name : ");
        String fileName = input.next();

        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
            do{
                read = reader.read();
                System.out.print((char) read);
            }while (read != -1);
            System.out.print("\n\nAll Data has been Extracted Successfully");
        } catch (Exception ae){
            System.out.println(ae.getMessage());
        }
    }
}
