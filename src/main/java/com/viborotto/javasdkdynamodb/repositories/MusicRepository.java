package com.viborotto.javasdkdynamodb.repositories;

import com.viborotto.javasdkdynamodb.entity.Music;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface MusicRepository extends CrudRepository<Music, Long> {

//
//    Optional<Music> findByMusicId(Long id);
//
//    List<Music> findAllByMusicItem();
//
//    Optional<Music> deleteById(Long id);
}
