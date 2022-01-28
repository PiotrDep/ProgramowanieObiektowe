import java.time.LocalDate;
class Student extends Osoba{
    private double sredniaOcen;
    public Student(String nazwisko,LocalDate dataUrodzenia,double sredniaOcen)
    {
        super(nazwisko,dataUrodzenia);
        this.sredniaOcen = sredniaOcen;
    }
    public double compareTo(Student other)
    {
        return super.compareTo(other)+this.sredniaOcen;
    }

    public String toString()
    {
        String c = getClass().getName()+"["+getNazwisko()+" "+getdataUrodzenia()+" "+this.sredniaOcen+"]";
        return c;
    }
}
