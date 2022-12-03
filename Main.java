public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        System.out.println(remainder(1, 3));
        System.out.println(remainder(3, 4));
        System.out.println(remainder(-9, 45));
        System.out.println(remainder(5, 5));

        System.out.println("Задание 2");
        System.out.println(triArea(3, 2));
        System.out.println(triArea(7, 4));
        System.out.println(triArea(10, 10));

        System.out.println("Задание 3");
        System.out.println(animals(2, 3, 5));
        System.out.println(animals(1, 2, 3));
        System.out.println(animals(5, 2, 8));

        System.out.println("Задание 4");
        System.out.println(profitableGamble(0.2, 50, 9));
        System.out.println(profitableGamble(0.9, 1, 2));
        System.out.println(profitableGamble(0.9, 3, 2));

        System.out.println("Задание 5");
        System.out.println(operation(9, 15, 24));
        System.out.println(operation(24, 26, 2));
        System.out.println(operation(5, 6, 30));
        System.out.println(operation(81, 9, 9));
        System.out.println(operation(15, 11, 11));

        System.out.println("Задание 6");
        System.out.println(ctoa('A'));
        System.out.println(ctoa('m'));
        System.out.println(ctoa('['));
        System.out.println(ctoa('\\'));

        System.out.println("Задание 7");
        System.out.println(addUpTo(3));
        System.out.println(addUpTo(10));
        System.out.println(addUpTo(7));

        System.out.println("Задание 8");
        System.out.println(nextEdge(8, 10));
        System.out.println(nextEdge(5, 7));
        System.out.println(nextEdge(9, 2));

        System.out.println("Задание 9");
        System.out.println(sumOfCubs(new int[]{1, 5, 9}));
        System.out.println(sumOfCubs(new int[]{3, 4, 5}));
        System.out.println(sumOfCubs(new int[]{2}));
        System.out.println(sumOfCubs(new int[]{}));

        System.out.println("Задание 10");
        System.out.println(abcmath(42, 5, 10));
        System.out.println(abcmath(5, 2, 1));
        System.out.println(abcmath(1, 2, 3));
    }

    // задание 1
    public static int remainder(int num1, int num2) {
        return num1 % num2;
    }

    // задание 2
    public static int triArea(int base, int height) {
        double triArea = 0.5 * base * height;
        return (int)triArea;
    }

    // задание 3
    public static int animals(int chickens, int cows, int pigs) {
        return chickens * 2 + cows * 4 + pigs * 4;
    }

    // задание 4
    public static boolean profitableGamble(double prob, int prize, int pay) {
        return prob * prize > pay;
    }

    // задание 5
    public static String operation(int num1, int num2, int num3) {
        if (num1 + num2 == num3) {
            return "added";
        } else if (Math.abs(num1- num2) == num3) {
            return "subtracted";
        } else if (num1 * num2 == num3) {
            return "multiplied";
        } else if (num1 / num2 == num3) {
            return "divided";
        } else {
            return "none";
        }
    }

    // задание 6
    public static int ctoa(char symbol) {
        return symbol;
    }

    // задание 7
    public static int addUpTo(int num) {
        int result = 0;
        for (int i = num; i > 0; i--) {
            result += i;
        }
        return result;
    }

    // задание 8
    public static int nextEdge(int num1, int num2) {
        return Math.abs(num1 + num2) - 1;
    }

    // задание 9
    public static int sumOfCubs(int[] array) {
        int sum = 0;
        for (int i = 0; i <= array.length - 1; i++) {
             sum += Math.pow(array[i], 3);
        }
        return sum;
    }

    // задание 10
    public static boolean abcmath(int num1, int num2, int num3) {
        for (int i = num2; i >= 0; i--) {
            if (num2 != 0) {
                num2--;
                num1 += num1;
            }
        }
        return num1 % num3 == 0;
    }
}
