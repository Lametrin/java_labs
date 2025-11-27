package academy.tochkavhoda.introduction;

public class ZeroSteps3 {

    public int sum(int[] array) {
        int s = 0;
        for (int v : array) s += v;
        return s;
    }

    public int mul(int[] array) {
        if (array.length == 0) return 0;
        int m = 1;
        for (int v : array) m *= v;
        return m;
    }

    public int min(int[] array) {
        if (array.length == 0) return Integer.MAX_VALUE;
        int m = array[0];
        for (int v : array) if (v < m) m = v;
        return m;
    }

    public int max(int[] array) {
        if (array.length == 0) return Integer.MIN_VALUE;
        int m = array[0];
        for (int v : array) if (v > m) m = v;
        return m;
    }

    public double average(int[] array) {
        if (array.length == 0) return 0;
        return (double) sum(array) / array.length;
    }

    public boolean isSortedDescendant(int[] array) {
        for (int i = 1; i < array.length; i++)
            if (array[i - 1] <= array[i]) return false;
        return true;
    }

    public void cube(int[] array) {
        for (int i = 0; i < array.length; i++)
            array[i] = array[i] * array[i] * array[i];
    }

    public boolean find(int[] array, int value) {
        for (int v : array) if (v == value) return true;
        return false;
    }

    public void reverse(int[] array) {
        int l = 0, r = array.length - 1;
        while (l < r) {
            int t = array[l];
            array[l] = array[r];
            array[r] = t;
            l++;
            r--;
        }
    }

    public boolean isPalindrome(int[] array) {
        int l = 0, r = array.length - 1;
        while (l < r) {
            if (array[l] != array[r]) return false;
            l++;
            r--;
        }
        return true;
    }

    public void replaceBySquare(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) return;
            array[i] = array[i] * array[i];
        }
    }

    public int mulNonZero(int[] array) {
        if (array.length == 0) return 0;
        int m = 1;
        boolean found = false;
        for (int v : array) {
            if (v != 0) {
                m *= v;
                found = true;
            }
        }
        return found ? m : 0;
    }

    public boolean allPositive(int[] array) {
        if (array.length == 0) return false;
        for (int v : array) if (v <= 0) return false;
        return true;
    }

    public boolean allEqual(int[] array) {
        if (array.length <= 1) return true;
        int f = array[0];
        for (int v : array) if (v != f) return false;
        return true;
    }

    public int greaterThanNeighbours(int[] array) {
        if (array.length < 3) return -1;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) return i;
        }
        return -1;
    }

    public boolean neighboursAverage(double[] array) {
        if (array.length < 3) return false;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] == (array[i - 1] + array[i + 1]) / 2.0) return true;
        }
        return false;
    }

    public int sumBetween2Zeros(int[] array) {
        int first = -1, second = -1;
        for (int i = 0; i < array.length; i++)
            if (array[i] == 0) {
                if (first == -1) first = i;
                else {
                    second = i;
                    break;
                }
            }
        int sum = 0;
        for (int i = first + 1; i < second; i++) sum += array[i];
        return sum;
    }

    public int sameAtPosition(int[] array1, int[] array2) {
        int len = Math.min(array1.length, array2.length);
        int cnt = 0;
        for (int i = 0; i < len; i++)
            if (array1[i] == array2[i]) cnt++;
        return cnt;
    }

    public boolean bothZeroAtPosition(int[] array1, int[] array2) {
        int len = Math.min(array1.length, array2.length);
        for (int i = 0; i < len; i++)
            if (array1[i] == 0 && array2[i] == 0) return true;
        return false;
    }

    public void accumulatedSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            array[i] = sum;
        }
    }

    public int[] mergeArrays(int[] array1, int[] array2) {
        int[] r = new int[array1.length + array2.length];
        int i = 0, j = 0, k = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] <= array2[j]) r[k++] = array1[i++];
            else r[k++] = array2[j++];
        }
        while (i < array1.length) r[k++] = array1[i++];
        while (j < array2.length) r[k++] = array2[j++];
        return r;
    }

    public int insideCircle(int[] x, int[] y, int radius) {
        int cnt = 0;
        int r2 = radius * radius;
        for (int i = 0; i < x.length; i++) {
            int d2 = x[i] * x[i] + y[i] * y[i];
            if (d2 <= r2) cnt++;
        }
        return cnt;
    }

    public double scalarProduct(double[] array1, double[] array2) {
        double sum = 0;
        for (int i = 0; i < array1.length; i++)
            sum += array1[i] * array2[i];
        return sum;
    }
}