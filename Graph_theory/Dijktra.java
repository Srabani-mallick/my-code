import java.util.Scanner;

public class Dijktra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter weighted adjacency matrix:");
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                graph[i][j] = sc.nextInt();

        int[] dist = new int[n];
        boolean[] visited = new boolean[n];

        for(int i=0;i<n;i++)
            dist[i] = 9999;

        dist[0] = 0;

        for(int count=0; count<n-1; count++) {

            int min=9999,u=-1;

            for(int i=0;i<n;i++)
                if(!visited[i] && dist[i]<min) {
                    min = dist[i];
                    u = i;
                }

            visited[u] = true;

            for(int v=0;v<n;v++)
                if(graph[u][v]!=0 &&
                   dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u]+graph[u][v];
        }

        System.out.println("Shortest Distances:");
        for(int i=0;i<n;i++)
            System.out.println("0 -> "+i+" = "+dist[i]);
    }
}