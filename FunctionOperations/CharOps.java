import java.lang.Character;

class CharOps{
    public static void main(String[] args){
        char n = 'F';

        // isLetter() function returns true when the character passed is letter
        System.out.println(Character.isLetter(n));

        // isDigit() function returns true when the character passed is digit
        System.out.println(Character.isDigit('5'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isUpperCase('E'));
        System.out.println(Character.isLowerCase('e'));
        System.out.println(Character.toLowerCase('E'));
        System.out.println(Character.toUpperCase('e'));
        System.out.println(Character.toString('e'));
    }
}
