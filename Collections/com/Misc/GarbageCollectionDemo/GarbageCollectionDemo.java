package com.Misc.GarbageCollectionDemo;

public class GarbageCollectionDemo {
    public static void main(String[] args) throws InterruptedException{
        GarbageCollectionDemo obj1 = new GarbageCollectionDemo();
        GarbageCollectionDemo obj2 = new GarbageCollectionDemo();

        System.gc();
        obj2 = null;
    }    

    protected void finalized() throws Throwable
    {
        System.out.println("Garbage collector: ");
        System.out.println("Garbage collected object: "+this);
    }
}
