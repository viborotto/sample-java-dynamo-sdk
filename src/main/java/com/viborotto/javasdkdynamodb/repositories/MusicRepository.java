package com.viborotto.javasdkdynamodb.repositories;

import com.viborotto.javasdkdynamodb.entity.Music;
import com.viborotto.javasdkdynamodb.entity.MusicId;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface MusicRepository extends CrudRepository<Music, MusicId> {
    Optional<Music> findMusicById(String id);

//    Optional<Music> findByMusicId(Long id);

//    List<Music> findAllByMusicItem();
//    Optional<Music> deleteById(Long id);
}
