package com.example.demo105.Mapper;
import com.example.demo105.Dao.entity.AboutEntity;
import com.example.demo105.Model.AboutDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface AboutMapper{
    AboutMapper INSTANCE=Mappers.getMapper(AboutMapper.class);
    AboutDto mapToDtoAbout(AboutEntity aboutEntity);
}