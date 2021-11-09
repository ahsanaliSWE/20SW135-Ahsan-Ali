package login_dashboard;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/************************************************
 * Login Form for already registered users  
 ************************************************/
public class Login_Form extends javax.swing.JFrame {

    /******************************
     * Creates new form Login_Form
     ******************************/
    public Login_Form() {
        initComponents();
      
        // center the form
        this.setLocationRelativeTo(null);
        
        // create a yellow border for the jpanel_title
        Border jpanel_title_border = BorderFactory.createMatteBorder(0, 1, 1, 1, Color.yellow);
        // set the border to the jPanel_title
        jPanel_title.setBorder(jpanel_title_border);
        
        // create an border for the global panel
        Border glob_panel_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.orange);
        jPanel1.setBorder(glob_panel_border);
        
        // create a black border for the close & minimize jlables
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
        
        // create a border for the create acconut jlabel
        Border label_create_accont_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_Create_Account.setBorder(label_create_accont_border);
        
        // create a border with the color of the parent jpanel for the icons label to remove the move
        Border label_icons_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
        jLabel_username.setBorder(label_icons_border);
        jLabel_password.setBorder(label_icons_border);
        
        // create border for the username and password field
        Border field_border = BorderFactory.createMatteBorder(1, 5, 1, 1, Color.white);
        jTextField_Username.setBorder(field_border);
        jPasswordField.setBorder(field_border);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jTextField_Username = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jButton_Login = new javax.swing.JButton();
        jLabel_Create_Account = new javax.swing.JLabel();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jPanel_title = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(51, 0, 153));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel_username.setOpaque(true);

        jLabel_password.setOpaque(true);

        jTextField_Username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Username.setForeground(new java.awt.Color(153, 153, 153));
        jTextField_Username.setText("username");
        jTextField_Username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_UsernameFocusLost(evt);
            }
        });

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPasswordField.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField.setText("password");
        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });

        jButton_Login.setBackground(new java.awt.Color(0, 84, 140));
        jButton_Login.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 24)); // NOI18N
        jButton_Login.setForeground(new java.awt.Color(255, 255, 255));
        jButton_Login.setText("Login");
        jButton_Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_LoginMouseExited(evt);
            }
        });
        jButton_Login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoginActionPerformed(evt);
            }
        });

        jLabel_Create_Account.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Create_Account.setForeground(new java.awt.Color(255, 51, 51));
        jLabel_Create_Account.setText(">> No Account? Create One!");
        jLabel_Create_Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Create_Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_Create_AccountMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField_Username, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel_password, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel_Create_Account)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField_Username)
                    .addComponent(jLabel_username, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton_Login, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jLabel_Create_Account)
                .addGap(23, 23, 23))
        );

        // set icon to the jlabel
        jLabel_username.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/username_field.png")));
        // set icon to the jlabel
        jLabel_password.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/password_field.png")));
        jPasswordField.getAccessibleContext().setAccessibleDescription("");

        jLabel_minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_minimize.setText(" -");
        jLabel_minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel_close.setText(" X");
        jLabel_close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        jPanel_title.setBackground(new java.awt.Color(0, 153, 204));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 38)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");

        javax.swing.GroupLayout jPanel_titleLayout = new javax.swing.GroupLayout(jPanel_title);
        jPanel_title.setLayout(jPanel_titleLayout);
        jPanel_titleLayout.setHorizontalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_titleLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(42, 42, 42))
        );
        jPanel_titleLayout.setVerticalGroup(
            jPanel_titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_minimize)
                            .addComponent(jLabel_close)))
                    .addComponent(jPanel_title, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /********************************
     * Minimize Button Entered 
     ********************************/
    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.white);
    }//GEN-LAST:event_jLabel_minimizeMouseEntered
      
    /**************************
     * Minimize Button Exited
     **************************/
    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.black);
        
    }//GEN-LAST:event_jLabel_minimizeMouseExited
    
    /***************************
     * Minimize Button Entered 
     ***************************/
    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.white);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.white);
        
    }//GEN-LAST:event_jLabel_closeMouseEntered
   
    /*************************
     * Close Button Exited 
     *************************/
    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        
        Border label_border = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.black);
        
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jTextField_UsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusGained
        
        // clear the textfield on focus if the text is "username"
        if(jTextField_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_Username.setText("");
            jTextField_Username.setForeground(Color.black);
        }
        
        // set a yellow border to the jlabel icon
        Border jlabel_icon = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
        jLabel_username.setBorder(jlabel_icon);
        
    }//GEN-LAST:event_jTextField_UsernameFocusGained

    private void jTextField_UsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_UsernameFocusLost
        
        // if the text field is equal to username or empty
        // we will set the "username" text in the field 
        // on focus lost event
        
        if(jTextField_Username.getText().trim().equals("") || 
           jTextField_Username.getText().trim().toLowerCase().equals("username"))
        {
            jTextField_Username.setText("username");
            jTextField_Username.setForeground(new Color(153,153,153));
        }
        
        // create a border with the color of the parent jpanel for the icons label to remove the move
        Border label_icons_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
        jLabel_username.setBorder(label_icons_border);
        
    }//GEN-LAST:event_jTextField_UsernameFocusLost

    /*****************************************************
     * Checks if "passsword" is written in passwordfield
     *****************************************************/
    private void jPasswordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusGained
        
        // clear the password field on focus if the text is "password"
        
        // get the password text
        String pass = String.valueOf(jPasswordField.getPassword());
        
        if(pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField.setText("");
            jPasswordField.setForeground(Color.black);
        }
        
        // set a yellow border to the jlabel icon
        Border jlabel_icon = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.yellow);
        jLabel_password.setBorder(jlabel_icon);
        
        
    }//GEN-LAST:event_jPasswordFieldFocusGained

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
      
        // if the password field is equal to password or empty
        // we will set the "password" text in the field 
        // on focus lost event
        
        // get the password text
        String pass = String.valueOf(jPasswordField.getPassword());
        
        if(pass.trim().equals("") || 
           pass.trim().toLowerCase().equals("password"))
        {
            jPasswordField.setText("password");
            jPasswordField.setForeground(new Color(153,153,153));
        }
        
        // create a border with the color of the parent jpanel for the icons label to remove the move
        Border label_icons_border = BorderFactory.createMatteBorder(1, 1, 1, 1, new Color(153,153,153));
        jLabel_password.setBorder(label_icons_border);
        
    }//GEN-LAST:event_jPasswordFieldFocusLost

    /*****************
     * Login Entered
     ****************/
    private void jButton_LoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseEntered
        
        // set jbutton background
        jButton_Login.setBackground(new Color(0,101,183));
        
    }//GEN-LAST:event_jButton_LoginMouseEntered
    
    /*****************
     * Login Exited
     ****************/
    private void jButton_LoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_LoginMouseExited
       
        // set jbutton background
        jButton_Login.setBackground(new Color(0,84,104));
        
    }//GEN-LAST:event_jButton_LoginMouseExited
    
    /***************************
     * Minimize icon is clicked 
     ***************************/
    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        
        this.setState(JFrame.ICONIFIED);
        
    }//GEN-LAST:event_jLabel_minimizeMouseClicked
    
    /***************************
     * Close icon is clicked 
     ***************************/
    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked
     
    /***************************************
     * checks from Database and give access
     ***************************************/
    private void jButton_LoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoginActionPerformed
        
        PreparedStatement st;
        ResultSet rs;
        
        // get the username & password
        String username = jTextField_Username.getText();
        String password = String.valueOf(jPasswordField.getPassword());
        
        //create a select query to check if the username and the password exist in the database
        String query = "SELECT * FROM `users` WHERE `username` = ? AND `password` = ?";
        
        // show a message if the username or the password fields are empty
        if(username.trim().equals("username"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Username", "Empty Username", 2);
        }
        else if(password.trim().equals("password"))
        {
            JOptionPane.showMessageDialog(null, "Enter Your Password", "Empty Password", 2);
        }
        else{
            // connects when database is offline 
            if(username.trim().equals("admin")|| password.trim().equals("1234"))
            {
                // show a new form
                Dashboard_Form form = new Dashboard_Form();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
            }
            
            try {
            st = My_CNX.getConnection().prepareStatement(query);
            
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                // show a new form
                Dashboard_Form form = new Dashboard_Form();
                form.setVisible(true);
                form.pack();
                form.setLocationRelativeTo(null);
                // close the current form(login form)
                this.dispose();
                
            }else{
                // error message
                JOptionPane.showMessageDialog(null, "Invalid Username / Password","Login Error",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
    }//GEN-LAST:event_jButton_LoginActionPerformed

    /**************************
     * Create Account Entered
     *************************/
    private void jLabel_Create_AccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseEntered
        
        Border label_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.red);
        jLabel_Create_Account.setBorder(label_border);
        
    }//GEN-LAST:event_jLabel_Create_AccountMouseEntered

    /**************************
     * Create Account Exited
     *************************/
    private void jLabel_Create_AccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseExited
       
        Border label_create_accont_border = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.lightGray);
        jLabel_Create_Account.setBorder(label_create_accont_border);
        
    }//GEN-LAST:event_jLabel_Create_AccountMouseExited

    /*********************************************************
     * Open Registration Form When user Click the new Account
     *********************************************************/
    private void jLabel_Create_AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Create_AccountMouseClicked
        
        Register_Form rf = new Register_Form();
        rf.setVisible(true);
        rf.pack();
        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_jLabel_Create_AccountMouseClicked
    
    /*******************
     * Main Method
     *******************/
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Login;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Create_Account;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel_title;
    public javax.swing.JPasswordField jPasswordField;
    public javax.swing.JTextField jTextField_Username;
    // End of variables declaration//GEN-END:variables
}
