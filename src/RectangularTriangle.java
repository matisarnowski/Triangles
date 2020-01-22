public class RectangularTriangle extends PlainTriangle{
    private double firstSideOfTheSide;
    private double secondSideOfTheSide;
    private double side;

    public RectangularTriangle(double firstSideOfTheSide, double secondSideOfTheSide, double side) {
        super(firstSideOfTheSide, secondSideOfTheSide, secondSideOfTheSide, side);
        this.firstSideOfTheSide = firstSideOfTheSide;
        this.secondSideOfTheSide = secondSideOfTheSide;
        this.side = side;
    }
}
