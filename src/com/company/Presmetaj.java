package com.company;

public class Presmetaj {
    public int a;
    public int b;
    public int rez;

    public Presmetaj(){
    }
    public void SetRezultat(int rez){
        this.rez=rez;
    }
    public void SetSoberi(){
        rez=a+b;
    }
    public void SetOdzemi(){
        rez=a-b;
    }

    public void SetRezultat() {
    }
    public int GetSoberi(){
        return rez;
    }
    public int GetOdzemi(){
        return rez;
    }
}
