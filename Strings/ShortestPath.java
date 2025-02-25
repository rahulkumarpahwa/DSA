package Strings;

public class ShortestPath {
    public static float Shortest(String path) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < path.length(); i++) {
            char direction = path.charAt(i);
            if (direction == 'N') {
                y++; // up
            } else if (direction == 'E') {
                x++;// right

            } else if (direction == 'S') {
                y--;// down

            } else {
                x--;// left
            }

        }

        return (float) Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2)); // Math fxn returns double so we need to convert back to float.
    }

    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(Shortest(path));

    }
}
