package com.xing;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Author:lxy1999
 * Created:2020/2/23
 */
public class FileUploadClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1",12345);
        System.out.println("连接服务器成功....");
        OutputStream os = client.getOutputStream();
        FileInputStream fis = new FileInputStream("D:\\申请书\\李星月.jpg");
        byte[] bs = new byte[1024];
        int len = 0;
        while ((len=fis.read(bs))!=-1){
            os.write(bs,0,len);
        }
        client.shutdownOutput();
        InputStream in = client.getInputStream();
        byte[] b = new byte[1024];
        int l = in.read(b);
        System.out.println("服务器说"+new String(b,0,l));
        client.close();
        fis.close();
        os.close();
    }
}
