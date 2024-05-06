import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Example2 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\Documents\\GitHub\\javaIOExamples\\src\\text\\sample2.txt";
        try(InputStream inputStream = new FileInputStream(fileLocation);  // try(var inputStream = new FileInputStream(fileLocation)
            DataInputStream dataInputStream = new DataInputStream(inputStream)){ // try(var dataInputStream = new DataInputStream)
            byte [] fileData =  dataInputStream.readAllBytes();
            System.out.println(new String(fileData));
        }catch(IOException exception){
            System.err.println("Error: " + exception.getMessage());
        }
    }
}