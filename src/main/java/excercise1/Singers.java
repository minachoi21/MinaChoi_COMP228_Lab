package excercise1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Singers {
    private int id;
    private String name;
    private String address;
    private Date birthday;
    private int albumsCount;

    public Singers() {
        this.id = 0;
        this.name = "";
        this.address = "";
        this.birthday = new Date();
        this.albumsCount = 0;
    }

    public Singers(int id) {
        this();
        this.id = id;
    }

    public Singers(int id, String name) {
        this(id);
        this.name = name;
    }

    public Singers(int id, String name, String address) {
        this(id, name);
        this.address = address;
    }

    public Singers(int id, String name, String address, Date birthday) {
        this(id, name, address);
        this.birthday = birthday;
    }

    public Singers(int id, String name, String address, Date birthday, int albumsCount) {
        this(id, name, address, birthday);
        this.albumsCount = albumsCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setBirthday(String birthday) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.birthday = dateFormat.parse(birthday);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public int getAlbumsCount() {
        return albumsCount;
    }

    public void setAlbumsCount(int albumsCount) {
        this.albumsCount = albumsCount;
    }

    public void setSinger(int id, String name, String address, Date birthday, int albumsCount) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.birthday = birthday;
        this.albumsCount = albumsCount;
    }

    public void printSinger() {
        System.out.println("ID: " + id + ", Name: " + name + ", Address: " + address + ", Birthday: " + birthday + ", Number of Albums Published: " + albumsCount);
    }
}
