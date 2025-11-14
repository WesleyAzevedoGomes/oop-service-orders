package entities;

import entities.enums.TypeOrder;

import java.time.LocalDate;

public class ContractOrder extends ServiceOrder{
  public Integer months;

  public ContractOrder(Integer id, String name, LocalDate date, Double basePrice, TypeOrder typeService, Integer months){
    super(id, name, date, basePrice, typeService);
    this.months = months;
  }

  // Getter
  public Integer getMonths() {
    return months;
  }

  // Setter
  public void setMonths(Integer months) {
    this.months = months;
  }

  // More Methods
  public Double totalValue(){
    return getBasePrice() * months;
  }
  @Override
  public String summary(){
    return "[" +getTypeService() + " Order] \n" +
            "Client: " + getName() + " \n" +
            "Date: " + getDate() + "\n" +
            "Months: " + getMonths() + "\n" +
            "Total: $" + totalValue();
  }

}
