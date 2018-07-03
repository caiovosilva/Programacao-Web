/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atv1_contadorvogalconsoante;

/**
 *
 * @author caiovosilva
 */
public class CharacterCounter {
    
    public static String Count(String text){
        text = text.toUpperCase();
        char[] charArray = text.toCharArray();
        int others = 0;
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i < charArray.length; i++){
            if(Character.isLetter(charArray[i])){
                if(charArray[i]=='A' || charArray[i]=='E' || charArray[i]=='I' || charArray[i]=='O' || charArray[i]=='U')
                    vowels++;
                else
                consonants++;
            }
            else
                others++;
        }
        return " Numero de vogais: " + vowels +
               " Numero de consoantes: " + consonants +
               " Numero de outros caracteres: " + others;
    }
}
