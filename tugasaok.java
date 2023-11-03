
    import java.util.Scanner;
    public class tugasaok {

    public static void main(String args[]){
            
    Scanner input = new Scanner(System.in);

    //soal pertama, membuat biner ke desimal.
    //source https://www.duniailkom.com/latihan-kode-program-java-cara-konversi-biner-ke-desimal/
    
     
    int angka_biner, angka_desimal=0, i=1, digit;
     
    System.out.print("Input angka biner: ");
    angka_biner = input.nextInt();
     
    System.out.print("Angka desimal dari biner "+ angka_biner);
 
    while(angka_biner!=0) {
      digit = angka_biner % 10;
      angka_desimal = angka_desimal + (digit*i);
      i = i*2;
      angka_biner = angka_biner/10;
    }
     
    System.out.println(" adalah: "+ angka_desimal);
    System.out.println();
    //soal ke-1 end

    //soal kedua
    //Source https://www.duniailkom.com/latihan-kode-program-java-cara-konversi-desimal-ke-biner/
    Scanner in = new Scanner(System.in);
       
   
    int[] arr = new int[32];
    int n, o;
     
    System.out.print("input angka desimal: ");
    n = in.nextInt();
     
    for(o=0; n>0; o++){
      arr[o] = n%2;
      n = n/2;
    }
   
    System.out.print("Angka binernya adalah: ");
     
    for(o=o-1 ;o>=0 ;o--) {
      System.out.print(arr[o]);
    }
    System.out.println();
   //soal 2 end


   //soal ketiga. Biner ke hexa
   Scanner scanner = new Scanner(System.in);
   System.out.println();
        System.out.print("Masukkan nomor biner: ");
        String binary = scanner.nextLine();

        int decimal = Integer.parseInt(binary, 2);
        String hexadecimal = Integer.toHexString(decimal);

        System.out.println("Hexadecimal equivalent: " + hexadecimal.toUpperCase());
        System.out.println();
   // soal ketiga end

   //soal keempat
        Scanner hex2binary = new Scanner(System.in);
        System.out.print("Masukkan heksadesimal: ");
        String hex = hex2binary.nextLine();
        int desimal = Integer.parseInt(hex, 16);
        String biner = Integer.toBinaryString(desimal);
        System.out.println("Angka binernya adalah " + biner);
   //soal keempat end

   //soal kelima
   Scanner dec2hexa = new Scanner(System.in);
        System.out.print("Input Angka Desimal: ");
        int des = dec2hexa.nextInt();
        String heks = "";
        while (des != 0) {
            int heksValue = des % 16;
            char heksDigit = (heksValue <= 9 && heksValue >= 0) ? (char)(heksValue + '0') : (char)(heksValue - 10 + 'A');
            heks = heksDigit + heks;
            des = des / 16;
        }
        System.out.println("hexadecimalnya adalah: " + heks);
   //soal kelima end

    //soal keenam Hexa ke desimal 
    System.out.println();
    Scanner hexkedec = new Scanner(System.in);

    System.out.println("Input Hexadesimal");
        String heksa = hexkedec.nextLine();
        int dec = Integer.parseInt(heksa, 16);
        System.out.println("Bilangan desimal: " + dec); 
  }
}
