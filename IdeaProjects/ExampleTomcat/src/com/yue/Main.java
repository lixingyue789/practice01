package com.yue;

import java.io.ByteArrayInputStream;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Author:lxy1999
 * Created:2019/8/13
 *  HTTP/1.0 200 OK\r\n响应头(contentType)\r\n<html>...
 */
public class Main {

    public static void main(String[] args) throws Exception {
        String requestMessage = "GET /thread.html?id=18&page=9 HTTP/1.1\r\n"
                + "Host: www.bitvip.com\r\n"
                + "Accept: text/html\r\n"
                + "\r\n";
        InputStream is = new ByteArrayInputStream(requestMessage.getBytes());
        Request request = Request.parse(is);
        System.out.println(request.getMethod());
        System.out.println(request.getUrl());
        System.out.println(request.getProtocol());
        System.out.println(request.getRequestParams());
        System.out.println(request.getHeaders());

        OutputStream os = new ByteArrayOutputStream();
        Response response = Response.build(os);
        response.setStaus(Status.NOT_FOUND);
        response.setContentType("application/json");
        response.print("<html>");
        response.printf("<%s>","/html");
        response.println("<h1>hello</h1>");
        response.println("<head>");
        response.println("</head>");
        response.println("<body>");
        response.println("</body>");
        response.println("</html>");
        response.flush();
        System.out.println(os.toString());

        ServerSocket serverSocket = new ServerSocket(80);
        StaticController controller = new StaticController();
        while(true){
            Socket socket = serverSocket.accept();
            Request request1 = Request.parse(socket.getInputStream());
            Response response1 = Response.build(socket.getOutputStream());
            controller.doGet(request,response);
            response.flush();
            socket.close();
        }
    }
}
