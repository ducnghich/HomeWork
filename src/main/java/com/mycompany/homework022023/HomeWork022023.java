
package com.mycompany.homework022023;


/**
 *
 * @author Duc
 */
public class HomeWork022023 {
    
    public static int sumofm7(int num1, int num2){
        if(num2<num1){
            return 0;
        }
        int sum = 0;
        if (num2 %7 ==0){
        sum = num2;
        }
        return sum + sumofm7(num1,num2 -1);
    }
    
    public static void main(String[] args){
    int total = sumofm7(20,50);
    System.out.print(total); 
    }
   /* 
    public static void printHelloWorld(int n) {
     for (int i = 0; i < n; i++) {
        System.out.println("Hello World");
        //printHelloWorld(i); // recursive call
    }
   }
    
    public static void main(String[] args) {
       printHelloWorld(5);
    }

*/
}    

    


 