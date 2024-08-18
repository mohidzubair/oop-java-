
public class Student {
 private String[] address;
 private int id;
 private String name;
 public Student(String[] address,int id,String name ){
     setAddress(address);
     setId(id);
     setName(name);
 }

    public String[] getAddress(int j) {

        return address;
 }


    public void setAddress(String[] address) {
        this.address = address;
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
}
