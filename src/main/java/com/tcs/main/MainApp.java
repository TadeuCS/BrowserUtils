package com.tcs.main;

import java.util.Arrays;

public class MainApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        List<String> urls = new ArrayList<>();
//        urls.add("https://www.google.com.br/maps/dir/-18.5881435,-46.4866692/Patroc%C3%ADnio,+MG,+38740-000/@-18.763515,-46.8723614,11z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x94afba83e5e96d81:0x649f047e8c0afaf5!2m2!1d-46.9942511!2d-18.9380278");
//        urls.add("https://chat.movidesk.com/ChatWidget/Landing/9A7457EF2A664205BCB523769766DE26");
//        urls.add("https://www.loom.com/share/6104d781b6534e898613a09a5d301667");
        System.out.println(Arrays.toString(args));
        BrowserUtils.open(args);
    }
}
