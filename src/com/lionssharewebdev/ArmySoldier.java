package com.lionssharewebdev;

/**
 * Created by adrienne on 7/24/17.
 */
public class ArmySoldier extends Soldier{

    public ArmySoldier(String soldierName, String s) {
        super(soldierName, soldierBranchOfService, soldierRank, soldierIDNo);
    }

    @Override
    public void Speak() {
        System.out.print("This is bone!");
    }
}
