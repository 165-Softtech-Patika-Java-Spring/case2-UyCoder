package dev.ahmed.service.entityservice;

import dev.ahmed.entity.AddressCity;
import dev.ahmed.entity.AddressDoorNumber;
import dev.ahmed.repository.AddressCityDao;
import dev.ahmed.repository.AddressDoorNoDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Created: 2/20/2022 10:36
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Service
public class AddressDoorNoEntitySerive {

    @Autowired
    private AddressDoorNoDao addressDoorNoDao;

    public AddressDoorNumber save(AddressDoorNumber address) {
        return addressDoorNoDao.save(address);
    }

}
