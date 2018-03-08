package com.cy;

import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        Solution s = new Solution();
        StringBuffer buffer = new StringBuffer();
        BufferedReader bf= new BufferedReader(new FileReader("B.txt"));
        String str = null;
        while((str = bf.readLine())!=null){
            buffer.append(str.trim());
            buffer.append('\n');
        }

        String nstr = buffer.toString();
        System.out.println(s.solution(nstr,3));
    }

}
