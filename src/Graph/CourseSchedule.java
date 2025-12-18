package Graph;

//LeetCode problem 207
public class CourseSchedule {
    public static boolean dfsCycle(int node, int[][] edges, int[] vis, int[] path, int vertex) {

        vis[node] = 1;
        path[node] = 1;

        for (int i = 0; i < vertex; i++) {
            if (edges[node][i] == 1) {
                if (vis[i] == 0) {
                    if (dfsCycle(i, edges, vis, path, vertex)) {
                        return true;
                    }
                } else if (path[i] == 1) {
                    return true;
                }
            }
        }
        path[node] = 0;
        return false;
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int[][] graph = new int[numCourses][numCourses];

        // Convert edge list to adjacency matrix
        for (int[] e : prerequisites) {
            graph[e[0]][e[1]] = 1;
        }

        int[] vis = new int[numCourses];
        int[] path = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                if (dfsCycle(i, graph, vis, path, numCourses)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int course = 2;
        int[][] preRequisites = {{1, 0}};
        System.out.println(canFinish(course, preRequisites));
    }
}
