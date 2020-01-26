import org.w3c.dom.ls.LSOutput;

public class PlainTriangle {
    private double basis;
    private double height;
    private double firstSide;
    private double secondSide;

    public PlainTriangle(double basis, double firstSide, double secondSide) {
        this.basis = basis;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        setHeight(calculateHeight());
    }

    public void calculateTheCircumference(){
        if (isTrue()){
            System.out.println("Obwód wynosi: " + (basis + firstSide + secondSide));
        }
        else System.out.println("Nie można policzyć obwodu trójkąta, który nie może zaistnieć. ");
    }

    public void calculateField(){
        if (isTrue()){
            System.out.println("Pole wynosi: " + (0.5 * height * basis));
        }
        else System.out.println("Nie można policzyć pola trójkąta, który nie może zaistnieć. ");

    }

    public boolean isTrue(){
        if (basis + firstSide > secondSide){
            return true;
        }
        else if(basis < firstSide + secondSide){
            return true;
        }
        else if(basis + secondSide > firstSide){
            return true;
        }
        else return false;
    }

    public double calculateHeight(){
        double p = 0.5 * (basis + firstSide + secondSide);
        this.height = 2.0 * (Math.sqrt(p*(p - basis)*(p - firstSide)*(p - secondSide)) / basis);
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
