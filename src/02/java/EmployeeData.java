class EmployeeData {
    private double base_pay_;
    private int hour_worked_;
    EmployeeData(double base_pay, int hour_worked){
        this.base_pay_ = base_pay;
        this.hour_worked_ = hour_worked;
    }
    double getBasePay(){ return this.base_pay_; }
    int getHourWorked(){ return this.hour_worked_; }
}
