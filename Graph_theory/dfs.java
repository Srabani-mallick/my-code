public class dfs {

   public  static void dfs(int graph[][],boolean visited[],int v) {

        visited[v] = true;

        System.out.print(v + " ");

        for(int i=0;i<graph.length;i++) {

            if(graph[v][i] == 1 &&
               !visited[i]) {

                dfs(graph, visited, i);
            }
        }
    }

    public static void main(String[] args) {

        int graph[][] = {
                {0,1,1,0,0},
                {1,0,0,1,0},
                {1,0,0,1,1},
                {0,1,1,0,1},
                {0,0,1,1,0}
        };

        boolean visited[] =
                new boolean[5];

        dfs(graph, visited, 0);
    }
}