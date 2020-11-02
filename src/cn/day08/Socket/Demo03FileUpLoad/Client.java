package cn.day08.Socket.Demo03FileUpLoad;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\Crazycreate\\Desktop\\za\\TIM截图20200812125803.png"));

        Socket socket = new Socket("127.0.0.1",8888);

        OutputStream os = socket.getOutputStream();

        int len = 0;
        while((len = bis.read()) != -1){
            os.write(len);
        }

        socket.shutdownOutput();

        InputStream is = socket.getInputStream();

        len = 0;
        while((len = is.read()) != -1){
            System.out.print((char)len);
        }

        bis.close();
        socket.close();


    }
}
