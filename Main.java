import java.util.Scanner;

public class Main
{

  public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);
       
    System.out.println("##  Program Java Cek Tahun Kabisat  ##");
    System.out.println();
     
    int tahun;
     
    System.out.print("Input tahun: ");
    tahun = input.nextInt();
     
    if (tahun % 400 == 0) {
      System.out.println(tahun + " adalah tahun kabisat");
    }
    else if (tahun % 100 == 0) {
      System.out.println(tahun + " bukan tahun kabisat");
    }
    else if (tahun % 4 == 0) {
      System.out.println(tahun + " adalah tahun kabisat");
    }
    else {
      System.out.println(tahun + " bukan tahun kabisat");
    }
    input.close();
  }

}   