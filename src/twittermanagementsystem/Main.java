/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twittermanagementsystem;

import static java.lang.System.exit;

/**
 *
 * @author DAMAN KUMAR
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public static User usr[] = new User[255];
    public static int count=0;
    
    public Main(int val) {
        initComponents();
        if(val!=1){
        main.setVisible(true);
        user.setVisible(false);
        manager.setVisible(false);
        signup.setVisible(false);
        Login.setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        userbut = new javax.swing.JButton();
        managebut = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        user = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        backbut = new javax.swing.JButton();
        loginbut = new javax.swing.JButton();
        signupbut = new javax.swing.JButton();
        manager = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        signup = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        usernaam = new javax.swing.JLabel();
        pass = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        textun = new javax.swing.JTextField();
        textpass = new javax.swing.JTextField();
        textstatus = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        signupuser = new javax.swing.JButton();
        existlabel = new javax.swing.JLabel();
        Login = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        naam = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        entername = new javax.swing.JTextField();
        enterpass = new javax.swing.JTextField();
        backtouser = new javax.swing.JButton();
        loginuser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main.setBackground(new java.awt.Color(0, 102, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAMAN KUMAR\\Downloads\\twittericon.png")); // NOI18N

        userbut.setBackground(new java.awt.Color(0, 204, 255));
        userbut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        userbut.setText("User");
        userbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbutActionPerformed(evt);
            }
        });

        managebut.setBackground(new java.awt.Color(0, 204, 255));
        managebut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        managebut.setText("Manager");
        managebut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managebutActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(255, 51, 51));
        exit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(userbut)
                .addGap(103, 103, 103)
                .addComponent(managebut)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                        .addComponent(exit)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))))
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userbut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(managebut, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        user.setBackground(new java.awt.Color(0, 102, 255));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAMAN KUMAR\\Downloads\\twittericon (1).png")); // NOI18N
        jLabel3.setText("jLabel3");

        backbut.setBackground(new java.awt.Color(255, 51, 51));
        backbut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backbut.setText("Back");
        backbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbutActionPerformed(evt);
            }
        });

        loginbut.setBackground(new java.awt.Color(0, 255, 255));
        loginbut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginbut.setText("Login");
        loginbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbutActionPerformed(evt);
            }
        });

        signupbut.setBackground(new java.awt.Color(0, 255, 255));
        signupbut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupbut.setText("Sign Up");
        signupbut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout userLayout = new javax.swing.GroupLayout(user);
        user.setLayout(userLayout);
        userLayout.setHorizontalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(userLayout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(userLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(backbut)))
                .addContainerGap(211, Short.MAX_VALUE))
            .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userLayout.createSequentialGroup()
                    .addContainerGap(230, Short.MAX_VALUE)
                    .addComponent(loginbut, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(228, Short.MAX_VALUE)))
            .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userLayout.createSequentialGroup()
                    .addContainerGap(229, Short.MAX_VALUE)
                    .addComponent(signupbut)
                    .addContainerGap(229, Short.MAX_VALUE)))
        );
        userLayout.setVerticalGroup(
            userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(userLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(backbut, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userLayout.createSequentialGroup()
                    .addContainerGap(161, Short.MAX_VALUE)
                    .addComponent(loginbut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(155, Short.MAX_VALUE)))
            .addGroup(userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, userLayout.createSequentialGroup()
                    .addContainerGap(223, Short.MAX_VALUE)
                    .addComponent(signupbut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(90, Short.MAX_VALUE)))
        );

        manager.setBackground(new java.awt.Color(0, 102, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAMAN KUMAR\\Downloads\\twittericon (1).png")); // NOI18N
        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout managerLayout = new javax.swing.GroupLayout(manager);
        manager.setLayout(managerLayout);
        managerLayout.setHorizontalGroup(
            managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        managerLayout.setVerticalGroup(
            managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(managerLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );

        signup.setBackground(new java.awt.Color(0, 102, 255));
        signup.setForeground(new java.awt.Color(204, 0, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAMAN KUMAR\\Downloads\\twittericon (1).png")); // NOI18N
        jLabel4.setText("jLabel4");

        usernaam.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        usernaam.setText("User-Name :");

        pass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        pass.setText("Password : ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Status : ");

        textun.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        textpass.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textpassActionPerformed(evt);
            }
        });

        textstatus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        textstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textstatusActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(255, 51, 51));
        back.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        signupuser.setBackground(new java.awt.Color(0, 255, 255));
        signupuser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        signupuser.setText("Sign Up");
        signupuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupuserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signupLayout = new javax.swing.GroupLayout(signup);
        signup.setLayout(signupLayout);
        signupLayout.setHorizontalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLayout.createSequentialGroup()
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(signupLayout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signupuser))
                        .addGroup(signupLayout.createSequentialGroup()
                            .addGap(158, 158, 158)
                            .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(signupLayout.createSequentialGroup()
                                        .addComponent(usernaam)
                                        .addGap(18, 18, 18)
                                        .addComponent(textun, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(textstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(textpass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(signupLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(136, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, signupLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(existlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        signupLayout.setVerticalGroup(
            signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signupLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(existlabel)
                .addGap(10, 10, 10)
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernaam)
                    .addComponent(textun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass)
                    .addComponent(textpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(textstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(signupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(signupLayout.createSequentialGroup()
                        .addComponent(signupuser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Login.setBackground(new java.awt.Color(0, 102, 255));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\DAMAN KUMAR\\Downloads\\twittericon (1).png")); // NOI18N
        jLabel6.setText("jLabel6");

        naam.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        naam.setText("User-Name : ");

        password.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        password.setText("Password : ");

        entername.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        entername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enternameActionPerformed(evt);
            }
        });

        backtouser.setBackground(new java.awt.Color(255, 51, 51));
        backtouser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backtouser.setText("Back");
        backtouser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtouserActionPerformed(evt);
            }
        });

        loginuser.setBackground(new java.awt.Color(51, 255, 255));
        loginuser.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginuser.setText("Login");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(LoginLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(backtouser)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(loginuser))
                        .addGroup(LoginLayout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(naam)
                                .addComponent(password))
                            .addGap(18, 18, 18)
                            .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(entername, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(enterpass)))))
                .addContainerGap(185, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entername, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(naam, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(enterpass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backtouser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginuser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(manager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(manager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbutActionPerformed
            main.setVisible(false);
            user.setVisible(true);
       
    }//GEN-LAST:event_userbutActionPerformed

    private void managebutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managebutActionPerformed
        main.setVisible(false);
        manager.setVisible(true);
    }//GEN-LAST:event_managebutActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void backbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbutActionPerformed
        user.setVisible(false);
        main.setVisible(true);
    }//GEN-LAST:event_backbutActionPerformed

    private void signupbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbutActionPerformed
        user.setVisible(false);
        signup.setVisible(true);
    }//GEN-LAST:event_signupbutActionPerformed

    private void loginbutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbutActionPerformed
        user.setVisible(false);
        Login.setVisible(true);
    }//GEN-LAST:event_loginbutActionPerformed

    private void textstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textstatusActionPerformed
        
    }//GEN-LAST:event_textstatusActionPerformed

    private void textpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textpassActionPerformed

    private void enternameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enternameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enternameActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        textun.setText("");
        textpass.setText("");
        textstatus.setText("");
        existlabel.setText("");
        signup.setVisible(false);
        user.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void signupuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupuserActionPerformed
         
        String naam = textun.getText().toString();
        String pass = textpass.getText().toString();
        String status = textstatus.getText().toString();
        int exist = checkuser(naam);
       
        if(exist==1)
        {
            existlabel.setText("User Already Exists!!!");
            textun.setText("");
            textpass.setText("");
        }
        else{
        signup.setVisible(false);
        user.setVisible(true);
        }
    }//GEN-LAST:event_signupuserActionPerformed

    private void backtouserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtouserActionPerformed
         Login.setVisible(false);
         user.setVisible(true);
    }//GEN-LAST:event_backtouserActionPerformed

    /**
     * @param args the command line arguments
     */
    public int checkuser(String name){
        int i;
        for(i=1;i<=count;i++)
        {
            System.out.println(usr[i].getusername());
            if(usr[i].getusername().equalsIgnoreCase(name))
            {
                return 1;
            }
        }
        return 0;
    }
    public void getting(){
        TwitterManagementSystem data = new TwitterManagementSystem();
        count = data.getData(usr);
    }
    public static void main(String[] args) {
      // Main main = new Main(1);
      // main.getting();
        TwitterManagementSystem data = new TwitterManagementSystem();
        count = data.getData(usr);
        
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JButton back;
    private javax.swing.JButton backbut;
    private javax.swing.JButton backtouser;
    private javax.swing.JTextField entername;
    private javax.swing.JTextField enterpass;
    private javax.swing.JLabel existlabel;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton loginbut;
    private javax.swing.JButton loginuser;
    private javax.swing.JPanel main;
    private javax.swing.JButton managebut;
    private javax.swing.JPanel manager;
    private javax.swing.JLabel naam;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel password;
    private javax.swing.JPanel signup;
    private javax.swing.JButton signupbut;
    private javax.swing.JButton signupuser;
    private javax.swing.JTextField textpass;
    private javax.swing.JTextField textstatus;
    private javax.swing.JTextField textun;
    private javax.swing.JPanel user;
    private javax.swing.JButton userbut;
    private javax.swing.JLabel usernaam;
    // End of variables declaration//GEN-END:variables
}
