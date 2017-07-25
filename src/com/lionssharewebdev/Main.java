package com.lionssharewebdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Soldier newArmySoldier = new ArmySoldier();
        Soldier newMarineSoldier = new MarineSoldier();
        Soldier newAirForceSoldier = new AirForceSoldier();

        System.out.println("Normal things soldiers do : ");
        System.out.println(newArmySoldier.Eat());
        System.out.println(newMarineSoldier.Sleep());
        System.out.println(newAirForceSoldier.Walk());

        System.out.println("------------------------------------------");
        System.out.println("What different kinds of soldiers say: ");
        System.out.print("An Army Soldier: " );
        newArmySoldier.speak();
        System.out.print("A Marine Soldier: " );
        newMarineSoldier.speak();
        System.out.print("An Air Force Soldier: " );
        newAirForceSoldier.speak();

        System.out.println("------------------------------------------");
        System.out.print("Enter your Army Solider's information: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        newArmySoldier.setName(scanner.nextLine());
        System.out.print("Enter ID : ");
        newArmySoldier.setiDNo(scanner.nextLine());
        System.out.print("Enter rank: ");
        newArmySoldier.setRank(scanner.nextLine());

        System.out.println("------------------------------------------");
        System.out.println("Your information is as follows :");
        System.out.println("Name :" + newArmySoldier.getName());
        System.out.println("ID :" + newArmySoldier.getiDNo());
        System.out.println("Rank :" + newArmySoldier.getRank());

        System.out.println("------------------------------------------");
        System.out.println("What a Marine does :");
        Soldier aMarineSoldier = new MarineSoldier();
        aMarineSoldier.hitsTarget();
        aMarineSoldier.twistsArm();
        aMarineSoldier.giveAikidoChop();
        aMarineSoldier.giveJudoKick();
        aMarineSoldier.implementsChokeHold();
        aMarineSoldier.toString();
        aMarineSoldier.show();

    }
}
