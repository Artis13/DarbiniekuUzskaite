public class Ipasibas {
    String Vards;
    String Uzvards;
    String DzimsanasDatums;
    public Ipasibas(String Vards,String Uzvards, String DzimsanasDatums){
        this.Vards = Vards;
        this.Uzvards = Uzvards;
        this.DzimsanasDatums = DzimsanasDatums;
    }
    public String toString(){
     return Vards + Uzvards + DzimsanasDatums;
    }
}
