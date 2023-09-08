public class Cone extends Shape {
    private double radius;
    private double height;
    public Cone(double radius, double height)  {
        this.radius = radius;
        this.height = height;
    }
    @Override
    public double surfaceArea()  {
        return (radius * Math.PI * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2))));
    }
    @Override
    public double volume() {
        return (Math.PI * Math.pow(radius, 2) * (height / 3));
    }
    @Override
    public String toString()  {
        System.out.printf("The surface area of the cone is %.2f%n", surfaceArea());
        System.out.printf("The volume of the cone is %.2f%n", volume());
        return null;
    }
}