public class HomeApp {
    public static void main(String[] args) {
        HomeService lightHomeService = new ConcreteLight();
        HomeInterface lightFacade = new HomeInterface(lightHomeService);

        HomeService tvHomeService = new ConcreteTv();
        HomeInterface tvFacade = new HomeInterface(tvHomeService);

        HomeService airConditioningService = new ConcreteAirConditioning();
        HomeInterface airConditioningFacade = new HomeInterface(airConditioningService);

        lightFacade.turnOnAll();
        tvFacade.turnOnAll();
        airConditioningFacade.turnOnAll();

        lightFacade.turnOffAll();
        tvFacade.turnOffAll();
        airConditioningFacade.turnOffAll();

    }
    
}
