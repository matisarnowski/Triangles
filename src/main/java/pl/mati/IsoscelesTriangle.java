package pl.mati;

public class IsoscelesTriangle extends EquilateralTriangle{
    private double side;

    public IsoscelesTriangle(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public void calculateField() {
        System.out.println("Pole wynosi: " + side * side * Math.sqrt(3.0) * 0.25);
    }
}
