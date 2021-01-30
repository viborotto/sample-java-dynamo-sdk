package com.viborotto.javasdkdynamodb.service;

import com.viborotto.javasdkdynamodb.entity.Music;
import com.viborotto.javasdkdynamodb.repositories.MusicRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MusicServiceImpl implements MusicService {

    @Autowired
    private MusicRepository musicRepository;

    public MusicServiceImpl(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Override
    public Music saveMusic(Music music) {
        Optional<Music> musicItem =
                musicRepository.findMusicById(music.getId());

        if(musicItem.isPresent()) {
            throw new RuntimeException("There is already a music with this id");
        }
        return musicRepository.save(music);
    }

    @Override
    public Iterable<Music> findAllMusicItem() {
        return musicRepository.findAll();
    }

    @Override
    public Optional<Music> findMusicItemById(String id) {
        return musicRepository.findMusicById(id);
    }


    @Override
    public Music updateMusicItem(String id, Music music) {
        Optional<Music> updateMusicItem =
                musicRepository.findMusicById(id);

        if(updateMusicItem.isEmpty()) {
            throw new RuntimeException("There is no music with this id");
        }

        BeanUtils.copyProperties(music, updateMusicItem.get(), "id");

        return musicRepository.save(updateMusicItem.get());
    }

    @Override
    public void deleteMusicItem(String id) {
        Optional<Music> musicItem =
                musicRepository.findMusicById(id);

        if(musicItem.isEmpty()) {
            throw new RuntimeException("There is no music with this id");
        }
        musicRepository.findMusicById(id);
    }
}
