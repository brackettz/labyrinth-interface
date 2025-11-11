public class StartGameCommandPayload {
  private CommandType type;
  private AnonymousSchema_2 boardSize;
  private int treasureCardCount = 24;
  private Integer totalBonusCount;
  private Integer gameDurationInSeconds;
  private Map<String, Object> additionalProperties;

  public CommandType getType() { return this.type; }
  public void setType(CommandType type) { this.type = type; }

  public AnonymousSchema_2 getBoardSize() { return this.boardSize; }
  public void setBoardSize(AnonymousSchema_2 boardSize) { this.boardSize = boardSize; }

  public int getTreasureCardCount() { return this.treasureCardCount; }
  public void setTreasureCardCount(int treasureCardCount) { this.treasureCardCount = treasureCardCount; }

  public Integer getTotalBonusCount() { return this.totalBonusCount; }
  public void setTotalBonusCount(Integer totalBonusCount) { this.totalBonusCount = totalBonusCount; }

  public Integer getGameDurationInSeconds() { return this.gameDurationInSeconds; }
  public void setGameDurationInSeconds(Integer gameDurationInSeconds) { this.gameDurationInSeconds = gameDurationInSeconds; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}