/*/
Interfejs opisujący każdą klasę, której obiekty można zmierzyć
 */

public interface Measurable {
    // abstrakcyjna metoda, która oblicza miarę obiektu
    double getMeasure();

    // abstrakcyjna metoda, która pobiera imię pracownika
    String getName();

    // domyślne metody interfejsu, jeśli nie będą zastąpione w klasie implementującej to zostaną one oddziedziczone w tej postaci
    default double getSalary(){
        return this.getMeasure();
    }

    default boolean isGreaterThan(Measurable other) {
        return this.getMeasure() > other.getMeasure(); // zwraca true lub false w zależności czy aktualna wartość obiektu jest większa od innej, służy do wyznaczenia najwyższego wynagrodzenia
    }
}
