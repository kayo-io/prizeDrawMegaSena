package br.upe;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println("Resultado da Última Mega Sena: " + ResultMegaSena.getLastResult());
        System.out.println("Resultado da Última Quina: " + ResultsQuina.getLastResult());
        System.out.println("Resultado da Última Timemania: " + ResultTimeMania.getLastResult());
    }
}
