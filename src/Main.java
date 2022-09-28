public class Main {
    public static void main(String[] args) {
////Создайте объекты для следующий персон:
        ////
        ////Максим из города Минск, которому 35 лет
        ////Аня из города Москва, которой 29 лет
        ////Катя из города Калининград, которой 28 лет
        ////Артем из города Москва, которому 27 лет

        Human maksim = new Human();
        maksim.name = "Максим";
        maksim.town = "Минск";
        maksim.yearOfBirth = 35;
        maksim.job = " бренд-менеджерa";
        maksim.human();

        Human anna = new Human();
        anna.name = "Аня";
        anna.town = "Москва";
        anna.yearOfBirth = 29;
        anna.job = " методистa образовательных программ";
        anna.human();

        Human katya = new Human();
        katya.name = "Катя";
        katya.town = "Калининград";
        katya.yearOfBirth = 28;
        katya.job = " продакт-менеджера";
        katya.human();

        Human artem = new Human();
        artem.name = "Артем";
        artem.town = "Москва";
        artem.yearOfBirth = 27;
        artem.job = " директора по развитию бизнеса";
        artem.human();

//
//Максим из города Минск, которому 35 лет
//Аня из города Москва, которой 29 лет
//Катя из города Калининград, которой 28 лет
//Артем из города Москва, которому 27 лет
        //Максим работает бренд-менеджером
//Аня работает методистом образовательных программ
//Катя работает продакт-менеджером
//Артем работает директором по развитию бизнеса
//Допишите программу таким образом, чтобы в консоль выводились приветственное сообщение в формате :"Привет!
// Меня зовут …. Я из города …. Я родился в … году. Я работаю на должности… . Будем знакомы!"

        Car ladaGrande = new Car();
        ladaGrande.brand = "Lada";
        ladaGrande.model = "Grande";
        ladaGrande.productionYear = 2015;
        ladaGrande.productionCountry = "России";
        ladaGrande.color = "желтый";
        ladaGrande.engineVolume = 1.7f;
        ladaGrande.car();

        Car audi = new Car();
        audi.brand = "Audi A8 50 L TDI";
        audi.model = "quattro";
        audi.productionYear = 2020;
        audi.productionCountry = "Германия";
        audi.color = "черный";
        audi.engineVolume = 3.0f;
        audi.car();

        Car bmw = new Car();
        bmw.brand = "BMW";
        bmw.model = "Z8";
        bmw.productionYear = 2021;
        bmw.productionCountry = "Германия";
        bmw.color = "черный";
        bmw.engineVolume = 3.0f;
        bmw.car();

        Car kia = new Car();
        kia.brand = "Kia";
        kia.model = "Sportage 4 поколение";
        kia.productionYear = 2018;
        kia.productionCountry = "Южная Корея";
        kia.color = "красный";
        kia.engineVolume = 2.4f;
        kia.car();

        Car hyundai = new Car();
        hyundai.brand = "Hyundai";
        hyundai.model = "Avante";
        hyundai.productionYear = 2016;
        hyundai.productionCountry = "Южная Корея";
        hyundai.color = "оранжевый";
        hyundai.engineVolume = 1.6f;
        hyundai.car();
        //// Создайте объекты для следующих автомобилей:
        //
        //    //Lada Grande, 2015 год выпуска, сборка в России, желтого цвета, объем двигателя - 1,7
        //    //Audi A8 50 L TDI quattro, 2020 год выпуска, сборка в Германии, черный цвет кузова, объем двигателя 3.0 литра
        //    //BMW Z8, сборка в Германии в 2021 году, черный цвет кузова, объем – 3.0
        //    //Kia Sportage 4 поколение, 2018 год выпуска, сборка в Южной Корее, цвет кузова красный, объем двигателя – 2,4 литра.
        //    //Hyundai Avante, сборка в Южной Корее, цвет кузова оранжевый, объем двигателя - 1,6 литра, год выпуска - 2016 год.
    }

}