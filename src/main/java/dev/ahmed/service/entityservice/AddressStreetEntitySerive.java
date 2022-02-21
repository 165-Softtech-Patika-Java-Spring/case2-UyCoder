package dev.ahmed.service.entityservice;

import dev.ahmed.entity.AddressCity;
import dev.ahmed.entity.AddressStreet;
import dev.ahmed.repository.AddressCityDao;
import dev.ahmed.repository.AddressStreetDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Created: 2/20/2022 10:36
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Service
public class AddressStreetEntitySerive {

    @Autowired
    private AddressStreetDao addressStreetDao;

    public AddressStreet save(AddressStreet address) {
        return addressStreetDao.save(address);
    }

}
