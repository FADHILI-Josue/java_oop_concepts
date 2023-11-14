import java.io.Serializable;

public class Car implements RadioTv, Serializable {
    private String color;
    public static final String ANSI_RED = "\u001B[31m";
    private int numberOfSeats;
    private int minHeight;

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", minHeight=" + minHeight +
                ", maxHeight=" + maxHeight +
                '}';
    }

    private int maxHeight;

    Car(String color, int numberOfSeats, int minHeight, int maxHeight){
        if(numberOfSeats > 100) try {
            throw new CarSeatsException("the number of seats beyond 100");
        } catch (CarSeatsException e) {
            System.out.println(ANSI_RED+e.getMessage());
        }
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setMinHeight(int minHeight) {
        this.minHeight = minHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    public String getColor() {
        return color;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public int getMinHeight() {
        return minHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void watchTelevision() {
        System.out.println(" watching a television");
    }

    @Override
    public void playRadio() {
        System.out.println(" playing a radio");
    }
}
