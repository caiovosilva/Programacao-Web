/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author caiov
 */
public class Server {
    public static void main(String args[]){
        
        try{
            ServerSocket server = new ServerSocket(1234);
        
            while(true){
                Socket skt = server.accept();
                ProcessRequest request = new ProcessRequest(skt);
                Thread t = new Thread(request);
                t.start();
            }
        }
        catch(Exception ex){
            ex.printStackTrace(System.out);
        }
    }
}
