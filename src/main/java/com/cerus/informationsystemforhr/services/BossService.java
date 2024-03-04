package com.cerus.informationsystemforhr.services;

import com.cerus.informationsystemforhr.models.Boss;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BossService {

    /**
     * Метод добавления нового объекта класса Boss
     * @param id
     * @param boss
     */
    void createBoss(int id, Boss boss);

    /**
     * Метод удаления существующего объекта класса Boss
     * @param id
     */
    void deleteBoss(int id);

    /**
     * Метод обновления существующего объекта класса Boss
     * @param id
     * @param bossUpdate
     */
    void updateBoss(int id, Boss bossUpdate);

    /**
     * Метод получения существующего объекта класса Boss по его ID
     * @param id
     * @return
     */
    Boss getBossById(int id);

    /**
     * Метод получения всех существующих объектов класса Boss
     * @return
     */
    List<Boss> getAllBosses();
}
