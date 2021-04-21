import java.util.Scanner;
public class RunNim {

    public static void main(String[] args) {
        System.out.println(" NIM MAHASISWA UIN SUSKA");

        String nimScan;
        nimScan = "";
        Scanner scan = new Scanner(System.in);
        System.out.print("Inputkan NIM = ");
        nimScan = scan.nextLine();

        NIM nim = new NIM(nimScan);

        System.out.println("\nJenjang Pendidikan\t\t: " + nim.getJenjangPendidikan());
        System.out.println("\nTahun Masuk\t\t: " + nim.getTahunMasuk());
        System.out.println("\nFakultas\t\t: " + nim.getFakultas());
        System.out.println("\nJurusan\t\t: " + nim.getTahunMasuk());
        System.out.println("\nJenis Kelamin\t\t: " + nim.getTahunMasuk());
        System.out.println("\nNo Urut Mahasiswa\t\t: " + nim.getTahunMasuk());
    }
}
