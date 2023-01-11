package com.fc.demo.client;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class ClientMain {
    public static void main(String[] args) throws Exception {
        String text = "TestowyTekst";
        String content = getUrlContent("http://localhost:8080/textLength?text=" + text);
        System.out.println(content);


        String contentElements = getUrlContent("http://localhost:8080/listSize?elements=Konrad&elements=Kasia&elements=Adam");
        System.out.println(contentElements);
    }

    public static String getUrlContent(String url) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest =
                HttpRequest.newBuilder(new URI(url))
                        .GET()
                        .build();

        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        int statusCode = httpResponse.statusCode();
        System.out.println(statusCode);
        return httpResponse.body();

    }
}
