public class Uczen extends Osoba implements Dyzurny{
    /*
    Uczen to klasa potomna
    Osoba to klasa bazowa
    Uczen dziedziczy wszystko? po klasie osoba
     */
    private int nrEwidencyjny;
    static int liczbaObiektow;

    public Uczen(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);//wywyolujemy konstruktor klasy bazowej
    }

    public Uczen(String imie, String nazwisko,int wiek, int nrEwidencyjny) {
        super(imie,nazwisko, wiek);
        this.nrEwidencyjny = nrEwidencyjny;
        liczbaObiektow++;
        nrEwidencyjny=liczbaObiektow;
    }

    @Override
    public String toString() {
        return "Uczen imie;" +getImie()+"nazwisko: "+nazwisko+
                "nrEwidencyjny=" + nrEwidencyjny +
                '}';
    }

    @Override
    public void wykonajDyzur() {
        System.out.println("wytarlem tablice");
    }
}