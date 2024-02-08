package erxercise.chapter_57;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        // todo : 서버 소켓 생성
        // todo : 클라이언트 접속 대기
        try (ServerSocket serverSocket = new ServerSocket(1234); // 서버 소켓 생성
            Socket clientScoket = serverSocket.accept(); // 클라이언트 접속 대기
            ){

            System.out.println("서버가 시작되었습니다.");
            System.out.println("클라이언트가 접속하였습니다.");

            // todo : 클라이언트로부터 데이터를 받기 위한 InputStream 생성
            InputStream clientInputstream = clientScoket.getInputStream();
            BufferedReader ClientbufferedReader = new BufferedReader(new InputStreamReader(clientInputstream));

            // todo : 클라이언트로 데이터를 보내기 위한 OutputStream 생성
            OutputStream serverOutputStream = clientScoket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(serverOutputStream,true);

            // inputLine
            String inputLine;

            // todo : 클라이언트로부터 데이터를 읽고 화면에 출력
            // todo : 클라이언트에게 응답을 보냄
            while ((inputLine = ClientbufferedReader.readLine()) != null){
                System.out.println("클라이언트로 부터 온 요청은 " + inputLine);

                printWriter.println("서버로부터 응답이 왔습니다.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
