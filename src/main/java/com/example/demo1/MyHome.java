package com.example.demo1;

public class MyHome {
    public String  color;    //  цвет(коричневый)
    public String  form;     //  форма здания(прямоугольник)
    public Integer section;  // секций(подьездов)
    public Integer floor;    //  этажей
    public Integer app;      //  квартир
    public Integer year;     // год постройки

    public MyHome(String color, String form, Integer section, Integer floor, Integer app, Integer year) {
        this.color = color;
        this.form = form;
        this.section = section;
        this.floor = floor;
        this.app = app;
        this.year = year;
    }

    public MyHome() {
    }

    @Override
    public String toString() {
        return "MyHome{" +
                "color='" + color + '\'' +
                ", form='" + form + '\'' +
                ", section=" + section +
                ", floor=" + floor +
                ", app=" + app +
                ", year=" + year +
                '}';
    }

    void srtq(){
        System.out.println("4 house - street");
    }

    public String toString(String color) {
        return "MyHome{" +
                "color='" + color + '\'' +
                ", form='" + form + '\'' +
                ", section=" + section +
                ", floor=" + floor +
                ", app=" + app +
                ", year=" + year +
                '}';
    }
    public  static void city(){
        System.out.println("My city - Kyiv");
    }
    public static void main (String[] args) {

        MyHome MyHome1 = new MyHome("Brown","Rectangle",3,25,370,2011);
        MyHome MyHome2 = new MyHome(new String("Red"),"Rectangle",5,22,585,2012);
        MyHome MyHome3 = new MyHome("White","Rectangle",7,23,890,2013);
        MyHome MyHome4 = new MyHome();

        System.out.println(MyHome1.toString("Orange")); //
        System.out.println(MyHome2.toString());
        System.out.println(MyHome3.toString());
        System.out.println(MyHome4.toString());
        MyHome1.srtq();// TODO: 17.04.2022
        city();
        Summa.summ = 1845;
        System.out.println(Summa.summ);
    }
}



