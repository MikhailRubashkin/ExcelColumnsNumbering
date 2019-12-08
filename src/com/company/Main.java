package com.company;


class Main {
    public static String ExelColumn(int i) {
        StringBuilder stringBuilder = new StringBuilder();
        while (i > 0) {
            int count = (i - 1) % 26;
            stringBuilder.append((char) (count + 'A'));
            i = (i - 1) / 26;
        }
        return stringBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        for (int r = 0; r < 100; r++)
            System.out.println(r + " " + ExelColumn(r));
    }
}


