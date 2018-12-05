
/*
increment  ++
dicrement  --
 */

package com.introduction.leson1.leson3;

public class IncrementAndDicrement {
    public static void main(String [] args){
        int a = 5;
        System.out.println(a++);
        System.out.println(a);
        //постфекстный инкремент, переменная увеличивается/уменьшается на след этапе.


        a++;
        System.out.println("a++" + a);  //7
        a--;
        System.out.println("a--" + a);  //6


        // префекстный инкремент, переменная увеличивается/уменьшается перед расчетом.
        --a;
        System.out.println("--a" + a);   //5
        ++a;
        System.out.println("++a" + a);   //6




    }
}
