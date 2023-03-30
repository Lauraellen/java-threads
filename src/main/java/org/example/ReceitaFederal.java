package org.example;
import java.util.concurrent.TimeUnit;

public class ReceitaFederal extends Thread{
    public int aux;

    public int getAux() {
        return aux;
    }

    @Override
    public void run () {

        try {
            searchReceitaFederal();
            this.aux = 1;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public void searchReceitaFederal() throws InterruptedException {
        // configura quanto tempo a execução fica pausada dentro dessa função
        System.out.println("Consultando Receita Federal...");
        TimeUnit.SECONDS.sleep(1);
    }
}
