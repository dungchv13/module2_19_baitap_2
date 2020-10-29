public class Test {
    public static void main(String[] args) {
        ValidatePhoneNumber validatePhoneNumber = new ValidatePhoneNumber();
        boolean isVali1 = validatePhoneNumber.validate("(84)-(0978489648)");
        boolean isVali2 = validatePhoneNumber.validate("(a8)-(22222222)");

        System.out.println("(84)-(0978489648) is valid:"+isVali1);
        System.out.println("(a8)-(22222222) is valid:"+isVali2);

    }
}
