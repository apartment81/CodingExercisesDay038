package ro.mirodone;

 class SumOfNumbers {

    int GetSum(int a, int b) {
        int sum = 0;
        if (a != b) {
            if (a > b) {
                for (int i = a; i >= b; i--) {
                    sum = sum + i;
                }
                System.out.println(sum);
            }
            if (a < b) {
                for (int i = a; i <= b; i++) {
                    sum = sum + i;
                }
                System.out.println(sum);

            }
            return sum;
        } else {
            return a;
        }
    }

}
