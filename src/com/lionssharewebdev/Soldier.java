package com.lionssharewebdev;

/**
 * Created by adrienne on 7/24/17.
 */
public abstract class Soldier implements SharpShooter, HandToHand, MartialArts {
    private String soldierName;
    private String soldierBranchOfService;
    private String soldierRank;
    private String soldierIDNo;

    public Soldier(String soldierName, String soldierBranchOfService, String soldierRank, String soldierIDNo) {
        this.soldierName = soldierName;
        this.soldierBranchOfService = soldierBranchOfService;
        this.soldierRank = soldierRank;
        this.soldierIDNo = soldierIDNo;
    }

    public String getSoldierName() {
        return soldierName;
    }

    public void setSoldierName(String soldierName) {
        this.soldierName = soldierName;
    }

    public String getSoldierBranchOfService() {
        return soldierBranchOfService;
    }

    public void setSoldierBranchOfService(String soldierBranchOfService) {
        this.soldierBranchOfService = soldierBranchOfService;
    }

    public String getSoldierRank() {
        return soldierRank;
    }

    public void setSoldierRank(String soldierRank) {
        this.soldierRank = soldierRank;
    }

    public String getSoldierIDNo() {
        return soldierIDNo;
    }

    public void setSoldierIDNo(String soldierIDNo) {
        this.soldierIDNo = soldierIDNo;
    }

    public String Sleep(){
        String hoursSleeping = "Sleeps 10 hours";
        return hoursSleeping;
    }

    public String Eat(){
        String chew = "Chew loudly";
        return chew;
    }

    public String Walk(){
        String canWalk = "Can walk 5 miles";
        return canWalk;
    }

    public abstract void Speak();

    @Override
    public void chokehold() {

    }

    @Override
    public void judo() {

    }

    @Override
    public void hitTargetOneMileAway() {

    }

    @Override
    public void aikido() {

    }

    @Override
    public void twistarm() {

    }

    @Override
    public void hitTargetTwoMilesAway() {

    }
}
