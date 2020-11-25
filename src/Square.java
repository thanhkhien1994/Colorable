public class Square extends Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public Square(String color, boolean filled, int side) {
        super(color, filled);
        this.side = side;
    }

    public Square() {
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getArea(){
        return side*side;
    }
    public double getPrimate(){
        return side*4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                "Area="+getArea()+
                "Primate="+getPrimate()+
                '}';
    }
}
