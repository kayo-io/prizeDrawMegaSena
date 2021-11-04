package br.upe;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ResultsLotteryTest {

    @Test
    public void getLastResultMegaSena() {
        List<String> MegaSenaTest =  new ResultsLottery("mega-sena").getLastResult();

        //Verificar sa o retorno não é nulo
        assertNotNull(MegaSenaTest);

        //Verificar se o retorno não é vazio
        assertFalse(MegaSenaTest.isEmpty());

        //Verificar se o retorno é igual a 6 digitos
        assertEquals(6, MegaSenaTest.size());


    }

    @Test
    public void getLastResultQuina() {
        List<String> MegaSenaTest =  new ResultsLottery("quina").getLastResult();

        //Verificar sa o retorno não é nulo
        assertNotNull(MegaSenaTest);

        //Verificar se o retorno não é vazio
        assertFalse(MegaSenaTest.isEmpty());

        //Verificar se o retorno é igual a 6 digitos
        assertEquals(5, MegaSenaTest.size());


    }

    @Test
    public void getLastResultTimeMania() {
        List<String> MegaSenaTest =  new ResultsLottery("timemania").getLastResult();

        //Verificar sa o retorno não é nulo
        assertNotNull(MegaSenaTest);

        //Verificar se o retorno não é vazio
        assertFalse(MegaSenaTest.isEmpty());

        //Verificar se o retorno é igual a 6 digitos
        assertEquals(7, MegaSenaTest.size());


    }

}