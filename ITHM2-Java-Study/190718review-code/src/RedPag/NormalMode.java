package RedPag;
/**
 * 请将totalMoney分成count份，保存到ArrayList<Integer>中，返回即可。
 *
 * @param totalMoney            总金额为方便计算，已经转换为整数，单位为分。
 * @param totalCount            红包个数
 * @return ArrayList<Integer>	元素为各个红包的金额值，所有元素的值累和等于总金额。
 */
import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();

        int avg = totalMoney / totalCount; // 平均值
        int mod = totalMoney % totalCount; // 余数，模，零头

        // 注意totalCount - 1代表，最后一个先留着
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);
        }

        // 有零头，需要放在最后一个红包当中
        list.add(avg + mod);

        return list;
    }
}
