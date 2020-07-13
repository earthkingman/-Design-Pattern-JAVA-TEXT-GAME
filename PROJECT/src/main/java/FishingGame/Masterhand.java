package FishingGame;

class Masterhand extends AddDecorator {
  Tool tool;
  
  public Masterhand(Tool tool){
      this.tool = tool;
  }

  public String getDescription() {
      return "장인의 손길이 담긴 "+tool.getDescription();
  }

  public int Cost() {
      return 50 + tool.Cost();
  }

  public int Increase_fishing() {
      return 1 + tool.Increase_fishing();
  }
}
