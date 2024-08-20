public class Park {
    private String namePark;
    private Attraction[] attractions;
    private int attractionCount;

    public Park(String namePark, int maxAttractions){
        this.namePark = namePark;
        this.attractions = new Attraction[maxAttractions];
        this.attractionCount = 0;
    }

    public void addAttraction(String nameAttraction, String time, double cost){
        if (attractionCount < attractions.length) {
            attractions[attractionCount++] = new Attraction(nameAttraction, time, cost);
        } else {
            System.out.println("Невозможно добавить аттракцион: максимальное количество достигнуто.");
        }
    }

    public void printNameAttractions(){
        System.out.println("Аттракционы в парке " + namePark + ":");
        for (int i = 0; i < attractionCount; i++) {
            System.out.println(attractions[i]);
        }
    }

    private class Attraction{
        private String nameAttraction;
        private String time;
        private double cost;

        public Attraction(String nameAttraction, String time, double cost){
            this.nameAttraction = nameAttraction;
            this.time = time;
            this.cost = cost;
        }
        @Override
        public String toString() {
            return "Аттракцион: " + nameAttraction + ", Время работы: " + time + ", Стоимость: " + cost + " руб";
        }
    }
}
