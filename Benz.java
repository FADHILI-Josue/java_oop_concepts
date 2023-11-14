public class Benz extends Car implements AirConditioner{
    int temperature = 25;
    Benz(String color, int numberOfSeats) {
        super(color, numberOfSeats, 200, 500);
    }

    @Override
    public void manageTemperature(int temp) {
        this.temperature = temp;
        System.out.println("the temperature is "+ this.temperature);
    }
    @Override
    public void manageTemperature() {
        System.out.println("the temperature is "+ this.temperature);
    }

    @Override
    public String toString() {
        return "Benz{" +
                super.toString()+
                "temperature=" + temperature +
                '}';
    }
}
