package FacadePattern;
public class HotelApp {
    public static void main(String[] args) {
        FrontDesk facade = new FrontDesk();
        facade.client("AAA111", 101, 9);

    }
}