package uk.co.jpawlak.java8exercises.utils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice {
    public static   void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sum=0;
        Iterator<Integer> itr =  list.iterator();
        while (itr.hasNext()) {
            int num = itr.next();
            if (num > 0) {
                sum += num;
            }
        }
        System.out.println(sum);

        }
    }
/*PROBS
1.We just want to know the sum of integers but we would also have to provide how the iteration will take place, this is also called external iteration because client program is handling the algorithm to iterate over the list.
2.The program is sequential in nature, there is no way we can do this in parallel easily.
3.There is a lot of code to do even a simple task.*/
