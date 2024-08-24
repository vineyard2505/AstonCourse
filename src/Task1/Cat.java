package Task1;

public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull;

    @Override
    public void run(int path) {
        super.run(path);
        if (path <= 200) {
            System.out.println(name + " пробежал " + path);
        } else {
            System.out.println(name + " не может пробежать эту дистанцию");
        }
    }
    @Override
    public void swim(int path) {
        super.swim(path);
        System.out.println(name + " не умеет плавать");
    }
    public Cat(String name) {
        super(name);
        catCount++;
        this.isFull = false;
    }
    public static int getCatCount() {
        return catCount;
    }
    public void eat(Bowl bowl) {
        int foodAmount = 10;
        if (bowl.getFoodBowl() >= foodAmount) {
            bowl.underFood(foodAmount);
            this.isFull = true;
            System.out.println(name + " покушал и теперь сыт.");
        } else {
            this.isFull = false;
            System.out.println(name + " не может покушать. В тарелке недостаточно еды.");
        }
    }
    public boolean isFull() {
        return isFull;
    }
}
