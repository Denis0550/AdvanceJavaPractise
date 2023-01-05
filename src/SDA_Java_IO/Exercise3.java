package SDA_Java_IO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Exercise3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String strLine = "";
        try {
            String filename = "C:\\Users\\dsoro\\OneDrive\\Desktop\\Testy.txt";
            FileWriter fw = new FileWriter(filename, true);
            fw.write("Java I/O Exercises\n");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader(filename));
            while (strLine != null) {
                stringBuilder.append(strLine);
                stringBuilder.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
            br.close();
        } catch (IOException ioe) {
            System.err.println("IOException: " + ioe.getMessage());
        }
    }
}
