package application;

import entities.ContractOrder;
import entities.InstallationOrder;
import entities.RepairOrder;
import entities.ServiceOrder;
import entities.enums.TypeOrder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("How many ordens service will be registred? ");
    int numberOrdens = sc.nextInt();
    List<ServiceOrder> list = new ArrayList<>();

    for(int i = 0; i < numberOrdens; i++){
      sc.nextLine();
      System.out.println("What type of service do you want? (I/R/C)");
      System.out.println("Installation/Repair/Contract");
      String typeOrder = sc.nextLine();
      System.out.println("What is the service ID? ");
      int id = sc.nextInt();
      sc.nextLine();
      System.out.println("What is the client's name?");
      String name = sc.nextLine();
      System.out.println("What is the date?");
      String date = sc.nextLine();
      System.out.println("What is the price? ");
      double price = sc.nextDouble();
      sc.nextLine();
      if(typeOrder.equalsIgnoreCase("i")){
        System.out.println("Equipament name: ");
        String equipmentName = sc.nextLine();
        System.out.println("Installation fee: ");
        double installationFee = sc.nextDouble();
        list.add(new InstallationOrder(id, name, LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")), price, TypeOrder.INSTALLATION, equipmentName, installationFee));
      } else if (typeOrder.equalsIgnoreCase("r")) {
        System.out.println("Part cost: ");
        double partCost = sc.nextDouble();
        System.out.println("Hours worked: ");
        int hoursWorked = sc.nextInt();
        System.out.println("Hourly rate: ");
        double hourlyRate = sc.nextDouble();
        list.add(new RepairOrder(id, name, LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")), price, TypeOrder.REPAIR, partCost, hoursWorked, hourlyRate));
      } else {
        System.out.println("Months: ");
        int months = sc.nextInt();
        sc.nextLine();
        list.add(new ContractOrder(id, name, LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy")), price, TypeOrder.CONTRACT, months));
      }
    }

    for(ServiceOrder orders : list){
      System.out.println(orders.summary());
      System.out.println();
    }

    sc.close();
  }
}