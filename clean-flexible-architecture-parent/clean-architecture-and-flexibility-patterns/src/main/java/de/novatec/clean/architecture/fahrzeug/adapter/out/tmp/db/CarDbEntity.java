package de.novatec.clean.architecture.fahrzeug.adapter.out.tmp.db;

public class CarDbEntity {

    private String id;
    private String vin;
    private String category;
    private String carModelType;
    private String carModelName;
    private Double mileage;
    private String mileageUnit;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public String getMileageUnit() {
        return mileageUnit;
    }

    public void setMileageUnit(String mileageUnit) {
        this.mileageUnit = mileageUnit;
    }
}
