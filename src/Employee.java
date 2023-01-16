public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    int bonus;
    double salaryIncrease;

    Employee(String name, double salary, int workHours, int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    void tax(){

        if (this.salary>1000) {
            this.tax = (this.salary) * 0.03;
        }

    }

    void bonus(){
        int extraHours=this.workHours-40;
        if (this.workHours>40){
            this.bonus=extraHours*30;
        }
    }

    void raiseSalary(){
        int workYear=2021-this.hireYear;
        if(workYear<10){
            this.salaryIncrease=this.salary*0.05;
        } else if (workYear>9&&workYear<20) {
            this.salaryIncrease+=this.salary*0.1;
        } else if (workYear>19) {
            this.salaryIncrease+=this.salary*0.15;
        }
    }

    public String toString(){
        tax();
        bonus();
        raiseSalary();
        System.out.println("Name: "+this.name);
        System.out.println("Salary:* "+this.salary);
        System.out.println("Work hours:* "+this.workHours);
        System.out.println("Hire Year: "+this.hireYear);
        System.out.println("Salary tax:* "+this.tax);
        System.out.println("Bonus:* "+this.bonus);
        System.out.println("Salary increase: "+this.salaryIncrease);
        System.out.println("Salary with tax and bonus:* "+(this.salary+this.bonus-this.tax));
        System.out.println("Total salary:* "+(this.salary-this.tax+this.bonus+this.salaryIncrease));
        System.out.println("*weekly");
        return null;
    }

}
