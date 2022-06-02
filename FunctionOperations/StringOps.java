import java.lang.String;

public class StringOps{
    public static void main(String[] args){
        int n = 1000;
        String result = "";
        for(int i= 0; i <n; i++){
            result += Integer.valueOf(i);
            System.out.println(result);
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i <n;i++){
            sb.append(i);
        }
    }
}