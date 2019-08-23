package homeWork.lesson1;

import java.util.List;

public class Phone {

    private int selfPhoneNumber;

    public Phone(int phoneNumber) {
        super();
        this.selfPhoneNumber = phoneNumber;
    }

    public Phone() {
        super();
    }

    public int getSelfPhoneNumber() {
        return selfPhoneNumber;
    }

    public void setSelfPhoneNumber(int selfPhoneNumber) {
        this.selfPhoneNumber = selfPhoneNumber;
    }

    public void call(int number, List<Integer> numbersFromNetwork) {

        List<Integer> getNumberlist = numbersFromNetwork;

        for (int i = 0; i < getNumberlist.size(); i++) {

            if (getNumberlist.get(i).equals(number)) {
                System.out.println("Number exist");
            } else if (!getNumberlist.get(i).equals(number)) {
                System.out.println("Such number doesn't exist");
            }
        }
    }
}