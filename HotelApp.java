package facadepattern;

public class HotelApp {
    public static void main(String[] args) {
        FrontDesk frontDesk = new FrontDesk();

        System.out.println("=== Welcome to HotelApp ===");

        frontDesk.requestValet("ABC-1234");
        frontDesk.requestCleaning(205);
        frontDesk.requestCart(2);

        System.out.println("\nAll hotel services completed through FrontDesk facade!");
    }
}

