Scanner vv = new Scanner(System.in);

        System.out.print("Enter the employee name: ");
        String name = vv.nextLine();

        System.out.print("Enter the  employee id: ");
        long employeeid = vv.nextLong();

        System.out.print("Enter the  employee salary: ");
        long salary = vv.nextLong();

        System.out.println("Enter the  employee department: ");
        String department = vv.nextLine();    
        
        System.out.println("Enter the  employee designation: ");
        String designation = vv.nextLine();
        
        System.out.println(" employee  Name: " + name);
        System.out.println(" employee employeeid: " + employeeid);
        System.out.println(" employee salary: " + salary);
        System.out.println(" employee department: " + department);
        System.out.println(" employee designation: " + designation);
