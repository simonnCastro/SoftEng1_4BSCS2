public class HotelApp {
    public static void main(String[] args) {
        HotelService valetHotelService = new Valet();
        FrontDesk valetFrontDesk = new FrontDesk(valetHotelService);

        HotelService houseKeepingHotelService = new HouseKeeping();
        FrontDesk houseKeepingFrontDesk = new FrontDesk(houseKeepingHotelService);

        HotelService cartHotelService = new Cart();
        FrontDesk cartFrontDesk = new FrontDesk(cartHotelService);

        valetFrontDesk.pickUpVehicle("AAA 111");
        houseKeepingFrontDesk.cleanRoom("01");
        cartFrontDesk.requestCart("1");

    }
}
