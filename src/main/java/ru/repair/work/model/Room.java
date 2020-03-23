package ru.repair.work.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Room {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private long flatId;

    @Column
    private int sideNumber;

    @OneToMany
    private List<Surface> surfaces;

    public void setId(long id) {
        this.id = id;
    }

    public void setFlatId(long flatId) {
        this.flatId = flatId;
    }

    public void setSideNumber(int sideNumber) {
        this.sideNumber = sideNumber;
    }

    public void setSurfaces(List<Surface> surfaces) {
        this.surfaces = surfaces;
    }

    public long getId() {
        return id;
    }

    public long getFlatId() {
        return flatId;
    }

    public int getSideNumber() {
        return sideNumber;
    }

    public List<Surface> getSurfaces() {
        return surfaces;
    }
}
