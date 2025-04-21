//завдання 4
interface IPrinter {
    void print();
}

interface IScanner {
    void scan();
}

interface IFax {
    void fax();
}

class Printer implements IPrinter {
    public void print() {
        System.out.println("Друк...");
    }
}

class MultiFunctionDevice implements IPrinter, IScanner, IFax {
    public void print() {
        System.out.println("Друк з МФУ...");
    }
    public void scan() {
        System.out.println("Сканування...");
    }
    public void fax() {
        System.out.println("Відправка факсу...");
    }
}

public class ISPExample {
    public static void main(String[] args) {
        IPrinter printer = new Printer();
        printer.print();

        MultiFunctionDevice mfd = new MultiFunctionDevice();
        mfd.print();
        mfd.scan();
        mfd.fax();
    }
}
