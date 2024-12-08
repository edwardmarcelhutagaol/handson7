public class Person {
    String nama;
    String tanggalLahir;
    String tempatLahir;
    String jenisKelamin;
    String warnaKulit;
    Integer umur;

    Person(String nama, String tanggalLahir, String tempatLahir, String jenisKelamin, String warnaKulit, Integer umur){
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.tempatLahir = tempatLahir;
        this.jenisKelamin = jenisKelamin;
        this.warnaKulit = warnaKulit;
        this.umur = umur;
    }
    //method overloding
    Person(String nama){
        this(nama,"-","-","-","-",0);
    }
void buatMakanan(String bahan){
        switch (bahan){
            case "Telor":
                System.out.println("Telor dadar");
                break;
            case "Nasi":
                System.out.println("Nasi Goreng");
                break;
            case "Mie":
                System.out.println("Mie goreng");
                break;
            case "Bihun":
                System.out.println("Bihun goreng");
                break;
            default:
                System.out.println("Saya belum bisa membuat makanan dari bahan tersebut");
        }
    }
    void sayYourBiography(){
        System.out.println("Nama : "+ nama);
        System.out.println("Tanggal Lahir : " +tanggalLahir);
        System.out.println("Tempat Lahir : " + tempatLahir);
        System.out.println("Jenis Kelamin: " +jenisKelamin);
        System.out.println("Warna Kulit : "+ warnaKulit);
        System.out.println("Umur : " + umur);
    }
}