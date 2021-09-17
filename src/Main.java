public class Main {


    public static int fibonacci(int n) {
        //calculate the nth fibonacci numbers
        assert(n >= 0);
        switch (n) {
            case 0:
                return 0;
            case 1:
                return 1;
            default:
                return (fibonacci(n - 1) + fibonacci(n - 2));

        }


    }

    public static int dynamic_fibonacci(int n) {
        //calculate the nth fibonacci numbers
        assert(n >= 0);
        int[] fSave = new int[n+2];
        fSave[0] = 0;
        fSave[1] = 1;
        for (int i = 2; i <= n; i++) {
            fSave[i] = fSave[i-1] + fSave[i-2];
        }
        return fSave[n];


    }

    public static String[] combos(char[][] inputArray) {
        return combos_int(inputArray, 0, new String[0]);
    }

    public static String[] combos_int(char[][] inputArray, int pos, String[] resultSoFar) {
        char[] pos_array = inputArray[pos];

        if (pos == inputArray.length-1) {
            String[] resultArray = new String[pos_array.length];
            int i = 0;
            for (char ch : pos_array) {
                resultArray[i] = Character.toString(ch);
                i++;
            }
            return resultArray;
        }
        resultSoFar = combos_int(inputArray, pos+1, resultSoFar);

        String[] resultArray = new String[resultSoFar.length * pos_array.length];
        int j = 0;
        for (char ch : pos_array) {
            for (String res: resultSoFar) {
                    resultArray[j] = ch + res;
                    j++;
            }
        }
        return resultArray;

        }
    public static void main(String[] args) {
        System.out.println("Hello World!999");

        for (int i = 0; i < 10; i++) {
            System.out.println("fib " + i + " : " + fibonacci(i));

        }

        for (int i = 0; i < 10; i++) {
            System.out.println("d fib " + i + " : " + dynamic_fibonacci(i));

        }
        char[][] x1 = {{'a','b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'k'}};
        String[] r1 = combos(x1);
        System.out.println("R1 is" + java.util.Arrays.toString(r1));
        System.out.println(("R1 has size: "  + r1.length));

    }
}
