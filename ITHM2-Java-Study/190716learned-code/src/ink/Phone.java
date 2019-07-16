package ink;

public class Phone {
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
