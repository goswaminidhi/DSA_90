package DSA_90_Patternwise.Graph;

public class FloodFill {
    public static void helper(int[][] image, int sr, int sc, int color,int cur){
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length){
            return ;
        }

        if(cur != image[sr][sc]){
            return;
        }
        image[sr][sc] = color;


        helper(image,sr+1,sc,color,cur);
        helper(image,sr-1,sc,color,cur);
        helper(image,sr,sc+1,color,cur);
        helper(image,sr,sc-1,color,cur);
    }
    public static  int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image == null || image.length == 0 || image[0].length == 0){
            return image;
        }
       if(image[sr][sc] == color){
           return image;
       }
       helper(image,sr,sc,color,image[sr][sc]);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                System.out.print(image[i][j]);
            }
        }
        return image;
    }
    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int color = 2;
        System.out.println(floodFill(image,sr,sc,color));
    }
}
