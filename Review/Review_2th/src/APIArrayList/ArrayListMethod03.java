package APIArrayList;
/*
    ArrayList当中的常用方法
 */
import java.util.ArrayList;
public class ArrayListMethod03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list); // []

        // public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。
        // 返回值代表添加是否成功，其他的不一定成功。
        boolean success = list.add("柳岩");
        System.out.println(list); // [柳岩]
        System.out.println("添加的动作是否成功：" + success); // true

        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        list.add("贾乃亮");
        System.out.println(list); // [柳岩, 高圆圆, 赵又廷, 李小璐, 贾乃亮]

        // public E get(int index)：从集合当中获取元素，参数是从0开始索引编号。
        // 返回值就是对应位置的元素。
        String name = list.get(2);
        System.out.println("第2号索引位置：" + name); // 赵又廷

        // public E remove(int index)：从集合当中删除元素，参数是从0开始索引编号。
        // 返回值就是被删除掉的元素。
        String whoRemoved = list.remove(3);
        System.out.println("被删除的人是：" + whoRemoved); // 李小璐
        System.out.println(list); // [柳岩, 高圆圆, 赵又廷, 贾乃亮]

        // public int size()：获取集合的尺寸长度。
        // 返回值是集合中包含的元素个数。
        int size = list.size();
        System.out.println("集合的长度是：" + size);
    }
}
