package br.upe;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ResultsLottery {

    private static String initialTag;

    private static String prizeDraw;

    public ResultsLottery(String prizeDraw) {
        this.prizeDraw = prizeDraw;
        ResultsLottery.initialTag = "<ul class=\"resultado-loteria " + prizeDraw + "\">";
    }

    private final static String URL = "http://loterias.caixa.gov.br/wps/portal/loterias/landing/";

    private final static String finalTag = "</ul>";

    public final static List<String> getLastResult() {

        CloseableHttpClient httpClient = HttpClients.createDefault();

        try {
            HttpGet httpget = new HttpGet(URL);

            String html = httpClient.execute(httpget, new BasicResponseHandler());

            return getDozens(html, initialTag);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            httpClient.getConnectionManager().shutdown();

        }

        return null;
    }

    private final static List<String> getDozens(String html, String initialTag) {

        int idxBeginSearch = html.indexOf(initialTag) + initialTag.length();

        int idxEndSearch = idxBeginSearch + html.substring(idxBeginSearch, html.length()).indexOf(finalTag);

        String extract = html.substring(idxBeginSearch, idxEndSearch);

        String[] trashNumbers = extract.split("</li>");
        List<String> numbers = Arrays.stream(trashNumbers).map(trash -> trash.replace("<li>", "")).collect(Collectors.toList());

        return numbers;
//        System.out.println("Resultado da " + prizeDraw.toUpperCase() + ": " + numbers);

    }

}
