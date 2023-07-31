package com.example.demo105.Dao.repository;
import com.example.demo105.Dao.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface ContactRepository extends JpaRepository<ContactEntity,Integer>{
}