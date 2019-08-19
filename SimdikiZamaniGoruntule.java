package simdikizamanıgoruntule;

public class SimdikiZamaniGoruntule {

    public static void main(String[] args) {
        long toplamMillis = System.currentTimeMillis();
        
        long toplamSn = toplamMillis / 1000;
        long Sn = toplamSn % 60;
        
        long toplamDk = toplamSn / 60;
        long Dk = toplamDk % 60;
        
        long toplamSa = toplamDk / 60;
        long Sa = toplamSa % 24;
        
        System.out.println("Saat: " + Sa+ ":" + Dk + ":" + Sn + " GMT");
        //Eğer Tr saati istiyorsanız: Sa değişkeninin değerini 3 arttırın
        
        //Anlatım İçin YouTube Kanalımıza Gidebilirsiniz: PFF SOFTWARE
    }
    
}
