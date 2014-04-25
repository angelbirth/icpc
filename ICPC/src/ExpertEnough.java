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
public class ExpertEnough {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T = sc.nextInt();
        
        int n = 1;
        while(n <= T) {
            int D = sc.nextInt();

            String[] M=new String[D];
            int[] L=new int[D];
            int[] H=new int[D];

            for (int i = 0; i < D; i++) {
                M[i] = sc.next();
                L[i] = sc.nextInt();
                H[i] = sc.nextInt();
            }

            int Q = sc.nextInt();
            int[] P=new int[Q];
            for (int i = 0; i < Q; i++) {
                P[i] = sc.nextInt();
            }

            for (int i = 0; i < Q; i++) {
                for (int j = 0; j < D; j++) {
                    if(L[j] < P[i] && P[i] < H[j] && M[j] != null) {
                        System.out.println(M[j]);
                        M[j] = null;
                        break;
                    }
                    if(j == (D-1)) {
                        if(P[i] < L[j] || H[j] < P[i]) {
                           System.out.println("UNDETERMINED");
                        }                    
                        else {
                            if(M[j] != null) {
                                System.out.println(M[j]);
                            }
                            else {
                                System.out.println("UNDETERMINED");
                            }
                        }
                    }                
                }
            }
            n++;
        }
    }
}
