public class PlainTriangle {
    private double basis;
    private double height;
    private double firstSide;
    private double secondSide;

    public PlainTriangle(double basis, double height, double firstSide, double secondSide) {
        this.basis = basis;
        this.height = height;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public double calculateTheCircumference(){
        return basis + firstSide + secondSide;
    }

    public double calculateField(){
        return 0.5 * height * basis;
    }
}
