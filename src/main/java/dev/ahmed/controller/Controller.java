package dev.ahmed.controller;

import dev.ahmed.dto.*;
import dev.ahmed.entity.*;
import dev.ahmed.gen.dto.RestResponse;
import dev.ahmed.service.AddressService;
import dev.ahmed.service.entityservice.*;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Created: 2/20/2022 02:04
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
public class Controller {

    private final AddressService addressService;

    @Autowired
    private AddressDistrictEntitySerive addressDistrictEntitySerive;

    @Autowired
    private AddressNeighborhoodEntitySerive addressNeighborhoodEntitySerive;


    // 1 * Ülke kaydedilebilmelidir.
    @PostMapping("/country")
    public ResponseEntity save(@RequestBody SaveCountryRequestDto saveCountryRequestDto) {
        AddressDto addressDto = addressService.save(saveCountryRequestDto);
        return new ResponseEntity(addressDto, HttpStatus.OK);
    }


    // 2 * Ülke kodundan ülke sorgulanabilmelidir.
    @GetMapping("/country/{countryId}")
    public ResponseEntity findCountryById(@PathVariable Long id){
        AddressDto addressDto = AddressService.findById(id);
        return ResponseEntity.ok(RestResponse.of(addressDto));
    }

    // 3 * Şehir kaydedilebilmelidir.
    @PostMapping("/city")
    public ResponseEntity saveCity(@RequestBody SaveCityRequestDto saveCityRequestDto) {
        AddressDto addressDto = addressService.save(saveCityRequestDto);
        return new ResponseEntity(addressDto, HttpStatus.OK);
    }

    // 4 * Plakadan şehir bilgisi sorgulanabilmelidir.
    @GetMapping("/city/{plateNo}")
    public ResponseEntity findCityById(@PathVariable Long plateNo){
        AddressDto addressDto = addressService.findById(plateNo);
        return ResponseEntity.ok(RestResponse.of(addressDto));
    }

    // 5 * İlçe kaydedilebilmelidir.
    @PostMapping("/district")
    public ResponseEntity saveCity(@RequestBody SaveDistrictRequestDto saveDistrictRequestDto) {
        AddressDto addressDto = addressService.save(saveDistrictRequestDto);
        return new ResponseEntity(addressDto, HttpStatus.OK);
    }

    // 6 * Bir ile ait ilçeler sorgulanabilmelidir.
    @GetMapping("/province")
    public ResponseEntity findAllProvince() {
        List<AddressDto> addressDtoList = addressDistrictEntitySerive.findAll();
        return new ResponseEntity(addressDtoList, HttpStatus.OK);
        }

    // il kaydedililmesi
    @PostMapping("/province")
    public ResponseEntity save(@RequestBody SaveProvinceRequestDto saveProvinceRequestDto) {
        AddressDto addressDto = addressService.save(saveProvinceRequestDto);
        return new ResponseEntity(addressDto, HttpStatus.OK);
    }

    // 7 * Mahalle kaydedilebilmelidir.
    @PostMapping("/neighborhood")
    public ResponseEntity save(@RequestBody SaveNeighborhoodRequestDto saveNeighborhoodRequestDto) {
        AddressDto addressDto = addressService.save(saveNeighborhoodRequestDto);
        return new ResponseEntity(addressDto, HttpStatus.OK);
    }

    // 8 * Mahalle adını güncellenebilmelidir.
    @PutMapping("/neighborhood")
    public ResponseEntity updateNeighborhood(@RequestBody SaveNeighborhoodRequestDto saveNeighborhoodRequestDto){
        AddressDto addressDto = addressService.update(saveNeighborhoodRequestDto);
        return new ResponseEntity(addressDto, HttpStatus.OK);
    }

    // 9 * Bir ilçeye ait mahalleler sorgulanabilmelidir.
    @GetMapping("/neighborhood")
    public ResponseEntity getNeighborhoodByDistrictId(@PathVariable Long districtId) {
        List<AddressNeighborhoodDto> neighborhoodDtoList = addressNeighborhoodEntitySerive.findAll(districtId);
        return new ResponseEntity(neighborhoodDtoList, HttpStatus.OK);
    }

    // 10 * Sokak kaydedilebilmelidir.
    @PostMapping("/street")
    public ResponseEntity saveStreet(@RequestBody SaveStreetRequestDto saveStreetRequestDto) {
        AddressDto addressDto = addressService.save(saveStreetRequestDto);
        return new ResponseEntity(addressDto, HttpStatus.OK);
    }

    // 11 * Sokak adı güncellenebilmelidir.
    @PutMapping
    public ResponseEntity updateStreet(@RequestBody SaveStreetRequestDto saveStreetRequestDto){
        AddressDto addressDto = addressService.update(saveStreetRequestDto);
        return ResponseEntity.ok(RestResponse.of(addressDto));
    }


    // 12 * Bir mahalleye ait sokaklar sorgulanabilmelidir.
    @GetMapping("/street")
    public ResponseEntity getStreet(@PathVariable Long id) {
        List<AddressNeighborhoodDto> neighborhoodDtoList = addressNeighborhoodEntitySerive.findAll(id);
        return new ResponseEntity(neighborhoodDtoList, HttpStatus.OK);
    }

    // 13 * Adres kaydedilebilmelidir.
    @PostMapping
    public ResponseEntity saveAdress(@RequestBody SaveAdressRequestDto saveAdressRequestDto) {
        AddressDto addressDto = addressService.save(saveAdressRequestDto);
        return new ResponseEntity(addressDto, HttpStatus.OK);
    }


    // 14 * Adres silinebilmelidir.
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable Long id){
        addressService.delete(id);
        return ResponseEntity.ok(RestResponse.empty());
    }


    // 15 * Id den adres bilgisi edinilebilmelidir.
    @GetMapping
    public ResponseEntity findAll(){
        List<AddressDto> addressDtoList = addressService.findAll();
        return ResponseEntity.ok(RestResponse.of(addressDtoList));
    }



}
