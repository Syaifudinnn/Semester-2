public class DataDosen16 {
    
    //tampil data dosen
    public static void dataDosen(Dosen16[] arrayOfDosen) {
        for (Dosen16 dosen : arrayOfDosen) {
            dosen.tampilData();
        }
    }

    //tampil jumlah dosen berdasarkan jenis kelamin
    public static void jumlahDosenPerJK(Dosen16[] arrayOfDosen) {
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahPria++;
            } else {
                jumlahWanita++;
            }
        }

        System.out.println("Dosen Pria : " + jumlahPria);
        System.out.println("Dosen Wanita : " + jumlahWanita);
        System.out.println("-----------------------------");
    }

    //rerata usia dosen per jenis kelamin
    public static void rerataUsiaDosenPerJK(Dosen16[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int jumlahPria = 0, jumlahWanita = 0;

        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                totalUsiaPria += dosen.usia;
                jumlahPria++;
            } else {
                totalUsiaWanita += dosen.usia;
                jumlahWanita++;
            }
        }

        //hitung rata rata
        double rerataPria = (double) totalUsiaPria / jumlahPria;
        double rerataWanita = (double) totalUsiaWanita / jumlahWanita;

        //output
        System.out.println("Rerata Usia Dosen Pria : " + rerataPria);
        System.out.println("Rerata Usia Dosen Wanita : " + rerataWanita);
        System.out.println("-----------------------------");
    }

    //dosen paling tua
    public static void infoDosenPalingTua(Dosen16[] arrayOfDosen) {
        Dosen16 palingTua = arrayOfDosen[0];

        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.usia > palingTua.usia) {
                palingTua = dosen;
            }
        }

        System.out.println("Dosen Paling Tua : " + palingTua.nama);
    }

    //dosen paling muda
    public static void infoDosenPalingMuda(Dosen16[] arrayOfDosen) {
        Dosen16 palingMuda = arrayOfDosen[0];

        for (Dosen16 dosen : arrayOfDosen) {
            if (dosen.usia < palingMuda.usia) {
                palingMuda = dosen;
            }
        }

        System.out.println("Dosen Paling Tua : " + palingMuda.nama);
    }

}
