package com.example.demo105.Dao.repository;
import com.example.demo105.Dao.entity.GlassesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<GlassesEntity,Integer>{
}