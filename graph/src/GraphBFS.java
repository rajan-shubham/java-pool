import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class GraphBFS {
    public static void main(String[] args) {
        System.out.println("Graphs Breadth First Search");
        /*
        Initial configuration for graph BFS
        1. Queue Data Structure (first in first out) which contains always the starting/first node at starting
        2. Visited Array -> graph is 1 based and node is no. 9 so arr length/size is 10 (0 to 9)
            and the first/start nod mark it as 1
        * Keep taking it out from queue till it is not empty
        * give graph is in Adjacency List (ArrayList<ArrayList<>> adjList)

        * take first element of queue, went to its neighbor, put that in queue
            and mark it as visited

         */

        int v = 10; // No. of nodes/vertices
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();
        for(int i = 0; i<=v; i++){
            adjList.add(new ArrayList<Integer>());
        }

        adjList.get(1).add(2);  adjList.get(1).add(6);
        adjList.get(2).add(1);  adjList.get(2).add(3);  adjList.get(2).add(4);
        adjList.get(3).add(2);
        adjList.get(4).add(2);  adjList.get(4).add(5);
        adjList.get(5).add(4);  adjList.get(5).add(8);
        adjList.get(6).add(1);  adjList.get(6).add(7);  adjList.get(6).add(9);
        adjList.get(7).add(6);  adjList.get(7).add(8);
        adjList.get(8).add(5);  adjList.get(8).add(7);
        adjList.get(9).add(6);

        ArrayList<Integer> bfsOfGraphAdjList = bfsOfGraph(v, adjList);
        System.out.println(bfsOfGraphAdjList);
    }

    public static ArrayList<Integer> bfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer>bfs = new ArrayList<>();
        boolean[] vis = new boolean[v];
        Queue<Integer> q = new LinkedList<>();

        q.add(1);
        vis[1] = true;

        while (!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            // Get all adjacent vertices of the dequeued value/node
            // If a adjacent has not been visited, then
            // visited and enqueue it
            for(Integer it: adj.get(node)){
                if (vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
