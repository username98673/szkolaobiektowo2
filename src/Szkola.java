import java.util.ArrayList;

public class Szkola {
    private static Szkola szkola=new Szkola();
    private ArrayList<Uczen> uczniowie=new ArrayList<>();
    private ArrayList<Klasa> klasas= new ArrayList<>();
    private Szkola(){

    }
    public static Szkola getSzkola(){
        return szkola;
    }
    public void dodajUczniaDoSzkoly(String imie,String nazwisko,int wiek){
        uczniowie.add(new Uczen(imie, nazwisko,wiek));
    }
    public void przypiszUczniaDoKlasy(Klasa klasa,Uczen uczen){
        klasa.dodajUczniaDoKlasy(uczen);
    }
}
