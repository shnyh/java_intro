public class FooCorporation {
    public static void main(String[] arguments) {
        final EmployeeData employee1 = new EmployeeData(7.50, 35);
        final EmployeeData employee2 = new EmployeeData(8.20, 47);
        final EmployeeData employee3 = new EmployeeData(10.00, 73);

        System.out.println("employee1: " + calcTotalPay(employee1));
        System.out.println("employee2: " + calcTotalPay(employee2));
        System.out.println("employee3: " + calcTotalPay(employee3));
    }
    private static String calcTotalPay(EmployeeData employeeData){
        String res;
        final double minWage = 8.00;
        if ( employeeData.getHourWorked() >= 60 || employeeData.getBasePay() < minWage ){
            res = "error";
        }
        else {
            res = String.valueOf(Math.min(40, employeeData.getHourWorked()) * employeeData.getBasePay() + Math.max(0, employeeData.getHourWorked()-40)*employeeData.getBasePay()*1.5);
        }
        return res;
    }
}
