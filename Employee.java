    import java.util.Scanner; 

    class Employee
    {
        int Id;
        String Name;
        String Designation;
        int Age;
        long Salary;

        Employee()            
        {
            Id = 1;
            Name = "Conor MCgregor";
            Designation ="CEO";
            Age = 30;
            Salary = 999999;
        }

        void PutData()
        {
            System.out.print("\n\tEmployee Id     : "+Id);
            System.out.print("\n\tEmployee Name   : "+Name);
           System.out.print("\n\tDesignation Name   : "+Designation);

            System.out.print("\n\tEmployee Age    : "+Age);
            System.out.print("\n\tEmployee Salary : "+Salary);
        }

        public static void main(String args[])
        {

            Employee E = new Employee(); 

            E.PutData();          

        }
    }

 