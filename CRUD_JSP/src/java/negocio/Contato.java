/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author caiov
 */
public class Contato {

    public Contato(){
            // Cria arquivo
            file = new File("/contatos.txt");

            // Se o arquivo nao existir, ele gera
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Contato.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    }
    
    public String getSalvarContato(){
            FileWriter fw = null;
        try {
            // Prepara para escrever no arquivo
            fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            // Escreve e fecha arquivo
            bw.newLine();
            bw.write(nome+"_"+cpf+"_"+tel);
            bw.close();
            fw.close();

            return "CADASTRO FEITO COM SUCESSO!";
        } catch (IOException ex) {
            Logger.getLogger(Contato.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Erro ao salvar contato";
    }
    
    public String getContatos(){
        String conteudo = new String();
        FileReader ler;
        try {
            ler = new FileReader("/contatos.txt");
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            while( (linha = reader.readLine()) != null )
                conteudo+=linha+"%n";
        } catch (FileNotFoundException  ex) {
            Logger.getLogger(Contato.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Contato.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conteudo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    private File file;
    private String nome;
    private String cpf;
    private String tel;
    
}
