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
public class Zombie implements IDestroyable{

    protected int health;
    protected int level;

    @Override
    public void destroyed() {

    }

    public String getZombieInfo() {
        return "Zombie Data = ";
    }
}
