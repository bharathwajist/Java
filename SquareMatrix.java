class SquareMatrix{
    public static void main(String[] args){
        int square[][] = {{1,3,5},{5,6,7}};
        System.out.println("Your Original Matrix is :");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Square matrix after : ");
        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(square[i][j]*square[i][j] + " ");
            }
            System.out.println();
        }
    }
}