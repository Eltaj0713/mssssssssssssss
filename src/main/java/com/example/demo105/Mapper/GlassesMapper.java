package com.example.demo105.Mapper;
import com.example.demo105.Dao.entity.GlassesEntity;
import com.example.demo105.Model.GlassesDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface GlassesMapper{
    GlassesMapper INSTANCE = Mappers.getMapper(GlassesMapper.class);
    GlassesDto mapToDtoGlasses(GlassesEntity glassesEntity);
}