package com.atguigu.reflection;
/**
 * @author Wint
 * @create 2022-06-06 15:34
 */
public class Life<T> {
    private String Life1;
    int Life2;
    protected double Life3;
    public String Life4;
    public Life() {
    }
    public Life(String life1, int life2, double life3, String life4) {
        Life1 = life1;
        Life2 = life2;
        Life3 = life3;
        Life4 = life4;
    }
    public String getLife1() {
        return Life1;
    }
    public void setLife1(String life1) {
        Life1 = life1;
    }
    public int getLife2() {
        return Life2;
    }
    public void setLife2(int life2) {
        Life2 = life2;
    }
    public double getLife3() {
        return Life3;
    }
    public void setLife3(double life3) {
        Life3 = life3;
    }
    public String getLife4() {
        return Life4;
    }
    public void setLife4(String life4) {
        Life4 = life4;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Life life = (Life) o;
        if (Life2 != life.Life2) return false;
        if (Double.compare(life.Life3, Life3) != 0) return false;
        if (Life1 != null ? !Life1.equals(life.Life1) : life.Life1 != null) return false;
        return Life4 != null ? Life4.equals(life.Life4) : life.Life4 == null;
    }
    @Override
    public int hashCode() {
        int result;
        long temp;
        result = Life1 != null ? Life1.hashCode() : 0;
        result = 31 * result + Life2;
        temp = Double.doubleToLongBits(Life3);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (Life4 != null ? Life4.hashCode() : 0);
        return result;
    }
    @Override
    public String toString() {
        return "Life{" +
                "Life1='" + Life1 + '\'' +
                ", Life2=" + Life2 +
                ", Life3=" + Life3 +
                ", Life4='" + Life4 + '\'' +
                '}';
    }
}
