package Task1;

public class Animal {
    public String name;
    private static int animalCount = 0;
    private int path;

    public void run(int path){
        this.path = path;
    }
    public void swim(int path){
        this.path = path;
    }
    public Animal(String name) {
        this.name = name;
        animalCount++;
    }
    public static int getAnimalCount() {
        return animalCount;
    }
}
