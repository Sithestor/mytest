package com.spring.sum;

public class getsum {

    public static  int gets(int ...nums){
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        return sum;
    }

}
