package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Persoon p = new Persoon();
        p.setVoornaam("Joske");
        p.setAchternaam("Vermeulen");
        System.out.println(p.getVoornaam());
        System.out.println(p.getAchternaam());
        System.out.println(p.getVolledigeNaam());
        Persoon p2 = new Persoon();
        p2.setVoornaam("Marieke");
        p2.setAchternaam("Peeters");
        System.out.println(p2.getVolledigeNaam());
	// write your code here
    }
}
