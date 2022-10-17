public class RightTriangleRunner {
    public static void main (String [] args) {
        RightTriangle triangle1 = new RightTriangle (3, 4);
        RightTriangle triangle2 = new RightTriangle (6.5, 10.7);

        double hypotneuse1 = triangle1.hypotneuse ();
        double hypotneuse2 = triangle2.hypotneuse ();

        System.out.println (hypotneuse1 + "\n" + hypotneuse2);
    }
}
