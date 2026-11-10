1. Encapsulation: Hiding Info/Data (Data-> Private and Public Setter and Getter)
2. Inheritance: Code written in parent classes can be reused by Child Classes.
3. Abstraction: Hiding the implementation (Core Logic) and expose the required functionalities.
4. Polymorphism: - It will allow us to perform same functionalities in different way.
                 - Same method will behave differently based on the object type.(Situation)
                 - Method Overring is a example of runtime polymorphism.
****************************************************


// Valid downcasting
User u1 = new AdminUser();
AdminUser a1 = (AdminUser) u1;

// Invalid downcasting
User u2 = new User();
AdminUser a2 = (AdminUser) u2;


****************************************************

class User {
void userClass() {
System.out.println("User");
}
}

class AdminUser extends User {
void adminClass() {                                    //downcasting
System.out.println("AdminUser");                       User u = new SuperAdmin();
}                                                      AdminUser a = (AdminUser) u;
}                                                      SuperAdmin s = (SuperAdmin) u;

class SuperAdmin extends AdminUser {
void superAdminClass() {
System.out.println("SuperAdmin");
}
}

Invalid downcasting:
User u = new AdminUser();
SuperAdmin s = (SuperAdmin) u;
Because the actual object is an AdminUser not a SuperAdmin

****************************************************

Object Class: equals, hashCode(), wait(), notify()

****************************************************

S O L I D :
S: Single Resposibility 
O: Open/Close --> Open for extension, closed for modification. 

