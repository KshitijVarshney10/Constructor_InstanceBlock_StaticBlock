/* Design a java program to display the number of instances created so far of a specific class.*/

public class NoOfInstances {
    static int noOfObjects = 0;

    {
        noOfObjects += 1;
    }
    public NoOfInstances() {
    }

    public NoOfInstances(int n) {
    }

    public NoOfInstances(String s) {
    }

    public static void main(String args[]) {
        NoOfInstances obj1 = new NoOfInstances();
        NoOfInstances obj2 = new NoOfInstances(10);
        NoOfInstances obj3 = new NoOfInstances("Kshitij");

        // t1.noOfObjects or t2.noOfObjects or t3.noOfObjects
        System.out.println(NoOfInstances.noOfObjects);
    }
}