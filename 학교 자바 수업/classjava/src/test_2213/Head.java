package test_2213;

import java.util.Scanner;

public class Head {

    String material;
    String color;

    Head(String material, String color){

        this.material = material;
        this.color = color;

    }

    public void final1(){

        System.out.println("로봇의 머리 재질은 " + material +" 입니다");
        System.out.println("로봇의 머리 색은  "+ color + " 입니다");

    }



}
