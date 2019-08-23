package homeWork.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Network {

    public List<Integer> numberList;

    public Network() {
        super();
    }


    public void registerNumber(int number) {
        numberList = new ArrayList<Integer>();
        numberList.add(number);
    }

    public List <Integer> getNumberList() {
        System.out.println("Gets the list" + numberList.size());
        return numberList;

    }
}
