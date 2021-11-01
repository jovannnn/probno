package com.company;

public class Main {

    public static void main(String[] args) {
	Presmetaj n=new Presmetaj();
    n.a=24;
    n.b=12;
    n.SetSoberi();
    n.SetOdzemi();
    n.SetRezultat();
    System.out.println("Sobiranje:"+" "+n.GetOdzemi());
    }
}
