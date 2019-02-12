package com.bat.petra.data.repository;

import com.bat.petra.data.model.Exception;

import java.util.Optional;

public class ExceptionRepositoryImpl implements ExceptionRepository{
    @Override
    public <S extends Exception> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Exception> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Exception> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Exception> findAll() {
        return null;
    }

    @Override
    public Iterable<Exception> findAllById(Iterable<Long> longs) {
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
    public void delete(Exception entity) {

    }

    @Override
    public void deleteAll(Iterable<? extends Exception> entities) {

    }

    @Override
    public void deleteAll() {

    }
}