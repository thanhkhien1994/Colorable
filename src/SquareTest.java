public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square.toString());
        square.setSide(14);
        System.out.println(square.toString());
        square.howToColor();
    }
}
