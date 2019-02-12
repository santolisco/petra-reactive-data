package com.bat.petra.data.repository;

import com.bat.petra.data.model.LineItem;


import java.util.Optional;

public class LineItemService implements LineItemRepository {

    @Override
    public <S extends LineItem> S save(S entity) {
        return null;
    }

    @Override
    public <S extends LineItem> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<LineItem> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<LineItem> findAll() {
        return null;
    }

    @Override
    public Iterable<LineItem> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(LineItem entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends LineItem> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
