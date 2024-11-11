package ANIMAL;

import java.util.ArrayList;

public class AnimalsList {
    public ArrayList<Animals> AnimalsLists;

    public AnimalsList() {
        this.AnimalsLists = new ArrayList<Animals>();
    }
    
    public AnimalsList(ArrayList<Animals> AnimalsLists) {
        
        this.AnimalsLists = AnimalsLists;
    }
    
    public void them(Animals Animals) {
        this.AnimalsLists.add(Animals);
    }

    public void Show() {
        System.out.println(String.format("%-12s %-20s %-15s %-15s %-15s %-15s %-20s %-20s %-20s", "Ma Vat Nuoi", "Ten Vat Nuoi", "Loai Vat Nuoi","Loai thuc an", "Trong luong(kg)", "So luong(con)", "San luong Sua(l)","So Luong Trung","San luong Thit(kg)"));
        for (Animals animals : AnimalsLists) {
            System.out.println(animals.toString());
        }
    }
    
    public void remove(Animals animals) {

        this.AnimalsLists.remove(animals);
    }

    public void Search(String name) {
        for (Animals animals : AnimalsLists) {
            if (animals.getname().indexOf(name)>=0) {
                System.out.println(animals.toString());
            }
        }
    }

}
