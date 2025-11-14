package entities;

import entities.enums.TypeOrder;

import java.time.LocalDate;

public class RepairOrder extends ServiceOrder{
  private Double partCost;
  private Integer hoursWorked;
  private Double hourlyRate;

  public RepairOrder(Integer id, String name, LocalDate date, Double basePrice, TypeOrder typeService, Double partCost, Integer hoursWorked, Double hourlyRate){
    super(id, name, date, basePrice, typeService);
    this.partCost = partCost;
    this.hoursWorked = hoursWorked;
    this.hourlyRate = hourlyRate;
  }

  // Getters
  public Double getPartCost() {
    return partCost;
  }
  public Integer getHoursWorked() {
    return hoursWorked;
  }
  public Double getHourlyRate() {
    return hourlyRate;
  }

  // Setters
  public void setPartCost(Double partCost) {
    this.partCost = partCost;
  }
  public void setHoursWorked(Integer hoursWorked) {
    this.hoursWorked = hoursWorked;
  }
  public void setHourlyRate(Double hourlyRate) {
    this.hourlyRate = hourlyRate;
  }

  // More Methods
  public Double totalValue(){
    return getBasePrice() + partCost + (hoursWorked * hourlyRate);
  }

  @Override
  public String summary(){
    return "[" +getTypeService() + " Order] \n" +
            "Client: " + getName() + " \n" +
            "Date: " + getDate() + "\n" +
            "Part cost: $" + getPartCost() + "\n" +
            "Hours worked: " + getHoursWorked() + "\n" +
            "Hourly rate: $" + getHourlyRate() + "\n" +
            "Total: $" + totalValue();
  }
}
