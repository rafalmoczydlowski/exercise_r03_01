/*/
Klasa obliczająca średnią przesłanych wynagrodzeń, największe wynagrodzenie z przesłanych oraz układa obiekty rosnąco i malejąco według zarobków
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

    public String sortingAscending() {return Employee.sortingAscending(list); }

    public String sortingDescending() {return Employee.sortingDescending(list); }
}
