package erxercise.chapter_57;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        // todo : 서버에 연결
        try (Socket socket = new Socket("localhost",1234)){

            // todo : 서버로 데이터를 보내기 위한 OutputStream 생성
            OutputStream outputStream = socket.getOutputStream();
            PrintWriter clientprintWriter = new PrintWriter(outputStream,true);

            // todo : 서버로부터 데이터를 받기 위한 InputSteam 생성
            InputStream inputStream = socket.getInputStream();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            // todo : 서버에 메시지 전송
            clientprintWriter.println("이건 제가 정의한 client 요청입니다.");
            // todo : 서버로부터 받은 응답 출력
            String response = bufferedReader.readLine();
            System.out.println("서버로부터 받은 응답: "+response);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
