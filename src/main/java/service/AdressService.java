package service;

import entity.Address;
import entity.Car;
import entity.Human;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AddressRepository;
import repository.CarRepository;
import repository.HumanRepository;

import java.util.List;

@Service
@Transactional
public class AdressService {

    @Autowired
    private final AddressRepository addressRepository;
    @Autowired
    private final HumanRepository humanRepository;
    @Autowired
    private final CarRepository carRepository;

    public AdressService(AddressRepository addressRepository, HumanRepository humanRepository,
                         CarRepository carRepository) {
        this.addressRepository = addressRepository;
        this.humanRepository = humanRepository;
        this.carRepository = carRepository;
    }

    public void addAdress()
    {
        Address address = new Address("Ankara", "Türkiye");
        Human human = new Human("Umut", 30);
        human.setAddress(address);
        humanRepository.save(human);
        addressRepository.save(address);
        Car car = new Car("BMW", human);
        carRepository.save(car);




    }

}
