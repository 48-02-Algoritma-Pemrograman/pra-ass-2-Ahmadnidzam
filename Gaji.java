 import java.util.Scanner;

public class Gaji{
    public static int masaKerja;
    static int Gaji(){
        int gajiPokok;
        if (masaKerja<5) {
            gajiPokok=5000000;
        }else if (masaKerja >=5 && masaKerja<10) {
            gajiPokok=7500000;
        }else{
            gajiPokok=10000000;
        }
        return gajiPokok;
    }
    static int Lembur(int jamLembur){
        int gajiLembur;
        if (masaKerja<5) {
            gajiLembur=jamLembur*40000;
        }else if (masaKerja>=5 && masaKerja <10) {
            gajiLembur=jamLembur*50000;
        }else{
            gajiLembur=jamLembur*75000;
        }
        return gajiLembur;
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        masaKerja = input.nextInt();
        int jamLembur = input.nextInt();

        /* Pekerjaan anda mulai dari sini */
        int gajiPokok = Gaji();
        int gajiLembur = Lembur(jamLembur);
        int totalGaji = gajiPokok + gajiLembur;
        System.out.println(totalGaji);
        /* Pekerjaan anda berakhir sini */

        System.out.println(Gaji.class.getDeclaredMethods().length);
        System.out.println(Gaji.class.getDeclaredFields().length);
        
    }
    
}
