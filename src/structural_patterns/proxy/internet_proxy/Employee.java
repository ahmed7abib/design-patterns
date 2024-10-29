package structural_patterns.proxy.internet_proxy;

public class Employee {
    private final String name;
    private final int securityLevel;

    public Employee(EmployeeBuilder employeeBuilder) {
        this.name = employeeBuilder.name;
        this.securityLevel = employeeBuilder.securityLevel;
    }

    public String getName() {
        return name;
    }

    public int getSecurityLevel() {
        return securityLevel;
    }

    public static class EmployeeBuilder {
        private String name;
        private int securityLevel;

        public EmployeeBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public EmployeeBuilder setSecurityLevel(int securityLevel) {
            this.securityLevel = securityLevel;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
