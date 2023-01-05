package SDA_Java_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercise2 {
    public static void main(String[] args) {
        BufferedReader bufferedReader;
        String strLine;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\dsoro\\OneDrive\\Desktop\\Pip.txt"));
            while ((strLine = bufferedReader.readLine()) != null) {
                System.out.println(strLine);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found. Look again =) ");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}
