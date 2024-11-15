package com.dailycodework.project.model;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "PreviousPasswords")
public class PreviousPasswords {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "previous_password_id")
    private int previousPasswordId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "old_password", nullable = false)
    private String oldPassword;

    @Column(name = "changed_at", nullable = false)
    private Timestamp changedAt;

    // Getters and Setters
    public int getPreviousPasswordId() {
        return previousPasswordId;
    }

    public void setPreviousPasswordId(int previousPasswordId) {
        this.previousPasswordId = previousPasswordId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getOldPassword() {
        return oldPassword;
    }

    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    public Timestamp getChangedAt() {
        return changedAt;
    }

    public void setChangedAt(Timestamp changedAt) {
        this.changedAt = changedAt;
    }
}
