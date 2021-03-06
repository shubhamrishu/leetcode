class Solution {
    int dir[] = {-1, 0, 1, 0, -1};
    
    int bfs(int[][] grid, int i, int j){
        int r = grid.length, c = grid[0].length;
        Queue<int[]> q = new LinkedList();
        q.offer(new int[]{i, j});
       int sum = 0;
        while(q.size()!=0){
            int[] curr = q.poll();
            int a = curr[0];
            int b = curr[1];
        
            if(grid[a][b] == -1)
                continue;
            grid[a][b] = -1;//marking as visited
            sum += 4;
            for(int k = 0; k < 4; k++){
                int x = a + dir[k];
                int y = b + dir[k+1];
                
                if(x >=0 && y>=0 && x <r && y < c && grid[x][y]==1){
                    q.offer(new int[]{x, y});
                    sum-=2;
                }
            }
        }
        return sum;

    }
    public int islandPerimeter(int[][] grid) {
        int r = grid.length, c = grid[0].length;
        int perimeter = 0;
        for (int i = 0; i<r; i++){
            for(int j = 0; j<c;j++){
                if (grid[i][j] == 1){
                    perimeter+=4;
                    if(j+1 < c && grid[i][j+1] == 1)
                        perimeter -= 2;
                    if(i+1 < r && grid[i+1][j] == 1)
                        perimeter -= 2;
                    // return perimeter = bfs(grid, i, j);
                    // break;
                }
            }
        }
        return perimeter;
    }
}