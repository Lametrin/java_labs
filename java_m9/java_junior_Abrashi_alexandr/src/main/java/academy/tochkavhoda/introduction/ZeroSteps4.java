package academy.tochkavhoda.introduction;

public class ZeroSteps4 {

    public int min(int[][] matrix) {
        if (matrix.length == 0) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int[] row : matrix)
            for (int v : row)
                if (v < min) min = v;
        return min;
    }

    public int max(int[][] matrix) {
        if (matrix.length == 0) return Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for (int[] row : matrix)
            for (int v : row)
                if (v > max) max = v;
        return max;
    }

    public boolean find(int[][] matrix, int value) {
        for (int[] row : matrix)
            for (int v : row)
                if (v == value) return true;
        return false;
    }

    public boolean isSortedDescendant(int[][] matrix) {
        ZeroSteps3 z3 = new ZeroSteps3();
        for (int[] row : matrix) {
            if (!z3.isSortedDescendant(row)) return false;
        }
        return true;
    }

    public int hasNoZeroRows(int[][] matrix) {
        int count = 0;
        for (int[] row : matrix) {
            // пустая строка считается строкой, не содержащей нулевой элемент
            if (row.length == 0) {
                count++;
                continue;
            }

            boolean hasZero = false;
            for (int v : row) {
                if (v == 0) { hasZero = true; break; }
            }
            if (!hasZero) count++;
        }
        return count;
    }

    public boolean hasFullZeroRow(int[][] matrix) {
        for (int[] row : matrix) {
            if (row.length == 0) continue; // пустая строка не считается "полностью нулевой"
            boolean allZero = true;
            for (int v : row)
                if (v != 0) { allZero = false; break; }
            if (allZero) return true;
        }
        return false;
    }

    public boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) return true;

        // все строки должны быть длины n
        for (int[] row : matrix)
            if (row.length != n) return false;

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
                if (matrix[i][j] != matrix[j][i]) return false;

        return true;
    }

    public int mainDiagonalMax(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (matrix[i].length <= i) return Integer.MIN_VALUE; // нет элемента i,i
            max = Math.max(max, matrix[i][i]);
        }
        return max;
    }

    public int mainDiagonalPositivesSum(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) return 0;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (matrix[i].length <= i) return 0; // нет элемента i,i
            if (matrix[i][i] > 0) sum += matrix[i][i];
        }
        return sum;
    }

    public int secondaryDiagonalMax(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) return Integer.MIN_VALUE;

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            if (matrix[i].length <= j) return Integer.MIN_VALUE; // нет элемента i,j
            max = Math.max(max, matrix[i][j]);
        }
        return max;
    }

    public int secondaryDiagonalPositivesSum(int[][] matrix) {
        int n = matrix.length;
        if (n == 0) return 0;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int j = n - 1 - i;
            if (matrix[i].length <= j) return 0; // нет элемента i,j
            if (matrix[i][j] > 0) sum += matrix[i][j];
        }
        return sum;
    }

    public int[][] matrixSum(int[][] m1, int[][] m2) {
        int[][] res = new int[m1.length][];
        for (int i = 0; i < m1.length; i++) {
            int maxLen = Math.max(m1[i].length, m2[i].length);
            int minLen = Math.min(m1[i].length, m2[i].length);
            res[i] = new int[maxLen];

            for (int j = 0; j < minLen; j++)
                res[i][j] = m1[i][j] + m2[i][j];

            if (m1[i].length > minLen)
                for (int j = minLen; j < m1[i].length; j++)
                    res[i][j] = m1[i][j];

            if (m2[i].length > minLen)
                for (int j = minLen; j < m2[i].length; j++)
                    res[i][j] = m2[i][j];
        }
        return res;
    }

    public void transpose(int[][] matrix) {
        int n = matrix.length;
        // только для строго квадратной (все строки длины n)
        for (int[] row : matrix)
            if (row.length != n) return;

        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
    }

    public void interchange(int[][] matrix) {
        // меняем местами 0<->1, 2<->3 и т.д.; если нечётное число строк, последняя остаётся
        for (int i = 0; i + 1 < matrix.length; i += 2) {
            int[] t = matrix[i];
            matrix[i] = matrix[i + 1];
            matrix[i + 1] = t;
        }
    }

    public int[] toLinearByRow(int[][] matrix) {
        int len = 0;
        for (int[] row : matrix) len += row.length;

        int[] r = new int[len];
        int k = 0;
        for (int[] row : matrix)
            for (int v : row)
                r[k++] = v;

        return r;
    }

    public int[] toLinearByColumn(int[][] matrix) {
        int maxCol = 0;
        for (int[] row : matrix)
            maxCol = Math.max(maxCol, row.length);

        int len = 0;
        for (int col = 0; col < maxCol; col++)
            for (int row = 0; row < matrix.length; row++)
                if (matrix[row].length > col)
                    len++;

        int[] r = new int[len];
        int k = 0;

        for (int col = 0; col < maxCol; col++)
            for (int row = 0; row < matrix.length; row++)
                if (matrix[row].length > col)
                    r[k++] = matrix[row][col];

        return r;
    }

    public int[] toLinearByRowUpperTriangle(int[][] matrix) {
        int n = matrix.length;
        // проверяем квадратность (каждая строка длины n)
        for (int[] row : matrix)
            if (row.length != n) return new int[0];

        int len = n * (n + 1) / 2;
        int[] r = new int[len];
        int k = 0;

        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                r[k++] = matrix[i][j];

        return r;
    }

    public int sumUntilNotFoundInRow(int[][] matrix, int barrier) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int v : row) {
                if (v == barrier) break;
                sum += v;
            }
        }
        return sum;
    }

    public int sumUntilNotFound(int[][] matrix, int barrier) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int v : row) {
                if (v == barrier) return sum;
                sum += v;
            }
        }
        return sum;
    }
}
