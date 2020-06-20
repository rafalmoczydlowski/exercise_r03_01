/*/
Klasa praocwnika, który może posiadać wynagrodzenie, impelmentuje interfejs Measurable
 */

public class Employee implements Measurable {

    private double salary;

    // konstruktor tworzący nowego pracownika z przypisanym do niego wynagrodzeniem
    public Employee(double employeeSalary){
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

    // metoda implememntuje abstrakcyjną metodę interfejsu Measurable [wymagane!] i zwraca bieżące wynagrodzenie
    @Override
    public double getMeasure() {
        return salary;
    }
}
