
public class Main {
    public static void main(String[] args) {
        SubClassOne one1 = new SubClassOne();
        SubClassOne one2 = new SubClassOne(10);

        SubClassTwo two1 = new SubClassTwo();
        SubClassTwo two2 = new SubClassTwo("Hello");

        SubClassThree three1 = new SubClassThree();
        SubClassThree three2 = new SubClassThree(5.5);

        one1.showValue(5);
        one1.showValue(5.5);

        two1.showName("lalal");
        two1.showName(100);

        three1.printInfo(3.14);
        three1.printInfo("Java");

        SubClassOne.display();
        SubClassTwo.display();
        SubClassThree.display();

        two1.useOtherClassData(one2, three2);
    }
}