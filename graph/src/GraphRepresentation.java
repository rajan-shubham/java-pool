import java.util.ArrayList;

public class GraphRepresentation {
    public static void main(String[] args) {
        /*
        given input UNDIRECTED GRAPHS
        N : no. of nodes
        M : no. of edges

        M lines (edges in any order): 1 2, 1 3, 3 4, 2 4, 2 5, 4 5

        STORE: (DATA STRUCTURE)
        1. adjacency Matrix
        2. adjacency List

        1. for 1 based graph (matrix space comp. n^2)
        define adj[n+1][n+1]
        --> intersection of nodes put 1 (ex: for both 1 2 and 2 1)
        --> remaining are filled with 0
         */
        int n = 3, m = 3;
        int adj[][] = new int[n+1][n+1];
        // dege 1--2
        adj[1][2] = 1; adj[2][1] = 1;

        // edge 2 -- 3
        adj[2][3] = 1; adj[3][2] = 1;

        // edge 1--3
        adj[1][3] = 1; adj[3][1] = 1;

//        adj[u][v] = 1; adj[v][u] = 1;

        /*
        ArrayList<ArrayList<>> adjList
        // run a loop and add exactly n+1 ArrayList to it
         */

        n = 3; m = 3;
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<=n; i++){
            adjList.add(new ArrayList<Integer>());
        }
        // edge 1--2
        adjList.get(1).add(2);
        adjList.get(2).add(1);

        // edge 2--3
        adjList.get(2).add(3);
        adjList.get(3).add(2);

        // edge 1--3
        adjList.get(1).add(3);
        adjList.get(3).add(1);

        // print all the edges // space comp O(2*Edges)
        for(int i = 1; i<=n; i++){ // for each node there adjacency list (or there connected neighbor edges)
            System.out.print("The neighbour of " + i  + " node is: ");
            for(int j = 0; j<adjList.get(i).size(); j++){
                System.out.print(adjList.get(i).get(j)+ " ");
            }
            System.out.println();
        }

        /*
        for any disconnected graph
        it's components are not connected by an edge so how we can traverse it
        so to reach its different components, in any graph traversal
        we use visitedArray

        suppose we have 10 nodes, so to traverse each
        for(i = 1 to 10){
            if(!visited[i]){
                traverse(i);}}
         */
    }
}
