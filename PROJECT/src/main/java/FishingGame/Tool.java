package FishingGame;

public abstract class Tool {
    
  protected String Description;
  protected int cost;
  protected int upgrade;  //사용자가 증가될 낚시능력
  /*public Tool() { 
  }*/

 

  public String getDescription() {
      return Description;
  }
  
 public abstract int Cost();
  public abstract int Increase_fishing();

    

}
