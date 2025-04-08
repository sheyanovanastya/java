class SubClassOne {
    private int value;
    SubClassOne() {}
    SubClassOne(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
    void setValue (int value) {
        this.value = value;
    }

    void showValue (int val) {
        System.out.println("Method" + val);
    }

    void showValue (double val) {
        System.out.println("Overridden method" + val);
    }

    static void display() {
        System.out.println("SubClassOne");
    }
}