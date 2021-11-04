package br.upe;

public class App {
    public static void main(String[] args) {

        System.out.println("Resultado da  Mega-Sena: " + new ResultsLottery("mega-sena").getLastResult());
        System.out.println("Resultado da  Quina: " + new ResultsLottery("quina").getLastResult());
        System.out.println("Resultado da  TimeMania: " + new ResultsLottery("timemania").getLastResult());

    }
}
