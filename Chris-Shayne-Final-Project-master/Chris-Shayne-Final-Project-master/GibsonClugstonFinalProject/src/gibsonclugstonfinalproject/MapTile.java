/*

 */
package gibsonclugstonfinalproject;


public class MapTile extends MapUnit{
    protected Tribesman unitOccupying;
    
    public MapTile(){
        unitOccupying = null;
    }
    
    public MapTile(Tribesman occupier){
        unitOccupying = occupier;
    }
    
    public boolean checkOccupied(){
        boolean isOccupied = true;
        
        if(unitOccupying == null){
            isOccupied = false;
        }
        
        return isOccupied;
        
    }
    
    public void setOccupier(Tribesman occupier){
        unitOccupying = occupier;
        
    }
    
    public Tribesman getOccupier(){
        return unitOccupying;
        
    }
    
    
}
