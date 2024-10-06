public class FrontDesk {
    private HotelService hotelService;

    public FrontDesk(HotelService hotelService){
        this.hotelService = hotelService;
    }

    public void pickUpVehicle(String plateNumber){
        hotelService.service(plateNumber);
    }
    public void cleanRoom(String servicedetail){
        hotelService.service(servicedetail);;
    }
    public void requestCart(String servicedetail){
        hotelService.service(servicedetail);
    }
}
