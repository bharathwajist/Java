public class Diagonal{
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

        // Print the above diagonal elements
        System.out.println("Above diagonal elements are : ");
        for(row_index = 0; row_index < size; row_index++){
            for(column_index = 0; column_index < size; column_index++){
                if(row_index < column_index){
                    // System.out.print("_");
                    System.out.print("|"+matrix[row_index][column_index]+"| ");
                    // System.out.print("_");
                }
                System.out.print("\t");
            }
            System.out.println();
        }


        // Print the main diagonal elements
        System.out.println("Main diagonal elements are : ");
        for(row_index = 0; row_index < size; row_index++){
            for(column_index = 0; column_index < size; column_index++){
                if(row_index == column_index){
                    // System.out.print("_");
                    System.out.print("|"+matrix[row_index][column_index]+"|\t");
                    // System.out.print("_");
                }
                System.out.print("\t");
            }
            System.out.println();
        }


        // Print the secondary diagonal elements
        System.out.println("Secondary diagonal elements are : ");
        for(row_index = 0; row_index < size; row_index++){
            for(column_index = 0; column_index < size; column_index++){
                if((row_index+ column_index) == size-1){
                    // System.out.print("_");
                    System.out.print("|"+matrix[row_index][column_index]+"|\t");
                    // System.out.print("_");
                }
                System.out.print("\t");
            }
            System.out.println();
        }

        // Print the Below diagonal elements
        System.out.println("Below diagonal elements are : ");
        for(row_index = 0; row_index < size; row_index++){
            for(column_index = 0; column_index < size; column_index++){
                if(row_index > column_index){
                    // System.out.print("_");
                    System.out.print("|"+matrix[row_index][column_index]+"|");
                    // System.out.print("_");
                }
                System.out.print("\t");
            }
            System.out.println();
        }

        // Print the secondary diagonal elements
        System.out.println("Corner elements are : ");
        for(row_index = 0; row_index < size; row_index++){
            for(column_index = 0; column_index < size; column_index++){
                if((row_index == 0 || row_index == size-1)&&(column_index == 0 || column_index == size-1)){
                    // System.out.print("_");
                    System.out.print("|"+matrix[row_index][column_index]+"|\t");
                    // System.out.print("_");
                }
                System.out.print(" ");
            }
            System.out.println();
        }

        
        // Print the border elements
        System.out.println("Border elements are : ");
        for(row_index = 0; row_index < size; row_index++){
            for(column_index = 0; column_index < size; column_index++){
                if((row_index == 0 || row_index == size-1)||(column_index == 0 || column_index == size-1)){
                    // System.out.print("_");
                    System.out.print("|"+matrix[row_index][column_index]+"|\t");
                    // System.out.print("_");
                }else{
                    System.out.print("\t");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}