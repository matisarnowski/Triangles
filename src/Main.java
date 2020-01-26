import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        isPlainTriangle();
        isEquilateralTriangle();
        isIsoscelesTriangle();
        isRectangularTriangle();

        System.out.println("The End!!!");
    }

    private static void isPlainTriangle(){
        System.out.println("Teraz policzymy obwód i pole najzwyklejszego trójkąta. ");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj długość podstawy trójkąta: ");
        double basis1 = scanner.nextDouble();
        System.out.println("Podaj długość wysokości trójkąta: ");
        double heiht1 = scanner.nextDouble();
        System.out.println("Podaj długość drugiego boku trójkąta: ");
        double firstSide1 = scanner.nextDouble();
        System.out.println("Podaj długość trzeciego boku trójkąta: ");
        double secondSide1 = scanner.nextDouble();

        PlainTriangle plaintriangle = new PlainTriangle(basis1, heiht1, firstSide1, secondSide1);

        System.out.println("Pole tego trójkąta, to: " + plaintriangle.calculateField() + "!");
        System.out.println("Obwód tego trójkąta, to: " + plaintriangle.calculateTheCircumference() + "!");
    }

    private static void isEquilateralTriangle(){
        System.out.println("Teraz policzymy obwód i pole trójkąta równoramiennego. ");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj długość podstawy trójkąta równoramiennego: ");
        double basis1 = scanner.nextDouble();
        System.out.println("Podaj długość wysokości trójkąta równoramiennego: ");
        double heiht1 = scanner.nextDouble();
        System.out.println("Podaj długość ramienia trójkąta równoramiennego: ");
        double side1 = scanner.nextDouble();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(basis1, heiht1, side1);

        System.out.println("Pole tego trójkąta, to: " + equilateralTriangle.calculateField() + "!");
        System.out.println("Obwód tego trójkąta, to: " + equilateralTriangle.calculateTheCircumference() + "!");
    }

    private static void isIsoscelesTriangle(){
        System.out.println("Teraz policzymy obwód i pole trójkąta równobocznego. ");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj długość boku trójkąta równobocznego: ");
        double side1 = scanner.nextDouble();
        double height1 = side1 * Math.sqrt(3.0) * 0.5;

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(side1, height1);

        System.out.println("Pole tego trójkąta, to: " + isoscelesTriangle.calculateField() + "!");
        System.out.println("Obwód tego trójkąta, to: " + isoscelesTriangle.calculateTheCircumference() + "!");
    }

    private static void isRectangularTriangle(){
        System.out.println("Teraz policzymy obwód i pole trójkąta prostokątnego. ");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj długość pierwszej przyprostokątnej trójkąta prostokątnego: ");
        double firstSideOfTheSide1 = scanner.nextDouble();
        System.out.println("Podaj długość drugiej przyprostokątnej trójkąta prostokątnego: ");
        double secondSideOfTheSide1 = scanner.nextDouble();
        System.out.println("Podaj długość ramienia trójkąta równoramiennego: ");
        double side1 = Math.sqrt(firstSideOfTheSide1 * firstSideOfTheSide1 + secondSideOfTheSide1 * secondSideOfTheSide1);

        RectangularTriangle rectangularTriangle = new RectangularTriangle(firstSideOfTheSide1, secondSideOfTheSide1, side1);

        System.out.println("Pole tego trójkąta, to: " + rectangularTriangle.calculateField() + "!");
        System.out.println("Obwód tego trójkąta, to: " + rectangularTriangle.calculateTheCircumference() + "!");
    }
}
