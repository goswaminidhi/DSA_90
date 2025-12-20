package DSA_90_Patternwise.Graph;

import java.util.ArrayList;

public class Cycle_Graph {
    public static boolean dfsCheck(int node,
                                   ArrayList<ArrayList<Integer>> adj,
                                   int vis[],int pathVis[]){
        vis[node] = 1;
        pathVis[node] = 1;
        for (int it : adj.get(node)) {

            if(vis[it] == 0){
                if(dfsCheck(it,adj,vis,pathVis)){
                    return true;
                }
            }else if(pathVis[it] == 1){
                return true;
            }
        }
        pathVis[node] = 0;
        return false;
    }
    public static boolean containCycle(ArrayList<ArrayList<Integer>> adj,int vertex){
        int vis[] = new int[vertex];
        int pathVis[] = new int[vertex];
        for (int i = 0; i < vertex; i++) {
            if(vis[i] == 0){
                if(dfsCheck(i,adj,vis,pathVis)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(1); // cycle

        System.out.println(containCycle(adj, V)); // tr
    }
}
