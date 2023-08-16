import java.util.Scanner;
class Print {
    public static void main(String[] args) {
        Print p = new Print();
        Scanner s = new Scanner(System.in);
        System.out.println("Hello world");
        System.out.println("Enter username");
        p.printText(s.nextLine());
    }

    void printText(String s){
        System.out.println("Hello "+s);
    }
}