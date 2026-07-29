class Solution {
    int m, n;
    int[][] dp;

    public int solve(int i, int j, int[][] obstacleGrid) {

        if (i >= m || j >= n) {
            return 0;
        }
        if (obstacleGrid[i][j] == 1)
            return 0;
        if (i == m - 1 && j == n - 1) {
            return 1;
        }
        
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int rig = solve(i, j + 1, obstacleGrid);
        int down = solve(i + 1, j, obstacleGrid);
        dp[i][j] = rig + down;
        return dp[i][j];
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
         m = obstacleGrid.length;
         n = obstacleGrid[0].length;
        dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, 0, obstacleGrid);
    }
}