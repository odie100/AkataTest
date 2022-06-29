package com.akata.test;

public class Question2 {

    public static void main(String[] args) throws Exception {
        System.out.println(jourAuFutur(1,7));
    }

    public static String jourAuFutur(Integer J, Integer A) throws Exception {
        String stringDay = "";
        switch ((J + A) % 7) {
            case 0:
                stringDay = "Dimanche";
                break;
            case 1:
                stringDay = "Lundi";
                break;
            case 2:
                stringDay = "Mardi";
                break;
            case 3:
                stringDay = "Mercredi";
                break;
            case 4:
                stringDay = "Jeudi";
                break;
            case 5:
                stringDay = "Vendredi";
                break;
            case 6:
                stringDay = "Samedi";
                break;
            default:
                throw new Exception("Days invalid");
        }
        return stringDay;
    }
}