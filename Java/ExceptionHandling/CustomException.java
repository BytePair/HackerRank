import java.util.*;
import java.util.Scanner;


class MyCalculator {

    public int power(int n, int p) throws Exception {

        if (n < 0 || p < 0) {
            throw new Exception("n and p should be non-negative");
        }

        if (n == 0) {
            return 0;
        }

        int ans = 1;
        for (int i = 0; i < p; i++) {
            ans *= n;
        }

        return ans;
    }

}


class CustomException {

public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		while ( in .hasNextInt()) {
			int n = in .nextInt();
			int p = in .nextInt();
			MyCalculator my_calculator = new MyCalculator();
			try {
				System.out.println(my_calculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}
