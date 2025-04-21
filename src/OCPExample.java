//завдання 2
interface CustomerDiscount {
    double getDiscount();
}

class RegularCustomer implements CustomerDiscount {
    public double getDiscount() {
        return 0;
    }
}

class LoyalCustomer implements CustomerDiscount {
    public double getDiscount() {
        return 10;
    }
}

class VipCustomer implements CustomerDiscount {
    public double getDiscount() {
        return 20;
    }
}

class PartnerCustomer implements CustomerDiscount {
    public double getDiscount() {
        return 15;
    }
}

class DiscountService {
    public void printDiscount(CustomerDiscount customer) {
        System.out.println("Знижка: " + customer.getDiscount() + "%");
    }
}

public class OCPExample {
    public static void main(String[] args) {
        DiscountService service = new DiscountService();
        service.printDiscount(new VipCustomer());
        service.printDiscount(new PartnerCustomer());
    }
}
