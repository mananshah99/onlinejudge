/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package projecteuler;

import java.io.IOException;

/**
 *
 * @author Manan
 */
public class ProjectEuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       //implementation code is left commented out--
        
       /**PROBLEM 1**/
       
       Problem001 p1 = new Problem001();
       //p1.euler001();
        
       /**PROBLEM 2**/
        
        Problem002 p2 = new Problem002();
        //p2.euler002();
       
       /**PROBLEM 3**/
       
        Problem003 p3 = new Problem003();
        long num = 600851475143L;
        //p3.euler003(num);
        
        Problem004 p4 = new Problem004();
        //p4.euler004();
        
        /**PROBLEM 5**/
        
        Problem005 p5 = new Problem005();
        //p5.euler005();        
        
        /**PROBLEM 6**/
        
        Problem006 p6 = new Problem006();
        //p6.euler006();

        /**PROBLEM 7**/

        Problem007 p7 = new Problem007();
        //p7.euler007();
   
        //Problem008.euler008();
        
        /**PROBLEM 9**/
        
        Problem009 p9 = new Problem009();
        //p9.euler009();
        
        /**PROBLEM 10**/
        
        Problem010 p10 = new Problem010();
        //p10.euler010();
        
        /**PROBLEM 12**/
         Problem012 p12 = new Problem012();
         p12.euler012();
    }
}
