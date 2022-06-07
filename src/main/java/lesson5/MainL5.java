package lesson5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class MainL5 {
    public static void main(String[] args) {
        EmployeeEntity employee = new EmployeeEntity.EmployeeEntityBuilder()
                .withFullName("ФИО")
                .withJobTitle("Java ml developer")
                .withEmail("qwerty@ya.ru")
                .withPhoneNumber("88005553535")
                .withSalary("2000$")
                .withAge(27)
                .build();

        CallEmployee callEmployee = new CallEmployee();
        callEmployee.call(employee);

        List<EmployeeEntity> employeeList = new ArrayList<>();
        employeeList.add(employee);
        employeeList.add(new EmployeeEntity.EmployeeEntityBuilder().withFullName("ФИО").withJobTitle("Java jr developer").withEmail("qwerty@ya.ru").withPhoneNumber("88005553535").withSalary("2000$").withAge(19).build());
        employeeList.add(new EmployeeEntity.EmployeeEntityBuilder().withFullName("ФИО").withJobTitle("Java pre-middle developer").withEmail("qwerty@ya.ru").withPhoneNumber("88005553535").withSalary("2000$").withAge(27).build());
        employeeList.add(new EmployeeEntity.EmployeeEntityBuilder().withFullName("ФИО").withJobTitle("Java ml-plus developer").withEmail("qwerty@ya.ru").withPhoneNumber("88005553535").withSalary("2000$").withAge(51).build());
        employeeList.add(new EmployeeEntity.EmployeeEntityBuilder().withFullName("ФИО").withJobTitle("Java sr developer").withEmail("qwerty@ya.ru").withPhoneNumber("88005553535").withSalary("2000$").withAge(42).build());

     //   System.out.println(employeeList.stream().filter(Objects::nonNull).collect(Collectors.toList()));

       // employeeList.stream().filter(employee1 -> employee.age>= 40).forEach(employee1 -> System.out.println(employee1));
        System.out.println(employeeList
                .stream()
                .filter(Objects::nonNull)
                .filter(employee1 -> employee1.getAge()>= 40)
                .collect(Collectors.toList()));
    }
}
