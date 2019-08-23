package homeWork.lesson1;

public class PhoneMain {


    public static void main(String[] args) {

        Phone phone = new Phone();
        Network network = new Network();

        phone.setSelfPhoneNumber(123456789);
        network.registerNumber(phone.getSelfPhoneNumber());
        phone.call(213456789, network.getNumberList());
        phone.call(123456789, network.getNumberList());
    }
}
