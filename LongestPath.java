class LongestPath {
    public int longestIncreasingPath(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        int[][] temp = new int[matrix.length][matrix[0].length];
        int[][] moves = {
                {1,0},
                {0,1},
                {0,-1},
                {-1,0}
        };
        int res = 1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                res = Math.max(res,compute(matrix,i,j,temp,moves,dp));
            }
        }
        return res;
    }
     public static int compute(int[][] matrix,int x,int y,int[][] temp,int[][] moves,int[][] dp){
        if(dp[x][y]!=0){
            return dp[x][y];
        }
        int cost = 1;
        temp[x][y] = 1;
        for(int[] a: moves){
            int nx=a[0]+x;
            int ny=a[1]+y;
            if(nx>=0 && ny>=0 && nx<matrix.length && ny<matrix[0].length && matrix[x][y]<matrix[nx][ny] && temp[nx][ny]==0){
                cost = Math.max(compute(matrix,nx,ny,temp,moves,dp)+1,cost);
            }
        }
        dp[x][y] = cost;
        temp[x][y]=0;
        return cost;
    }
}
