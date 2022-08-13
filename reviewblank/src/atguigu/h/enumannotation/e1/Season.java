package atguigu.h.enumannotation.e1;

/**
 * @author Wint
 * @create 2022-06-22 12:20
 */
/*
    创建月份枚举类，枚举值包含十二个月份，月份要求用英文单词
 */
enum Season {

    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","冰天雪地");

    private final String seasonName;
    private final String seasonDesc;

    private Season(String seasonName,String seasonDesc){
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
}
