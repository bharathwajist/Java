import java.util.Arrays;

public class StrChange{
    public static String str_to_upr(String s){
        return s.toUpperCase();
    }
    public static String str_to_lwr(String s){
        return s.toLowerCase();
    }
    public static String str_to_title(String s){
        if(s == null || s.isEmpty()){
            return s;
        }
        StringBuilder converted = new StringBuilder();

        boolean convertedText = true;
        for(char ch : s.toCharArray()){
            if(Character.isSpaceChar(ch)){
                convertedText = true;
            }else if(convertedText){
                ch = Character.toTitleCase(ch);
                convertedText = false;
            }else{
                ch = Character.toLowerCase(ch);
            }
            converted.append(ch);
        }
        return converted.toString();
    }
    public static String rvrs_str(String s){
        StringBuilder str = new StringBuilder();
        char[] ml = s.toCharArray();
        int size = ml.length-1;
        for(int k = size; k >= 0; k--){
            // System.out.println(ml[k]);
            str.append(ml[k]);
        }
        return str.toString();
    }
    public static void isThere(String passage, String s){
        String[] strList = passage.split(" ");
        int i = 1;
        for(String x: strList){
            i++;
            if(x.equals(s)){
                System.out.println("Word found in.");
                System.out.println("Word founf at "+i+" syllable.");
            }
        }
    }
    public static void charAfter(String passage, char chr){
        int charAt = passage.indexOf(chr);
        System.out.println(passage.substring(charAt));
    }
    public static String orderChar(String str){
        char a[] = str.toCharArray();
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if((Character.toLowerCase(a[j])) < (Character.toLowerCase(a[i]))){
                    swapChar(i, j, a);
                }
            }
        }
        return String.valueOf(a);
    }
    public static String easyOrder(String str){
        char[] charArr = str.toCharArray();
        Arrays.sort(charArr);
        return String.valueOf(charArr);
    }
    private static void swapChar(int i, int j, char[] chArr){
        char temp = chArr[i];
        chArr[i] = chArr[j];
        chArr[j] = temp;
    }
    public static boolean isItEqual(String s1, String s2){
        return s1.equals(s2);
    }
    public static void main(String[] args){
        // String str = "Change the string";
        // char n = 'n';
        // String passage = "Change";
        // Character chr = Character.toLowerCase(str);
        // System.out.println(str_to_upr(str));
        // System.out.println(str_to_lwr(str));
        // System.out.println(str_to_title(str));
        // System.out.println(rvrs_str(str));
        // rvrs_str(str);
        // This returns first index postion of the provided character
        // System.out.println(str.indexOf(n));
        // isThere(str, passage);
        // charAfter(str, n);
        // System.out.println(easyOrder(str));
        // System.out.println(orderChar(str));
        System.out.println(isItEqual("Nothing","Something"));
    }
}