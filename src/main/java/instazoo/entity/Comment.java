package instazoo.entity;

import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Comment {
    private Long id;
    private String title;
    private String caption;
    private String location;
    private Integer likes;

    private Set<String> likedUsers = new HashSet<>();
    private User user;
    private List<Comment> comments = new ArrayList<>();
    private LocalDateTime createdDate;

    @PrePersist
    protected void onCreate() {
        this.createdDate = LocalDateTime.now();
    }
}
