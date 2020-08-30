/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tcs.main;

import java.awt.Desktop;
import java.net.URI;
import java.util.List;

/**
 *
 * @author Tadeu-PC
 */
public class BrowserUtils {

    public static void open(String url) {
        try {
            Desktop desktop = Desktop.getDesktop();
            desktop.browse(URI.create(url));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void open(List<String> urls) {
        try {
            Desktop desktop = Desktop.getDesktop();
            for (String url : urls) {
                desktop.browse(URI.create(url));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void open(String[] urls) {
        try {
            Desktop desktop = Desktop.getDesktop();
            for (String url : urls) {
                desktop.browse(URI.create(url));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
