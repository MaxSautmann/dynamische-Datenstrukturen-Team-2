package de.hebk.multiplayer;

public enum PacketType {
    JOIN,
    QUIT,
    CONNECTION_CLOSE,
    ANSWER,
    PLAYER_JOIN,
    ALL_PLAYERS,
    CLEAR,
    SELECT_QUESTION,
    QUESTION_IS_SELECTED,
    QUESTION_SELECTED,
    ASK_QUESTION,
    RIGHT_ANSWER,
    WRONG_ANSWER,
    GAMEMODE,
    HARDCORE_TIME_UP,
    LAST_ALIVE,
    KEEP_PLAYING,
    STOP_PLAYING,
    END
}