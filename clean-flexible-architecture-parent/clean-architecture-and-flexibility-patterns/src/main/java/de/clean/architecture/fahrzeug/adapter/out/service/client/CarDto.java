package de.clean.architecture.fahrzeug.adapter.out.service.client;

public class CarDto {
    private String vin;
    private String carType;
    private String carModelType;
    private String carModelName;
    private Double kilometrage;
    private String kilometrageUnit;

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarModelType() {
        return carModelType;
    }

    public void setCarModelType(String carModelType) {
        this.carModelType = carModelType;
    }

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }

    public Double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(Double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public String getKilometrageUnit() {
        return kilometrageUnit;
    }

    public void setKilometrageUnit(String kilometrageUnit) {
        this.kilometrageUnit = kilometrageUnit;
    }
}
