/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.net.Socket;
import java.util.Random;

/**
 *
 * @author caiov
 */
public class BoaSorte {
    private String[] frases = new String[5];
    
    public BoaSorte(){
        frases[0]= "A sorte é para todos";
        frases[1]= "Somos todos irlandeses(isso nao faz sentido na vdd)";
        frases[2]= "Deus ajuda quem cedo madruga(oq isso tem a ver com sorte?)";
        frases[3]= "Eu nao sei mais oq escrever";
        frases[4]= "'Gente, que coisa horrorosa', by Maria de Fatima";
        System.out.println("vetor de frases criado");
    }
    
    public String sortearFrase(){
        Random random = new Random();
        String resposta = frases[random.nextInt(5)];
        System.out.println(resposta);
        return resposta;
    }
}
