import java.util.Scanner;
//İki sayının toplamı yazdır.
public class Main {
    public static void main(String[] args) {
        int sayi1;
        int sayi2;

        Scanner input =new Scanner(System.in);
        System.out.println("A Sayısını Giriniz");
        sayi1= input.nextInt();
        System.out.println("B Sayısını Giriniz");
        sayi2=input.nextInt();
        int toplam = sayi1 + sayi2 ;
        System.out.println("Sayı Toplam: " +  toplam);

//Toplamın tek mi Çift mi Olduğunu Kontrol Etme
        if(toplam %2==0){
        System.out.println("Toplam Çift Sayıdır:");}
       else {
                System.out.println("Toplam Tek Sayıdır") ;          }




        }
    }
