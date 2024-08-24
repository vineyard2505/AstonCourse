import Task1.Animal;
import Task1.Bowl;
import Task1.Cat;
import Task1.Dog;
import Task2.Circle;
import Task2.Rectangle;
import Task2.Triangle;

public class Main {
    public static void main(String[] args) {
        // Task 1
        Dog dogBobik = new Dog("Бобик");
        Dog dogValet = new Dog("Валет");
        Cat catSnow = new Cat("Снежок");
        Cat catBublik = new Cat("Бублик");
        dogBobik.run(600);
        dogBobik.swim(50);
        catBublik.run(300);
        catBublik.swim(3);
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        Bowl bowl = new Bowl(10);
        bowl.addFood(9);
        Cat[] cats = {catSnow, catBublik};
        for (Cat cat : cats) {
            cat.eat(bowl);
            System.out.println("Сытость: " + cat.isFull());
        }
        // Task 2
        Circle circle = new Circle(5);
        circle.setColor("Green");
        circle.setBorder("Black");
        circle.printCharacteristics();
        Rectangle rectangle = new Rectangle(5,5);
        rectangle.setColor("Red");
        rectangle.setBorder("Black");
        rectangle.printCharacteristics();
        Triangle triangle = new Triangle(5,6,7);
        triangle.setColor("Grey");
        triangle.setBorder("Black");
        triangle.printCharacteristics();
    }
}