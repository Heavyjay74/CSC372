public class Sphere extends Shape {
    private double radius;
    public Sphere (double radius)  {
        this.radius = radius;
    }
    @Override
    public double surfaceArea()  {
        return (4 * Math.PI * Math.pow(radius, 2));
    }
    @Override
    public double volume()  {
        return ((double) 4 / 3) * Math.PI * Math.pow(radius, 3);
    }
    @Override
    public String toString()  {
        System.out.printf("The surface area of the Sphere is %.2f%n", surfaceArea());
        System.out.printf("The volume of the sphere is %.2f%n", volume());
        return null;
    }

}
