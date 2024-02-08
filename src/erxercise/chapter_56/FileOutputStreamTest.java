package erxercise.chapter_56;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args) {

        String content = "This is content of File";

        try(FileOutputStream fos = new FileOutputStream("src/erxercise/chapter_56/output2.txt")){

            byte[] bytes = content.getBytes();
            fos.write(bytes);

            System.out.println("txt파일이 생성되었습니다.");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
