package com.cerus.informationsystemforhr.services;

import com.cerus.informationsystemforhr.models.Subordinate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SubordinateService {

    /**
     * Метод добавления нового объекта класса Subordinate
     * @param id
     * @param subordinate
     */
    void createSubordinate(int id, Subordinate subordinate);

    /**
     * Метод удаления существующего объекта класса Subordinate
     * @param id
     */
    void deleteSubordinate(int id);

    /**
     * Метод обновления существующего объекта класса Subordinate
     * @param id
     * @param subordinate
     */
    void updateSubordinate(int id, Subordinate subordinate);

    /**
     * Метод получения существующего объекта класса Subordinate по его ID
     * @param id
     * @return
     */
    Subordinate getSubordinateById(int id);

    /**
     * Метод получения всех существующих объектов класса Subordinate
     * @return
     */
    List<Subordinate> getAllSubordinates();
}
