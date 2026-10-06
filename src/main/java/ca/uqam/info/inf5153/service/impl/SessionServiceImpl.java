package ca.uqam.info.inf5153.service.impl;

import ca.uqam.info.inf5153.domain.Session;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class SessionServiceImpl {
    private final List<Session> listeSessions = new ArrayList<>();

    public void addSession(Session session) {
        listeSessions.add(session);
    }

    public Session getSession(Number codeSession) {
        Optional<Session> optionalSession = listeSessions
                .stream()
                .filter(s -> Objects.equals(s.codeSession, codeSession)).findFirst();

        return optionalSession.orElse(null);
    }

    public List<Session> getSessions() {
        List<Session> sessions = listeSessions
                .stream()
                .toList();

        if (sessions.isEmpty()) {
            return null;
        } else {
            return sessions;
        }
    }

    public Session updateSession(Number codeSession, LocalDate dateDebut, LocalDate dateFin) {
        Session session = getSession(codeSession);
        if (session != null) {
            session.dateDebut = dateDebut;
            session.dateFin = dateFin;
            return session;
        }
        return null;
    }

    public boolean deleteSession(Number codeSession) {
        return listeSessions.removeIf(session -> Objects.equals(session.codeSession, codeSession));
    }
}
