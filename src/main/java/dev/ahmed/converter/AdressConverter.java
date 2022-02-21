package dev.ahmed.converter;

import dev.ahmed.dto.AddressDto;
import dev.ahmed.entity.Address;

import java.util.ArrayList;
import java.util.List;

/**
 * @Created: 2/21/2022 19:59
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public class AdressConverter {
    public List<AddressDto> convertToAdressDtoList(List<Address> addressList) {

        List<AddressDto> addressDtoList = new ArrayList<>();
        for (Address address : addressList) {

            AddressDto addressDto = convertToAdressDto(address);

            addressDtoList.add(addressDto);
        }

        return addressDtoList;
    }

    public AddressDto convertToAdressDto(Address address) {
        AddressDto addressDto = new AddressDto();
        addressDto.setId(address.getId());
        addressDto.setCountry(address.getCountry());
        addressDto.setCity(address.getCity());
        addressDto.setProvince(address.getProvince());
        addressDto.setDisctrict(address.getDisctrict());
        addressDto.setNeighborhood(address.getNeighborhood());
        addressDto.setStreet(address.getStreet());
        addressDto.setDoorNumber(address.getDoorNumber());
        addressDto.setApartmentNumber(address.getApartmentNumber());
        return addressDto;
    }


}
