import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectInUndirectedGraph {
    public static void main(String[] args) {
        int v = 7; // No. of nodes
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for(int i = 0; i<=v; i++){
            adjList.add(new ArrayList<Integer>());
        }
        adjList.get(1).add(2);  adjList.get(1).add(3);
        adjList.get(2).add(1);  adjList.get(2).add(5);
        adjList.get(3).add(1);  adjList.get(3).add(4);  adjList.get(3).add(6);
        adjList.get(4).add(3);
        adjList.get(5).add(2);  adjList.get(5).add(7);
        adjList.get(6).add(3);  adjList.get(6).add(7);
        adjList.get(7).add(5);  adjList.get(7).add(6);

        // Detect cycle in an Undirected Graph (BFS) or DFS
        // create a queue for storing (node, it's parents node) Pair
        // create a visited array of total no. of node + 1 for 1 based graph
        //      and make source/starting node 1/visited

        System.out.println(isCycle(v,adjList));
    }

    public static boolean checkForCycle(int src, int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis){
        vis[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        while (!q.isEmpty()){
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for(int adjacentNode : adj.get(node)){
                if (vis[adjacentNode] == false){
                    vis[adjacentNode] = true;
                    q.add(new Pair(adjacentNode, node));
                }else if (parent != adjacentNode){
                    return true;
                }
            }
        }
        return false;
    }

    // Function to detect cycle in an undirected graph
    public static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj){
        boolean[] vis = new boolean[v+1]; // for 1 based graph
        for(int i = 0; i<=v; i++) vis[i] = false;
        for (int i = 1; i <= v; i++) {
            if (vis[i] == false){
                if (checkForCycle(i, v, adj, vis)) return true;
            }
        }
        return false;
    }
}
