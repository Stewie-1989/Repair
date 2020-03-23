package ru.repair.work.model;

import javax.persistence.*;

@Entity
@Table
public class Surface {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private int length;

    @Column
    private int width;

    @OneToOne
    private Room roomId;

    @Enumerated
    private SurfaceName surfaceName;

    public void setId(long id) {
        this.id = id;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setRoomId(Room roomId) {
        this.roomId = roomId;
    }

    public void setSurfaceName(SurfaceName surfaceName) {
        this.surfaceName = surfaceName;
    }

    public long getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public Room getRoomId() {
        return roomId;
    }

    public SurfaceName getSurfaceName() {
        return surfaceName;
    }
}
