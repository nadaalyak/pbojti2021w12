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
public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        if (level == 1) {
            health += (health * 2 / 100);
        } else if (level == 2) {
            health += (health * 3 / 100);
        } else {
            health += (health * 4 / 100);
        }
    }

    @Override
    public void destroyed() {
        health -= (health * 10 / 100);
    }

    @Override
    public String getZombieInfo() {
        String info = "Jumping " + super.getZombieInfo() + "\n";
        info += "Health = " + health + "\n" + "Level = " + level + "\n";
        return info;
    }
}
