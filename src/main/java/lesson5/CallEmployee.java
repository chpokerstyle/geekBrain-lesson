package lesson5;

public class CallEmployee {
    //ФИО, должность, email, телефон, зарплата, возраст

    EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
    public void call(EmployeeEntity employee){
        var call = employeeService.getEmployeeToTerminal(employee);
        System.out.println(call);
    }
}
