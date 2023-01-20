package MOSH;

public class CompletableFuturesDemo {
    public static void main() {
        var service = new FlightService();
        service.getQuote("site1")
                .thenAccept(System.out::println);
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
