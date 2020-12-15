import java.util.*;

public class Bus {
    Scanner scan = new Scanner(System.in);

    private ArrayList <Penumpang> penumpangBiasa;
    private ArrayList <Penumpang> penumpangPrioritas; 

    public Bus() {
        penumpangBiasa = new ArrayList<Penumpang>();
        penumpangPrioritas = new ArrayList<Penumpang>();
    }

    public ArrayList<Penumpang> getPenumpangBiasa(){
        for (Penumpang penumpang : penumpangBiasa) {
            penumpang.getNama();
        }
        return penumpangBiasa;

    }

    public ArrayList<Penumpang> getPenumpangPrioritas(){
        for (Penumpang penumpang : penumpangPrioritas) {
            penumpang.getNama();
        }
        return penumpangPrioritas;
    }

    public int getJumlahPenumpangBiasa(){
        int jumlahPenumpangBiasa = penumpangBiasa.size();
        System.out.println("Jumlah penumpang Biasa : " + jumlahPenumpangBiasa);
        return jumlahPenumpangBiasa;

    }

    public int getJumlahPenumpangPrioritas(){
        int jumlahPenumpangPrioritas = penumpangPrioritas.size();
        System.out.println("Jumlah penumpang Prioritas : " + jumlahPenumpangPrioritas);
        return jumlahPenumpangPrioritas;
    }

    public boolean naikPenumpang(Penumpang penumpang){
        if ((penumpangPrioritas.size() < 2) && (penumpang.getUmur() < 10 || penumpang.getUmur() > 60) || (penumpang.getHamil() == true) ) {
            System.out.println("Penumpang Dengan Nama " + penumpang.getNama() + "Telah Naik");
            return penumpangPrioritas.add(penumpang);
        } else if (penumpangBiasa.size() < 5){
            System.out.println("Penumpang Dengan Nama " + penumpang.getNama() + "Tidak Bisa Naik");
            return penumpangBiasa.add(penumpang);
        } else {
            System.out.println("Penumpang Dengan Nama " + penumpang.getNama() + "Tidak Bisa Naik Dikarenakan Tidak Ada Kursi Yang Tersedia");
            return false;
        }
    }

    public boolean turunkanPenumpang(String nama){
        for (int i = 0; i < penumpangBiasa.size(); i++) {
            if (nama.equals(penumpangBiasa.get(i).getNama())) {
                penumpangBiasa.remove(i);
                System.out.println("Penumpang Telah Diturunkan");
                return penumpangBiasa.equals(nama);
            } else {
                System.out.println("Tidak Ada Penumpang Yang Bernama " + nama);
                return false;
            }
        }

        for (int i = 0; i < penumpangPrioritas.size(); i++) {
            if (nama.equals(penumpangPrioritas.get(i).getNama())) {
                penumpangPrioritas.remove(i);
                System.out.println("Penumpang Telah Diturunkan");
                return penumpangPrioritas.equals(nama);
            } else {
                System.out.println("Tidak Ada Penumpang Yang Bernama " + nama);
                return false;
            }
        }
        return penumpangPrioritas.equals(nama);
    }

    public String toString(){
        String namaPenumpangBiasa =" ", namaPenumpangPrioritas =" ";
        boolean check1 = penumpangBiasa.isEmpty();
        boolean check2 = penumpangPrioritas.isEmpty();

        for (Penumpang penumpang : penumpangBiasa) {
            namaPenumpangBiasa += penumpang.getNama().toString();
        }
        for (Penumpang penumpang : penumpangPrioritas) {
            namaPenumpangPrioritas += penumpang.getNama().toString();
        }

        if (check1 == true) {
            System.out.println("Tidak Ada Penumpang Biasa");
        } else {
            System.out.println("daftar Nama Penumpang Biasa = " + namaPenumpangBiasa);
        }

        if (check2 == true) {
            System.out.println("Tidak Ada Penumpang Prioritas");
        } else {
            System.out.println("daftar Nama Penumpang Prioritas = " + namaPenumpangPrioritas);
        }

        System.out.println("jumlah Semua Penumpang Adalah = " +penumpangBiasa.size() + penumpangPrioritas.size());

        return "daftar nama penumpang biasa = " + namaPenumpangBiasa + "daftar nama penumpang prioritas = " + namaPenumpangPrioritas
        + "jumlah1 semua penumpang = " + penumpangBiasa.size() + penumpangPrioritas.size();
    }
        
}
