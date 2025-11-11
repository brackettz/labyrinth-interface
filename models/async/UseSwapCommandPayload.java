public class UseSwapCommandPayload {
  private CommandType type;
  private String targetPlayerId;
  private Map<String, Object> additionalProperties;

  public CommandType getType() { return this.type; }
  public void setType(CommandType type) { this.type = type; }

  public String getTargetPlayerId() { return this.targetPlayerId; }
  public void setTargetPlayerId(String targetPlayerId) { this.targetPlayerId = targetPlayerId; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}