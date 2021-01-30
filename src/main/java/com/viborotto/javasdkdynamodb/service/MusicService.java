package com.viborotto.javasdkdynamodb.service;

import com.viborotto.javasdkdynamodb.entity.Music;

import java.util.Optional;

public interface MusicService {

    Music saveMusic(Music music);
    Iterable<Music> findAllMusicItem();
    Optional<Music> findMusicItemById(String id);
    Music updateMusicItem(String id, Music music);
    void deleteMusicItem(String id);
}