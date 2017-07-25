package com.lionssharewebdev;

/**
 * Created by adrienne on 7/24/17.
 */
public abstract class Soldier implements SharpShooter, HandToHand, MartialArts {
    private String name;
    private String rank;
    private String iDNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getiDNo() {
        return iDNo;
    }

    public void setiDNo(String iDNo) {
        this.iDNo = iDNo;
    }

    public String Sleep(){
        String hoursSleeping = "Sleeps 10 hours";
        return hoursSleeping;
    }

    public String Eat(){
        String chew = "Chews loudly";
        return chew;
    }

    public String Walk(){
        String canWalk = "Can walk 5 miles";
        return canWalk;
    }

    abstract void speak();

    @Override
    public void implementsChokeHold() {
        System.out.println("Combatant down!");
    }

    @Override
    public void giveJudoKick() {
        System.out.println("Combatant injured!");
    }

    @Override
    public void hitsTarget() {
        System.out.println("Target is dead!");
    }

    @Override
    public void giveAikidoChop() {
        System.out.println("Missed combatant!");
    }

    @Override
    public void twistsArm() {
        System.out.println("Combatant arm broken!");
    }
}
