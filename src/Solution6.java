import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution6 {

    public static void main(String[] args) {

        System.out.println("请输入要打印的字符串");
        Scanner scanner1 = new Scanner(System.in);
        String s= scanner1.nextLine();
        System.out.println("请输入要打印行数");
        Scanner scanner2 = new Scanner(System.in);
        int i = scanner2.nextInt();
        String ss;
        ss = Solution6.convert1(s,i);
        System.out.println(ss);

    }

    //热心网友给出的方法,并没有官方给的容易懂
    private static String convert1(String s, int nRows) {

        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[nRows];
        for (int i = 0; i < sb.length; i++)
            sb[i] = new StringBuffer();

        int i = 0;
        while (i < len) {

            for (int idx = 0; idx < nRows && i < len; idx++) // vertically down
                sb[idx].append(c[i++]);

            for (int idx = nRows-2; idx >= 1 && i < len; idx--) // obliquely up
                sb[idx].append(c[i++]);
        }
        for (int idx = 1; idx < sb.length; idx++)
            sb[0].append(sb[idx]);

        return sb[0].toString();
    }

    //官方标答
    private static String convert2(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        //建立了i个StringBuilder型数组
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }


}

