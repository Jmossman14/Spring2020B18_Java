package Day39_AccessModifiers;

public class EmployeeObjects {
    public static void main(String[] args) {
        //create objects to test the functions of Employee_WarmUp class:
        Employee_WarmUp employee1 = new Employee_WarmUp("Judy");
        System.out.println(employee1);//Name: Judy, Job Title: null, ID: 0, salary: $0.0

        Employee_WarmUp employee2 = new Employee_WarmUp("Judy","QA Tester");
        System.out.println(employee2);//Name: Judy, Job Title: QA Tester, ID: 0, salary: $0.0

        Employee_WarmUp employee3 = new Employee_WarmUp("Judy","QA Tester",12345);
        System.out.println(employee3);//Name: Judy, Job Title: QA Tester, ID: 12345, salary: $0.0

        Employee_WarmUp employee4 = new Employee_WarmUp("Judy","QA Tester",123456,120000);
        System.out.println(employee4);//Name: Judy, Job Title: QA Tester, ID: 123456, salary: $120000.0

    }
}
