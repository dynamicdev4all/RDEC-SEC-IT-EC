import java.io.IOException;
import java.net.URI;
import java.net.http.*;

public class ApiClient {
    public static void main(String[] args) {
        String address = "https://itunes.apple.com/search?term=jack+johnson&limit=25";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(URI.create(address)).GET().build();

        try {
            HttpResponse<String> res = client.send(request, HttpResponse.BodyHandlers.ofString());

            if (res.statusCode() == 200) {
                System.out.println(res.body());
            } else {
                System.out.println("Some error occured");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}