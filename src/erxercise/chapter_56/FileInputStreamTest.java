package erxercise.chapter_56;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args) {
        //FileInputStream
        try(FileInputStream fis = new FileInputStream("src/erxercise/chapter_56/test.txt")){

            int i;
            while ((i=fis.read()) !=-1){
                System.out.print((char) i);
            }
            // -1인 이유는 read()에서 끝나면 -1 반환하기 떄문 즉 -1이되면 끝날떄가지 실행하라는 것

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
