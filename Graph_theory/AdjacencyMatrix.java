import java.util.Scanner;

public class AdjacencyMatrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int graph[][] = new int[n][n];

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        System.out.println("Enter edges:");

        for(int i=0;i<e;i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph[u][v] = 1;
            graph[v][u] = 1;   // Undirected Graph
        }

        System.out.println("Adjacency Matrix:");

        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}