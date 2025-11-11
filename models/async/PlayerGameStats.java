public class PlayerGameStats {
  private Integer stepsTaken;
  private Integer tilesPushed;
  private Integer treasuresCollected;
  private Map<String, Object> additionalProperties;

  public Integer getStepsTaken() { return this.stepsTaken; }
  public void setStepsTaken(Integer stepsTaken) { this.stepsTaken = stepsTaken; }

  public Integer getTilesPushed() { return this.tilesPushed; }
  public void setTilesPushed(Integer tilesPushed) { this.tilesPushed = tilesPushed; }

  public Integer getTreasuresCollected() { return this.treasuresCollected; }
  public void setTreasuresCollected(Integer treasuresCollected) { this.treasuresCollected = treasuresCollected; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}