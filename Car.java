public class Car {
    private void startElectricity(){
        System.out.println("Електрична сиситема активована");
    }
    private void startCommand(){
        System.out.println("Команда активавана");
    }
    private void startFuelSystem(){
        System.out.println("Паливна система активована");
    }


    public void start(){
        startElectricity();
        startCommand();
        startFuelSystem();
        System.out.println("Авто заведено.");
    }

}
