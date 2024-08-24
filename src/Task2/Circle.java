package Task2;

public class Circle implements Figure, Filling, Border {
    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void setBorder(String color) {
        this.borderColor = color;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void setColor(String color) {
        this.fillColor = color;
    }

    public void printCharacteristics(){
        System.out.println("Круг:");
        System.out.println("Периметр: " + calcPerimeter());
        System.out.println("Площадь: " + calcArea());
        System.out.println("Заливка: " + fillColor);
        System.out.println("Граница: " + borderColor);
    }
}
