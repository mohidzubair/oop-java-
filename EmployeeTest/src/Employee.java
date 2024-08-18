public class Employee {
    private String name;
    int employeeId;
    String employeeName;
    private Address employeeAddress;

    public Employee(int employeeId,Address employeeAddress){
        this.employeeId=employeeId;
        setEmployeeAddress(employeeAddress);
    }

    public Address getEmployeeAddress(){
        return employeeAddress;
    }
    public void setEmployeeAddress(Address employeeAddress){
        this.employeeAddress=employeeAddress;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}
