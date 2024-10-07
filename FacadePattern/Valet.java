package FacadePattern;
public class Valet implements HotelService {
    public void pickUpVehicle(String plateNumber) {
        System.out.println("Vehicle with plate number " + plateNumber + " to be picked up and parked by valet.");
    }

    @Override
    public void service() {
        pickUpVehicle("AAA111");
    }
}