package structural_patterns.proxy.internet_proxy;

public class RealInternetConnection implements Internet {

    @Override
    public void getInternetAccess(Employee employee) {
        System.out.println("Permission granted for Employee: " + employee.getName());
    }
}
