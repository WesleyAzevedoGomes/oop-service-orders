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
