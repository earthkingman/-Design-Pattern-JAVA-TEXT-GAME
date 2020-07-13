package FishingGame;

public class Tool_FishingRod extends Tool {
    
  public  Tool_FishingRod() {
      Description = "기본 낚시대";
      cost= 0;
      upgrade=1;
  }
  


  public int Cost() {
      return cost ; 
  }

  public int Increase_fishing() {
      return upgrade ;
  }

}
