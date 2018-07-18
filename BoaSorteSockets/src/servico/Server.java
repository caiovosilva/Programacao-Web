/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author caiov
 */
public class Server {
    public static void main(String srs[]) throws Exception{
        ServerSocket server = new ServerSocket(1234);
        System.out.println("Servidor criado");

        while(true){
            System.out.println("Esperando por conexão...");
            Socket skt = server.accept();
            ProcessaPedido processaPedido = new ProcessaPedido(skt);
            Thread t = new Thread(processaPedido);
            t.start();
        }
    }
    
}
