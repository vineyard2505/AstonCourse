package Task2;

public class Rectangle implements Figure, Filling, Border {
    private String fillColor;
    private String borderColor;
    private double weight;
    private double height;

    public Rectangle(double weight, double height){
        this.weight = weight;
        this.height = height;
    }

    @Override
    public void setBorder(String color) {
        this.borderColor = color;
    }

    @Override
    public double calcPerimeter() {
        return 2 * (weight + height);
    }

    @Override
    public double calcArea() {
        return weight * height;
    }

    @Override
    public void setColor(String color) {
        this.fillColor = color;
    }

    public void printCharacteristics(){
        System.out.println("Прямоугольник:");
        System.out.println("Периметр: " + calcPerimeter());
        System.out.println("Площадь: " + calcArea());
        System.out.println("Заливка: " + fillColor);
        System.out.println("Граница: " + borderColor);
    }
}
