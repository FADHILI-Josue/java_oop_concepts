import java.io.*;
public class Main {
    public static void main(String[] args) {
        insertCarInFile();
        getCarFromFile();

//        you can create the new benz cars and toyota cars using
//        you can create new toyota cars
//        Toyota toyota1 = new Toyota("red", 23,400,500);
//        every class have getters and setters and well-defined toString methods which override the native one
        Benz benz1 = new Benz("red", 10);
//        you can change the benz temp or get it using
        benz1.manageTemperature(); // you get the current temp
//        benz1.manageTemperature(50); // or set your custom temp
//        benz1.playRadio(); // this will play the radio, functions the same also as the toyota car
//        benz1.watchTelevision(); // this will show the tv, functions the same as on the toyota car

    }
    public static void insertCarInFile() {
        Car car = new Car("red", 133,400,500);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("car.ser"))) {
            oos.writeObject(car);
            System.out.println("Car serialized successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void getCarFromFile() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("car.ser"))) {
            Car deserializedCar = (Car) ois.readObject();
            System.out.println("Car deserialized successfully.");
            System.out.println(deserializedCar);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
