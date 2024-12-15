/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package controller; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.*;
import model.*;
import view.UserView;

public class UserController { 
    private UserView view;
    private UserMapper mapper;
    
    public UserController (UserView view, UserMapper mapper) {
    this.view =  view;
    this.mapper = mapper;
    this.view.addAddUserListener(new AddUserListener()); 
    this.view.addRefreshListener(new RefreshListener());
}   
    
class AddUserListener implements ActionListener {
@Override
public void actionPerformed (ActionEvent e) { 
    String name = view.getNameInput();
    String email = view.getEmailInput();
    if (name.isEmpty() && !email.isEmpty()) { User user = new User(); user.setName (name);
    user.setEmail (email);
    mapper.insertUser (user);
    JOptionPane.showMessageDialog(view, "User added successfully!");
    } else {
    JOptionPane.showMessageDialog(view, "Please fill in all fields.");
        
        }
    }
}
    class RefreshListener implements ActionListener {
    @Override
    public void actionPerformed (ActionEvent e) {   
        List<User> users = mapper.getAllUsers();
        String[] userArray = users.stream()
                            .map(u -> u.getName()+ "(" + u.getEmail() + ")")
                            .toArray(String[]::new);
                            
        view.setUserList (userArray);
    }
  }
}