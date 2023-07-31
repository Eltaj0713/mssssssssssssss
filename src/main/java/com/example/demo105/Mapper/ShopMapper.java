package com.example.demo105.Mapper;
import com.example.demo105.Dao.entity.ShopEntity;
import com.example.demo105.Model.ShopDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
@Mapper
public interface ShopMapper{
    ShopMapper INSTANCE= Mappers.getMapper(ShopMapper.class);
    ShopDto mapToDtoShop(ShopEntity shopEntity);
}