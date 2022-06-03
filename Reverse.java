public class Reverse {
    public static void ReverseIt(String str){
        System.out.print(str);
        System.out.println();
        int size = str.length();
        for(int i = size-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
    public static void main(String[] args) {
        // Reverse r = new Reverse();
        ReverseIt("Nothing");
    }
}
