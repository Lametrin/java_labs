package academy.tochkavhoda.introduction;

public class ZeroSteps2 {

    public int sumSquares(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * i;
        }
        return sum;
    }

    public int sumOdds(int count) {
        int sum = 0;
        for (int i = 1; i <= count; i += 2) {
            sum += i;
        }
        return sum;
    }

    public double sumInverses(int count) {
        double sum = 0.0;
        for (int i = 1; i <= count; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }

    public long factorial(int count) {
        long result = 1;
        for (int i = 1; i <= count; i++) {
            result *= i;
        }
        return result;
    }

    public int prodDigits(int value) {
        value = Math.abs(value);
        if (value == 0) return 0;

        int prod = 1;
        while (value > 0) {
            prod *= value % 10;
            value /= 10;
        }
        return prod;
    }

    public int fibonacci(int number) {
        if (number == 0) return 0;
        if (number == 1) return 1;

        int prev = 0;
        int curr = 1;

        for (int i = 2; i <= number; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    public long sum2Powers(int max) {
        long sum = 0;
        long pow = 1;
        for (int i = 0; i <= max; i++) {
            sum += pow;
            pow *= 2;
        }
        return sum;
    }

    public int sumSquaresWithBarrier(int count, int barrier) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += i * i;
            if (sum > barrier) break;
        }
        return sum;
    }

    public int sumPairProd(int count1, int count2) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += i * j;
            }
        }
        return sum;
    }

    public int sumPairProdWithBarrier(int count1, int count2, int barrier) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                int prod = i * j;
                if (prod < barrier) {
                    sum += prod;
                }
            }
        }
        return sum;
    }

    public double sumInversePairProd(int count1, int count2) {
        double sum = 0.0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                sum += 1.0 / (i * j);
            }
        }
        return sum;
    }

    public int sumTripleProd(int count1, int count2, int count3) {
        int sum = 0;
        for (int i = 1; i <= count1; i++) {
            for (int j = 1; j <= count2; j++) {
                for (int k = 1; k <= count3; k++) {
                    sum += i * j * k;
                }
            }
        }
        return sum;
    }

    public double calculateE() {
        double sum = 1.0;
        double term = 1.0;

        for (int i = 1; term >= 1E-6; i++) {
            term /= i;
            sum += term;
        }
        return sum;
    }

    public double calculatePi() {
        double sum = 0.0;
        double term;
        int k = 0;

        while (true) {
            term = 4.0 * ((k % 2 == 0 ? 1.0 : -1.0) / (2 * k + 1));
            if (Math.abs(term) < 1E-8) break;

            sum += term;
            k++;
        }
        return sum;
    }

    public double calculateCircleSquare(double length, int count) {
        int inside = 0;
        double center = length / 2;
        double radius = length / 2;

        for (int i = 0; i < count; i++) {
            double x = Math.random() * length;
            double y = Math.random() * length;

            double dx = x - center;
            double dy = y - center;

            if (dx * dx + dy * dy <= radius * radius) {
                inside++;
            }
        }

        return length * length * inside / (double) count;
    }
}
