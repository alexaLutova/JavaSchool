package ru.rzn.sbt.javaschool.lesson3.decrypt;

public class Solution {
    /**
     * Дешфрование строки
     *
     * Реализуйте метод decrypt, осуществляющий расшифровку сроки encrypted с использованием {@link StringBuilder}.
     *
     * Входящая строка зашифрована следующим образом:
     * а) Зашифрованы только символы латинского алфавита, прочие следует оставлять в исходном виде
     * б) Каждый символ зашифрован ASCII кодом со смещением 9, например 'a' -> 'j'
     * в) После символа 'z' шифрование осуществляется циклически, независимо от регистра символа, например,
     * 'x' -> 'g', 'V' -> 'E'
     *
     * Не забудте проверку на null.
     */
    public static String decrypt(String encrypted){
        if (encrypted==null) return null;
        StringBuilder Stroka=new StringBuilder();
        char[] ArrayStr = encrypted.toCharArray();

        for (int i=0;i<ArrayStr.length;i++) {
            if (ArrayStr[i] >= 'a' & ArrayStr[i] <= 'z') {
                int ascii = (int) ArrayStr[i];
                int newascii = ascii - 9;
                if (newascii < 'a') newascii = 'z' - 'a' + newascii + 1;

                Stroka.append((char) newascii);
                System.out.println("new " + Stroka);
            } else if (ArrayStr[i] >= 'A' & ArrayStr[i] <= 'Z') {

                int ascii = (int) ArrayStr[i];
                int newascii = ascii - 9;
                if (newascii < 'A') newascii = 'Z' - 'A' + newascii + 1;

                Stroka.append((char) newascii);
                System.out.println("new " + Stroka);
            } else {
                Stroka.append(ArrayStr[i]);
            }


        }


      return Stroka.toString();


    }
}
