package Graph;

import java.util.ArrayList;
import java.util.Stack;

public class Topological_Sort {
    public static void dfs(int node, int[] vis, Stack<Integer> stack,int[][] graph){

        vis[node] = 1;

        for (int i = 0; i < vis[node]; i++) {
            if(vis[i] == 0){
                dfs(i,vis,stack,graph);
            }
        }
        stack.push(node);
    }
    public static int[] topological(int[][] graph,int vertex){
        int[] vis = new int[5];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < vertex; i++) {
            if(vis[i] == 0){
                dfs(i,vis,stack,graph);
            }
        }
        //to store the answer
//        ArrayList<Integer> ans = new ArrayList<>();
        int[] ans = new int[vertex];
        int i = 0;
        while (!stack.isEmpty()){
            ans[i++] = stack.peek();
            stack.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] array = {{5,0},{4,0},{4,1},{3,1},{2,3},{5,2}};
        int vertex = 5;
        System.out.println(topological(array,vertex));
    }
}
