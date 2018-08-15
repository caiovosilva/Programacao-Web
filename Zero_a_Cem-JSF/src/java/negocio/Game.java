/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Random;

/**
 *
 * @author caiovosilva
 */
public class Game {

    private int numeroSorteado;
    private int numeroDigitado;

    public Game() {
        this.sortear();
    }

    public int getNumeroSorteado() {
        return numeroSorteado;
    }

    private void setNumeroSorteado(int numeroSorteado) {
        this.numeroSorteado = numeroSorteado;
    }

    private void sortear() {
        Random r = new Random();
        this.setNumeroSorteado(r.nextInt(101));

    }

    public int getNumeroDigitado() {
        return numeroDigitado;
    }

    public void setNumeroDigitado(int numeroDigitado) {
        this.numeroDigitado = numeroDigitado;
    }

    public int getResultado() {

        if (this.getNumeroDigitado() > this.getNumeroSorteado()) {
            return 1;
        } else if (this.getNumeroDigitado() < this.getNumeroSorteado()) {
            return -1;
        } else {
            this.sortear();
            return 0;
        }
    }

}
