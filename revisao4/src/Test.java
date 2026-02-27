public class Test {

    public static void main(String[] args){

        Person Laura = new Person();

        Laura.name = "Laura";
        Laura.age = 20;
        Laura.gender = "F";
        Laura.height = 1.70f;
        Laura.weight = 67;

        Laura.eat();
        Laura.study();
        Laura.sleep();

        Person Rose = new Person();

        Rose.name = "Rose";
        Rose.age = 50;
        Rose.gender = "F";
        Rose.height = 1.64f;
        Rose.weight = 75;

        Rose.eat();
        Rose.study();
        Rose.sleep();

        Person Ni = new Person();

        Ni.name = "Ni";
        Ni.age = 55;
        Ni.gender = "M";
        Ni.height = 1.72f;
        Ni.weight = 83;

        Ni.eat();
        Ni.study();
        Ni.sleep();

    }

}
