package DSA_90_Patternwise.Graph;

import java.util.Arrays;
import java.util.Stack;

public class Topological_Sort {
    public static void dfs(int node, int[] vis, Stack<Integer> stack,int[][] graph,int v){

        vis[node] = 1;

        for (int i = 0; i < v   ; i++) {
            if(graph[node][i] == 1 && vis[i] == 0){
                dfs(i,vis,stack,graph,v);
            }
        }
        stack.push(node);
    }
    public static int[] topological(int[][] edges,int vertex){
        int[][]graph= new int[vertex][vertex];

        // Convert edge list to adjacency matrix
        for (int[] e : edges) {
            graph[e[0]][e[1]] = 1;
        }
        int[] vis = new int[vertex];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < vertex; i++) {
            if(vis[i] == 0){
                dfs(i,vis,stack,graph,vertex);
            }
        }
        //to store the answer
//        ArrayList<Integer> ans = new ArrayList<>();
        int[] ans = new int[vertex];
        int i = 0;
        while (!stack.isEmpty()){
            ans[i++] = stack.pop();

        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] array = {{1,0}};
        int vertex = 2;
        System.out.println(Arrays.toString(topological(array,vertex)));
    }
}
