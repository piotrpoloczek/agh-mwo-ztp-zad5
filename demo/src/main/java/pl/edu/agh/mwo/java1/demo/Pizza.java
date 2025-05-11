package pl.edu.agh.mwo.java1.demo;

public class Pizza {
    private final String name;
    private String bakedBy;
    private String deliveredBy;
    private String orderedBy;

    public Pizza(String name) {
        this.name = name;
    }

    public void setBakedBy(String bakedBy) {
        this.bakedBy = bakedBy;
    }

    public void setDeliveredBy(String deliveredBy) {
        this.deliveredBy = deliveredBy;
    }

    public void setOrderedBy(String orderedBy) {
        this.orderedBy = orderedBy;
    }

    public void printHistory() {
        System.out.println("Pizza: " + name);
        System.out.println("Upieczona przez: " + bakedBy);
        System.out.println("Dostarczona przez: " + deliveredBy);
        System.out.println("Zamowiona Przez: " + orderedBy);
    }
}
