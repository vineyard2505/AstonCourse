public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1 и 2");
        Employee[] employeesArray = new Employee[5];
        employeesArray[0] = new Employee("Петров Юрий Алексеевич", "Разработчик", "petr113@gmail.com","+375333399222",6000.05,30);
        employeesArray[1] = new Employee("Виноградова Татьяна Владимировна", "Стажер", "vino113@gmail.com","+375333399888",3000.05,22);
        employeesArray[2] = new Employee("Сергеев Алексей Андреевич", "Тестировщик", "Serg@gmail.com","+375333355522",5000.05,28);
        employeesArray[3] = new Employee("Дробышев Иван Юрьевич", "Разработчик", "drob13@gmail.com","+375298899222",6400.05,25);
        employeesArray[4] = new Employee("Свиридо Николай Владимирович", "Стажер", "Svirido13@gmail.com","+375298800444",2500.10,21);
        employeesArray[1].printEmployee();
        System.out.println("Задание 3");
        Park park1 = new Park("Юбилейный", 3);
        park1.addAttraction("Американские горки", "10:00 - 22:00", 6);
        park1.addAttraction("Колесо обозрения", "09:00 - 21:00", 7);
        park1.printNameAttractions();
    }
}