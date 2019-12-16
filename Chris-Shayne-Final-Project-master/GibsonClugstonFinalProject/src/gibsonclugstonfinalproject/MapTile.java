/*

 */
package gibsonclugstonfinalproject;


public class MapTile extends MapUnit{
    protected Human unitOccupying;
    
    public MapTile(){
        unitOccupying = null;
    }
    
    public MapTile(Human occupier){
        unitOccupying = occupier;
    }
    
    public boolean checkOccupied(){
        boolean isOccupied = true;
        
        if(unitOccupying == null){
            isOccupied = false;
        }
        
        return isOccupied;
        
    }
    
}
