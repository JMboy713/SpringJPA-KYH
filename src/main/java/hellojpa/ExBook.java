package hellojpa;

import jakarta.persistence.Entity;

@Entity
public class ExBook extends ExItem {
    private String author;
    private String isbn;
}
