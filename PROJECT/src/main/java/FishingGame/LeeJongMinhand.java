package FishingGame;

class LeeJongMinhand extends AddDecorator {
 Tool tool;
  
  public LeeJongMinhand(Tool tool){
      this.tool = tool;
  }

  public String getDescription() {
      return "이종민교수님의 손길이 담긴 "+tool.getDescription();
  }

  public int Cost() {
      return 150 + tool.Cost();
  }

  public int Increase_fishing() {
      return 3 + tool.Increase_fishing();
  }
}
