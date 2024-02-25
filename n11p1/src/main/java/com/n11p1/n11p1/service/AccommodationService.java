package com.n11p1.n11p1.service;

import com.n11p1.n11p1.entity.Accommodation;
import com.n11p1.n11p1.entity.House;
import com.n11p1.n11p1.entity.SummerHouse;
import com.n11p1.n11p1.entity.Villa;

import java.util.ArrayList;
import java.util.List;

public class AccommodationService implements IAccommodationService {
    private List<Accommodation> houses;

    public AccommodationService(List<Accommodation> houses) {
        this.houses = houses;
    }

    @Override
    public List<Accommodation> getHouseList(Class<? extends Accommodation> houseType) {
        List<Accommodation> houseList = new ArrayList<>();

        for (Accommodation house : houses) {
            if (houseType.isInstance(house)) {
                houseList.add(house);
            }
        }
        return houseList;
    }

    @Override
    public List<House> getAllHouses() {
        List<House> houseList = new ArrayList<>();
        for (Accommodation housing : houses) {
            if (housing instanceof House) {
                houseList.add((House) housing);
            }
        }
        return houseList;
    }

    @Override
    public List<Villa> getAllVillas() {
        List<Villa> villas = new ArrayList<>();
        for (Accommodation house : houses) {
            if (house instanceof Villa) {
                villas.add((Villa) house);
            }
        }
        return villas;
    }

    @Override
    public List<SummerHouse> getAllSummerhouses() {
        List<SummerHouse> summerhouses = new ArrayList<>();
        for (Accommodation house : houses) {
            if (house instanceof SummerHouse) {
                summerhouses.add((SummerHouse) house);
            }
        }
        return summerhouses;
    }

    @Override
    public double totalPrice(Class<? extends Accommodation> houseType) {
        double total = 0;

        for (Accommodation house : houses) {
            if (houseType.isInstance(house)) {
                total += house.getPrice();
            }
        }
        return total;
    }

    @Override
    public double averageArea(Class<? extends Accommodation> houseType) {
        List<Accommodation> houseList = getHouseList(houseType);
        double totalArea = 0;

        for (Accommodation house : houseList) {
            totalArea += house.getArea();
        }
        return totalArea / houseList.size();
    }

    @Override
    public double totalArea(Class<? extends Accommodation> houseType) {
        double totalArea = 0;

        for (Accommodation house : houses) {
            if (houseType.isInstance(house)) {
                totalArea += house.getArea();
            }
        }
        return totalArea;
    }

    @Override
    public double averagePrice(Class<? extends Accommodation> houseType) {
        List<Accommodation> houseList = getHouseList(houseType);
        double totalPrice = 0;

        for (Accommodation house : houseList) {
            totalPrice += house.getPrice();
        }
        return totalPrice / houseList.size();
    }

    @Override
    public List<Accommodation> filterByRoomsAndLivingRooms(int minRooms, int minSalons) {
        List<Accommodation> filteredHouses = new ArrayList<>();

        for (Accommodation house : houses) {
            if (house.getRoomCount() >= minRooms && house.getRoomCount() >= minSalons) {
                filteredHouses.add(house);
            }
        }
        return filteredHouses;
    }
}
