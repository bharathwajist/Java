public class Pattern extends Thread{
    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
    }

    // Pattern1
    public static void pattern1(){
        System.out.println("Above left Diagonal");
        for (int i = 0; i <= 5; i++) {

            for (int j = i; j <= 5; j++) {
                
                System.out.print("*\t");
            }
            System.out.println();
            System.out.println();
        }
    }


    // Pattern2
    public static void pattern2(){
        System.out.println("Below left Diagonal");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
            System.out.println();
        }
    }

    // Pattern3
    public static void pattern3(){
        System.out.println("Above right Diagonal");
        for (int i = 0; i <= 5; i++) {
            for (int j = 0; j <= 5; j++) {
                if(i <= j){
                    System.out.print("*");
                }
                System.out.print("\t");
            }
            System.out.println();
            System.out.println();
        }
    }

    // Patter4
    public static void pattern4(){
        System.out.println("Below right Diagonal");
        for (int i = 0; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                if(j>i){
                    System.out.print("\t");
                }
                System.out.print("*");
            }
            System.out.println();
            System.out.println();
        }
    }

    // Pattern5
    public static void pattern5(){
        for (int i=0; i<5; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
            { 
                System.out.print(" "); //print space
            }  
            // for (int j=0; j<=i; j++ ) //inner loop for number of columns
            // { 
            //     System.out.print("* "); //print star
            // } 

        System.out.println(); //ending line after each row
    }
}