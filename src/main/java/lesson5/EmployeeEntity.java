package lesson5;

import lombok.Data;

@Data
public class EmployeeEntity {
    public String fullName;
    public String jobTitle;
    public String email;
    public String phoneNumber;
    public String salary;
    public int age;

    public static final class EmployeeEntityBuilder {
        public String fullName;
        public String jobTitle;
        public String email;
        public String phoneNumber;
        public String salary;
        public int age;

        public EmployeeEntityBuilder() {
        }

        public static EmployeeEntityBuilder anEmployeeEntity() {
            return new EmployeeEntityBuilder();
        }

        public EmployeeEntityBuilder withFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }

        public EmployeeEntityBuilder withJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
            return this;
        }

        public EmployeeEntityBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public EmployeeEntityBuilder withPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public EmployeeEntityBuilder withSalary(String salary) {
            this.salary = salary;
            return this;
        }

        public EmployeeEntityBuilder withAge(int age) {
            this.age = age;
            return this;
        }

        public EmployeeEntity build() {
            EmployeeEntity employeeEntity = new EmployeeEntity();
            employeeEntity.setFullName(fullName);
            employeeEntity.setJobTitle(jobTitle);
            employeeEntity.setEmail(email);
            employeeEntity.setPhoneNumber(phoneNumber);
            employeeEntity.setSalary(salary);
            employeeEntity.setAge(age);
            return employeeEntity;
        }
    }
}
