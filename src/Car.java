public class Car {
    //Создайте новый проект в IDEA. Создайте класс автомобиль, у которого есть:
    //
    //марка
    //модель
    //объем двигателя в литрах
    //цвет кузова
    //год производства
    //страна сборки
    String brand;
    String model;
    float engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    void car() {
        System.out.print(brand + " ");
        System.out.print(model + ", ");
        System.out.print(productionYear + " год выпуска, ");
        System.out.print("сборка " + productionCountry + ", ");
        System.out.print("цвет кузова " + color + ", ");
        System.out.print("объем двигателя " + engineVolume + " литра");
        System.out.println();
    }
}


