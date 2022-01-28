import java.time.LocalDate;

class Osoba implements Comparable<Osoba>,Cloneable
{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko,LocalDate dataUrodzenia)
    {
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getNazwisko(){return this.nazwisko;}
    public LocalDate getdataUrodzenia(){return this.dataUrodzenia;}

    public String toString()
    {
        String c = getClass().getName()+"["+this.nazwisko+" "+this.dataUrodzenia+"]";
        return c;
    }

    public boolean equals(Osoba other)
    {
        return nazwisko.equals(other.nazwisko) && dataUrodzenia.equals(other.dataUrodzenia);
    } 

    public int compareTo(Osoba other)
    {
        return nazwisko.compareTo(other.nazwisko)+dataUrodzenia.compareTo(other.dataUrodzenia);
    }

}