package chapter1;

/**
 * Created by Administrator on 2017/7/30.
 */
public class BinarySearch {
    public static int rank(int key, int[] a){
        return rank(key, a, 0, a.length - 1);
    }
    public static int rank(int key, int[] a, int lo, int hi){
        if(lo > hi) return -1;
        int mid = (lo + hi) / 2;
        if(key < a[mid]) return rank(key, a, lo, mid);
        else if(key > a[mid]) return rank(key, a, mid, hi);
        else return mid;
    }
    public static void main(String[] args){

    }
}
