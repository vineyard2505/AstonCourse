package Task1;

public class Bowl {
    private int foodBowl;

    public Bowl(int foodBowl) {
        this.foodBowl = foodBowl;
    }
    public int getFoodBowl() {
        return foodBowl;
    }
    public void underFood(int amount) {
        if (foodBowl - amount >= 0) {
            foodBowl -= amount;
        } else {
            System.out.println("В тарелке недостаточно еды");
        }
    }
    public void addFood(int amount) {
        if (amount > 0) {
            foodBowl += amount;
            System.out.println("В тарелку добавлено " + amount + " порций еды");
        }
    }
}
