package ink_Set2;
/*
    哈希表=数组+链表/红黑树
    数组找相同哈希值的那一组元素
    链表/红黑树找相同哈希值中要找的那个元素
    链表长度超过8位就会转换为红黑树
    哈希表的特点：查询速度快
    Set集合不允许存储重复元素的原理
    前提：存储的元素必须重写hashCode方法和equals方法
 */
import java.util.HashSet;
public class HashSetSaveString03 {
    public static void main(String[] args) {
        //创建HashSet集合对象
        HashSet<String> set = new HashSet<>();
        String s1 = new String("abc");
        String s2 = new String("abc");
        set.add(s1);
        //哈希值96354 没有 直接存储在集合中
        set.add(s2);
        //哈希值96354 有（哈希冲突） 会调用s2.equals(s1)
        //返回true认定两个元素相同 就不会存储了
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]
    }
}
