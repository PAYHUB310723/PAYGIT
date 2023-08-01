package com.demo.funda;
//INSTANT PRACTICE : STORE ANY 5 LANGUAGES IN ENUM AND PRINT THEM.
public class EnumEx {
    public static void main(String[] args) {
            ACSetting setting = ACSetting.AUTO;
            System.out.println(setting);
            String settingApplied = setting.toString();
            System.out.println(settingApplied);
            try {
                ACSetting setting1 = ACSetting.valueOf("TURBOs");
                System.out.println(setting1);
            } catch(IllegalArgumentException illegalArgumentException) {
                System.out.println("Wrong Setting TURBOs. Please select the correct one!");
            }


            System.out.println(ACSetting.COOL);
    }
}

enum ACSetting {
    FAN, DRY, COOL, AUTO, TURBO
}