
public class MultilevelInheritance {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println("Accessing inherited and own methods from Son object:\n");
        son.company();  
        son.car();          
        son.ownProperty();   
    }
}

class Grandfather {
    void company() {
        System.out.println("Grandfather's company: Haque's Ltd");
    }
}

class Father extends Grandfather {
    void car() {
        System.out.println("Father's car: BMW");
    }
}

class Son extends Father {
    void ownProperty() {
        System.out.println("Son's property: Earphones");
    }
}
