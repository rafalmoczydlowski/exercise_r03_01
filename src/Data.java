/*/
Klasa obliczająca średnią przesłanych wynagrodzeń
 */

public class Data {

    private Measurable[] list;

    public Data(Measurable[] objects) {
        list = objects;
    }

    public double getAverage() {
        return Employee.getAverage(list);
    }
}
