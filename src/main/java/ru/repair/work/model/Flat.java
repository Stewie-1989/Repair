package ru.repair.work.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Flat {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private long userId;

    @Column
    private int roomNumber;

    @OneToMany
    private List<Room> rooms;

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getUserId() {
        return userId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public List<Room> getRooms() {
        return rooms;
    }
}
