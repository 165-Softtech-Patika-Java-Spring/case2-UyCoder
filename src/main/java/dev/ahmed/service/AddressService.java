package dev.ahmed.service;

import dev.ahmed.AddressMessage;
import dev.ahmed.converter.AdressConverter;
import dev.ahmed.converter.AdressMapper;
import dev.ahmed.dto.*;
import dev.ahmed.entity.Address;
import dev.ahmed.gen.exceptions.ItemNotFoundException;
import dev.ahmed.service.entityservice.AddressEntitySerive;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Created: 2/17/2022 23:40
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */

@Service
@RequiredArgsConstructor
public class AddressService {

    private static AddressEntitySerive addressEntitySerive;
    private final AdressConverter adressConverter;

    public List<AddressDto> findAll() {
        List<Address> addressList = addressEntitySerive.findAll();

        List<AddressDto> addressDtoList = adressConverter.convertToAdressDtoList(addressList);

        return addressDtoList;
    }

    public AddressDto save(SaveCountryRequestDto saveCountryRequestDto) {

        Address address = AdressMapper.INSTANCE.convertToAdress(saveCountryRequestDto);

        address = addressEntitySerive.save(address);

        AddressDto addressDto = AdressMapper.INSTANCE.convertToadressDto(address);

        return addressDto;
    }


    public void delete(Long id) {

        Address cusCustomer = addressEntitySerive.getByIdWithControl(id);

        addressEntitySerive.delete(cusCustomer);
    }

    public static AddressDto findById(Long id) {

        Address address = addressEntitySerive.getByIdWithControl(id);

        AddressDto addressDto = AdressMapper.INSTANCE.convertToadressDto(address);

        return addressDto;
    }


    public AddressDto update(AddressUpdateRequestDto addressUpdateRequestDto) {

        controlIsCustomerExist(addressUpdateRequestDto);

        Address address;
        address = AdressMapper.INSTANCE.convertToAdress(addressUpdateRequestDto);
        addressEntitySerive.save(address);
        AddressDto addressDto = AdressMapper.INSTANCE.convertToadressDto(address);
        return addressDto;
    }

    private void controlIsCustomerExist(AddressUpdateRequestDto addressUpdateRequestDto) {

        Long id = addressUpdateRequestDto.getId();
        boolean isExist = addressEntitySerive.existsById(id);
        if (!isExist){
            throw new ItemNotFoundException(AddressMessage.CUSTOMER_ERROR_MESSAGE);
        }
    }

    public AddressDto save(SaveCityRequestDto saveCityRequestDto) {
        Address address = AdressMapper.INSTANCE.convertToAdress(saveCityRequestDto);

        address = addressEntitySerive.save(address);

        AddressDto addressDto = AdressMapper.INSTANCE.convertToadressDto(address);

        return addressDto;
    }

    public AddressDto save(SaveDistrictRequestDto saveDistrictRequestDto) {

        Address address = AdressMapper.INSTANCE.convertToAdress(saveDistrictRequestDto);

        address = addressEntitySerive.save(address);

        AddressDto addressDto = AdressMapper.INSTANCE.convertToadressDto(address);

        return addressDto;
    }

    public AddressDto save(SaveProvinceRequestDto saveProvinceRequestDto) {

        Address address = AdressMapper.INSTANCE.convertToAdress(saveProvinceRequestDto);

        address = addressEntitySerive.save(address);

        AddressDto addressDto = AdressMapper.INSTANCE.convertToadressDto(address);

        return addressDto;
    }

    public AddressDto save(SaveNeighborhoodRequestDto saveNeighborhoodRequestDto) {

        Address address = AdressMapper.INSTANCE.convertToAdress(saveNeighborhoodRequestDto);

        address = addressEntitySerive.save(address);

        AddressDto addressDto = AdressMapper.INSTANCE.convertToadressDto(address);

        return addressDto;
    }

    public AddressDto save(SaveStreetRequestDto saveStreetRequestDto) {

        Address address = AdressMapper.INSTANCE.convertToAdress(saveStreetRequestDto);

        address = addressEntitySerive.save(address);

        AddressDto addressDto = AdressMapper.INSTANCE.convertToadressDto(address);

        return addressDto;
    }

    public AddressDto save(SaveAdressRequestDto saveAdressRequestDto) {
        Address address = AdressMapper.INSTANCE.convertToAdress(saveAdressRequestDto);

        address = addressEntitySerive.save(address);

        AddressDto addressDto = AdressMapper.INSTANCE.convertToadressDto(address);

        return addressDto;

    }
}
