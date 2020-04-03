package pl.mati;

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
        System.out.println("Podaj długość drugiego boku trójkąta: ");
        double firstSide1 = scanner.nextDouble();
        System.out.println("Podaj długość trzeciego boku trójkąta: ");
        double secondSide1 = scanner.nextDouble();

        PlainTriangle plaintriangle = new PlainTriangle(basis1, firstSide1, secondSide1);

        plaintriangle.calculateField();
        plaintriangle.calculateTheCircumference();
        System.out.println(plaintriangle.calculateHeight());
    }

    private static void isEquilateralTriangle(){
        System.out.println("Teraz policzymy obwód i pole trójkąta równoramiennego. ");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj długość podstawy trójkąta równoramiennego: ");
        double basis1 = scanner.nextDouble();
        System.out.println("Podaj długość ramienia trójkąta równoramiennego: ");
        double side1 = scanner.nextDouble();

        EquilateralTriangle equilateralTriangle = new EquilateralTriangle(basis1, side1);

        equilateralTriangle.calculateField();
        equilateralTriangle.calculateTheCircumference();
    }

    private static void isIsoscelesTriangle(){
        System.out.println("Teraz policzymy obwód i pole trójkąta równobocznego. ");

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj długość boku trójkąta równobocznego: ");
        double side1 = scanner.nextDouble();

        IsoscelesTriangle isoscelesTriangle = new IsoscelesTriangle(side1);

        isoscelesTriangle.calculateField();
        isoscelesTriangle.calculateTheCircumference();
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

        rectangularTriangle.calculateField();
        rectangularTriangle.calculateTheCircumference();
    }
}
