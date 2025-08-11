import java.util.ArrayList;

public class DFSgraph {
    public static void main(String[] args) {
        int v = 8; // No. of nodes/vertices
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<=v; i++) adjList.add(new ArrayList<>());

        adjList.get(1).add(2);  adjList.get(1).add(3);
        adjList.get(2).add(1);  adjList.get(2).add(5);  adjList.get(2).add(6);
        adjList.get(3).add(1);  adjList.get(3).add(4);  adjList.get(3).add(7);
        adjList.get(4).add(3);  adjList.get(4).add(8);
        adjList.get(5).add(2);
        adjList.get(6).add(2);
        adjList.get(7).add(3);  adjList.get(7).add(8);
        adjList.get(8).add(4);  adjList.get(8).add(7);

        // the result of dfs traversal of graph is depends upon the adjacency list
        ArrayList<Integer> bfsGraphResult = dfsOfGraph(v, adjList);
        System.out.println(bfsGraphResult);
    }

    // function to return a list containing the DFS traversal of the graph
    public static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v+1]; // boolean array to keep track of visited vertices
        vis[1] = true;
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(1, vis, adj, ls);
        return ls;
    }

    public static void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls){
        // marking current node as visited
        vis[node] = true;
        ls.add(node);

        // getting neighbour nodes
        for(Integer it : adj.get(node)){
            if (vis[it] == false){
                dfs(it, vis, adj, ls);
            }
        }
    }
}
