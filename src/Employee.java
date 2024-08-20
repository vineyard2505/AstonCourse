public class Employee {
    private String FIO;
    private String post;
    private String email;
    private String numberPhone;
    private double salary;
    private int age;
    public Employee(String FIO, String post, String email, String numberPhone, double salary, int age){
        this.FIO = FIO;
        this.post = post;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }
    public void printEmployee(){
        System.out.println("ФИО: " + FIO);
        System.out.println("Должность: " + post);
        System.out.println("Email: " + email);
        System.out.println("Номер телефона: " + numberPhone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}
