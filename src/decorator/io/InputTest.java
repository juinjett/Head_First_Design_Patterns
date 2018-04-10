package decorator.io;

import java.io.*;

public class InputTest {
    public static void main(String[] args) {
        int c;

        try (
                InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("text.txt")));
        ) {
            while ((c = in.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fileReader;
        BufferedReader bufferedReader;

    }
}
