import java.util.Locale;
import java.util.Scanner;

public class InputDouble {


    private double variableDouble = 1.0;

    public InputDouble(double variableDouble) {
        this.variableDouble = variableDouble;
    }

    public double changeVariableDouble(){
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        return this.variableDouble = scanner.nextDouble();
    }

    public double getVariableDouble() {
        return variableDouble;
    }

    public void setVariableDouble(double variableDouble) {
        this.variableDouble = variableDouble;
    }


}
