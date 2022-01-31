//package com.company;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

public class xd{

    public static void main(String[] args) {
        ArrayList<Stypemdium> grupa = new ArrayList<Stypemdium>();
        grupa.add(new Stypemdium("b",LocalDate.of(2007,11,12),5));
        grupa.add(new Stypemdium("b",LocalDate.of(2003,11,4), 4));
        grupa.add(new Stypemdium("c",LocalDate.of(2005,12,3),5));
        grupa.add(new Stypemdium("da",LocalDate.of(2001,11,1),3.2));
        grupa.add(new Stypemdium("d",LocalDate.of(2001,11,1),2.2));
        grupa.get(0).setkwota();
        grupa.get(1).setkwota();
        grupa.get(2).setkwota();
        grupa.get(3).setkwota();
        grupa.get(4).setkwota();
        ArrayList<Stypemdium> gs = new ArrayList<Stypemdium>();
        System.out.print(grupa);
        System.out.print("\n");
        Collections.sort(grupa);
        System.out.println(grupa);
        for(Stypemdium g:grupa)
        {
            if(g.KwotaStypendium(g)==500)
            {
                gs.add(g);
            }
        }
        System.out.println(gs);
    }

static class Student implements Comparable<Student>,Cloneable
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
}
}
class Stypemdium extends Student
{
    private static double kwotaStypendium;
    private ArrayList<Student> x;
    public Stypemdium(String nazwisko,LocalDate dataUrodzenia,double sredniaOcen)
    {
        super(nazwisko,dataUrodzenia,sredniaOcen);
    }
    public  void setkwota()
    {
        Stypemdium.kwotaStypendium=500;
    }
    public  double getkwota()
    {
        return this.kwotaStypendium;
    }
    public static double KwotaStypendium(Student s)
    {
        LocalDate d1 = LocalDate.parse("2005-01-01");
        LocalDate x=s.getdataUrodzenia();
        if(s.getocena()==5&&x.isAfter(d1))
        {
            return s.getkwota();
        }
        return 0;
    }
}

