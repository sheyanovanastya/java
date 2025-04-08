class SubClassTwo {
    private String name;
    SubClassTwo (){}
    SubClassTwo (String name){
        this.name = name;
    }

    String getName(){
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    void showName(String nm) {
        System.out.println("Name: " +nm);
    }
    void showName(int number) {
        System.out.println("Number: " +number);
    }

    static void display() { System.out.println("SubClassTwo"); }

    void useOtherClassData(SubClassOne one, SubClassThree three) {
        System.out.println("SubClassOne value: " + one.getValue() + ", SubClassThree value: " + three.getNumber());
    }
}