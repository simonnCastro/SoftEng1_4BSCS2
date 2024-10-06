public class HouseKeeping implements HotelService{
    @Override
    public void service(String serviceDetail){
        cleanRoom(serviceDetail);
    }
    public void cleanRoom(String roomNumber){
        System.out.println("Clean room " + roomNumber);
    }
}
