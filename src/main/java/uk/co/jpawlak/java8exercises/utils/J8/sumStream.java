package uk.co.jpawlak.java8exercises.utils.J8;

import java.util.Arrays;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class sumStream {
Integer[] myArr= new Integer[]{1,2,3,4,5,6,7,8,9};

//Stream<Integer> mystream = Arrays.stream(myArr).map(n->n*2).forEach(System.out::println);
/*This line will not compile because forEach returns void, which means you can't assign it to mystream. Instead, you should do it like this:*/
public static void main(String[] args) {
    Integer[] myArr= new Integer[]{1,2,3,4,5,6,7,8,9};

//    Arrays.stream(myArr)
//            .map(n->n*2).
//            forEach(System.out::println);
    Integer[]dbarr= Arrays.stream(myArr)
            .map(n->n*2)
            .peek(System.out::println)
            .toArray(Integer[]::new)
//            .peek(System.out::println) /*is that toArray is a terminal operation that consumes the stream. Once you perform a terminal operation on a stream (like toArray, forEach, or reduce), the stream is considered closed and cannot be used for further operations, including peek.*/

    ;

}


//Stream<Integer> mystream = Arrays.stream(myArr).map(sumStream::);

//        myStream.forEach(System.out::println); // Print the doubled values

}
