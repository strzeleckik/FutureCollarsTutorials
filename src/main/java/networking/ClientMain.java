package networking;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ClientMain {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newBuilder().build();

        HttpRequest httpRequest =
                HttpRequest.newBuilder(new URI("https://www.google.com/"))
                        .GET()
                        .build();

        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        int statusCode = httpResponse.statusCode();

        System.out.println(statusCode);
        System.out.println(httpResponse.body());
    }
}
