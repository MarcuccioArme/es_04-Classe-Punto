public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto(Punto altro) {
        this.x = altro.x;
        this.y = altro.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distanzaOrigine() {
        return Math.sqrt(x * x + y * y);
    }

    public double distanzaDaPunto(Punto altro) {
        double dx = x - altro.x;
        double dy = y - altro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Punto simmetricoOrigine() {
        return new Punto(-x, -y);
    }

    public boolean coincideCon(Punto altro) {
        return x == altro.x && y == altro.y;
    }

    public static void main(String[] args) {
        Punto p1 = new Punto(1, 2);
        Punto p2 = new Punto(p1);
        System.out.println(p1.getX() + " " + p1.getY());  // output: 1.0 2.0
        System.out.println(p2.getX() + " " + p2.getY());  // output: 1.0 2.0
        p1.setX(3);
        System.out.println(p1.getX() + " " + p1.getY());  // output: 3.0 2.0
        System.out.println(p2.getX() + " " + p2.getY());  // output: 1.0 2.0
        System.out.println(p1.distanzaOrigine());  // output: 3.605551275463989
        System.out.println(p1.distanzaDaPunto(p2));  // output: 2.0
        Punto p3 = p1.simmetricoOrigine();
        System.out.println(p3.getX() + " " + p3.getY());  // output: -3.0 -2.0
        System.out.println(p1.coincideCon(p2));  // output: false
        System.out.println(p2.coincideCon(new Punto(1, 2)));  // output: true
    }
}