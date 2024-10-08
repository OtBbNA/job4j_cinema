package ru.job4j.cinema.service.session;

import ru.job4j.cinema.dto.SessionDto;
import ru.job4j.cinema.model.Session;

import java.util.Collection;
import java.util.Optional;

public interface SessionService {

    Optional<SessionDto> findById(int id);

    Collection<SessionDto> findByFilmId(int id);

    Collection<SessionDto> findAll();
}
