
public class InvalidAgeException extends Exception {

    public InvalidAgeException(String message) {
        super(message); //super(message) ifadesi, bir alt sınıfın üst sınıfın constructor'ını çağırmak için kullanılır
    }
}
