package org.example;
import java.util.concurrent.TimeUnit;

public class JusBrasil extends  Thread {
    public int aux = 0;

    public int getAux() {
        return aux;
    }

    @Override
    public void run () {

        try {
            searchJusBrasil();
            this.aux = 1;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void searchJusBrasil() throws InterruptedException {
        // configura quanto tempo a execução fica pausada dentro dessa função
        System.out.println("Consultando JusBrasil...");
        TimeUnit.SECONDS.sleep(1);
    }
}
