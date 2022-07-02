package chap06.section3;

public class KCustomerAccess {
    public static void main(String[] args) {
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();

        KJob kjob = KCustomer.job;
        System.out.println(kjob.getTitle());

        kjob.setTitle("Accountant");
        System.out.println(kjob.getTitle());
    }
}
