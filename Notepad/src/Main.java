import java.io.*;
import java.util.Scanner;

public class Main {
    //Dosyaya metin eklemek için yazılan metot
    public static void fileWrite(String text){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("NotePad.txt"));
            bw.write(text);
            bw.close();
            System.out.println("Metin dosyaya kaydedildi.");
        } catch (IOException e) {
            System.out.println("Alınan hata : " + e.getMessage());
        }
    }
    //Dosyaya yazılan verileri okumak için yazılan metot
    public static String fileReader(){
        StringBuilder txt = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader("NotePad.txt"));
            String line;
            while ((line = br.readLine()) != null){
                txt.append(line).append("\n");
            }
            br.close();
        } catch (IOException e){
            System.out.println("Alınan hata : " + e.getMessage());
        }
        return txt.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Son kaydedilen metni ekrana yazdırıyoruz.
        String lastText = fileReader();
        System.out.println("Son kaydedilen metin : \n" + lastText);

        System.out.println("Yeni bir metin girin: ");
        String text = input.nextLine();

        //Girilen metni dosyaya yazdırmak için metodu çağırıyoruz.
        fileWrite(text);


    }
}