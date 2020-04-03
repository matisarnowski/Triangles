package pl.mati;

public class RectangularTriangle extends PlainTriangle{
        private double firstSide;
        private double secondSide;
        private double thirdSide;

    public RectangularTriangle(double firstSide, double secondSide, double thirdSide) {
        super(firstSide, secondSide, thirdSide);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }
}
