package com.mbti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalityTypeTest {
    public static void main(String[] args) {
        List<String> M = new ArrayList<>(Arrays.asList("E","I"));
        List<String> B = new ArrayList<>(Arrays.asList("N","S"));
        List<String> T = new ArrayList<>(Arrays.asList("T","F"));
        List<String> I = new ArrayList<>(Arrays.asList("J","P"));

        List<String> MBTI = new ArrayList<>();

        for(String m : M){
            for(String b: B){
                for(String t : T){
                    for(String i : I){
                        MBTI.add(m+b+t+i);
                    }
                }
            }
        }

        System.out.print(MBTI);


    }
}
