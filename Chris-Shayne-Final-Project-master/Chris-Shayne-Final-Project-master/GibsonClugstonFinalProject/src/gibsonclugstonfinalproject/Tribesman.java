/*

 */

package gibsonclugstonfinalproject;

public class Tribesman extends MapUnit{
    protected int HP;
    protected int ATK;
    protected int DEF;
    protected int MOVE;
    protected int range;
    protected String unitType;
    protected String name;
    
    public Tribesman() {
        HP = 0;
        ATK = 0;
        DEF = 0;
        MOVE = 0;
        range = 0;
        unitType = "";
        name = "";
        
    }
    
    public Tribesman(String unitType, String name) {
        
        if(unitType.equals("Grunt")){
            HP = 10;
            ATK = 1;
            DEF = 1;
            MOVE = 2;
            range = 1;
            
        }else if(unitType.equals("Tribe Leader")){
            HP = 20;
            ATK = 2;
            DEF = 2;
            MOVE = 1;
            range = 1;
            
        }else if(unitType.equals("Rock Thrower")){
            HP = 5;
            ATK = 2;
            DEF = 1;
            MOVE = 1;
            range = 2;
            
        }
        
        this.unitType = unitType;
        this.name = name;
        
    }
    
    private void move(){
        
    }
    
    //Getters
    private int getHP(){
        return HP;
    }
    
    private int getATK(){
        return ATK;
    }
    
    private int getDEF(){
        return DEF;
    }
    
    private int getR(){
        return range;
    }
    
    //Setters
    private void setHP(int HP){
        this.HP = HP;
    }
    
    private void setATK(int ATK){
        this.ATK = ATK;
    }
    
    private void setDEF(int DEF){
        this.DEF = DEF;
    }
    
    private void setR(int R){
        range = R;
    }
    
}
