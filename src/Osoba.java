import java.util.Scanner;

public abstract class Osoba {
    //klasa abstrakcyjna nie pozwala na utworzenie obiektow tej klasy
    //hermetyzacja
    //modyfikator dostepu private, protected
    //private widoczne tylko wewnatrz klasy
    private String imie;
    protected String nazwisko;
    private int wiek;

    //przeciazanie konstruktora
    //trzy konstruktory o roznych argumentach
    public Osoba(String imie, String nazwisko, int wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
        wiek = 7;
    }

    public Osoba() {
        imie="";
        nazwisko= "";
    }
    //metody dostepowe
    //gettery i settery

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        //zabezpieczenia przed nieporzadana zmiana
        System.out.println("Podaj haslo: ");
        Scanner klawiatura = new Scanner(System.in);
        String haslo=klawiatura.next();
        if(haslo.equals("qwe123")){
            this.imie=imie;
        }
        else{
            System.out.println("blednie haslo");
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}