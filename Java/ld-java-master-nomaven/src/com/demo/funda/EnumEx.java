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

//            Using numbers with enum
        ACSetting1 acSetting1 = ACSetting1.FAN;
        System.out.println("New : " + acSetting1);
        int setting5 = acSetting1.getSetting();
        System.out.println(acSetting1+ "(" + setting5 + ")");
        System.out.println(setting5);

        ACSetting2 acSetting2 = ACSetting2.DRY;
        System.out.println(acSetting2.getSetting());

        int setting7 = ACSettings.FAN;
        System.out.println(setting7);
        String setting8 = ACSettings.DRY;
        System.out.println(setting8);
    }
}

enum ACSetting {
    FAN, DRY, COOL, AUTO, TURBO
}

enum ACSetting1 {
    FAN(7), DRY(2), COOL(3), AUTO(4), TURBO(99);
    private int setting;
    ACSetting1(int pSetting) {
        setting = pSetting;
    }
    public int getSetting(){
        return setting;
    }
}

enum ACSetting2 {
    FAN(true), DRY(false);
    private boolean setting;
    ACSetting2(boolean pSetting) {
        setting = pSetting;
    }
    public boolean getSetting(){
        return setting;
    }
}

class ACSettings {
    public static int FAN = 8;
    public static String DRY = "D";
}