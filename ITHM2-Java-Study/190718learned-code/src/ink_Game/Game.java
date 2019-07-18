package ink_Game;
//类可以做成员变量
//接口也可以做成员变量
public class Game {
    public static void main(String[] args) {
        // 创建一个英雄角色
        Hero hero = new Hero();
        // 为英雄起一个名字，并且设置年龄
        hero.setName("盖伦");
        hero.setAge(20);

        // 创建一个武器对象
        Weapon weapon = new Weapon("多兰剑");
        // 为英雄配备武器
        hero.setWeapon(weapon);
        //设置英雄技能
//        hero.setSkill(new SkillImpl()); // 使用单独定义的实现类
        // 还可以改成使用匿名内部类
//        Skill skill = new Skill() {
//            @Override
//            public void use() {
//                System.out.println("Pia~pia~pia~");
//            }
//        };
//        hero.setSkill(skill)
        // 进一步简化，同时使用匿名内部类和匿名对象
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("德玛西亚正义！！");
            }
        });
        // 年龄为20的盖伦用多兰剑攻击敌方。
        hero.attack();

    }
}

