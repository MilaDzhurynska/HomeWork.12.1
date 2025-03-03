public class Run {
    public static void main(String[] args) {
        Employee em = new Employee("Alex Fox", "developer", "afox@gmail.com", "12345", 35);
        em.printInfo();

        System.out.println();

        Car myCar = new Car();
        myCar.start();
    }
}
