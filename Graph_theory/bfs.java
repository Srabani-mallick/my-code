import java.util.Scanner;

public class bfs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter adjacency matrix:");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                graph[i][j] = sc.nextInt();

        boolean[] visited = new boolean[n];
        int[] queue = new int[n];

        int front=0,rear=0;

        queue[rear++] = 0;
        visited[0] = true;

        System.out.print("BFS Traversal: ");

        while(front < rear) {
            int v = queue[front++];

            System.out.print(v + " ");

            for(int i=0;i<n;i++) {
                if(graph[v][i]==1 && !visited[i]) {
                    visited[i] = true;
                    queue[rear++] = i;
                }
            }
        }
    }
}