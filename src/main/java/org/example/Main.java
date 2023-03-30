package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        DateTimeFormatter date = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalDateTime nowParalelo = LocalDateTime.now();
        System.out.println("Executando em paralelo: ");
        System.out.println("Hora inicial: " + date.format(nowParalelo));

        Serasa serasa = new Serasa();
        serasa.start();


        JusBrasil jusBrasil = new JusBrasil();
        jusBrasil.start();

        ReceitaFederal receitaFederal = new ReceitaFederal();
        receitaFederal.start();

        int aux = 0;
        while(aux == 0) {
            if(serasa.getAux() != 0 && receitaFederal.getAux() != 0 && jusBrasil.getAux() != 0) {
                aux++;
            }
            System.out.print("");

        }

        LocalDateTime afterSeconds = LocalDateTime.now();
        System.out.println("Hora final: " + date.format(afterSeconds));


        System.out.println("Executando sequencialmente");
        LocalDateTime nowSequencial = LocalDateTime.now();
        System.out.println("Hora inicial: " + date.format(nowSequencial));

        serasa.searchSerasa();
        receitaFederal.searchReceitaFederal();
        jusBrasil.searchJusBrasil();

        LocalDateTime afterSecondsSequencial = LocalDateTime.now();
        System.out.println("Hora final: " + date.format(afterSecondsSequencial));

    }
}
