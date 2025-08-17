import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CycleDetectInUndirectedGraph {
    //    https://www.youtube.com/watch?v=BPlrALf1LDU&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=11
    public static void main(String[] args) {
        int v = 7; // No. of nodes
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= v; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        adjList.get(1).add(2);
        adjList.get(1).add(3);
        adjList.get(2).add(1);
        adjList.get(2).add(5);
        adjList.get(3).add(1);
        adjList.get(3).add(4);
        adjList.get(3).add(6);
        adjList.get(4).add(3);
        adjList.get(5).add(2);
        adjList.get(5).add(7);
        adjList.get(6).add(3);
        adjList.get(6).add(7);
        adjList.get(7).add(5);
        adjList.get(7).add(6);

        // Detect cycle in an Undirected Graph (BFS) or DFS
        // create a queue for storing (node, it's parents node) Pair
        // create a visited array of total no. of node + 1 for 1 based graph
        //      and make source/starting node 1/visited

        System.out.println(isCycle(v, adjList));
    }

    // this Function is using BFS (queue)
    public static boolean checkForCycle(int src, int v, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[src] = true;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(src, -1));
        while (!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for (int adjacentNode : adj.get(node)) {
                if (vis[adjacentNode] == false) {
                    vis[adjacentNode] = true;
                    q.add(new Pair(adjacentNode, node));
                } else if (parent != adjacentNode) {
                    return true;
                }
            }
        }
        return false;
    }

    // Function to detect cycle in an undirected graph
    public static boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[v + 1]; // for 1 based graph
        for (int i = 0; i <= v; i++) vis[i] = false;
        for (int i = 1; i <= v; i++) {
            if (vis[i] == false) {
                if (checkForCycle(i, v, adj, vis)) return true;
            }
        }
        return false;
    }

/*
//https://www.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1
import java.util.*;

class Solution {

    static class Pair {
        int first, second;
        Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }

    public boolean isCycle(int V, int[][] edges) {
        // Step 1: Build adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<Integer>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u); // undirected graph
        }

        // Step 2: Visited array
        boolean[] vis = new boolean[V];

        // Step 3: Check each component
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (checkForCycle(i, adj, vis)) return true;
            }
        }
        return false;
    }

    private boolean checkForCycle(int src, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        Queue<Pair> q = new LinkedList<>();
        vis[src] = true;
        q.add(new Pair(src, -1));

        while (!q.isEmpty()) {
            int node = q.peek().first;
            int parent = q.peek().second;
            q.remove();

            for (int neighbor : adj.get(node)) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(new Pair(neighbor, node));
                } else if (neighbor != parent) {
                    // visited and not parent → cycle found
                    return true;
                }
            }
        }
        return false;
    }
}
 */

//    https://www.youtube.com/watch?v=zQ3zgFypzX4&list=PLgUwDviBIf0oE3gA41TKO2H5bHpPd7fzn&index=12
// this is DFS implementation of cycle present in graph
    // function to detect cycle in an undirected graph
    public boolean isCycleDFS(int v, ArrayList<ArrayList<Integer>> adj){
        int[] vis = new int[v+1];
        for(int i = 0; i<v; i++){
            if(vis[i] == 0){
                if(dfs(i,-1, vis, adj) == true) return true;
            }
        }
        return false;
    }
    private boolean dfs(int node, int parent, int[] vis, ArrayList<ArrayList<Integer>> adj){
        vis[node] = 1;
        for(int adjacentNode: adj.get(node)){
            if(vis[adjacentNode]==0){
                if(dfs(adjacentNode, node, vis, adj)==true) return true;
            }else if(adjacentNode != parent) return true;
        }
        return false;
    }
}
