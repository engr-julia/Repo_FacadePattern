package facadepattern;

public class Cart implements HotelService {

    @Override
    public void performService() {
        System.out.println("Cart service is ready.");
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Requesting " + numberOfCarts + " luggage cart(s).");
    }
}
