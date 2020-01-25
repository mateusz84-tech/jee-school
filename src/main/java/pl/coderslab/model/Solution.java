package pl.coderslab.model;

import java.time.LocalDateTime;

public class Solution {
    private int id;
    private int exercise_id;
    private int users_id;
    private String desription;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Solution(int exercise_id, int users_id, String desription, LocalDateTime created, LocalDateTime updated){
        this.exercise_id = exercise_id;
        this.users_id = users_id;
        this.desription = desription;
        this.created = created;
        this.updated = updated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExercise_id() {
        return exercise_id;
    }

    public void setExercise_id(int exercise_id) {
        this.exercise_id = exercise_id;
    }

    public int getUsers_id() {
        return users_id;
    }

    public void setUsers_id(int users_id) {
        this.users_id = users_id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }

    public String getDesription() {
        return desription;
    }

    public void setDesription(String desription) {
        this.desription = desription;
    }

    @Override
    public String toString() {
        return "Solution{" +
                "id=" + id +
                ", exercise_id=" + exercise_id +
                ", users_id=" + users_id +
                ", desription='" + desription + '\'' +
                ", created=" + created +
                ", updated=" + updated +
                '}';
    }
}
