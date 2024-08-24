package Task1;

public class Dog extends Animal {
    private static int dogCount = 0;

    @Override
    public void run(int path) {
        super.run(path);
        if (path <= 500) {
            System.out.println(name + " пробежал " + path);
        } else {
            System.out.println(name + " не может пробежать эту дистанцию");
        }
    }
    @Override
    public void swim(int path) {
        super.swim(path);
        if (path <= 10) {
            System.out.println(name + " проплыл " + path);
        } else {
            System.out.println(name + " не может проплыть эту дистанцию");
        }
    }
    public Dog(String name) {
        super(name);
        dogCount++;
    }
    public static int getDogCount() {
        return dogCount;
    }
}
