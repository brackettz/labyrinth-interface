public class GameOverEventPayload implements SlashGame {
  private EventType type;
  private String winnerId;
  private RankingEntry[] ranking;
  private Map<String, Object> additionalProperties;

  public EventType getType() { return this.type; }
  public void setType(EventType type) { this.type = type; }

  public String getWinnerId() { return this.winnerId; }
  public void setWinnerId(String winnerId) { this.winnerId = winnerId; }

  public RankingEntry[] getRanking() { return this.ranking; }
  public void setRanking(RankingEntry[] ranking) { this.ranking = ranking; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}