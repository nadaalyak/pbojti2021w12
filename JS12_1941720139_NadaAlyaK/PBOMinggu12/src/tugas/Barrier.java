/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Nada Alya
 */
public class Barrier implements IDestroyable{

    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public void destroyed() {
        strength -= (strength * 0.1);
    }

    public String getBarrierInfo() {
        String info = "";
        info += "Barrier Strength = " + strength;
        return info;
    }
}
