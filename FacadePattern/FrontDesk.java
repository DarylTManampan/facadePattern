package FacadePattern;
public class FrontDesk {
    private Valet valet;
    private HouseKeeping houseKeeping;
    private Cart cart;

    public FrontDesk() {
        this.valet = new Valet();
        this.houseKeeping = new HouseKeeping();
        this.cart = new Cart();
    }

    public void client(String plateNumber, int roomNumber, int numberOfCarts) {
        System.out.println("");
        valet.pickUpVehicle(plateNumber);
        houseKeeping.cleanRoom(roomNumber);
        cart.requestCart(numberOfCarts);
    }
}