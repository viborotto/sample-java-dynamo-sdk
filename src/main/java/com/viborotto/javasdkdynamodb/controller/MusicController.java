package com.viborotto.javasdkdynamodb.controller;


import com.viborotto.javasdkdynamodb.entity.Music;
import com.viborotto.javasdkdynamodb.service.MusicServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class MusicController {

    @Autowired
    private MusicServiceImpl musicServiceImpl;

    public MusicController(MusicServiceImpl musicServiceImpl) {
        this.musicServiceImpl = musicServiceImpl;
    }

    @PostMapping("/aws/dynamo/musics")
    public ResponseEntity<Music> newMusicItem(@Valid @RequestBody Music music) {
        Music newMusic = musicServiceImpl.saveMusic(music);
        return ResponseEntity.status(201).body(newMusic);
    }

    @GetMapping("/aws/dynamo/musics")
    public ResponseEntity<?> getMusics() {
        return ResponseEntity.ok(musicServiceImpl.findAllMusicItem());
    }

    @GetMapping("/aws/dynamo/musics/{music_id}")
    public ResponseEntity<?> getMusics(@PathVariable Long music_id) {
        return ResponseEntity.ok(musicServiceImpl.findMusicItemById(music_id));
    }

    @PutMapping("/aws/dynamo/musics/{music_id}")
    public ResponseEntity<Music> updateMusic(@PathVariable Long music_id, @Valid @RequestBody Music music) {
        return ResponseEntity.ok(musicServiceImpl.updateMusicItem(music_id, music));
    }

    @DeleteMapping("/aws/dynamo/musics/{music_id}")
    public void deleteMusic(@PathVariable Long music_id) {
        musicServiceImpl.deleteMusicItem(music_id);
    }


}
