## Абстракция

Реализуйте класс Товар, содержащий данные о товаре, и класс ТорговыйАвтомат, содержащий в себе методы
initProducts (List<Product>) сохраняющий в себе список исходных продуктов и getProduct(String name)

## Инкапсуляция
Реализуйте конструкторы get/set методы, постройте логику Торгового Автомата на основе кода сделанного
в предыдущем задании
 
## Наследование
Сделайте класс Товар абстрактным, создайте нескольких наследников (к примеру: Бутылка Воды),
сделайте интерфейсом ТорговыйАвтомат и реализуйте класс какого-то одного типа Торгового Автомата 
(пример: ПродующийБутылкиВодыАвтомат)
/
## Полиморфизм
Переопределите метод toString для Товара, запустите программу, после этого переопределите для наследника 
этот метод, после запуска обратите внимание на изменение поведения.
Создайте перегруженный метод выдачи товаров Торговым Автоматом дополнив дополнительно выходным параметром 
(пример: getProduct(String name)) выдающий товар по имени, создайте метод возвращающий товар по имени и какоу-либо 
параметру товара getProduct(String name. int volume)

# **ДЗ:**
Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать перегруженный метод getProduct(int name, int volume, int temperature), выдающий продукт соответствующий имени, объёму и температуре
В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику, заложенную в программе
Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

## Решение:
* Реализован класс HotDrink наследуемый от BottleOfWater (можно было наследоваться от абстрактного класса Product, но тогда бы нужно было дополнительно прописывать поле volume и методы getVolume и setVolume, которые уже реализованы в крассе  BottleOfWater).

* Реализован класс HotOfDrinkVendingMachine наследуемый от VendingMachine.

* Доработан клиентский код.
