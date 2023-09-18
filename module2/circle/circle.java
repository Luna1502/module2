package circle;

class Circle {
    private final double radius;
    private final String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }



    public String getColor() {
        return color;
    }


    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Cylinder extends Circle {
    private final double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }


    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Bán kính: " + getRadius() + " Chiều cao: " + height + " Màu: " + getColor();
    }
}

class Test {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder(4.5, "red", 7.0);
        System.out.println(c1);
        System.out.println("Diện tích là: " + c1.getArea());
        System.out.println("Thể tích là: " + c1.getVolume());
    }
}

