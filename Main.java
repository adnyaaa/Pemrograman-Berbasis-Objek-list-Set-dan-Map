//2105551099 NI PUTU ADNYA PUSPITA DEWI
//Contoh List, Set, Map
package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Deklarasi list
        ArrayList<String> list = new ArrayList<>();
        //Memasukkan objek
        list.add("Senin");
        list.add("Selasa");
        list.add("Rabu");
        list.add("Kamis");
        list.add("Jumat");
        list.add("Sabtu");
        list.add("Rabu");
        list.add("Minggu");
        System.out.println("Menampilkan List");
        System.out.println(list);

        //Deklarasi Set
        Set<String> set = new TreeSet<String>();
        // Memasukkan Objek
        set.add("345");
        set.add("123");
        set.add("213");
        set.add("345");
        System.out.println("Menampilkan Set");
        System.out.println(set);

        //Deklarasi Map
        Map <String, String> map = new TreeMap<String, String>();
        //Memasukkan Objek
        map.put("2105551001","Sinta");
        map.put("2105551032","Aldo");
        map.put("2105551019","Anfi");
        map.put("2105551099","Nana");
        System.out.println("Menampilkan Map");
        System.out.println(map);

    }
}
