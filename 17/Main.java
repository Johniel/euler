import java.lang.*;

public class Main {
    public Main()
    {
        final int N = 15;
        int[][] num = {{75, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00},
                       {95, 64, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00},
                       {17, 47, 82, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00},
                       {18, 35, 87, 10, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00},
                       {20,  4, 82, 47, 65, 00, 00, 00, 00, 00, 00, 00, 00, 00, 00},
                       {19,  1, 23, 75,  3, 34, 00, 00, 00, 00, 00, 00, 00, 00, 00},
                       {88,  2, 77, 73,  7, 63, 67, 00, 00, 00, 00, 00, 00, 00, 00},
                       {99, 65,  4, 28,  6, 16, 70, 92, 00, 00, 00, 00, 00, 00, 00},
                       {41, 41, 26, 56, 83, 40, 80, 70, 33, 00, 00, 00, 00, 00, 00},
                       {41, 48, 72, 33, 47, 32, 37, 16, 94, 29, 00, 00, 00, 00, 00},
                       {53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14, 00, 00, 00, 00},
                       {70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57, 00, 00, 00},
                       {91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48, 00, 00},
                       {63, 66,  4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31, 00},
                       {04, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60,  4, 23}};
        final int M = 20;
        int[][] dp = new int[M][M];
        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < M; ++j) {
                dp[i][j] = 0;
            }
        }
        dp[0][0] = num[0][0];

        for (int i = 0; i < N - 1; ++i) {
            for (int j = 0; j <= i; ++j) {
                if (dp[i][j] == 0) continue;
                dp[i + 1][j + 0] = Math.max(dp[i + 1][j + 0], dp[i][j] + num[i + 1][j + 0]);
                dp[i + 1][j + 1] = Math.max(dp[i + 1][j + 1], dp[i][j] + num[i + 1][j + 1]);
            }
        }

        int mx = 0;
        for (int i = 0; i < M; ++i) {
            for (int j = 0; j < M; ++j) {
                mx = Math.max(mx, dp[i][j]);
            }
        }
        System.out.println(mx);
    }
    public static void main(String[] args)
    {
        new Main();
    }
};
