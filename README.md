## PT-BR

# Service Order System (OOP Project)

Projeto desenvolvido em Java para praticar **Herança**, **Polimorfismo**, **Sobrescrita**, **Enums**, **Composição**, **Listas** e manipulação de **datas** utilizando `LocalDate`.

O sistema permite registrar diferentes tipos de ordens de serviço — instalação, reparo e contrato — e gerar resumos individuais usando polimorfismo.

---

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- Programação Orientada a Objetos (OOP)
- Herança e Polimorfismo
- Enums
- Listas (`ArrayList`)
- Datas usando `LocalDate` e `DateTimeFormatter`

---

## 📦 Funcionalidades

- Registrar múltiplas ordens de serviço:
  - **InstallationOrder**
  - **RepairOrder**
  - **ContractOrder**
- Armazenar tudo em uma lista do tipo `ServiceOrder` (upcasting)
- Cada tipo de ordem possui:
  - cálculo próprio do valor
  - campos adicionais
  - método `summary()` sobrescrito
- Saída organizada mostrando o resumo de cada pedido

## EN-US

# Service Order System (OOP Project)

Project developed in Java to practice **Inheritance**, **Polymorphism**, **Method Overriding**, **Enums**, **Composition**, **Lists**, and **date handling** using `LocalDate`.

The system allows registering different types of service orders — installation, repair, and contract — and generating individual summaries using polymorphism.

---

## 🚀 Technologies Used

- **Java 17+**
- Object-Oriented Programming (OOP)
- Inheritance and Polymorphism
- Enums
- Lists (`ArrayList`)
- Date handling using `LocalDate` and `DateTimeFormatter`

---

## 📦 Features

- Register multiple service orders:
    - **InstallationOrder**
    - **RepairOrder**
    - **ContractOrder**
- Store everything in a `ServiceOrder` list (upcasting)
- Each order type includes:
    - its own price calculation
    - additional specific fields
    - an overridden `summary()` method
- Organized output showing each order summary
