package FacadePattern;
public class Cart implements HotelService {
    public void requestCart(int numberOfCarts) {
        System.out.println(+ numberOfCarts + " luggage carts requested to front desk.");
    }

    @Override
    public void service() {
        requestCart(9); 
    }
}