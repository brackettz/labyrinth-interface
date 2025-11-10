package labyrinth.contracts.model;
import labyrinth.contracts.model.LobbyStateEventPayload;
import labyrinth.contracts.model.GameStartedEventPayload;
import labyrinth.contracts.model.GameStateUpdateEventPayload;
import labyrinth.contracts.model.PlayerTurnEventPayload;
import labyrinth.contracts.model.ActionErrorEventPayload;
import labyrinth.contracts.model.PlayerDisconnectedEventPayload;
import labyrinth.contracts.model.AchievementUnlockedEventPayload;
import labyrinth.contracts.model.GameOverEventPayload;
import labyrinth.contracts.model.NextTreasureCardEventPayload;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
@JsonTypeInfo(use=JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
  @JsonSubTypes.Type(value = LobbyStateEventPayload.class, name = "LobbyStateEventPayload"),
  @JsonSubTypes.Type(value = GameStartedEventPayload.class, name = "GameStartedEventPayload"),
  @JsonSubTypes.Type(value = GameStateUpdateEventPayload.class, name = "GameStateUpdateEventPayload"),
  @JsonSubTypes.Type(value = PlayerTurnEventPayload.class, name = "PlayerTurnEventPayload"),
  @JsonSubTypes.Type(value = ActionErrorEventPayload.class, name = "ActionErrorEventPayload"),
  @JsonSubTypes.Type(value = PlayerDisconnectedEventPayload.class, name = "PlayerDisconnectedEventPayload"),
  @JsonSubTypes.Type(value = AchievementUnlockedEventPayload.class, name = "AchievementUnlockedEventPayload"),
  @JsonSubTypes.Type(value = GameOverEventPayload.class, name = "GameOverEventPayload"),
  @JsonSubTypes.Type(value = NextTreasureCardEventPayload.class, name = "NextTreasureCardEventPayload")
})
/**
 * SlashGame represents a union of types: LobbyStateEventPayload, GameStartedEventPayload, GameStateUpdateEventPayload, PlayerTurnEventPayload, ActionErrorEventPayload, PlayerDisconnectedEventPayload, AchievementUnlockedEventPayload, GameOverEventPayload, NextTreasureCardEventPayload
 */
public interface SlashGame {
  
}