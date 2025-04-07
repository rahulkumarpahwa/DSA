package ADA;

public class PrimsAlgo {
    public static void main(String[] args) {
        int V = 5; // Number of vertices in the graph
        boolean visited[] = new boolean[V];
        int graph[][] = { { 0, 2, 0, 6, 0 },
                { 2, 0, 3, 8, 5 },
                { 0, 3, 0, 0, 7 },
                { 6, 8, 0, 0, 9 },
                { 0, 5, 7, 9, 0 } };
        int parent[] = new int[V];
        int weights[] = new int[V];
    }
}
