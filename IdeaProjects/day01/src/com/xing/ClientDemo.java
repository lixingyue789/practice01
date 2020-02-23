package com.xing;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Author:lxy1999
 * Created:2020/2/23
 */
public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1",12345);
        OutputStream os = client.getOutputStream();
        os.write("how are you!!".getBytes());
        System.out.println("给服务器发送信息成功！！");
        InputStream is = client.getInputStream();
        byte[] bs = new byte[1024];
        int len = is.read(bs);
        System.out.println("服务器响应:"+new String(bs,0,len));
        client.close();
        os.close();
    }
}
