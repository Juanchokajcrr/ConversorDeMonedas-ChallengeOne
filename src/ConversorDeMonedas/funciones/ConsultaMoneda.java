package ConversorDeMonedas.funciones;

import ConversorDeMonedas.models.MonedasApi;
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public MonedasApi buscarMoneda(String codigo) {

        String apiKey = "e2b27a40900b5f3ea19c13e8";
        String monedaBase = "USD";

        String direccion = ("https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + monedaBase);

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            //System.out.println(response.body());
            return new Gson().fromJson(response.body(), MonedasApi.class);

        }catch (RuntimeException e) {
            throw new RuntimeException("Error de conexión con la API: " + e.getMessage());
        }
        catch (Exception e) {
            throw new RuntimeException("No encontre ese tipo de moneda");
        }
    }
}
