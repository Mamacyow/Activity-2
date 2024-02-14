/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package activity.pkg2;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author Student
 */
public class Activity2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Yow = {12, 19, 2000, 23, 10};
        
        System.out.println("Print Array = " + Arrays.toString(Yow));
        
        int sum = IntStream.of(Yow).sum();
        
        System.out.println("The sum is: " + sum);
        
        int max = 0;
        max = Math.max(Yow[0], Math.max(Yow[1], Math.max(Yow[2], Math.max(Yow[3], Yow[4]))));
        
        System.out.println("Maximum Value: " + max);

    }
    
}
