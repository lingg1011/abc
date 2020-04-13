/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a[] = {"linh", "nhat", "ne"};
        String b[] = {"linh1", "nhat1", "ne1"};
        String c1, c2;
        
        System.out.println("tk : ");
        Scanner nc = new Scanner(System.in);
        c1 = nc.nextLine();
        for (String a1 : a) {
            if (c1.equals(a1)) {
                System.out.println("pass : ");
                c2 = nc.nextLine();
                for (String a2 : b){
                    if(c2.equals(a2)){
                        System.out.println("dung roi");
                    }
                }
            }
        }
    }
}
