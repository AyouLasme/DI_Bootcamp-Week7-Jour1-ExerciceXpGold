import Exercice1.Rectangle;
import Exercice1.Shape;
import Exercice1.Square;

public class Main {
    public static void main(String[] args) {
        Shape rectangle1 = new Rectangle(10,24);
        System.out.println("La surface du rextangle est: " + rectangle1.getArea());

        Shape square1 = new Square(20);
        System.out.println("La surface du carré est: " + square1.getArea());

    }
}