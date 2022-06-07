import java.util.ArrayList;

class Problem5{
    public static void func(String str){
        int size = str.length();
        char val[] = new char[size];
        val=str.toCharArray();
        StringBuilder capitalCase= new StringBuilder();
        StringBuilder smallCase= new StringBuilder();
        
        for(int i = 0; i < size; i++){
            // println("Value of i : "+val[i]);
            if(((int)val[i] >= 65) && ((int)val[i] <= 96)){
                // println(val[i]+"");
                capitalCase.append(val[i]);
            }
            else if(((int)val[i] >= 97) && ((int)val[i] <= 125)){
                // println(val[i]+"");
                smallCase.append(val[i]);
            }
        }
        println(smallCase+"");
        println(capitalCase+"");
    }

    public static void swap(int j, int i){

    }
    public static void main(String[] args) {
        String str = "aezSTAbkZL";
        // Output : abeALSkzTZ
        func(str);
    }

    public static void println(String str){
        System.out.println(str);
    }
}