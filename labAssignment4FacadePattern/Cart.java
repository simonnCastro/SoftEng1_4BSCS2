public class Cart implements HotelService{
    @Override
    public void service(String serviceDetail){
        requestCart(serviceDetail);
    }
    public void requestCart(String numberOfCarts){
        System.out.println("Request cart " + numberOfCarts);
    }
}
