package arraylib;

/**
 * Created by gaojp on 2017/7/27.
 * There are high frequency used operations of array in this class
 */
public class ArrayOps<T extends Comparable<T>> {
    /*
    * This func returns the max element of array
    * parm: T[]
    * return: the max element
    * */
    public T getMax(T[] arr){
        if(null == arr || 0 == arr.length){
            return null;
        }
        T max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i].compareTo(max) > 0){
                max = arr[i];
            }
        }
        return max;
    }
    /*
    * This func invert the array
    * */
    public void invertArr(T[] arr){
        if(null == arr || 0 == arr.length){
            return;
        }
        int n = arr.length;
        for(int i = 0; i < n/2; i++){
            T tmp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = tmp;
        }
    }
    public static void main(String[] args){
        String[] str = {"a", "b", "c", "A"};
        Integer[] intarr = {1, 2, 3, 4};
        ArrayOps<Integer> arrayOps = new ArrayOps<>();
        System.out.println(arrayOps.getMax(intarr));
        System.out.println("a = " + (int)'a' + " A = " + (int)'A');
        arrayOps.invertArr(intarr);
        for(int a : intarr){
            System.out.println(a);
        }
    }
}
