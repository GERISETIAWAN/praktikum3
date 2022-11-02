public class MahasiswaBeraksi {
    public static void main(String[] args){
        //membuat object
        Mahasiswa anton = new Mahasiswa();

        /*memanggil atribut dan memberi nilai */
        anton.setnim("101020201");
        anton.setnama("Anton Santoso");
        anton.setjenisKelamin("Laki-laki");
        anton.setUmur("28");
        anton.setalamat("Bekasi Kota");
        anton.setjurusan("Informatika");

        anton.cetakInfo();
    }
}