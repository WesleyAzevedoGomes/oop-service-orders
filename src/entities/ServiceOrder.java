package entities;

import entities.enums.TypeOrder;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ServiceOrder {
  private Integer id;
  private String name;
  private LocalDate date;
  private Double basePrice;
  private TypeOrder typeService;
  private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");


  public ServiceOrder(){

  }
  public ServiceOrder(Integer id, String name, LocalDate date, Double basePrice, TypeOrder typeService){
    this.id = id;
    this.name = name;
    this.date = date;
    this.basePrice = basePrice;
    this.typeService = typeService;
  }

  // Getters
  public Integer getId() {
    return id;
  }
  public String getName() {
    return name;
  }
  public String getDate() {
    return date.format(fmt);
  }
  public Double getBasePrice() {
    return basePrice;
  }
  public TypeOrder getTypeService(){
    return typeService;
  }

  // Setters
  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public void setBasePrice(Double basePrice) {
    this.basePrice = basePrice;
  }


  // More methods

  public String summary(){
    return "[" +getTypeService() + " Order] \n" + "Client: " + getName() + " \n" +
    "Date: " + getDate() + "\n" +
    "Total: $" + getBasePrice();
  }
}
