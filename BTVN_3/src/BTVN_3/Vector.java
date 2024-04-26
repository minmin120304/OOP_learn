import java.util.Scanner;

class Vector {
    private final double[] coords;

    public Vector(int n) {
        coords = new double[n];
    }

    public Vector add(Vector v) {
        Vector sum = new Vector(coords.length);
        for(int i=0; i<coords.length; i++) {
            sum.coords[i] = this.coords[i] + v.coords[i];
        }
        return sum;
    }

    public Vector difference(Vector v) {
        Vector diff = new Vector(coords.length);
        for(int i=0; i<coords.length; i++) {
            diff.coords[i] = this.coords[i] - v.coords[i];
        }
        return diff;
    }

    public double scalarProduct(Vector v) {
        double product = 0;
        for(int i=0; i<coords.length; i++) {
            product += this.coords[i] * v.coords[i];
        }
        return product;
    }

    public Vector product(double c) {
        Vector prod = new Vector(coords.length);
        for(int i=0; i<coords.length; i++) {
        }
        return prod;
    }

    public double length() {
        double sum = 0;
        for(int i=0; i<coords.length; i++) {
            sum += coords[i] * coords[i];
        }
        return Math.sqrt(sum);
    }

    public Vector normalize() {
        double len = length();
        Vector norm = new Vector(coords.length);
        for(int i=0; i<coords.length; i++) {
        }
        return norm;
    }

    public void enter() {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<coords.length; i++) {
            coords[i] = sc.nextDouble();
        }
    }

    public void print() {
        for(int i=0; i<coords.length; i++) {
            System.out.print(coords[i] + " ");
        }
        System.out.println();
    }

    public boolean isCollinear(Vector v) {
        return scalarProduct(v) == length() * v.length();
    }

    public boolean isPerpendicular(Vector v) {
        return scalarProduct(v) == 0;
    }

}
