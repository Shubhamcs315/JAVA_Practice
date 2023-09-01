import java.util.Scanner;

class DecimalBinary {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.print("Enter number: ");

                int dec = sc.nextInt();

                int bin = 0;

                int base = 1;

                while (dec > 0) {//12
                        int remainder = dec % 2;
                        bin = (remainder * base)+bin;
                        base *= 10;
                        dec /= 2; 
                }
                System.out.println("Binary: " + bin);
                sc.close();
        }
}