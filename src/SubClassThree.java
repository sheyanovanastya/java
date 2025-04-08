class SubClassThree {
    private double number;

    SubClassThree() {}
    SubClassThree(double number) {
        this.number = number;
    }

    double getNumber() { return number; }
    void setNumber(double number) {
        this.number = number;
    }

    void printInfo(double num) {
        System.out.println("Double: " + num);
    }
    void printInfo(String text) {
        System.out.println("String: " + text);
    }

    static void display() {
        System.out.println("SubClassThree");
    }
}