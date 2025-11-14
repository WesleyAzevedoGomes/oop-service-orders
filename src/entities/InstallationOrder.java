package entities;

import entities.enums.TypeOrder;

import java.time.LocalDate;

public class InstallationOrder extends ServiceOrder{
  private String equipmentName;
  private Double installationFee;

  public InstallationOrder(Integer id, String name, LocalDate date, Double basePrice, TypeOrder typeService, String equipmentName, Double installationFee){
    super(id, name, date, basePrice, typeService);
    this.equipmentName = equipmentName;
    this.installationFee = installationFee;
  }

  // Getters
  public String getEquipmentName(){
    return equipmentName;
  }
  public Double getInstallationFee() {
    return installationFee;
  }

  // Setter
  public void setEquipmentName(String equipmentName){
    this.equipmentName = equipmentName;
  }
  public void setInstallationFee(Double installationFee) {
    this.installationFee = installationFee;
  }

  // More methos
  public Double totalValue(){
    return getBasePrice() + installationFee;
  }

  @Override
  public String summary(){
    return "[" +getTypeService() + " Order] \n" + "Client: " + getName() + " \n" +
            "Date: " + getDate() + "\n" +
            "Equipment: " + getEquipmentName() + "\n" +
            "Total: $" + totalValue();
  }
}
