class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,h=matrix.length*matrix[0].length-1;
        while(l<=h){
            int mid = (h+l)/2;
            int r = mid/matrix[0].length, c = mid%matrix[0].length;
            if(target==matrix[r][c]) return true;
            else if(matrix[r][c]<target) l = mid+1;
            else h = mid-1;
        }
        return false;
    }
}
