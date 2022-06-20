package test;

import org.junit.Test;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.CompletableFuture;

/**
 * @author admin
 * @create 2022-06-19
 */
public class HeepClientTest {
    @Test
    public void test() throws Exception {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://www.baidu.com/")).build();
        HttpResponse.BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();
        HttpResponse<String> response = httpClient.send(request, bodyHandler);
        response.body().lines().forEach(System.out::println);
    }
    @Test
    public void test2() throws Exception {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create("https://www.baidu.com/")).build();
        HttpResponse.BodyHandler<String> bodyHandler = HttpResponse.BodyHandlers.ofString();
        CompletableFuture<HttpResponse<String>> response = httpClient.sendAsync(request, bodyHandler);
        response.get().body().lines().forEach(System.out::println);
    }
}
