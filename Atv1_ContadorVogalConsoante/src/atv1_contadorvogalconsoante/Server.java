package atv1_contadorvogalconsoante;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import javax.net.ssl.SSLServerSocket;

/**
 *
 * @author caiovosilva
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket srv = new ServerSocket(1234);
        System.out.println("Server runing on (QUAL EH A TRADUCAO PRA PORTA?) 1234");
        while (true) {
            Socket soc = srv.accept();
            Scanner readClient = new Scanner(soc.getInputStream());
            String text = readClient.nextLine();
            PrintWriter escrita = new PrintWriter(soc.getOutputStream(), true);
            escrita.println(vowelsConsonantsCounter(text));
        }
    }
    
    private static String vowelsConsonantsCounter(String text){
        return ("Numero de vogais: " + (text.length() - text.replaceAll("a|e|i|o|u", "").length())+
                    " ; Numero de consoantes: " +text.replaceAll("a|e|i|o|u", "").length());
    }
}
