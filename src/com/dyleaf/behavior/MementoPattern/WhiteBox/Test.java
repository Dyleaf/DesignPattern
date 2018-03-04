package behavior.MementoPattern.WhiteBox;

public class Test {
    public static void main(String[] args) {

        int state = 3;
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState(state);
        /**
         * 创建备忘录对象的 缓存起来
         */
        caretaker.saveMemento(originator.creatMementoObject());
        /*
         * 进行设置重新还原
         */
        originator.setState(5);
        System.out.println("发起人更改状态：" + originator.getState());

        originator.restoreMemento(caretaker.retrieveMemento());

    }
}
