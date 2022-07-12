public class Problem1 {
    public static void main(String[] args) {
        String text = "8459761203";
        // String text = "0123456789";
        String pattern = "5439";
        int text_len = text.length();
        int pat_len = pattern.length();
        int AnsArr[] = new int[pat_len];
        for (int i = 0; i < text_len; i++) {
            for (int j = 0; j < pat_len; j++) {
                if (text.charAt(i) == pattern.charAt(j)) {
                    AnsArr[j] = i;
                }
            }
        }
        System.out.println(check(AnsArr));
    }

    static int check(int[] AnsArr){
        int temp = AnsArr[0];
        int len = AnsArr.length;
        int total = temp;
        int ans = 0;
        int comp = temp;
        for (int i = 1; i < len; i++) {
            comp = compare(temp, AnsArr[i]);
            temp = AnsArr[i];
            ans = comp;
            total+=ans;
        }
        return total;
    }

    static int compare(int a, int b){
        return a > b ? a-b : b-a;
    }
}
