package com.sda.ex13;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private List<Car> carsList;

    public CarService() {
        this.carsList = new ArrayList<>();
    }

    public void addCarsToTheList(Car car) {
        carsList.add(car);

    }

    public void removeCarFromTheList(Car car) {
        carsList.remove(car);
    }

    public List<Car> getCarsList() {
        return this.carsList;
    }

    public List<Car> getCarsWithEngineV12() {
        return carsList
                .stream()
                .filter((Car car) -> car.getEngine().equals("V12"))
                .collect(Collectors.toList());
    }

    public List<Car> getCarsManufacturedBefore(int year) {
        return carsList
                .stream()
                .filter((Car car) -> car.getYearManufacturer() < year)
                .collect(Collectors.toList());

    }

    public Car mostExpensiveCar() {
        double maxPrice = 0;
        Car expensiveCar = null;
        for (Car car : carsList) {

            if (maxPrice < car.getPrice()) {
                maxPrice = car.getPrice();
                expensiveCar = car;
            }

        }
        return expensiveCar;
    }

    public Car cheapestCar() {
        double minPrice = 0;
        Car cheapestCar = null;
        for (Car car : carsList) {

            if (minPrice > car.getPrice()) {
                minPrice = car.getPrice();
                cheapestCar = car;
            }

        }
        return cheapestCar;
    }

    public List<Car> searchFromManufacturer(String manufacturer) {
        return carsList
                .stream()
                .filter((Car car) -> car.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());

    }

    public List<Car> sortList(boolean isAscending) {
        if (isAscending) {
            return carsList
                    .stream()
                    .sorted(Comparator.comparing(Car::getPrice))
                    .collect(Collectors.toList());
        } else {
            return carsList
                    .stream()
                    .sorted(Comparator.comparing(Car::getPrice).reversed())
                    .collect(Collectors.toList());
        }
    }

    public boolean checkSpecificCar(Car car) {
       return carsList.stream().allMatch((Car carFromList) -> carFromList
                .getManufacturer()
                .equals(car.getManufacturer())
                && carFromList.getYearManufacturer() == car.getYearManufacturer()
                && carFromList.getEngine().equals(car.getEngine())
                && carFromList.getPrice() == car.getPrice());

    }

    public List<Car> sortByManufacturerYear(int year, String condition){
        switch (condition){
            case "<" :
                return carsList.stream()
                        .filter((Car car) -> car.getYearManufacturer() < year)
                        .collect(Collectors.toList());
            case ">" :
                return carsList.stream()
                        .filter((Car car) -> car.getYearManufacturer() > year)
                        .collect(Collectors.toList());
            case "<=" :
                return carsList.stream()
                        .filter((Car car) -> car.getYearManufacturer() <= year)
                        .collect(Collectors.toList());
            case ">=" :
                return carsList.stream()
                        .filter((Car car) -> car.getYearManufacturer() >= year)
                        .collect(Collectors.toList());
            case "!=" :
                return carsList.stream()
                        .filter((Car car) -> car.getYearManufacturer() != year)
                        .collect(Collectors.toList());
            case "==" :
                return carsList.stream()
                        .filter((Car car) -> car.getYearManufacturer() == year)
                        .collect(Collectors.toList());
            default:
                return carsList;
        }

    }
}
