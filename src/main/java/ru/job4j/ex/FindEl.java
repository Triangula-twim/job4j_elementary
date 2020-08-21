package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        int iterator = 0;
        /* for-each */
        for (String el: value
             ) {
            if (el.equals(key)) {
                rsl = iterator;
            }
            iterator++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found.");
        }
        return rsl;
    }

    public static void main(String[] args) {
        try {
            indexOf(new String[]{"one", "two"}, "two");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
