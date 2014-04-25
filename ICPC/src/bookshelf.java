
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chrisand
 */
public class bookshelf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N = sc.nextInt();
        int L = sc.nextInt();        
        
        int[] H=new int[N];
        int[] W=new int[N];
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextInt();
            W[i] = sc.nextInt();
        }       
        
        for (int i = 1 ; i < N ; i++) {
            for (int j = 0; j < N-1 ; j++) {
               if(W[j] > W[j+1]) {
                    int tempW = W[j];
                    int tempH = H[j];
                    W[j] = W[j+1];
                    H[j] = H[j+1];
                    W[j+1] = tempW;
                    H[j+1] = tempH;
                }               
            }           
        }
        
        int sumWidth = 0, sumHeight = 0, maxHeight = 0, remain = L;
        int[] shelves=new int[1000000];
        for (int i = 0, j = 0; i < N; i++) {
            if(W[i] <= remain) {
                remain = remain - W[i];
                if(H[i] >= maxHeight) {
                    maxHeight = H[i];
                    shelves[j] = maxHeight;
                }
            }
            else {
                j++;
                remain = L; maxHeight = 0;
                remain = remain - W[i];
                if(H[i] >= maxHeight) {
                    maxHeight = H[i];
                    shelves[j] = maxHeight;
                }                
            }
        }
        
        for (int i = 0; i < shelves.length; i++) {
            sumHeight += shelves[i];
        }
        
        System.out.println(sumHeight);
    }  
}
