package etc;

import java.util.Arrays;

class Solution {
    public int[][] solution(int n, int m, int[] fold, int[][] cut) {
        int[][] paper = createPaper(n, m);

        for (int f : fold) {
            if (f == 1) {
                paper = foldHorizontally(paper);
            } else if (f == -1) {
                paper = foldVertically(paper);
            }
        }

        for (int[] c : cut) {
            int x = c[0];
            int y = c[1];

            if (x >= 0 && x < m && y >= 0 && y < n) {
                paper = cutPaper(paper, x, y);
            }
        }

        return paper;
    }

    public int[][] createPaper(int n, int m) {
        int[][] paper = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(paper[i], 1);
        }

        return paper;
    }

    public int[][] foldHorizontally(int[][] paper) {
        int n = paper.length;
        int m = paper[0].length;

        int[][] foldedPaper = new int[n / 2][m];

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < m; j++) {
                foldedPaper[i][j] = paper[i][j] + paper[n - i - 1][j];
            }
        }

        return foldedPaper;
    }

    public int[][] foldVertically(int[][] paper) {
        int n = paper.length;
        int m = paper[0].length;

        int[][] foldedPaper = new int[n][m / 2];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m / 2; j++) {
                foldedPaper[i][j] = paper[i][j] + paper[i][m - j - 1];
            }
        }

        return foldedPaper;
    }

    public int[][] cutPaper(int[][] paper, int x, int y) {
        int n = paper.length;
        int m = paper[0].length;

        if (x >= 0 && x < m && y >= 0 && y < n) {
            paper[y][x] = 0;
        }

        return paper;
    }
}
