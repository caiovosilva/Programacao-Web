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
            escrita.println(CharacterCounter.Count(text));
        }
    }
}
