package dev.ahmed.service.entityservice;

import dev.ahmed.entity.AddressCity;
import dev.ahmed.entity.AddressCountry;
import dev.ahmed.repository.AddressCityDao;
import dev.ahmed.repository.AddressCountryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Created: 2/20/2022 10:36
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Service
public class AddressCityEntitySerive {

    @Autowired
    private AddressCityDao addressCityDao;

    public AddressCity save(AddressCity address) {
        return addressCityDao.save(address);
    }

}
