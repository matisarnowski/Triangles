public class IsoscelesTriangle extends EquilateralTriangle{
    private double side;
    private double height ;

    public IsoscelesTriangle(double height, double side) {
        super(side, height, side);
        this.side = side;
        this.height = height;
    }

    @Override
    public double calculateField() {
        return side * side * Math.sqrt(3.0) * 0.25;
    }
}
