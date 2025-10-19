package facadepattern;

public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        valet = new Valet();
        houseKeeping = new HouseKeeping();
        cart = new Cart();
    }

    public void requestValet(String plateNumber) {
        System.out.println("\n[FrontDesk] Forwarding valet request...");
        valet.pickUpVehicle(plateNumber);
    }

    public void requestCleaning(int roomNumber) {
        System.out.println("\n[FrontDesk] Forwarding housekeeping request...");
        houseKeeping.cleanRoom(roomNumber);
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("\n[FrontDesk] Forwarding cart request...");
        cart.requestCart(numberOfCarts);
    }
}

