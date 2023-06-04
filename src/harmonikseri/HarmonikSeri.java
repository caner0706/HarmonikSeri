package harmonikseri;

import java.util.Scanner;

public class HarmonikSeri {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Hesaplamak İstediğiniz Sayıyı Girin : ");
        int sayi = scanner.nextInt();
        
        
        double toplam = 0.0;
        for(double i=1;i<=sayi;i++){
            toplam += (1/i);
        }
        
        System.out.println("Harmonik Serinin Sonucu : " + toplam );
        
    }
    
}
