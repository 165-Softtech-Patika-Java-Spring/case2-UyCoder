package dev.ahmed.service.entityservice;

import dev.ahmed.entity.AddressCity;
import dev.ahmed.entity.AddressProvince;
import dev.ahmed.repository.AddressCityDao;
import dev.ahmed.repository.AddressProvinceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Created: 2/20/2022 10:36
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
@Service
public class AddressProvinceEntitySerive {

    @Autowired
    private AddressProvinceDao addressProvinceDao;

    public AddressProvince save(AddressProvince address) {
        return addressProvinceDao.save(address);
    }

}
