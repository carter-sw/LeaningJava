package erxercise.chapter_56;

import java.io.*;

public class InputStreamReaderTest {
    public static void main(String[] args) {

        int i=0;

        System.out.println("입력값을 넣어주세요.");
        try {
            StringBuilder sb1 = new StringBuilder();
            while ( (i = System.in.read()) !='\n') {
                sb1.append((char) i);
            }
            System.out.println("InputStream 적용 전:" +sb1.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

        int j=0;
        StringBuilder sb2 = new StringBuilder();

        try(InputStreamReader isr = new InputStreamReader(System.in)) {
            while ( (i = isr.read()) !='\n') {
                sb2.append((char) j);
            }
            System.out.println("InputStream 적용 후:" +sb2.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}

