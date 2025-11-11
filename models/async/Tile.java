public class Tile {
  private Direction[] entrances;
  private Treasure treasure;
  private Bonus bonus;
  private Boolean isFixed;
  private Map<String, Object> additionalProperties;

  public Direction[] getEntrances() { return this.entrances; }
  public void setEntrances(Direction[] entrances) { this.entrances = entrances; }

  public Treasure getTreasure() { return this.treasure; }
  public void setTreasure(Treasure treasure) { this.treasure = treasure; }

  public Bonus getBonus() { return this.bonus; }
  public void setBonus(Bonus bonus) { this.bonus = bonus; }

  public Boolean getIsFixed() { return this.isFixed; }
  public void setIsFixed(Boolean isFixed) { this.isFixed = isFixed; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}