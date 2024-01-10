import java.lang.*;
import java.util.*;

class myProgram {
    public static void main(String[] args) {
        String name;
        Scanner s = new Scanner(System.in);
        System.out.println("May I know your name:");
        name = s.nextLine();
        System.out.println("Welcome" + " " + name);
    }
}
