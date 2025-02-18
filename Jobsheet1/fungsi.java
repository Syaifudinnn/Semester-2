public class fungsi {
    
    //deklarasi array
    String[] toko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
    String[] tanaman = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
    int[] hargaTanaman = {75000, 50000, 60000, 10000};
    int[][] stokTanaman = {
        {10, 5, 15, 7}, //RoyalGarden 1
        {6, 11, 9, 12}, //RoyalGarden 2
        {2, 10, 10, 5}, //RoyalGarden 3
        {5, 7, 12, 9}   //RoyalGarden 4
    };
    
    public static void main(String[] args) {
        
        //buat objek dari class fungsi
        fungsi f = new fungsi();

        //panggil fungsi pendapatanCabang
        f.pendapatanCabang();

        //panggil fungsi stokTanaman
        f.stokTanaman();

    }

    //fungsi untuk menampilkan pendapatan semua cabang
    public void pendapatanCabang() {

        System.out.println("Pendapatan Semua Cabang : ");

        int totalPendapatan = 0;
        for (int i = 0; i < toko.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < tanaman.length; j++) {
                pendapatan += stokTanaman[i][j] * hargaTanaman[j];
            }
            System.out.println(toko[i] + " : " + pendapatan);
            totalPendapatan += pendapatan;
        }
        System.out.println("Total Pendapatan : " + totalPendapatan);
    }

    //fungsi untuk mengetahui stok tanaman di semua cabang
    public void stokTanaman() {

        System.out.println("\nStok Tanaman di Semua Cabang : ");

        System.out.print("               ");
        for (String namaTanaman : tanaman) {
            System.out.printf("%-10s", namaTanaman);
        }
        System.out.println();

        for (int i = 0; i < toko.length; i++) {
            System.out.printf("%-15s", toko[i]);
            for (int j = 0; j < stokTanaman.length; j++) {
                System.out.printf("%-10d", stokTanaman[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nTanaman yang mati di RoyalGarden 4:");
        System.out.printf("Aglonema : %d, Keladi : %d, Alocasia : %d, Mawar : %d\n", 1, 2, 0, 5);
    }
    
}