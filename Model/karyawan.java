package Model;

public class karyawan{
    private String name, address,id,email, gender, category, phone;


public karyawan(String name, String address,String id, String email, String phone, String gender, String category) {
    this.name = name;
    this.address = address;
    this.gender = gender;
    this.id = id;
    this.email = email;
    this.phone = phone;
    this.category = category;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name; 
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }


}

