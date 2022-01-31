
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import java.util.Iterator;
class Student implements Comparable<Student>,Cloneable
{
    private String nazwa;
    private LocalDate dataUrodzenia;
    private double ocena;

    public Student(String nazwa,LocalDate dataUrodzenia,double ocena)
    {
        this.nazwa = nazwa;
        this.dataUrodzenia = dataUrodzenia;
        this.ocena=ocena;
    }

    public String getNazwisko(){return this.nazwa;}
    public LocalDate getdataUrodzenia(){return this.dataUrodzenia;}
    public Double getocena(){return this.ocena;}

    public String toString()
    {
        String c = "["+this.nazwa+" "+this.dataUrodzenia+" "+ this.ocena+"]";
        return c;
    }

    public boolean equals(Student other)
    {
        return nazwa.equals(other.nazwa) && dataUrodzenia.equals(other.dataUrodzenia);
    } 

    @Override
    public int compareTo(Student o) {
        return dataUrodzenia.compareTo(o.dataUrodzenia)+nazwa.compareTo(o.nazwa)+Double.compare(o.ocena,this.ocena);
    }

    public double getkwota() {
        return 0;
    }
}
