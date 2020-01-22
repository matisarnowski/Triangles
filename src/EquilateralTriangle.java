public class EquilateralTriangle extends PlainTriangle{
    private double side;

    public EquilateralTriangle(double basis, double height, double side) {
        super(basis, height, side, side);
        this.side = side;
    }
}
