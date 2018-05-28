package com.aurelien.Dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.aurelien.Entity.Car;

	@Repository
	public class CarDao 
	{
	private static Map<Integer, Car> cars;
		
		static 
		{
			cars = new HashMap<Integer, Car>()
			{
				{
					put(1, new Car(1, "Bentley","contienntal GT",600));
					put(2, new Car(2,"Aston Martin","V12 vantage",800));
					put(3, new Car(3,"Rolls-Royce","Phantom",500));
				}
			};
		}	

		public Collection<Car> getAllCars()
		{
			return this.cars.values();
		}
}


