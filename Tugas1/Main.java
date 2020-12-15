import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Bus bus = new Bus();
        Scanner input = new Scanner(System.in);
        int pilihan;
        System.out.println(" BUS TRANS KOETARADJA ");
        String nama;
        int umur;
        String hamil;
        boolean status;
        while(true){
            System.out.println("Menu :");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println();
            System.out.print("Masukkan Pilihan Anda : ");
            pilihan = input.nextInt();
            System.out.println();
            input.nextLine();
            if(pilihan==1){
                System.out.print("Nama       : ");
                nama = input.nextLine();
                System.out.print("Umur       : ");
                umur = input.nextInt();
                input.nextLine();
                System.out.print("Hamil(y/n) : ");
                hamil = input.nextLine();
                if(hamil.equalsIgnoreCase("y")){
                    status = true;
                }else{
                    status = false;
                }
                Penumpang pen = new Penumpang(nama, umur, status);
                System.out.println(bus.naikPenumpang(pen) ? "Penumpang berhasil ditambahkan!":"Penumpang Gagal ditambahkan!");
            }else if(pilihan==2){
                System.out.print("Nama       : ");
                nama = input.nextLine();
                System.out.println(bus.turunkanPenumpang(nama) ? "Penumpang berhasil Turun!":"Penumpang Tidak ditemukan!");
            }else if(pilihan==3){
                System.out.println(bus.toString());
            }
        }
    }
}