package com.cakmak.eng.deneme.repository;

import com.cakmak.eng.deneme.entity.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends CrudRepository<Profile,Long> {
}
