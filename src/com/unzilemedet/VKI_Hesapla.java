package com.unzilemedet;

import java.util.Scanner;

public class VKI_Hesapla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy, kilo, vki;

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        boy = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = input.nextDouble();

        vki = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + vki);

    }
}