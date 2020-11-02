package cn.day02;

public class Demo01Exceptiom {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        getE(a,5);



    }

    public static int getE(int[] arr, int idx){

        if(arr == null)
            throw new NullPointerException("数组不能为空");
        if(idx < 0 || idx >arr.length)
            throw new ArrayIndexOutOfBoundsException("数组越界");

        int ans = arr[idx];
        return ans;

    }




}
