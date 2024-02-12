package erxercise.chapter_59;

import erxercise.chapter_57.Customer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {
    public static void main(String[] args) {
        List<Customer> customerList = new ArrayList<>(); // 고객 대기 리스트
        //  서버 소켓 생성
        //  클라이언트 접속 대기
        try (ServerSocket serverSocket = new ServerSocket(1234); // 서버 소켓 생성
        ) {
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + "서버가 시작되었습니다.");
            while (true) {                                        // server의 계속 대기를 위한 while true
                try {
                     Socket clientScoket = serverSocket.accept(); // 클라이언트 접속 대기

                    Thread request = new Thread(new RequestHandler(clientScoket,customerList));
                    request.start();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
