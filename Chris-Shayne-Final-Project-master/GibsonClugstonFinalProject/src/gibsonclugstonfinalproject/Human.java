/*

 */
package gibsonclugstonfinalproject;

abstract public class Human extends MapUnit{
    protected int HP;
    protected int ATK;
    protected int DEF;
    protected int range;    
    
    public Human() {
        HP = 0;
        ATK = 0;
        DEF = 0;
        range = 0;
        
    }
    
    public Human(int HP, int ATK, int DEF, int range) {
        this.HP = HP;
        this.ATK = ATK;
        this.DEF = DEF;
        this.range = range;

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
