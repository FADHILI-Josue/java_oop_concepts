public class CarSeatsException extends Exception {
    CarSeatsException(){
        super("something went wrong");
    }
    CarSeatsException(String message) {
        super(message);
    }
}