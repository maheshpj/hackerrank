package hackerrank.src.tests;

import java.util.Date;

public class Hosting {

    private int id;
    private String name;
    private Date createdDate;

    public Hosting(int id, String name, Date createdDate) {
        this.id = id;
        this.name = name;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
