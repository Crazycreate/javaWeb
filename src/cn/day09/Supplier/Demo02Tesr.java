package cn.day09.Supplier;

import java.util.function.Supplier;

public class Demo02Tesr {
    public static void main(String[] args) {
        int[] arr = {10,65,20,77,86};
        int ans2 = getMax(()->{
            int ans = arr[0];
            for (int i : arr){
                if(i > ans)
                    ans = i;
            }
            return ans;
        });

        System.out.println(ans2);




    }

    public static int getMax(Supplier<Integer> sup){
        return sup.get();
    }
}
