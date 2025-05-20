public class Sphere extends Circle {

    public Sphere(double radius) {
        super(radius);
    }
    
    public double volume() {
        return Math.PI * Math.pow(this.radius, 3) * (4.0/3.0);
    }
    @Override
    public double area() {
        return 4.0 * Math.PI * Math.pow(this.radius, 2);
    }
}