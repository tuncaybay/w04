package ch.hicoders.jam101.week04.tren;

public class Vagon {

    private  int vagonNo;

    public Vagon() {
        // Vagon objesine 1 ile 10 arasinda rastgele bir deger atanmasi
        this.vagonNo =((int)((Math.random() * 10) + 1));
    }

    public int getVagonNo() {
        return vagonNo;
    }
}
