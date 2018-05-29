package com.aurelien.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aurelien.Entity.Car;
import com.aurelien.Entity.User;
import com.aurelien.Service.CarService;


	@RestController
	@RequestMapping("/cars")
	public class CarController 
	{
		@Autowired(required=true)
		private CarService carService;
		
		@RequestMapping(method = RequestMethod.GET)
		public Collection<Car> getAllCars()
		{
			return carService.getAllCars();
		}
	
	
	
	
}
