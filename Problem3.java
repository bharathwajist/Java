import java.util.ArrayList;
import java.util.Scanner;

public class Problem3 {
    public static void seven() {
        for (int i = 0; i < 40; i++) {
            String pattern = "";
            for (int j = 0; j < 40; j++) {
                if (i == 15) {
                    if ((j >= 15) && (j < 23)) {
                        pattern = pattern + "* ";
                    } else {
                        pattern = pattern + "- ";
                    }
                } else if ((i >= 16) && (i < 23)) {
                    if (j == 22) {
                        pattern = pattern + "* ";
                    } else {
                        pattern = pattern + "- ";
                    }
                } else {
                    pattern = pattern + "- ";
                }
            }
            System.out.println(pattern);
        }
    }

    public static void u() {
        for (int i = 0; i < 40; i++) {
            String pattern = "";
            for (int j = 0; j < 40; j++) {
                if ((j == 15) || (j == 22)) {
                    if ((i >= 15) && (i <= 22)) {
                        pattern = pattern + "* ";
                    } else {
                        pattern = pattern + "- ";
                    }
                }
                if (i == 22) {
                    if ((j >= 15) && (j <= 21)) {
                        pattern = pattern + "* ";
                    } else {
                        pattern = pattern + "- ";
                    }
                } else {
                    pattern = pattern + "- ";
                }
            }
            System.out.println(pattern);
        }
    }

    public static void square() {
        for (int i = 0; i < 40; i++) {
            String pattern = "";
            for (int j = 0; j < 40; j++) {
                if ((j >= 15) && (j < 23)) {
                    if ((i >= 15) && (i < 23)) {
                        pattern = pattern + "* ";
                    } else {
                        pattern = pattern + "- ";
                    }
                } else {
                    pattern = pattern + "- ";
                }
            }
            System.out.println(pattern);
        }
    }

    public static void blank() {
        for (int i = 0; i < 40; i++) {
            String pattern = "";
            for (int j = 0; j < 40; j++) {
                pattern = pattern + "- ";
            }
            System.out.println(pattern);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> save = new ArrayList<Integer>();
        int game = -999999;
        String name = null;
        while (true) {
            System.out.println("P--> Play  Q--> quiet S-->Save L-->Load C-->Clear");
            char value = sc.next().toLowerCase().charAt(0);
            if (value == 'p') {
                System.out.println(value);
                System.out.println("1.Square 2.U 3.seven ");
                game = sc.nextInt();
                if ((int) game == 1) {
                    square();
                } else if ((int) game == 2) {
                    u();
                } else if ((int) game == 3) {
                    seven();
                }
            } else if (value == 'c') {
                save.clear();
            } else if (value == 's') {
                if (game != 0) {
                    save.add(game);
                    System.out.println(game);
                    System.out.println("saved!!");
                } else {
                    System.out.println("NO current Patter");
                }
            } else if (value == 'l') {
                System.out.println(save);
                if (save.equals(null) == true) {
                    System.out.println("NO saved pattern");
                } else {
                    String load_msg = "Load patterns are ";
                    for (int i = 0; i < save.size(); i++) {
                        if (i == 1) {
                            // square()
                            name = "Square";
                        } else if (i == 2) {
                            // u()
                            name = "U";
                        } else if (i == 3) {
                            // # seven()
                            name = "Seven";
                        }
                        load_msg = load_msg + (char) i + "." + name + " ";
                    }
                    System.out.println("Enter to load 1/2/3 : ");
                    try{
                        int load = sc.nextInt();
                        if (load == 1) {
                            square();
                        } else if (load == 2) {
                            u();
                        } else if (load == 3) {
                            seven();
                        }
                    }catch(Exception e){
                        System.out.print("You have entered wrong value\nYou are out of game!\n");
                        break;
                    }
                }
            }
            if (value == 'q') {
                break;
            }
        }
        sc.close();
    }
}
