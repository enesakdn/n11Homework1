package com.n11p1.n11p1;

import com.n11p1.n11p1.entity.Accommodation;
import com.n11p1.n11p1.entity.House;
import com.n11p1.n11p1.entity.SummerHouse;
import com.n11p1.n11p1.entity.Villa;
import com.n11p1.n11p1.service.AccommodationService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class N11p1Application {

	public static void main(String[] args) {
		SpringApplication.run(N11p1Application.class, args);
		List<Accommodation> accommodations = new ArrayList<>();
		accommodations.add(new House("House1", 120, 3, 1500, 180000));
		accommodations.add(new House("House2", 100, 2, 2000, 200000));
		accommodations.add(new Villa("Villa1", 200, 5, 2500, 500000));
		accommodations.add(new Villa("Villa2", 180, 4, 2200, 450000));
		accommodations.add(new SummerHouse("SummerHouse1", 80, 2, 1200, 100000));
		accommodations.add(new SummerHouse("SummerHouse2", 120, 3, 1500, 150000));

		AccommodationService service = new AccommodationService(accommodations);

		System.out.println("Total price of all houses: $" + service.totalPrice(House.class));
		System.out.println("Total price of all villas: $" + service.totalPrice(Villa.class));
		System.out.println("Total price of all summerhouses: $" + service.totalPrice(SummerHouse.class));
		System.out.println("Average area of all houses: " + service.averageArea(House.class) + " m²");
		System.out.println("Average area of all villas: " + service.averageArea(Villa.class) + " m²");
		System.out.println("Average area of all summerhouses: " + service.averageArea(SummerHouse.class) + " m²");
		System.out.println();

		int minRooms = 3;
		int minLivingRooms = 2;

		List<Accommodation> filteredHouses = service.filterByRoomsAndLivingRooms(minRooms, minLivingRooms);
		System.out.println("Houses with at least " + minRooms + " rooms and " + minLivingRooms + " living rooms:");
		for (Accommodation accommodation : filteredHouses) {
			System.out.println(accommodation);
		}

		System.out.println();
		System.out.println("Get all houses: " + service.getAllHouses());
		System.out.println("Get all villas: " + service.getAllVillas());
		System.out.println("Get all summerhouses: " + service.getAllSummerhouses());
	}

}
