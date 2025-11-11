public class MovePawnCommandPayload {
  private CommandType type;
  private Coordinates targetCoordinates;
  private Map<String, Object> additionalProperties;

  public CommandType getType() { return this.type; }
  public void setType(CommandType type) { this.type = type; }

  public Coordinates getTargetCoordinates() { return this.targetCoordinates; }
  public void setTargetCoordinates(Coordinates targetCoordinates) { this.targetCoordinates = targetCoordinates; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}