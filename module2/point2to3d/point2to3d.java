package point2to3d;

class Point2D {
    private float x;
    private float y;

    public Point2D() {
        this(0.0f, 0.0f);
    }

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float[] getXY() {
        return new float[]{x, y};
    }


    @Override
    public String toString() {
        return "x: " + x + ", y: " + y;
    }
}

class Point3D extends Point2D {
    private float z;

    public Point3D() {
        this(0.0f, 0.0f, 0.0f);
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", z: " + z;
    }
}
