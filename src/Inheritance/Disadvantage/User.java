package Inheritance.Disadvantage;

public class User
{
    public void doSomething()
    {
        System.out.println("All users");
    }
}

class SuperUser extends User
{
    @Override
    public void doSomething()
    {
        System.out.println("SuperUsers");
    }
}



class FreeUser extends User {
    @Override
    public void doSomething() {
        super.doSomething();        //using additional functionalities while using the original User's method
        System.out.println("Additional FreeUser functionality");
    }
}

class SuperUserSubs extends SuperUser
{
    @Override
    public void doSomething()
    {
        System.out.println("Offers under SuperUser ");
    }
}


/*In inheritance we need to keep in mind that a single class can't inherit from do different class
* because this will lead to diamond problem... JAVA doesn't allow this
*/
