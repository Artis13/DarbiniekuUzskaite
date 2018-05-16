import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Uzskaite uz = new Uzskaite();
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Vai vēlaties veikt jaunu darbību?(j/n)");
            String atbilde = scanner.next();

            if (!atbilde.equals("j")) break;

            System.out.println("Lai pievienotu darbinieku ievadiet (p), lai iznemtu darbinieku nospiediet (i)," +
                " lai izprintetu sobridejo sarakstu nospiediet (d), Lai mainitu darbinieka dzimsanas datumu nospiediet(m) ");
            atbilde = scanner.next().toLowerCase();
            if (atbilde.equals("p")){
                uz.PievienotDarbinieku();
            }
            else if(atbilde.equals("i")){
                uz.IznemtNoSaraksta();
            }
            else if (atbilde.equals("d")){
                int y = 1;
                for (Ipasibas x : uz.saraksts){
                    System.out.println(y + " Darbinieks ir : " + x.toString());
                    y++;
                }
            }
            else if (atbilde.equals("m")){
                uz.MainitDzimsanasdienu();
            }
            else {
                System.out.println("Darbiba netika atpazīta :(");
            }
        }
    }
}
