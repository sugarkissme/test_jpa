package com.example.demo.constant;

public enum Season {

    SPRING("SPRING", "春季"),
    SUMMER("SUMMER", "春季"),
    AUTUMN("AUTUMN", "春季"),
    WINTER("WINTER", "白雪飞扬");
    private final String seasonName;
    private final String SeasonDesc;


    Season(String seasonName, String SeasonDesc) {
        this.seasonName = seasonName;
        this.SeasonDesc = SeasonDesc;
    }
    public  static Integer getPosion(String name){
        for (Season s:Season.values()) {
            if(s.name().equals(name)){
                return  s.ordinal();
            }
        }
        return -1;

    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }


}
