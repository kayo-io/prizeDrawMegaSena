package br.upe;

public class App {
    public static void main(String[] args) {

        new ResultsLottery("mega-sena").getLastResult();
        new ResultsLottery("quina").getLastResult();
        new ResultsLottery("timemania").getLastResult();

    }
}
