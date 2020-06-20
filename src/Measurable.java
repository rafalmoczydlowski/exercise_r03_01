/*/
Interfejs opisujący każdą klasę, której obiekty można zmierzyć
 */

public interface Measurable {
    // abstrakcyjna metoda, która oblicza miarę obiektu
    double getMeasure();

    // domyślna metoda interfejsu, jeśli nie będzie zastąpiona w klasie implementującej to zostanie ona oddziedziczona w tej postaci
    default double getSalary(){
        return this.getMeasure();
    }
}
