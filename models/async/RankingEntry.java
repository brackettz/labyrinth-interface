public class RankingEntry {
  private String playerId;
  private Integer rank;
  private Integer score;
  private PlayerGameStats stats;
  private Map<String, Object> additionalProperties;

  public String getPlayerId() { return this.playerId; }
  public void setPlayerId(String playerId) { this.playerId = playerId; }

  public Integer getRank() { return this.rank; }
  public void setRank(Integer rank) { this.rank = rank; }

  public Integer getScore() { return this.score; }
  public void setScore(Integer score) { this.score = score; }

  public PlayerGameStats getStats() { return this.stats; }
  public void setStats(PlayerGameStats stats) { this.stats = stats; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}