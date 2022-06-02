class IdentityMatrix{

    public static void identity(int n){
        int row, col;
        // int IdnArr[][] = int[row][col];
        for(row = 0; row < n; row++){
            for(col = 0; col < n; col++){
                if(row == col){
                    System.out.print(1+"  ");
                }else{
                    System.out.print(0+"  ");
                }
            }
            System.out.println();
        }
        // return 0;
    }

    public static void main(String[] args){
        int matrix[][] = new int[5][5], row_index, column_index, x = 0, size = 5;

        // Get the square of matrix
        for(row_index = 0; row_index < size; row_index++){
            for(column_index = 0; column_index < size; column_index++){
                matrix[row_index][column_index] = ++x;
            }
        }

        // Display the fuckin matrix
        System.out.printf("The matrix is \n");
        for(row_index = 0; row_index < size; row_index++){
            for(column_index = 0; column_index < size; column_index++){
                System.out.print("|"+matrix[row_index][column_index]+"|\t");
            }
            System.out.println();
        }

        boolean counter = true;

        identity(4);
        // Print the main diagonal elements
        // System.out.println("Main diagonal elements are : ");
        for(row_index = 0; row_index < size; row_index++){
            for(column_index = 0; column_index < size; column_index++){
                if(row_index == column_index){
                    // System.out.print("_");
                    // System.out.print("|"+matrix[row_index][column_index]+"|\t");
                    // System.out.print("_");
                    if(matrix[row_index][column_index] == 0){
                        counter=true;
                    }
                }
                // System.out.print("\t");
            }
            // System.out.println();
        }
        if(counter){
            // System.out.println("The above matrix is not an identity matrix");
        }
    }
}