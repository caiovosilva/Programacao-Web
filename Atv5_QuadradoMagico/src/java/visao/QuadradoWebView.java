/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

/**
 *
 * @author aluno
 */
public class QuadradoWebView {
    
    public String getNewQuadrado(int matriz[][]){
    
        return "<form action =\"ControleQuadradoMagico\" method=\"GET\">\n" +
"            <table align=\"center\">\n" +
"                <tr>\n" +
"                    <td><input type=\"text\" name=\"a1\" value=\""+matriz[0][0]+"\"/></td>\n" +
"                    <td><input type=\"text\" name=\"a2\" value=\""+matriz[0][1]+"\"/></td>\n" +
"                    <td><input type=\"text\" name=\"a3\" value=\""+matriz[0][2]+"\"/></td>\n" +
"                </tr>\n" +
"                <tr>\n" +
"                    <td><input type=\"text\" name=\"b1\" value=\""+matriz[1][0]+"\"/></td>\n" +
"                    <td><input type=\"text\" name=\"b2\" value=\""+matriz[1][1]+"\"/></td>\n" +
"                    <td><input type=\"text\" name=\"b3\" value=\""+matriz[1][2]+"\"/></td>\n" +
"                </tr>\n" +
"                <tr>\n" +
"                    <td><input type=\"text\" name=\"c1\" value=\""+matriz[2][0]+"\"/></td>\n" +
"                    <td><input type=\"text\" name=\"c2\" value=\""+matriz[2][1]+"\"/></td>\n" +
"                    <td><input type=\"text\" name=\"c3\" value=\""+matriz[2][2]+"\"/></td>\n" +
"                </tr>\n" +
"                <tr>\n" +
"                    <td><input type=\"submit\" name=\"acao\" value=\"Novo\"></td>\n" +
"                    <td><input type=\"submit\" name=\"acao\" value=\"Jogar\"></td>\n" +
"                    <td><input type=\"reset\" name=\"acao\" value=\"Limpar\"></td>\n" +
"                </tr>\n" +
"            </table>\n" +
"        </form>";
    }
    
}
