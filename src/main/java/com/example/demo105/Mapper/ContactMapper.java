package com.example.demo105.Mapper;
import com.example.demo105.Dao.entity.ContactEntity;
import com.example.demo105.Model.ContactDto;
import org.springframework.stereotype.Component;
@Component
public class ContactMapper{
    public static ContactEntity contactEntityDto(ContactDto contactDto){
        return new ContactEntity(
                contactDto.getId(),
                contactDto.getFull_name(),
                contactDto.getEmail(),
                contactDto.getMessage(),
                contactDto.getPhone_number()
        );
    }
}