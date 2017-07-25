package com.lionssharewebdev;

/**
 * Created by adrienne on 7/24/17.
 */
public class MarineSoldier extends Soldier{

    public MarineSoldier(String soldierName, String soldierBranchOfService, String soldierRank, String soldierIDNo) {
        super(soldierName, soldierBranchOfService, soldierRank, soldierIDNo);
    }

    @Override
    public void Speak() {
        System.out.print("Oorah!");
    }
}