public class BubbleSort {
    
    public static void Sort(int arr[], int size){

        System.out.println("Print array");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-1; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Print after sorting array");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]={1,3,42,53,6,46};
        int size = arr.length;
        
        Sort(arr, size);
    }
}
