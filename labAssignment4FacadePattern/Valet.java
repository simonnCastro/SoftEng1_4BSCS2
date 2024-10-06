public class Valet implements HotelService{
    @Override
    public void service(String serviceDetail){
        pickUpVehicle(serviceDetail);
    }
    public void pickUpVehicle(String plateNumber){
        System.out.println("Pick up vehicle " + plateNumber);
    }
}
