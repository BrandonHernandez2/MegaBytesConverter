public class Assignment {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kilobytes){
        if (kilobytes >= 0) {
            int mega = kilobytes / 1024;
            int kb = kilobytes % 1024;
            // System.out.println(kilobytes + " KB = " + mega + " KB and " + kb);
            String result = String.format("%s KB = %s MB and %s KB", mega, kb, kb);
            System.out.println(result); //Same as earlier comment
        } else {
            System.out.println("Invalid ");
        }
    }
}
