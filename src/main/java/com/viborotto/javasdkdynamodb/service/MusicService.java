package com.viborotto.javasdkdynamodb.service;

import com.viborotto.javasdkdynamodb.entity.Music;

import java.util.Optional;

public interface MusicService {

    Music saveMusic(Music music);
    Iterable<Music> findAllMusicItem();
    Optional<Music> findMusicItemById(Long id);
    Music updateMusicItem(Long id, Music music);
    void deleteMusicItem(Long id);
}