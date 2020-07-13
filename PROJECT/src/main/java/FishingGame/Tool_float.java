package FishingGame;

class Tool_float extends Tool {
  public Tool_float() {
      Description = "기본 찌";
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
