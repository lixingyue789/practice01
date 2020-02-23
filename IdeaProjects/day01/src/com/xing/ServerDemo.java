package com.xing;

import com.sun.corba.se.spi.activation.Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author:lxy1999
 * Created:2020/2/23
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(12345);
        System.out.println("等待客户端连接");
        Socket client = socket.accept();
        String IP = client.getInetAddress().getHostAddress();
        System.out.println("小样抓到你了"+IP);
        InputStream is = client.getInputStream();
        byte[] bs = new byte[1024];
        int len = is.read(bs);
        System.out.println("客户端说"+new String(bs,0,len));
        OutputStream os = client.getOutputStream();
        os.write("您的消息已经收到了...".getBytes());
        System.out.println("给客户端发送信息成功!!!");
        socket.close();
        client.close();
        is.close();
    }
}
