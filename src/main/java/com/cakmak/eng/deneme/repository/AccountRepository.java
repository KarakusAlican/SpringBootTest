package com.cakmak.eng.deneme.repository;


import com.cakmak.eng.deneme.entity.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Integer> {
}
