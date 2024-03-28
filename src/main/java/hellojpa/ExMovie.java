package hellojpa;

import jakarta.persistence.Entity;

@Entity
public class ExMovie extends ExItem {
    private String director;
    private String actor;
}
