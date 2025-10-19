package facadepattern;

public class Valet implements HotelService {

    @Override
    public void performService() {
        System.out.println("Valet service is now available.");
    }

    public void pickUpVehicle(String plateNumber) {
        System.out.println("Valet is picking up vehicle with plate number: " + plateNumber);
    }
}
