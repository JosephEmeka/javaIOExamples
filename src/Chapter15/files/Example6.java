package Chapter15.files;

import java.io.FileWriter;
import java.io.IOException;

public class Example6 {
    public static void main(String[] args){
        String fileLocation  = "C:\\Users\\DELL\\Documents\\GitHub\\javaIOExamples\\src\\text\\sample2.txt";
        try(FileWriter fileWriter = new FileWriter(fileLocation)){
            fileWriter.write("Hello world");
        }
        catch(IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
