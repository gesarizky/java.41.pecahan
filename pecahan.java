
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Gesa Rizky Nugraha
 */
public class pecahan {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println(" ********************************* ");
        System.out.println(" *Masukkan Nilai a (dari pecahana a b/c)");
        System.out.println(" ********************************* ");

        int a = sc.nextInt();

        System.out.println(" ******************************* ");
        System.out.println(" *Masukkan Nilai b (dari pecahana "+a+" b/c)");
        System.out.println(" ******************************* ");

        int b = sc.nextInt();
        
        System.out.println(" ******************************* ");
        System.out.println(" *Masukkan Nilai c (dari pecahana "+a+" "+b+"/c)");
        System.out.println(" ******************************* ");

        int c = sc.nextInt();

        int a1 = a * c + b;

        System.out.println(" ************************************************* ");
        System.out.println(" *Maka Dari Pecahan " + a + " " + b + "/" +c );
        System.out.println(" *Maka Menjadi Pecahan  = " +a1+" / "+c );
        System.out.println(" ************************************************* ");
    }
}
