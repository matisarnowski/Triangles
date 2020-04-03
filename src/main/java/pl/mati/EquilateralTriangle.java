package pl.mati;

public class EquilateralTriangle extends PlainTriangle{
    private double side;

    public EquilateralTriangle(double basis, double side) {
        super(basis,  side, side);
        this.side = side;
    }
}
