
package Code.FRPG;

/**
 *
 * @author Tim
 */
public class Monster{
    // TD - Instantiating and constructors created 
    private int health;
    private int combatPower;
    private String name;
    public boolean isAlive(){
        if(health==0)
            return false;
        return true; 
    }
    public void death(){
        combatPower = 0;
    }
    public Monster(){
        health=combatPower=0;
    }
    public Monster(int h, int c, String name){
        health = h;
        combatPower = c;
        this.name = name;
    }
    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }
    public void setCombatPower(int combatPower){
        this.combatPower = combatPower;
    }
    public int getCombatPower(){
        return combatPower;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public Monster createMonster(){
        
     return new Monster(100,20,"Monster");
        
    } 
    @Override
    public String toString(){
        return "Name: " + name + " Health: " + health + " CP: " + combatPower;
    }
}