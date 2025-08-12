import java.util.ArrayList;

public class NoOfProvienceConnectedComponent {
    public static void main(String[] args) {
        // No. of Disconnected components in a graph
        // space comp : O(N) visitedArray + O(N) stackSpaceRecursion
        // Time comp : O(N) + O(V + 2E)
    }

    public static int numProvinces(ArrayList<ArrayList<Integer>> adj, int v){
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        // to change adjacency matrix to Adj List
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                if (adj.get(i).get(j) == 1 && i!=j){
                    adjList.get(i).add(j);
                    adjList.get(j).add(i);
                }
            }
        }
        int[] vis = new int[v];
        int count = 0;
        for (int i = 0; i < v; i++) {
            if (vis[i] == 0){
                count++;
                dfs(i, adjList, vis);
            }
        }
        return count;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adjList, int[] vis){
        vis[node] = 1;
        for(Integer it: adjList.get(node)){
            if (vis[it] == 0){
                dfs(it, adjList, vis);
            }
        }
    }
}
