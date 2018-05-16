import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uzskaite {
    public Ipasibas ipasibas;
    Scanner scanner = new Scanner(System.in);

    List<Ipasibas> saraksts;

    public Uzskaite(){
        saraksts = new ArrayList<Ipasibas>();
    }

    public List<Ipasibas> PievienotDarbinieku(){

        System.out.println("Ievadiet darbinieka Vārdu, Uzvārdu un dzimšanas datumu ");
        String vards = scanner.next();
        String uzvards = scanner.next();
        String DzimsanasDatums = scanner.next();
        Ipasibas ip = new Ipasibas(vards,uzvards,DzimsanasDatums);

        saraksts.add(ip);

        return saraksts;
    }
    public List<Ipasibas> IznemtNoSaraksta(){
        System.out.println("Ievadiet darbinieka Vārdu, Uzvārdu? ");
        String vards = scanner.next();
        String uzvards = scanner.next();
        for (Ipasibas ip:saraksts){
            if (ip.Vards.equals(vards)&&ip.Uzvards.equals(uzvards)){
                saraksts.remove(ip);
                System.out.println("Darbinieks tika izņemts no saraksta ");
                return saraksts;
            }
        }
        System.out.println("Darbinieks netika atrasts ");
        return saraksts;
    }

    public List<Ipasibas> MainitDzimsanasdienu() {
        System.out.println("Ievadiet darbinieka Vārdu, Uzvārdu? ");
        String vards = scanner.next();
        String uzvards = scanner.next();
        for (Ipasibas ip:saraksts){
            if (ip.Vards.equals(vards)&&ip.Uzvards.equals(uzvards)){
                System.out.println("Ievadiet darbinieka jauno Dzimsanasdienas datumu? ");
                String jaunais = scanner.next();
                ip.DzimsanasDatums = jaunais;
                System.out.println("Datums tika nomainits ");
                return saraksts;
            }
        }
        System.out.println("Darbinieks netika atrasts ");
        return saraksts;
    }
}
