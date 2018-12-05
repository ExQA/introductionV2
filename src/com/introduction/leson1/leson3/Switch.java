package com.introduction.leson1.leson3;

public class Switch {
    public static void main(String [] args) {

        int mounthNumber = 0;
        String mounth = "August";
                switch (mounth.toLowerCase()) {
                    case "january":
                        mounthNumber = 1;
                        break;
                    case "february":
                        mounthNumber = 2;
                        break;
                    case "march":
                        mounthNumber = 3;
                        break;
                    case "april":
                        mounthNumber = 4;
                        break;
                    case "may":
                        mounthNumber = 5;
                        break;
                    case "june":
                        mounthNumber = 6;
                        break;
                    case "jul":
                        mounthNumber = 7;
                        break;
                    case "august":
                        mounthNumber = 8;
                        break;
                    case "september":
                        mounthNumber = 9;
                        break;
                    case "oktober":
                        mounthNumber = 10;
                        break;
                    case "november":
                        mounthNumber = 11;
                        break;
                    case "december":
                        mounthNumber = 12;
                        break;
                    default:
                        mounthNumber = 0;
                        break;
                }

                if (mounthNumber != 0){

                    System.out.println(mounthNumber);

                } else {

                    System.out.println("invalid month");
                }
    }
}
