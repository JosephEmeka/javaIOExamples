package Chapter15.files;

import java.io.IOException;
import java.io.PrintStream;
    public class Example1 {

        public static void main(String[] args) {
            String fileLocation = "C:\\Users\\DELL\\Documents\\GitHub\\javaIOExamples\\src\\text\\sample.txt";
            try(PrintStream printStream =
                        new PrintStream(fileLocation)) {
                printStream.println("There is a tide in the affairs of men");
            }catch (IOException exception) {
                System.err.println("Error: " + exception.getMessage());
            }
        }
    }
