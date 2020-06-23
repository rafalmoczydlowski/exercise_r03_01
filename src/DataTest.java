/*/
Klasa testująca metody getAverage i metodę getSalary z klasy Employee
/*/
public class DataTest {
    public static void main(String [] args) {
        Measurable [] objects = {
                new Employee("Steve", 70.00),
                new Employee("Pablo", 20.00),
                new Employee("Vaclik", 20.00),
        };
        Data data = new Data(objects);
        System.out.println("===========================");
        System.out.println("Number of employees: " + objects.length);
        for (int i = 0; i < objects.length; i++) {
            System.out.println(i+1 + " employee salary: " +objects[i].getSalary());
        }
        System.out.println("Average salary of employees: " + data.getAverage());

        System.out.println("Employee with the highest salary is " + data.largest().getName());
        System.out.println("===========================");
        System.out.println(data.sortingAscending());
        System.out.println("===========================");
        System.out.println(data.sortingDescending());
    }
}
