public class NIM {
    private String nim;

    public NIM(String nimScan) {
    }

    public String getNim() { return nim; }

    public void setNim(String nim) { this.nim = nim; }

    public String getJenjangPendidikan() {
        char kodeJp = nim.charAt(0);
        if (kodeJp == '1') {
            return "S1 (Sarjana)";
        } else if (kodeJp == '2') {
            return "S2 (Magister)";
        } else if (kodeJp == '3') {
            return "S3 (Doktor)";
        }
        return "Tidak Terdeteksi";
    }
        public String getTahunMasuk () {
            char kodeTm = nim.charAt(0);
            if (kodeTm == '18') {
                return "2018";
            }else if (kodeTm == '19') {
                return "2019";
            } else if (kodeTm == '20') {
                return "2020";
            }
            return "Tidak Terdeteksi";
        }
    }
}
