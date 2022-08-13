package atguigu.d.objective.obj15;

/**
 * @author Wint
 * @create 2022-06-22 11:08
 */
/*
 * interface CompareObject{
	public int compareTo(Object o);
	//若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
 }
 */
public interface CompareObject {
    //若返回值是 0 , 代表相等; 若为正数，代表当前对象大；负数代表当前对象小
    public int compareTo(Object o);
}
