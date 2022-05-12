package com.company;

import com.lab.Character;
import com.lab.Warlock;
import com.lab.Wizard;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks\n");

        Wizard Aulus = new Wizard("Aulus", 15, 150, 200);
        Warlock Hoshida = new Warlock("Hoshida", 10, 100, 150);
        Aulus.nameDisplay();
        Hoshida.nameDisplay();

        Aulus.hailStorm(Hoshida);
        Aulus.showStats();
        Hoshida.showStats();

        Hoshida.maelStorm(Aulus);
        Aulus.showStats();
        Hoshida.showStats();

        Aulus.healSpell();
        Aulus.showStats();
        Hoshida.showStats();

        Hoshida.fireBall(Aulus);
        Aulus.showStats();
        Hoshida.showStats();

        Aulus.kulam(Hoshida);
        Aulus.levelUp();
    }
}
