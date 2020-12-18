package ch.hicoders.jam101.week04;

import ch.hicoders.jam101.week04.tren.Vagon;
import java.util.Scanner;

// Tren ödevi

public class Tren {

    public static void main(String[] args) {

        // Tren ve Vagon objelerinin olusturulmasi
        Tren tren = new Tren();
        Vagon vagon = new Vagon();

        // Tahmin No degiskeninin olusturulmasi ve deger atanmasi
        int vagonNoTahminNo = 1;

        // Oyunun baslatilmasi
        tren.vagonNoBul(vagonNoTahminNo, vagon.getVagonNo());
    }

    // Tahminlerin kullaniciya sorulup kayit edilmesi
    // daha sonraki derslerde sadece 1 ile 10 arasindaki sayilari kabul edecek sekilde gelistirilebilir
    private int vagonNoSor(int tahminNo) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vagon No [1-10] (Tahmin "+tahminNo+"): ");
        int vagonNo = sc.nextInt();
        return vagonNo;
    }

    // kullanicinin girdigi tahmini sayilarla vagonun bulunmasi
    private void vagonNoBul(int vagonNoTahminNo, int vagonNo) {

        for (int i = vagonNoTahminNo; i < 6; i++) {
            if (i < 5){
                vagonNoTahminNo = vagonNoSor(i);
            }
            if (i == 5){
                System.out.println("tahmin edemediniz");
                break;
            } else if (vagonNoTahminNo == vagonNo) {
                System.out.println("Dogru tahmin");
                break;
            } else if (vagonNoTahminNo > vagonNo) {
                System.out.println("geride");
            } else if (vagonNoTahminNo < vagonNo) {
                System.out.println("ileride");
            }
        }

    }
}
