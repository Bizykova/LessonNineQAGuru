package org.example;

import org.example.arraylist.Zoo;
import org.example.hashmap.Car;
import org.example.hashmap.CarColor;
import org.example.hashset.Task;
import org.example.treeset.Color;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        HashSet<Task> tasks = new HashSet<>();
        tasks.add(new Task("Нарядить елку! "));
        tasks.add(new Task("Купить торт! "));
        tasks.add(new Task("Схоить в театр! "));
        tasks.add(new Task("Нарядить елку! "));
        tasks.add(new Task("Купить торт! "));

        int count = 0;
        while(count < tasks.size()){
            count++;
            System.out.println(tasks);
        }
//
        ArrayList<Zoo> animal = new ArrayList<>();
        animal.add(new Zoo("Бегемот ", "его называют второе по размерам после слона сухопутное животное ", 12));
        animal.add(new Zoo("Жираф ", "парнокопытное млекопитающее, является самым высоким наземным животным ", 17));
        animal.add(new Zoo("Медведь ", " белый медведь - полярный медведь ", 6));
        animal.add(new Zoo("Тигр ", "хищное млекопитающее, один из 5 видов рода пантер ", 8));
        animal.add(new Zoo("Слон ", "самое крупное наземное животное ", 38));

        for (int i = 0; i < animal.size(); i++) {

            if (i == 0) {
                animal.add(0, new Zoo("Заяц ", "маленькое пушистое животное ", 2));
            } else if (i == 2) {
                animal.remove(2);
            }
            System.out.println(animal.get(i));
        }

        TreeSet<Color> colors = new TreeSet<>();
        colors.add(new Color("orange"));
        colors.add(new Color("green"));
        colors.add(new Color("white"));
        colors.add(new Color("blue"));
        colors.add(new Color("yellow"));
        colors.add(new Color("pink"));

        for(Color color: colors){
            System.out.println(color);
        }



        HashMap<String, Car> cars = new HashMap<>();
        cars.put("A987ОО98", new Car("A987ОО98", 122, 1.6, CarColor.BLACK));
        cars.put("Е777МТ77", new Car("Е777МТ77", 163, 1.8, CarColor.BLUE));
        cars.put("А026МТ46", new Car("А026МТ46", 125, 2.0, CarColor.RED));
        cars.put("У026КТ52", new Car("У026КТ52", 101, 1.4, CarColor.WHITE));

        Iterator<Map.Entry<String,Car >> iterator = cars.entrySet().iterator();

        do{

            Map.Entry<String, Car> entry = iterator.next();
            String key = entry.getKey();
            Car value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);

        }
        while (iterator.hasNext());

    }


}
