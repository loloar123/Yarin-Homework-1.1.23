package date_01_01_23oop.HW;

public class Main {
    public static void main(String[] args) {
        Builder user = new Builder(21,1.8,"Naor");
        Builder halfUser = new Builder(21,1.8);
        Builder guest = new Builder();
        Builder copyUser = new Builder(user);

//        user = halfUser;

        System.out.println(user.toString());
        System.out.println(halfUser.toString());
        System.out.println(guest.toString());
        System.out.println(copyUser.toString());
        copyUser.setAge(14);
        System.out.println(copyUser.toString());
    }
}
