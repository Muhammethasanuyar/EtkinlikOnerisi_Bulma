public class EtkinlikOnerisi {
    public static void main(String[] args) {
        int sicaklik = 10; // Örnek sıcaklık değeri

        if (sicaklik < 5) {
            System.out.println("Kayak yapmayı öner.");
        } else if (sicaklik >= 5 && sicaklik < 15) {
            System.out.println("Sinema etkinliğini öner.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Piknik etkinliğini öner.");
        } else {
            System.out.println("Yüzme etkinliğini öner.");
        }
    }
}
