package GC_collector;

public class GarbageCollectorExample {

    //finilize() will call in between the gc collection process, (we can use it for printing logs)

    public void finalize(){
        System.out.println("finalized method called");
    }

    public static void main(String[] args) {
        // un-used objects
        // un-referenced objects
        // Anonymous objects

        GarbageCollectorExample gc1 = new GarbageCollectorExample();
        GarbageCollectorExample gc2 = new GarbageCollectorExample();
        GarbageCollectorExample gc3 = new GarbageCollectorExample();

        new GarbageCollectorExample(); // anonymous objets

        gc1 = null; // un-referenced objects
        gc2 = gc3; // gc2 becomes un-referenced object

        System.gc(); // so, 3 times finalize() method will be called



    }
}
