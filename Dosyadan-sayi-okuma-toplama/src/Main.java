import java.io.*;

public class Main {
    public static void main(String[] args) {
        File myFile = new File("myFile.txt");
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("myFile.txt"));
            bw.write("5\n");
            bw.write("10\n");
            bw.write("20\n");
            bw.write("12\n");
            bw.write("33\n");
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            BufferedReader br = new BufferedReader(new FileReader("myFile.txt"));
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null){
                sum += Integer.parseInt(line.trim());
            }
            System.out.println("Toplam : " + sum);
            br.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}