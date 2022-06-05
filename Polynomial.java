public class Polynomial {
    public static void main(String[] args) {
        int a[] = { 5, 0, 10, 6 };
        int b[] = { 1, 2, 4 };

        int n = a.length;
        int m = b.length;

        System.out.println("First Polynomial is ");
        PrintPolynomial(a, n);
        System.out.println("\nSecond Polynomial is ");
        PrintPolynomial(b, m);
        // System.out.println("Size of n : "+n);
        // System.out.println("Size of m : "+m);
        // System.out.println("Size of max : "+size);
        int sum[] = add(a, b, n, m);
        int size = sum.length;
        System.out.println("\nSum of Polynomial is ");
        PrintPolynomial(sum, size);
        System.out.println();
    }

    // Function to find which is maximum in two numbers
    public static int max(int n, int m) {
        return (n > m) ? n : m;
    }


    // Function to find which is minimum in two numbers
    public static int minimum(int n, int m) {
        return (n < m) ? n : m;
    }

    // function adds two polynomials
    static int[] add(int a[], int b[], int n, int m) {
        int size = max(n, m);
        int min = minimum(n, m);
        int sum[] = new int[size];

        // Initializing the product polynomial
        for (int i = 0; i < size; i++) {
            sum[i] = a[i];
        }

        // Take ever term of first polynomial
        for (int i = 0; i < min; i++) {
            sum[i] += b[i];
        }

        return sum;
    }

    // Print polynomial
    static void PrintPolynomial(int arr[], int size) {
        try {
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
                if (i != 0) {
                    System.out.print("x^" + i);
                }
                if (i != size - 1) {
                    System.out.print(" + ");
                }
            }
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Error occurred : " + ae);
        }
    }
}