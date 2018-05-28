package com.aurelien.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aurelien.Dao.CarDao;
import com.aurelien.Entity.Car;

@Service
public class CarService 
{

	@Autowired
	private CarDao carDao;
	
	public Collection<Car> getAllCars()
	{
		return this.carDao.getAllCars();
	}

}
