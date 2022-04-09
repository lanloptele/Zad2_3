import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner( System.in );
    double[] oceny= new double[7];// nowa tablica czyli nawiasy kwadratowe mamy 7 ocen wiec tablica duza na 7 typ double bo oceny sa z przecinkiem
    oceny[0]=4.0;
      oceny[1]=3.0;
        oceny[2]=5.0;
          oceny[3]=3.5;
            oceny[4]=4.5;
              oceny[5]=5.0;
                oceny[6]=2.0;
    double suma = 0.0;
  int ilosc = oceny.length;
  for (int i = 0; i < oceny.length; i++) 
  {
            suma += oceny[i];
  }
  double srednia = suma / ilosc;
  System.out.print( "średnia to: " );
  System.out.println(srednia);
  }
}