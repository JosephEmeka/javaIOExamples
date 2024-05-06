import java.io.FileOutputStream;
import java.io.IOException;

public class Example4 {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\Documents\\GitHub\\javaIOExamples\\src\\text\\sample4.txt";
        try(FileOutputStream fileOutputStream  =
                    // if you implement the commented line, it will not override what has been previously written, instead it keeps printing it multiple you play it.
                    new FileOutputStream(fileLocation)) {//new FileOutputStream(fileLocation, true);
            // new FileOutputStream(fileLocation, true){
            // String data = "\nInvest your money wisely, stop playing sporty bet";
            fileOutputStream.write("Invest your money wisely".getBytes());// .write(data.getByte()write takes a byte array, you cant send the file out as a string it takes a byte array
        }catch (IOException exception) {
            System.err.println("Error: " + exception.getMessage());
        }
    }
}

