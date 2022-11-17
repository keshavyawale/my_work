public class GrandParent {
    String grandfathername;
    String grandmothername;
    GrandParent(String a,String b )
    {
        this.grandfathername=a;
        this.grandmothername=b;
        System.out.println("name of grand father is "+grandfathername);
        System.out.println("name of grand mother is "+grandmothername);

    }
}

class Parent extends GrandParent{
    String father_name;
    String mother_name;
    Parent(String c,String d,String grandfathername,String grandmothername)
    {
        super(grandfathername,grandmothername);
        this.father_name=c;
        this.mother_name=d;
        System.out.println("father name "+father_name);
        System.out.println("mother name "+mother_name);
    }
}
class Child extends Parent{
    public static void main(String[] args) {
        Child ch= (Child) new GrandParent("Eknathrao","chandrabhaga");



    }
}