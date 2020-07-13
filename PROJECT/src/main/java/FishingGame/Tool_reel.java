package FishingGame;

class Tool_reel extends Tool {
  public  Tool_reel() {
      Description = "기본 릴";
      cost= 0;
      upgrade=1;
  }

  public int Cost() {
      return cost;
  }

  public int Increase_fishing() {
      return upgrade;
  }

}
