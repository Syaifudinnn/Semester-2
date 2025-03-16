public class HitungNilai {

    //attribut
    DataMahasiswa[] dataMahasiswa;

    //method konstruktor
    public HitungNilai(DataMahasiswa[] dataMahasiswa) {
        this.dataMahasiswa = dataMahasiswa;
    }

    //method cari nilai uts tertinggi dgn divide and conquer
    public int cariNilaiUTSTertinggi(int l, int r) {
        if (l == r) {
            return dataMahasiswa[l].nilaiUTS;
        }
        
        int mid = (l + r) / 2;
        int lsum = cariNilaiUTSTertinggi(l, mid);
        int rsum = cariNilaiUTSTertinggi(mid + 1, r);
        
        return Math.max(lsum, rsum);
    }

    //method cari nilai uts terendah dgn divide and conquer
    public int cariNilaiUTSTerendah(int l, int r) {
        if (l == r) {
            return dataMahasiswa[l].nilaiUTS;
        }
        
        int mid = (l + r) / 2;
        int lsum = cariNilaiUTSTerendah(l, mid);
        int rsum = cariNilaiUTSTerendah(mid + 1, r);
        
        return Math.min(lsum, rsum);
    }

    //method cari rata-rata uas dgn brute force
    public double rataUas(){
        double total = 0;
        for (DataMahasiswa data : dataMahasiswa) {
            total += data.nilaiUAS;
        }
        return total / dataMahasiswa.length;
    }

}