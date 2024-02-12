package erxercise.chapter_59;

import erxercise.chapter_57.Customer;

import java.io.*;
import java.net.Socket;
import java.util.List;

public class RequestHandler implements Runnable{

    private Socket clientSocket;
    private List<Customer> customerList; // 대기 명단

    public RequestHandler(Socket clientSocket, List<Customer> customerList) {
        this.clientSocket = clientSocket;
        this.customerList = customerList;
    }

    @Override
    public void run() {
        try {
            System.out.println("클라이언트가 접속하였습니다.");

            //  클라이언트로부터 데이터를 받기 위한 InputStream 생성
            InputStream clientInputstream = clientSocket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream((clientInputstream));

            //  클라이언트로 데이터를 보내기 위한 OutputStream 생성
            OutputStream serverOutputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

            //  클라이언트에게 응답을 보냄
            Customer customer = (Customer) objectInputStream.readObject();

//            customerList.add(customer);  두개 이상의  스레드가 접근할 시 누락의 위험이있음
            ListUtils.addList(customerList,customer);

            //  클라이언트로부터 데이터를 읽고 화면에 출력
            System.out.println("Thread " + Thread.currentThread().getName() + ": " + customer + "가 대기명단에 추가되었습니다.");
            printWriter.println("현재 고객 대기명단은 :" + customerList);

            clientSocket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
