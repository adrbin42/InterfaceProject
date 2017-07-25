package com.lionssharewebdev;

/**
 * Created by adrienne on 7/24/17.
 */
public interface HandToHand {
    void implementsChokeHold();
    void twistsArm();
    default void show()
    {
        System.out.println("Default Method Executed");
    }
}
