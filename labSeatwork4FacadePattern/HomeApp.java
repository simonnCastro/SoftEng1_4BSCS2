public class HomeApp {
    public static void main(String[] args) {
        HomeService lightHomeService = new ConcreteLight();
        HomeInterface lightFacade = new HomeInterface(lightHomeService);

        HomeService tvHomeService = new ConcreteLight();
        HomeInterface tvFacade = new HomeInterface(tvHomeService);

        HomeService airConditioningService = new ConcreteLight();
        HomeInterface airConditioningFacade = new HomeInterface(airConditioningService);

        lightFacade.turnOnAll();
        tvFacade.turnOnAll();
        airConditioningFacade.turnOnAll();

        lightFacade.turnOffAll();
        tvFacade.turnOffAll();
        airConditioningFacade.turnOffAll();

    }
    
}
