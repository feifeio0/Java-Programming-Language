package Extends;
class OldPhone {
    public void call() {
        System.out.println("打电话");
    }
    public void send() {
        System.out.println("发短信");
    }
    public void show() {
        System.out.println("显示号码");
    }
}
class NewPhone extends OldPhone{
    @Override
    public void show() {
        super.show(); // 把父类的show方法拿过来重复利用
        // 自己子类再来添加更多内容
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }
}
public class ExtendsSuperAdd04 {
    public static void main(String[] args) {
        OldPhone phone = new OldPhone();
        phone.call();//打电话
        phone.send();//发短信
        phone.show();//显示号码
        System.out.println("==========");
        NewPhone newPhone = new NewPhone();
        newPhone.call();//打电话
        newPhone.send();//发短信
        newPhone.show();//显示号码 显示姓名 显示头像
    }
}
