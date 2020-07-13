package FishingGame;

class KangTaeGonghand extends AddDecorator {
      Tool tool;
  public KangTaeGonghand(Tool tool) {
      this.tool = tool;
  }

  @Override
  public String getDescription() {
      return "강태공의 손길이 담긴 "+tool.getDescription();
  }

  @Override
  public int Cost() {
      return 100 + tool.Cost();
  }

  @Override
  public int Increase_fishing() {
      return 2 + tool.Increase_fishing();
  }

}
