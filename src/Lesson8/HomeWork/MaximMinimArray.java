package Lesson8.HomeWork;
/**
 *Write a Java program to find the maximum and minimum value of an array.
 */
public class MaximMinimArray {
    public static void main(String[] args) {

        int intArr[] = {34, -64, 3, 23, -12, 85, 19, -7, 69};

        int maximValue = 0 ;
        int minimValue = 0;

        for(int i = 0; i < intArr.length; i++){
            if(maximValue < intArr[i]){
                maximValue = intArr[i];
            }else if(minimValue > intArr[i]){
                minimValue = intArr[i];
            }
        }
        System.out.println("Maximum number = " + maximValue);
        System.out.println(" Minimum number = " + minimValue);

    }
}
