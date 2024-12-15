package lab.arahnik.websocket.handlers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Set;

@Component
@RequiredArgsConstructor
public class WsTextHandler extends TextWebSocketHandler {
    private final Set<WebSocketSession> sessions;

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        this.sessions.add(session);
        System.out.println("Connection established with " + session.getId());
        super.afterConnectionEstablished(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        this.sessions.remove(session);
        super.afterConnectionClosed(session, status);
    }

    public void sendMessage(String message) {
        for (WebSocketSession session : this.sessions) {
            try {
                session.sendMessage(new TextMessage(message));
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
