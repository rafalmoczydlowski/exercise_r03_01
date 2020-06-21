/*/
Klasa obliczająca średnią przesłanych wynagrodzeń oraz największe wynagrodzenie z przesłanych
 */

public class Data {

    private Measurable[] list;

    public Data(Measurable[] objects) {
        list = objects;
    }

    public double getAverage() {
        return Employee.getAverage(list);
    }

    public Measurable largest() {
        return Employee.largest(list);
    }
}
