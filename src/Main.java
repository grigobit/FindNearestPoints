import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] pairs = {{-1, 3}, {-1, -1}, {1, 1}, {2, 0.5}, {2, -1}, {3, 3}, {4, 2}, {4, -0.5}};

        int p1 = 0;
        int p2 = 1;
        double shortestDistance = distance(pairs[p1][0], pairs[p1][1], pairs[p2][0], pairs[p2][1]);

        for (int i = 0; i < pairs.length; i++) {
            for (int j = i + 1; j < pairs.length; j++) {
                double distance = distance(pairs[i][0], pairs[i][1], pairs[j][0], pairs[j][1]);

                if (shortestDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortestDistance = distance;
                }
            }
        }
        System.out.println("The closest two points are " + "(" + pairs[p1][0] + "," + pairs[p1][1] + ")" +
                " and (" + pairs[p2][0] + "," + pairs[p2][1] + ")");
    }

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}