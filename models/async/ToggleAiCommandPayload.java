public class ToggleAiCommandPayload {
  private CommandType type;
  private boolean enabled;
  private Map<String, Object> additionalProperties;

  public CommandType getType() { return this.type; }
  public void setType(CommandType type) { this.type = type; }

  public boolean getEnabled() { return this.enabled; }
  public void setEnabled(boolean enabled) { this.enabled = enabled; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}