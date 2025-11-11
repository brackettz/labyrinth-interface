public class PlayerTurnEventPayload implements SlashGame {
  private EventType type;
  private String playerId;
  private Tile extraTile;
  private Integer turnTimeLimitSeconds;
  private Map<String, Object> additionalProperties;

  public EventType getType() { return this.type; }
  public void setType(EventType type) { this.type = type; }

  public String getPlayerId() { return this.playerId; }
  public void setPlayerId(String playerId) { this.playerId = playerId; }

  public Tile getExtraTile() { return this.extraTile; }
  public void setExtraTile(Tile extraTile) { this.extraTile = extraTile; }

  public Integer getTurnTimeLimitSeconds() { return this.turnTimeLimitSeconds; }
  public void setTurnTimeLimitSeconds(Integer turnTimeLimitSeconds) { this.turnTimeLimitSeconds = turnTimeLimitSeconds; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}