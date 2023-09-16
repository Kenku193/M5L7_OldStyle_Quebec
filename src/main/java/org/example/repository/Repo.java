package org.example.repository;

import java.util.Optional;

public interface Repo<T> {

    Optional<T> getById(Long id);

    void update(T entity);

}
