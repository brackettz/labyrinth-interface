public class ActionErrorEventPayload implements SlashGame {
  private EventType type;
  private ErrorCode errorCode;
  private String message;
  private Map<String, Object> additionalProperties;

  public EventType getType() { return this.type; }
  public void setType(EventType type) { this.type = type; }

  public ErrorCode getErrorCode() { return this.errorCode; }
  public void setErrorCode(ErrorCode errorCode) { this.errorCode = errorCode; }

  public String getMessage() { return this.message; }
  public void setMessage(String message) { this.message = message; }

  public Map<String, Object> getAdditionalProperties() { return this.additionalProperties; }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) { this.additionalProperties = additionalProperties; }
}