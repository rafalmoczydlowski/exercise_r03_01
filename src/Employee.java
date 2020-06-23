/*/
Klasa praocwnika, który może posiadać wynagrodzenie, impelmentuje interfejs Measurable
 */

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

public class Employee implements Measurable {

    private String name;
    private double salary;

    // konstruktor tworzący nowego pracownika z przypisanym do niego wynagrodzeniem
    public Employee(String employeeName, double employeeSalary){
        name = employeeName;
        salary = employeeSalary;
    }

    // metoda wyliczająca średnią wynagrodzeń pracowników
    static double getAverage(Measurable [] objects) {
        if (objects.length == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (Measurable object : objects) {
            sum += object.getMeasure();
        }
        return sum/objects.length;
    }

    // metoda zwracająca najwyższe wynagrodzenie z przesłanych do tablicy
    static Measurable largest (Measurable[] objects) {
        if (objects.length ==0) {
            return null;
        }
        Measurable max = objects[0];
        for (Measurable next : objects) {
            if (next.isGreaterThan(max)) {
                max = next;
            }
        }
        return max;
    }

    // metoda zwracająca w formie Stringa obiekty posegregowane rosnąco według wynagrodzenia; jeśli wynagrodzenie jest takie samo drugim parametrem porównywanym jest imię
    @NotNull
    static String sortingAscending (Measurable[] objects) {
        Arrays.sort(objects, Comparator.comparing(Measurable::getSalary).thenComparing(Measurable::getName));
        System.out.println("// Sorted ascending by salary:");
        return (Arrays.toString(objects).replace(",", "\n"));
    }

    // metoda zwracająca w formie Stringa obiekty posegregowane malejąco według wynagrodzenia; jeśli wynagrodzenie jest takie samo drugim parametrem porównywanym jest imię
    @NotNull
    static String sortingDescending (Measurable[] objects) {
        Arrays.sort(objects, Comparator.comparing(Measurable::getSalary).thenComparing(Measurable::getName).reversed());
        System.out.println("// Sorted descending by salary:");
        return (Arrays.toString(objects).replace(",", "\n"));
    }

    // metoda implememntuje abstrakcyjną metodę interfejsu Measurable [wymagane!] i zwraca bieżące wynagrodzenie
    @Override
    public double getMeasure() {
        return salary;
    }

    // metoda implememntuje abstrakcyjną metodę interfejsu Measurable [wymagane!] i zwraca imię pracownika
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee salary = " + salary + " name = " + name;
    }
}
