package structural_patterns.proxy.internet_proxy;

public class InternetProxy implements Internet {

    @Override
    public void getInternetAccess(Employee employee) {
        if (employee.getSecurityLevel() > 5) {
            new RealInternetConnection().getInternetAccess(employee);
        } else {
            System.out.println("Permission denied for this employee.");
        }
    }
}
