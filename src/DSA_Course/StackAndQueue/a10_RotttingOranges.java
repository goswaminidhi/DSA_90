package DSA_Course.StackAndQueue;

import java.util.*;

public class a10_RotttingOranges {
    public static int orangesRotting(int[][] grid) {
        //First add all the rotting oranges to the queue
        Queue<int[] > queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 2){
                    queue.offer(new int[] {i,j,0});
                    System.out.println(queue);
                }
            }
        }

        //Mark the adjacent nodes as rotten and insert the index till the queue is not empty
        int minutes = 0;

        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int i = poll[0];
            int j = poll[1];
            int leve = poll[2];
            //right
            if(i+1 <= grid.length -1 && grid[i+1][j] == 1){
                grid[i+1][j] = 2;;
                queue.offer(new int[]{i+1,j,leve+1});
            }
            //left
            if(i > 0 && grid[i-1][j] == 1){
                grid[i-1][j] = 2;
                queue.offer(new int[]{i-1,j,leve+1});
            }

            //top
            if(j+1 < grid[0].length && grid[i][j+1] == 1){
                grid[i][j+1] = 2;
                queue.offer(new int[]{i,j+1,leve+1});
            }
            //bottom
            if(j-1 >= 0  && grid[i][j-1] == 1){
                grid[i][j-1] = 2;
                queue.offer(new int[]{i,j-1,leve+1});
            }
            minutes = Math.max(leve, minutes);
        }


        //If any one remains than return -1
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] == 1){
                   return -1;
                }
            }
        }
        return minutes;
    }

    public static void main(String[] args) {
        System.out.println(orangesRotting(new int[][] {{2,1,1},{1,1,0},{0,1,1}}));
        System.out.println(orangesRotting(new int[][] {{2,1,1},{0,1,1},{1,0,1}}));
    }
}
