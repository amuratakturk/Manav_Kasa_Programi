import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double armut =2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlican =5.00;
        double armutmiktari;
        double elmamiktari;
        double domatesmiktari;
        double muzmiktari;
        double patlicanmiktari;
        double toplamtutar;

        Scanner inp = new Scanner(System.in);


        System.out.println("Armut Kaç Kilo Aldınız ? ");
        armutmiktari  = inp.nextDouble();


        System.out.println("Elma Kaç Kilo Aldınız ? ");
        elmamiktari = inp.nextDouble();

        System.out.println("Domates Kaç Kilo Aldınız ? ");
         domatesmiktari= inp.nextDouble();

        System.out.println("Muz Kaç Kilo ? Aldınız ");
        muzmiktari = inp.nextDouble();

        System.out.println("Patlıcan Kaç Kilo Aldınız ? ");
        patlicanmiktari=inp.nextDouble();

            toplamtutar = (armutmiktari*armut)+(elmamiktari*elma)+(domatesmiktari*domates)+(muzmiktari*muz)+(patlicanmiktari*patlican);


        System.out.println("toplam Tutar : "+toplamtutar);



    }
}