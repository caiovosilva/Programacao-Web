/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

/**
 *
 * @author caiov
 */
public class ArrayWorker {
    private int myArray[];
    
    public ArrayWorker(int pArray[]){
        myArray = pArray;
    }
    
    public int[] orderedArray(){
        int lArray[] = myArray;
        int a;
        for(int i=0;i<lArray.length-1 ; i++){
            if(lArray[i]<lArray[i+1]){
                a=lArray[i];
                lArray[i] = lArray[i+1];
                lArray[i+1]=a;
            }
        }
        return lArray;
    }
}
