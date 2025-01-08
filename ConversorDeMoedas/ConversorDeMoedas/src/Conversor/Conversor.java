package Conversor;


import com.google.gson.Gson;


import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Conversor {
    private final String brl = "BRL";
    private final String usd  = "USD";
    private final String ars = "ARS";
    private final String cop = "COP";

    public double Pegadados(String moeda1, String moeda2){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://v6.exchangerate-api.com/v6/5c4f938bfd88e6d772ef12a6/pair/"+ moeda1 + "/" + moeda2 ))
                .build();
        HttpResponse<String> response;
        Gson gson = new Gson();

        {
            try {
                response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                TipoMoedaRecord moedaVdd = gson.fromJson(json, TipoMoedaRecord.class);
                TipoMoeda moeda = new TipoMoeda(moedaVdd);
                return moeda.getConversion_rate();

            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void BrlParaDolar(double qtd){

        double precofinal = qtd * Pegadados(brl, usd);
        System.out.println("Valor de: " + qtd + " BRL" + " Corresponde ao valor final de  =>>> " + precofinal + " USD");
    }
    public void DolarParaBRL(double qtd){
        double precofinal = qtd * Pegadados(usd, brl);
        System.out.println("Valor de: " + qtd + " USD" + " Corresponde ao valor final de  =>>> " + precofinal + " BRL");
    }
    public void ARSParaDolar(double qtd){
        double precofinal = qtd * Pegadados(ars, usd);
        System.out.println("Valor de: " + qtd + " ARS" + " Corresponde ao valor final de  =>>> " + precofinal + " USD");
    }
    public void DolarParaARS(double qtd){
        double precofinal = qtd * Pegadados(usd, ars);
        System.out.println("Valor de: " + qtd + " USD" + " Corresponde ao valor final de  =>>> " + precofinal + " ARS");
    }
    public void CoPParaDolar(double qtd){
        double precofinal = qtd * Pegadados(cop, usd);
        System.out.println("Valor de: " + qtd + " COP" + " Corresponde ao valor final de  =>>> " + precofinal + " USD");
    }
    public void DolarParaCop(double qtd){
        double precofinal = qtd * Pegadados(usd, cop);
        System.out.println("Valor de: " + qtd + " USD" + " Corresponde ao valor final de  =>>> " + precofinal + " COP");
    }
}
