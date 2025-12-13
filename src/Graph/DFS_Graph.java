package Graph;

import java.util.ArrayList;
import java.util.List;

public class DFS_Graph {
    static ArrayList<Integer> list;
    static boolean[] isVisited ;
    public static void helper(ArrayList<ArrayList<Integer>> adj,int vertex){
        if(isVisited[vertex] == false){
            list.add(vertex);
            isVisited[vertex] = true;

            for (int i = 0; i < adj.get(vertex).size(); i++) {
                helper(adj, adj.get(vertex).get(i));
            }
        }
    }
    public static ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        list = new ArrayList<>();
        isVisited = new boolean[adj.size()];

        helper(adj, 0);

        return list;

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();
        adjList.add(new ArrayList<>(List.of(2, 3, 1)));
        adjList.add(new ArrayList<>(List.of(0)));
        adjList.add(new ArrayList<>(List.of(0, 4)));
        adjList.add(new ArrayList<>(List.of(0)));
        adjList.add(new ArrayList<>(List.of(2)));
        System.out.println(dfs(adjList));
    }
}
