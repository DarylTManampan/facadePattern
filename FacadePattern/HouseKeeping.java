package FacadePattern;
public class HouseKeeping implements HotelService {
    public void cleanRoom(int roomNumber) {
        System.out.println("Housekeeping service on room number " + roomNumber);
    }

    @Override
    public void service() {
        cleanRoom(101);
    }
}