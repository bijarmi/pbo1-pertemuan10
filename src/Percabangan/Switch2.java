package Percabangan;

public class Switch2 {
    public static void main(String[] args) {
        char nilai='D';
        switch(nilai){
            case 'A':
                System.out.println("Mahasiswa : \"terima kasih pak\"");
                System.out.println("Dosen : \"Selamat ya\"");
                break;
            case 'B':
                System.out.println("Mahasiswa : \"Kenapa ulun kada dapat A, Pak?\"");
                System.out.println("Dosen : \"!@#$\"");
                break;
            case 'C':
                System.out.println("Mahasiswa : \"Ulun Turun Pul Pak ae, Tugas pul jua\"");
                System.out.println("Dosen : \"Tapi bisa lah menjawab Ujian?\"");
                        System.out.println("Mahasiswa : \"Hehehe\"");
                   break;
            default:
                System.out.println("Mahasiswa : \"Ulun Turun Pul Pak ae, Tugas pul jua\"");
                System.out.println("Dosen : \"Bujur jua kh?\"");
                System.out.println("Dosen : \"Memeriksa Berkas\"");
                System.out.println("Dosen : \"Menceleng\"");
                System.out.println("Mahasiswa : \"Kabur\"");
                break;
        }
    }

}
