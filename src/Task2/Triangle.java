package Task2;

public class Triangle implements Figure, Filling, Border {
    private double sideOne;
    private double sideTwo;
    private double sideTree;
    private String fillColor;
    private String borderColor;

    public Triangle(double sideOne, double sideTwo, double sideTree){
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideTree = sideTree;
    }
    @Override
    public void setBorder(String color) {
        this.borderColor = color;
    }

    @Override
    public double calcPerimeter() {
        return sideOne + sideTwo + sideTree;
    }

    @Override
    public double calcArea() {
        double halfPerimeter = calcPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) * (halfPerimeter - sideTree));
    }

    @Override
    public void setColor(String color) {
        this.fillColor = color;
    }

    public void printCharacteristics(){
        System.out.println("Треугольник:");
        System.out.println("Периметр: " + calcPerimeter());
        System.out.println("Площадь: " + calcArea());
        System.out.println("Заливка: " + fillColor);
        System.out.println("Граница: " + borderColor);
    }
}
