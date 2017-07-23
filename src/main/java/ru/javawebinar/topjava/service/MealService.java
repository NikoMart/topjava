package ru.javawebinar.topjava.service;

import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.util.exception.NotFoundException;

import java.util.Collection;
import java.util.List;

public interface MealService {
    Meal save(Meal user,int userId);

    void delete(int id,int userId) throws NotFoundException;

    Meal get(int id,int userId) throws NotFoundException;

    void update(Meal user,int userId);

    Collection<Meal> getAll(int userId);
}