package atguigu.g.commonclass.c1;

import org.junit.Test;

/**
 * @author Wint
 * @create 2022-06-22 12:11
 */
public class StringDemo {
    /*
    将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为”abfedcg”
     */
    //方式一：转换为char[]
    public String reverse(String str, int startIndex, int endIndex) {
        if(str != null){
            char[] chars = str.toCharArray();
            for(int x = startIndex,y = endIndex; x < y ; x++,y--){
                char temp = chars[x];
                chars[x] = chars[y];
                chars[y] = temp;
            }
            return new String(chars);
        }
        return null;
    }

    //方式二：使用String的拼接
    public String reverse1(String str, int startIndex, int endIndex) {
        if (str != null){
            String str1 = str.substring(0,startIndex);
            for (int i = endIndex ; i >= startIndex ; i--){
                str1 += str.charAt(i);
            }
            str1 += str.substring(endIndex + 1,str.length());
            return str1;
        }
        return null;
    }

    //方式三：使用StringBuffer/StringBuilder替换String
    public String reverse2(String str, int startIndex, int endIndex) {
        if(str != null){
            StringBuilder stringBuilder = new StringBuilder(str.length());
            stringBuilder.append(str.substring(0,startIndex));
            for (int i = endIndex ; i >= startIndex ; i--){
                stringBuilder.append(str.charAt(i));
            }
            stringBuilder.append(str.substring(endIndex + 1));
            return new String(stringBuilder);
        }
        return null;

    }

    @Test
    public void testReverse() {
        String str = "abcdefg";
        String reverse = reverse2(str, 2, 5);
        System.out.println(reverse);
    }
}
