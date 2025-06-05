class Diagonaltraverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int i = 0;
        int j = 0;
        int incx = -1;
        int incy = 1;
        int count = 0;
        int[] res = new int[mat.length*mat[0].length];
        while(count<(mat.length*mat[0].length)){
            res[count] = mat[i][j];
            int nx = i+incx;
            int ny = j+incy;
            if(ny>=mat[0].length){
                i++;
                incx = 1;
                incy = -1;
            }
            else if(nx>=mat.length){
                j++;
                incx = -1;
                incy = 1;
            }
            else if(nx<0){
                j++;
                incx=1;
                incy=-1;
            }
            else if(ny<0){
                i++;
                incx =-1;
                incy = 1;
            }
            else{
                i+=incx;
                j+=incy;
            }
            count++;
        }
        return res;
    }
}
