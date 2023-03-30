package org.example;

import java.util.concurrent.TimeUnit;

public class Serasa extends Thread{
    public int getAux() {
        return aux;
    }

    public int aux;

    @Override
    public void run () {

        try {
            searchSerasa();
            this.aux = 1;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void searchSerasa() throws InterruptedException {
        // configura quanto tempo a execução fica pausada dentro dessa função
        System.out.println("Consultando Serasa...");
        TimeUnit.SECONDS.sleep(1);
    }
}
