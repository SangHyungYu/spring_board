package com.javalec.mysite.vo;

public class UserVO {
private String id;
private String name;
private String password;
private String role;


public String getId() {
   return id;
}
public void setId(String id) {
   this.id = id;
}
public String getName() {
   return name;
}
public void setName(String name) {
   this.name = name;
}
public String getPassword() {
   return password;
}
public void setPassword(String password) {
   this.password = password;
}
public String getRole() {
   return role;
}
public void setRole(String role) {
   this.role = role;
}
@Override
public String toString() {
   return "UesrsVO [id=" + id + ", name=" + name + ", password=" + password + ", role=" + role + "]";
}

}