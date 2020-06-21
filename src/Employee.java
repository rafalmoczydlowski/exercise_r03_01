/*/
Klasa praocwnika, który może posiadać wynagrodzenie, impelmentuje interfejs Measurable
 */

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
}
