/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client;

import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author caiov
 */
public class Client {
    
    public static void main(String args[]){
        try{
            Socket socket = new Socket("127.0.0.1",1234);
            Scanner mensagem = new Scanner(socket.getInputStream());
            System.out.println(mensagem.nextLine());
        }
        catch(Exception ex){
            System.out.println(ex);
        }
    }
}
