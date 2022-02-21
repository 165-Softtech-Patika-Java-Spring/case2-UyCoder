package dev.ahmed.service.entityservice;

import dev.ahmed.dto.AddressDto;
import dev.ahmed.entity.AddressCity;
import dev.ahmed.entity.AddressDistrict;
import dev.ahmed.repository.AddressCityDao;
import dev.ahmed.repository.AddressDistrictDao;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Created: 2/20/2022 10:36
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Service
@RequiredArgsConstructor
public class AddressDistrictEntitySerive {

    @Autowired
    private AddressDistrictDao addressDistrictDao;


    public AddressDistrict save(AddressDistrict address) {
        return addressDistrictDao.save(address);
    }

    public List<AddressDto> findAll() {
        return null;
    }
}
