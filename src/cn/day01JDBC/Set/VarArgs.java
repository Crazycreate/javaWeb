package cn.day01JDBC.Set;

public class VarArgs {
    public static void main(String[] args) {

        System.out.println(adds(1, 10, 56));

    }


    public static int adds(int...arr){
        //System.out.println(arr.length);
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }
        return ans;
    }




}
