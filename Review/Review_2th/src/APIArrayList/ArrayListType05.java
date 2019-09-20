package APIArrayList;
/*
    如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。
    基本类型    包装类（引用类型，包装类都位于java.lang包下）
    byte        Byte
    short       Short
    int         Integer     【特殊】
    long        Long
    float       Float
    double      Double
    char        Character   【特殊】
    boolean     Boolean
 */
import java.util.ArrayList;
public class ArrayListType05 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>();
        // ArrayList<int> listB = new ArrayList<>();
        // 错误写法！泛型只能是引用类型，不能是基本类型
        ArrayList<Integer> listC = new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC); // [100, 200]

        int num = listC.get(1);
        System.out.println("第1号元素是：" + num);
    }
}