package br.com.alura.agora.main;

import br.com.alura.agora.excessao.ErroDeConversaoDeAnoException;
import br.com.alura.agora.models.Title;
import br.com.alura.agora.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonToken;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainWSearch {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Title> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy
                        .UPPER_CAMEL_CASE)
                        .setPrettyPrinting()
                        .create();;

        while(!busca.equalsIgnoreCase("sair")){
            System.out.println("Digite um filme para busca: ");
            busca = leitura.nextLine();
            if(busca.equalsIgnoreCase("sair")){
                break;
            }

            String endereco = "https://www.omdbapi.com/?t=" + busca.replace(" " , "+") + "&apikey=2e68d843";
            try{
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request,  BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);

                TitleOmdb myTitleOmdb = gson.fromJson(json, TitleOmdb.class);
                System.out.println(myTitleOmdb);
                Title myTitle = new Title(myTitleOmdb);
                System.out.println("Titulo após conversão");
                System.out.println(myTitle);

                titulos.add(myTitle);
            } catch (NumberFormatException excessao){
                System.out.println("Aconteceu um erro");
                System.out.println(excessao.getMessage());
            } catch (IllegalArgumentException e){
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            } catch (ErroDeConversaoDeAnoException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);

        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        leitura.close();
    }
}
