package com.n11p1.n11p1.service;

import com.n11p1.n11p1.entity.Accommodation;
import com.n11p1.n11p1.entity.House;
import com.n11p1.n11p1.entity.SummerHouse;
import com.n11p1.n11p1.entity.Villa;

import java.util.List;

public interface IAccommodationService {

    List<Accommodation> getHouseList(Class<? extends Accommodation> houseType);

    List<House> getAllHouses();

    List<Villa> getAllVillas();

    List<SummerHouse> getAllSummerhouses();

    double totalPrice(Class<? extends Accommodation> houseType);

    double averageArea(Class<? extends Accommodation> houseType);

    double totalArea(Class<? extends Accommodation> houseType);

    double averagePrice(Class<? extends Accommodation> houseType);

    List<Accommodation> filterByRoomsAndLivingRooms(int minRooms, int minSalons);
}