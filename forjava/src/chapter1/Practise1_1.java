package chapter1;

/**
 * Created by Administrator on 2017/8/1.
 */
public class Practise1_1 {
    public static void main(String[] args){
        //1.1.8 类型转换
        String index = "1.1.8--";
        System.out.println('b');
        System.out.println('b' + 'c');//类型转换，char -> int
        System.out.println((char) ('a' + 4));
        System.out.println(index + Integer.toBinaryString(8));
        //1.1.9 正整数二进制表示法
        index = "1.1.9--";
        String s = "";
        int N = 10;
        for(int i = N; i > 0; i /= 2){
            s = (i % 2) + s;
        }
        System.out.println(index + s);
        //1.1.13 打印二维数组的转置
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}};
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
        //1.1.14 打印lg()，接受正整数N，返回不大于lg2N的最大整数
        index = "1.1.14--";
        System.out.println(index + lg(1));
    }

    public static int lg(int N) {
        if (N < 1) return -1;
        int cnt = 0;
        for (int i = N; i > 1; i /= 2) {
            cnt++;
        }
        return cnt;
    }
}
