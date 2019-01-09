package com.kmr.langpack;

import java.util.ArrayList;
import java.util.List;

//PickGoldCoinFromMonthForSuitableDay
public class PickGoldCoin {
    
    public static List<Integer> coinChoose(int day) {
        //List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        int sum = 0;
        for(int i = 2; i<= day; i++) {
            if(i>0) {
            list1.add(i);
            }
        }
        return list1;
    }

    public static void main(String[] args) {
        System.out.println(PickGoldCoin.coinChoose(2));
    }
}
