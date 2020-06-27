package lists.vectorAndStacks;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;

public class FloodFillUsingStack {
	
    private static final int[][] directions = new int[][]{
            {0, 1},
            {1, 0},
            {0, -1},
            {-1, 0}};

    public static void main(String[] args) {

        // Setup the matrix.
        int[][] matrix = new int[][]{
                {1, 1, 1, 1, 1, 1},
                {1, 1, 2, 2, 1, 1},
                {1, 1, 2, 2, 1, 1},
                {2, 2, 2, 2, 2, 2}};


        // Approach 1 : Using STACK.
        {

            System.out.println("************** STACK APPROACH ************* \n");

            final long stackApproachStart = System.nanoTime();

            Stack<Pair> stack = new Stack<>();
            Set<Pair> visited = new HashSet<>();

            // Starting point.
            Pair start = new Pair(2, 2);
            stack.add(start);

            while (!stack.isEmpty()) {
                Pair pair = stack.pop();
                if (matrix[pair.row][pair.col] == 3) {
                    continue;
                }
                for (int i = 0; i < directions.length; i++) {
                    int x = pair.row + directions[i][0];
                    int y = pair.col + directions[i][1];
                    if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || matrix[x][y] != 2 || visited.contains(new Pair(x, y))) {
                        continue;
                    }
                    stack.add(new Pair(x, y));
                }
                visited.add(pair);
                matrix[pair.row][pair.col] = 3;
            }

            printMatrix(matrix);

            System.out.println("\nTotal time taken by STACK approach : [" + (System.nanoTime() - stackApproachStart) / 1000 + "] us\n");
        }


    }

    private static void printMatrix(final int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }
    }

    private static class Pair {

        private int row;
        private int col;

        public Pair(final int row, final int col) {
            this.row = row;
            this.col = col;
        }

        @Override
        public boolean equals(final Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            final Pair pair = (Pair)o;
            return row == pair.row &&
                    col == pair.col;
        }

        @Override
        public int hashCode() {
            return Objects.hash(row, col);
        }
    }
}
