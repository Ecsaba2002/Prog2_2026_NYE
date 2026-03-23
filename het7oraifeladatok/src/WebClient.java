public class WebClient {

    // Static Nested Class
    public static class Config {
        public static int timeout;
        public static String url;
    }

    public void connect() {
        System.out.println("Connecting with configuration:");
        System.out.println("URL: " + Config.url);
        System.out.println("Timeout: " + Config.timeout + " ms");
    }

    public static void main(String[] args) {
        // Konfiguráció beállítása
        WebClient.Config.url = "https://example.com";
        WebClient.Config.timeout = 5000;

        // Kapcsolódás
        WebClient client = new WebClient();
        client.connect();
    }
}
