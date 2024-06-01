package demo;

import demo.model.User;

public class Main{
    public static void main(String[] args) {
        Communication com = new Communication();
        System.out.println(com.getAll());
        User userAdd = new User(3L, "James", "Brown", (byte) 37);
        System.out.println(com.post(userAdd));
        User userEdit = new User(3L, "Thomas", "Shelby", (byte) 32);
        System.out.println(com.put(userEdit));
       /* System.out.println(com.delete(userEdit.getId()));*/
    }
}