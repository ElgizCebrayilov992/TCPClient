/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tcpclient;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import util.FileUtil;

/**
 *
 * @author virtu
 */
public class TCPClient {
    public static void main(String[] args) throws Exception{
        sendAsByte();
     
        
    }
    
    
    
    
    //Burda byte ile gonderirik
    public static void sendAsByte() throws Exception{
    
        Socket socket=new Socket("localhost",6789);
        OutputStream outputStream=socket.getOutputStream();
        DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
        
        byte[] bytes=FileUtil.readBytes("C:\\workspace\\TCPClient\\hi.jpg"); 
        dataOutputStream.writeInt(bytes.length);
        outputStream.write(bytes);
        socket.close();
    
    }
    
    
    
    //Burda String olan yazini gonderirik
    public static void sendAsString() throws Exception{
        Socket socket=new Socket("localhost",6789);
        OutputStream outputStream=socket.getOutputStream();
        DataOutputStream dataOutputStream=new DataOutputStream(outputStream);
        outputStream.write("Hi,I am TCP Clien mesagges".getBytes());
        socket.close();
    }
}
