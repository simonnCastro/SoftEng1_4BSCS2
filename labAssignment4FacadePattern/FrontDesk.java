public class FrontDesk {
    private HotelService hotelService;

    public FrontDesk(HotelService hotelService){
        this.hotelService = hotelService;
    }

    public void pickUpVehicle(String plateNumber){
        hotelService.service(plateNumber);
    }
    public void cleanRoom(String roomNumber){
        hotelService.service(roomNumber);;
    }
    public void requestCart(String numberOfCarts){
        hotelService.service(numberOfCarts);
    }
}
