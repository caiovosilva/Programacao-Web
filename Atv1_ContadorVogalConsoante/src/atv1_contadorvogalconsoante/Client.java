/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv1_contadorvogalconsoante;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author caiovosilva
 */
public class Client {
    
        public static void main(String[] args) throws IOException {
            System.out.println("Digite um texto: ");
            Scanner scanner = new Scanner(System.in);
            String text = scanner.nextLine();
            Socket soc = new Socket("127.0.0.1",1234);
            PrintWriter writer = new PrintWriter(soc.getOutputStream(),true);
            
            writer.println(text);
            Scanner readServer = new Scanner(soc.getInputStream());
            System.out.println(readServer.nextLine());
            
        }
}
