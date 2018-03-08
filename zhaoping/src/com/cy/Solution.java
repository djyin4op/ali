package com.cy;

import java.util.Scanner;

class Solution {
    /*
    不知道想的对不对
    整个思路上只要求数组相邻天数之间的最大差值即可。
    怕数据太多，改成了一行一行读的形式，数组上则写成了循环数组
    实在不好意思，出了点状况，晚交了，抱歉
     */
    public int solution(String aFile, int x){
        //System.out.println(aFile);
        Scanner in =new Scanner(aFile);
        int [] price = new int[x+10];
        int  i=0;
        int  jishu=0;
        int  ans = -1;
        String str;
        while(in.hasNextLine()){
            str=in.nextLine();
            price[i]=Integer.parseInt(str);
            if(jishu>=x){
                int last=jishu%(x+1);
                int pre=(jishu-x)%(x+1);
                if(price[last]-price[pre]>ans){
                    ans=price[last]-price[pre];
                }
            }
            i=(++i)%(x+1);
            jishu++;
        }
        return ans;

    }
}


