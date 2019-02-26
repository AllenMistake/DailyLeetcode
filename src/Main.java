import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //==============6.Zigzag=================
        System.out.println("请输入要打印的字符串");
        Scanner scanner1 = new Scanner(System.in);
        String s= scanner1.nextLine();
        System.out.println("请输入要打印的字符串");
        Scanner scanner2 = new Scanner(System.in);
        int i = scanner2.nextInt();
        String ss;
        ss = Solution6.convert1(s,i);
        System.out.println(ss);

    }

}
