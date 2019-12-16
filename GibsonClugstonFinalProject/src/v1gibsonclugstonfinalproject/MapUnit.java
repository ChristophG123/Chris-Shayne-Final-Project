/*

 */
package v1gibsonclugstonfinalproject;

abstract public class MapUnit implements MapUnitInterface{
    protected int xPos;
    protected int yPos;
    protected int HP;
    protected int ATK;
    protected int DEF;
    protected int range;
    
    public MapUnit() {
        xPos = 0;
        yPos = 0;
        HP = 0;
        ATK = 0;
        DEF = 0;
        range = 0;

    }
    
    public MapUnit(int xPos, int yPos, int HP, int ATK, int DEF, int range) {
        this.xPos = xPos;
        this.yPos = yPos;
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
    
    public int getXPos(){
        return xPos;
    }
    
    public int getYPos(){
        return yPos;
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
