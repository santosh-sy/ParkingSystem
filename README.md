Certainly! Here's a simple README file that you can include in your GitHub repository for the Parking System project:

---

# Parking System

This is a simple Java console-based parking system that allows users to park cars, remove cars, and view all parked cars. The program keeps track of available parking slots and maintains a list of parked cars using a `Car` class.

## Features

1. **Park a Car:** Users can park a car by providing the state code and license plate number.

2. **Remove a Car:** Users can remove a parked car by providing the state code and license plate number.

3. **View All Parked Cars:** Users can view a list of all currently parked cars.

4. **Exit:** Users can exit the program.

## Usage

To use the parking system, follow these steps:

1. Run the `ParkingSystem` class.
2. Choose an option from the menu:
    - **1:** Park a car
    - **2:** Remove a car
    - **3:** View all parked cars
    - **4:** Exit

## Car Class

The `Car` class represents a parked car and contains information about the state code and license plate number.

### Methods

- `getCar(): String`: Returns the state code of the car.
- `getState(): String`: Returns the license plate number of the car.
