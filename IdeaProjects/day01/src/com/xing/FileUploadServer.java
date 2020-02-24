package com.xing;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author:lxy1999
 * Created:2020/2/23
 */
public class FileUploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(12345);
        while (true){
            System.out.println("等待客户端连接...");
            final Socket client = socket.accept();
            //开启一个线程与client交互
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream in = client.getInputStream();
                        System.out.println("小样->" + client.getInetAddress().getHostAddress());
                        String name = "D:\\啦啦啦\\" + System.currentTimeMillis() + ".jpg";
                        FileOutputStream fos = new FileOutputStream(name);
                        byte[] bs = new byte[1024];
                        int len = 0;
                        while ((len = in.read(bs)) != -1) {
                            fos.write(bs, 0, len);
                        }//1小时
                        System.out.println("客户端文件保存完毕，可以查看了:" + name);
                        OutputStream os = client.getOutputStream();
                        os.write("文件真的上传成功了！！！".getBytes());
                        client.close();
                        in.close();
                        fos.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }
}
