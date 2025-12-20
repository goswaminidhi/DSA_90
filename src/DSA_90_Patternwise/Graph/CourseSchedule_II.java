package DSA_90_Patternwise.Graph;

import java.util.Stack;

public class CourseSchedule_II {
    static boolean hasCycle = false;

    public static void dfsCheck(int node, int[][] graph, int[] vis, int[] pathVis, Stack<Integer> stack, int vertex) {
        vis[node] = 1;
        pathVis[node] = 1;
        for (int i = 0; i < vertex; i++) {
            if (graph[node][i] == 1) {
                if (vis[i] == 0) {
                    dfsCheck(i, graph, vis, pathVis, stack, vertex);
                } else if (pathVis[i] == 1) {
                    hasCycle = true;
                    return;
                }
            }
        }
        pathVis[node] = 0;
        stack.push(node);
    }

    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        int[][] graph = new int[numCourses][numCourses];

        // Convert edge list to adjacency matrix
        for (int[] e : prerequisites) {
            graph[e[1]][e[0]] = 1;
        }

        int[] vis = new int[numCourses];
        int[] pathVis = new int[numCourses];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                dfsCheck(i, graph, vis, pathVis, stack, numCourses);
                if (hasCycle) {
                    return new int[0];
                }
            }
        }
        int[] ans = new int[numCourses];
        int i = 0;
        while (!stack.isEmpty()) {
            ans[i++] = stack.pop();
        }
        return ans;
    }

    public static void main(String[] args) {
        int course = 2;
        int[][] preRequisites = {{1, 0}};
        System.out.println(findOrder(course, preRequisites));
        int[] res = findOrder(course, preRequisites);
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
