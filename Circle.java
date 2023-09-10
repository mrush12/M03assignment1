public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius,
            String color, boolean filled) {
        this.radius = radius;
        setColor(color);
        setFilled(filled);
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Print the circle info */
    public void printCircle() {
        System.out.printIn("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    /**
     * @return
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

@Override
public double getPerimeter() {
    return 2 * Math.PI * radius;
}

@Override
    public boolean equals(GeometricObject ) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            return radius == other.radius;
        }
        return false;
    }