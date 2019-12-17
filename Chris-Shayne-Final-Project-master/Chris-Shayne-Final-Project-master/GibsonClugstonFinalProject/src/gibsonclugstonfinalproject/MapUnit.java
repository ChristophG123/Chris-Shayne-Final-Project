/*

*/
package gibsonclugstonfinalproject;

public class MapUnit implements MapUnitInterface{
    protected int xPos;
    protected int yPos;
    
    public MapUnit() {
        xPos = 0;
        yPos = 0;

    }
    
    public MapUnit(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;

    }
    
    //Getters
    
    public int getXPos(){
        return xPos;
    }
    
    public int getYPos(){
        return yPos;
    }
    
    //Setters
    
    public void setXPos(int xPos){
        this.xPos = xPos;
    }
    
    public void setYPos(int yPos){
        this.yPos = yPos;
    }
    
}
