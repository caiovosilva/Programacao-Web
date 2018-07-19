/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.net.Socket;

/**
 *
 * @author caiov
 */
public class ProcessRequest implements Runnable{
    private Socket client;
    
    public ProcessRequest(Socket client){
        this.client = client;
    }
    
    public void run(){
        
    }
}
