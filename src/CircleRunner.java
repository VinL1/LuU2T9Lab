public class CircleRunner {
    public static void main (String [] args) {
        Circle lol = new Circle (5.0);
        System.out.println (lol.getInfo ());
        lol.setRadius (9.2);
        System.out.println (lol.getInfo ());
        lol.setRadius (Math.PI);
        System.out.println (lol.getInfo ());
    }
}
