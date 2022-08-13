package com.atguigu.enumm;

/**
 * @author Wint
 * @create 2022-05-28 20:10
 */
enum Season1 implements Info{

    SPRING("春天","1"){
        @Override
        public void show() {
            System.out.println("打印春天");
        }
    },
    SUMMER("夏天","2"){
        @Override
        public void show() {
            System.out.println("打印夏天");
        }
    },
    AUTUMN("秋天","3"){
        @Override
        public void show() {
            System.out.println("打印秋天");
        }
    },
    WINTER("冬天","4"){
        @Override
        public void show() {
            System.out.println("打印冬天");
        }
    };

    private final String name;
    private final String desc;

    private Season1(String name,String desc){
        this.name = name;
        this.desc = desc;
    }
    public String getName(){
        return name;
    }
    public String getDesc(){
        return desc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("Season");
    }
}
