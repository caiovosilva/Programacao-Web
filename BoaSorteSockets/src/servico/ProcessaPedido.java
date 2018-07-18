/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.io.PrintWriter;
import java.net.Socket;
import negocio.BoaSorte;

/**
 *
 * @author caiov
 */
public class ProcessaPedido implements Runnable {
    private Socket socket;
    
    public ProcessaPedido(Socket socket){
        this.socket = socket;
    }
    
    @Override
    public void run(){
        try{
            PrintWriter print = new PrintWriter(socket.getOutputStream(),true);
            print.print(new BoaSorte().sortearFrase());
        }
        catch(Exception ex){
            ex.printStackTrace(System.out);
        }
    }
}
