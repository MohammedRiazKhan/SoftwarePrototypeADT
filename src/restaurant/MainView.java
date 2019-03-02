package restaurant;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import model.*;
public class MainView extends javax.swing.JFrame {
    
    String[] guest = {"1", "2", "3", "4"};
    
    NewOrderTableModel newOrderModel = new NewOrderTableModel();
    CompleteOrderTableModel completeOrderModel = new CompleteOrderTableModel();
    
    //Meals
    ArrayList<Meal> mealList;
    ArrayList<Dessert> dessertList;
    ArrayList<Beverage> beverageList;
    
    //jcombobox model
    DefaultComboBoxModel<String> mealComboBox1 = new DefaultComboBoxModel<String>();
    DefaultComboBoxModel<String> mealComboBox2 = new DefaultComboBoxModel<String>();
    DefaultComboBoxModel<String> mealComboBox3 = new DefaultComboBoxModel<String>();
    DefaultComboBoxModel<String> mealComboBox4 = new DefaultComboBoxModel<String>();
    
    DefaultComboBoxModel<String> dessertComboBox1 = new DefaultComboBoxModel<String>();
    DefaultComboBoxModel<String> dessertComboBox2 = new DefaultComboBoxModel<String>();
    DefaultComboBoxModel<String> dessertComboBox3 = new DefaultComboBoxModel<String>();
    DefaultComboBoxModel<String> dessertComboBox4 = new DefaultComboBoxModel<String>();
    
    DefaultComboBoxModel<String> beverageComboBox1 = new DefaultComboBoxModel<String>();
    DefaultComboBoxModel<String> beverageComboBox2 = new DefaultComboBoxModel<String>();
    DefaultComboBoxModel<String> beverageComboBox3 = new DefaultComboBoxModel<String>();
    DefaultComboBoxModel<String> beverageComboBox4 = new DefaultComboBoxModel<String>();
    
    //guest amount
    int guestAmount = 1;
    int tableNum = 1;
    
    
    //meals ids
    int meal1Id;
    int meal2Id;
    int meal3Id;
    int meal4Id;
    
    int dessert1Id;
    int dessert2Id;
    int dessert3Id;
    int dessert4Id;
    
    int bev1Id;
    int bev2Id;
    int bev3Id;
    int bev4Id;
    
    
    public MainView() {
        initComponents();
        
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        setLocationRelativeTo(null);
        
        create.setVisible(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
        guest2Selection.setVisible(false);
        guest3Selection.setVisible(false);
        guest4Selection.setVisible(false);
        
        mealList = main.db.getMeals();
        
        for(int i = 0; i< mealList.size(); i++){
            mealComboBox1.addElement(mealList.get(i).getName());
            mealComboBox2.addElement(mealList.get(i).getName());
            mealComboBox3.addElement(mealList.get(i).getName());
            mealComboBox4.addElement(mealList.get(i).getName());
        }
        
        dessertList = main.db.getDesserts();
        
        for(int i = 0; i< dessertList.size(); i++){
            dessertComboBox1.addElement(dessertList.get(i).getName());
            dessertComboBox2.addElement(dessertList.get(i).getName());
            dessertComboBox3.addElement(dessertList.get(i).getName());
            dessertComboBox4.addElement(dessertList.get(i).getName());
        }
        
        beverageList = main.db.getBeverages();
        
        for(int i = 0; i< beverageList.size(); i++){
            beverageComboBox1.addElement(beverageList.get(i).getName());
            beverageComboBox2.addElement(beverageList.get(i).getName());
            beverageComboBox3.addElement(beverageList.get(i).getName());
            beverageComboBox4.addElement(beverageList.get(i).getName());
        }
        
        meal1.setSelectedIndex(0);
        meal2.setSelectedIndex(0);
        meal3.setSelectedIndex(0);
        meal4.setSelectedIndex(0);
        
        dessert1.setSelectedIndex(0);
        dessert2.setSelectedIndex(0);
        dessert3.setSelectedIndex(0);
        dessert4.setSelectedIndex(0);
        
        beverage1.setSelectedIndex(0);
        beverage2.setSelectedIndex(0);
        beverage3.setSelectedIndex(0);
        beverage4.setSelectedIndex(0);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LeftPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        ViewOrder = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CreateOrder = new javax.swing.JButton();
        create = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        createOrder = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        guests = new javax.swing.JComboBox(guest);
        table = new javax.swing.JComboBox<>();
        guest1Selection = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        beverage1 = new javax.swing.JComboBox();
        dessert1 = new javax.swing.JComboBox();
        meal1 = new javax.swing.JComboBox();
        guest2Selection = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        dessert2 = new javax.swing.JComboBox();
        beverage2 = new javax.swing.JComboBox();
        meal2 = new javax.swing.JComboBox();
        guest3Selection = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        dessert3 = new javax.swing.JComboBox();
        beverage3 = new javax.swing.JComboBox();
        meal3 = new javax.swing.JComboBox();
        guest4Selection = new javax.swing.JPanel();
        beverage4 = new javax.swing.JComboBox();
        meal4 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        dessert4 = new javax.swing.JComboBox();
        view = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LeftPanel.setBackground(new java.awt.Color(0, 102, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 103, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 91, Short.MAX_VALUE)
        );

        jLabel1.setText("Welcome,");

        name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Riaz");

        ViewOrder.setBackground(new java.awt.Color(0, 51, 255));
        ViewOrder.setForeground(new java.awt.Color(255, 255, 255));
        ViewOrder.setText("View Orders");
        ViewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewOrderActionPerformed(evt);
            }
        });

        jLabel3.setText("Tables Assigned:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("1");

        CreateOrder.setBackground(new java.awt.Color(0, 51, 255));
        CreateOrder.setForeground(new java.awt.Color(255, 255, 255));
        CreateOrder.setText("Create Order");
        CreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LeftPanelLayout = new javax.swing.GroupLayout(LeftPanel);
        LeftPanel.setLayout(LeftPanelLayout);
        LeftPanelLayout.setHorizontalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ViewOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CreateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(LeftPanelLayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LeftPanelLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jLabel4)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        LeftPanelLayout.setVerticalGroup(
            LeftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LeftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(name)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(23, 23, 23)
                .addComponent(ViewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(CreateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Create Order");

        jLabel7.setText("No Guests");

        jLabel9.setText("Guest Meal Selection");

        createOrder.setBackground(new java.awt.Color(0, 51, 255));
        createOrder.setForeground(new java.awt.Color(255, 255, 255));
        createOrder.setText("CREATE");
        createOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createOrderActionPerformed(evt);
            }
        });

        jLabel14.setText("Table #");

        jLabel15.setForeground(new java.awt.Color(0, 51, 255));
        jLabel15.setText("Clear Selection");
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });

        guests.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                guestsItemStateChanged(evt);
            }
        });

        table.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1"}));
        table.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tableItemStateChanged(evt);
            }
        });

        jLabel10.setText("1");

        beverage1.setModel(beverageComboBox1);
        beverage1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                beverage1ItemStateChanged(evt);
            }
        });

        dessert1.setModel(dessertComboBox1);
        dessert1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dessert1ItemStateChanged(evt);
            }
        });

        meal1.setModel(mealComboBox1);
        meal1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                meal1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout guest1SelectionLayout = new javax.swing.GroupLayout(guest1Selection);
        guest1Selection.setLayout(guest1SelectionLayout);
        guest1SelectionLayout.setHorizontalGroup(
            guest1SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guest1SelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(meal1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(dessert1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(beverage1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        guest1SelectionLayout.setVerticalGroup(
            guest1SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guest1SelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guest1SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(dessert1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beverage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel11.setText("2");

        dessert2.setModel(dessertComboBox2);
        dessert2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dessert2ItemStateChanged(evt);
            }
        });
        dessert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dessert2ActionPerformed(evt);
            }
        });

        beverage2.setModel(beverageComboBox2);
        beverage2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                beverage2ItemStateChanged(evt);
            }
        });

        meal2.setModel(mealComboBox2);
        meal2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                meal2ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout guest2SelectionLayout = new javax.swing.GroupLayout(guest2Selection);
        guest2Selection.setLayout(guest2SelectionLayout);
        guest2SelectionLayout.setHorizontalGroup(
            guest2SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guest2SelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(meal2, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dessert2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(beverage2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        guest2SelectionLayout.setVerticalGroup(
            guest2SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guest2SelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guest2SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(dessert2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beverage2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel12.setText("3");

        dessert3.setModel(dessertComboBox3);
        dessert3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dessert3ItemStateChanged(evt);
            }
        });

        beverage3.setModel(beverageComboBox3);
        beverage3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                beverage3ItemStateChanged(evt);
            }
        });

        meal3.setModel(mealComboBox3);
        meal3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                meal3ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout guest3SelectionLayout = new javax.swing.GroupLayout(guest3Selection);
        guest3Selection.setLayout(guest3SelectionLayout);
        guest3SelectionLayout.setHorizontalGroup(
            guest3SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guest3SelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(meal3, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dessert3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(beverage3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        guest3SelectionLayout.setVerticalGroup(
            guest3SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guest3SelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guest3SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(dessert3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beverage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(meal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        beverage4.setModel(beverageComboBox4);
        beverage4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                beverage4ItemStateChanged(evt);
            }
        });

        meal4.setModel(mealComboBox4);
        meal4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                meal4ItemStateChanged(evt);
            }
        });

        jLabel13.setText("4");

        dessert4.setModel(dessertComboBox4);
        dessert4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                dessert4ItemStateChanged(evt);
            }
        });
        dessert4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dessert4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout guest4SelectionLayout = new javax.swing.GroupLayout(guest4Selection);
        guest4Selection.setLayout(guest4SelectionLayout);
        guest4SelectionLayout.setHorizontalGroup(
            guest4SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guest4SelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(meal4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dessert4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(beverage4, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        guest4SelectionLayout.setVerticalGroup(
            guest4SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(guest4SelectionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(guest4SelectionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(meal4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(beverage4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dessert4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout createLayout = new javax.swing.GroupLayout(create);
        create.setLayout(createLayout);
        createLayout.setHorizontalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createLayout.createSequentialGroup()
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guest1Selection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(createLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guest2Selection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(createLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guest3Selection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(createLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(createOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createLayout.createSequentialGroup()
                                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(createLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(guests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(createLayout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(405, 405, 405))
                                        .addGroup(createLayout.createSequentialGroup()
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(333, 333, 333))))
                                .addGap(0, 0, 0)
                                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(createLayout.createSequentialGroup()
                                        .addComponent(jLabel14)
                                        .addGap(10, 10, 10)
                                        .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel15))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(createLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(guest4Selection, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(23, 23, 23))
        );
        createLayout.setVerticalGroup(
            createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14)
                    .addComponent(guests, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(createLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(guest1Selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guest2Selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guest3Selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(guest4Selection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(createOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 204));
        jLabel8.setText("Orders");

        jLabel5.setText("New Orders");

        jTable1.setModel(newOrderModel);
        jScrollPane1.setViewportView(jTable1);

        jLabel16.setText("Complete");

        jTable3.setModel(completeOrderModel);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout viewLayout = new javax.swing.GroupLayout(view);
        view.setLayout(viewLayout);
        viewLayout.setHorizontalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel16)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        viewLayout.setVerticalGroup(
            viewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LeftPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 229, Short.MAX_VALUE)
                    .addComponent(view, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LeftPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(create, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ViewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewOrderActionPerformed

            
        view.setVisible(true);
        
        create.setVisible(false);
        
    }//GEN-LAST:event_ViewOrderActionPerformed

    private void CreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateOrderActionPerformed
        
        create.setVisible(true);
        
        view.setVisible(false);
        
    }//GEN-LAST:event_CreateOrderActionPerformed

    private void dessert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dessert2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dessert2ActionPerformed

    private void dessert4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dessert4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dessert4ActionPerformed

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
       
        meal1.setSelectedIndex(0);
        dessert1.setSelectedIndex(0);
        beverage1.setSelectedIndex(0);
        
        meal2.setSelectedIndex(0);
        dessert2.setSelectedIndex(0);
        beverage2.setSelectedIndex(0);
        
        meal3.setSelectedIndex(0);
        dessert3.setSelectedIndex(0);
        beverage3.setSelectedIndex(0);
        
        meal4.setSelectedIndex(0);
        dessert4.setSelectedIndex(0);
        beverage4.setSelectedIndex(0);
        
    }//GEN-LAST:event_jLabel15MouseClicked

    private void guestsItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_guestsItemStateChanged
       
        Object it = guests.getSelectedItem();
        
        String item = (String) it;
          
        if(item.equals("1")){
           guest1Selection.setVisible(true);
           guest2Selection.setVisible(false);
           guest3Selection.setVisible(false);
           guest4Selection.setVisible(false);
           
           guestAmount = Integer.parseInt(item);
        }
        else if(item.equals("2")){
           guest1Selection.setVisible(true);
           guest2Selection.setVisible(true);
           guest3Selection.setVisible(false);
           guest4Selection.setVisible(false);
           
           guestAmount = Integer.parseInt(item);
        }
        else if(item.equals("3")){
           guest1Selection.setVisible(true);
           guest2Selection.setVisible(true);
           guest3Selection.setVisible(true);
           guest4Selection.setVisible(false);
           
           guestAmount = Integer.parseInt(item);
        }
        else if(item.equals("4")){
           guest1Selection.setVisible(true);
           guest2Selection.setVisible(true);
           guest3Selection.setVisible(true);
           guest4Selection.setVisible(true);
           
           guestAmount = Integer.parseInt(item);
        }
      
        
    }//GEN-LAST:event_guestsItemStateChanged

    private void tableItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tableItemStateChanged
        
        Object selectedItem = table.getSelectedItem();
        
        String item = (String) selectedItem;
        
        if(item.equals("1")){
            tableNum = Integer.parseInt(item);
        } 
        
    }//GEN-LAST:event_tableItemStateChanged

    private void createOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createOrderActionPerformed
       
        List<MealSelection> selectionsList = new ArrayList();
       
        if(guestAmount == 1){
            
            String nameOfMeal = (String) meal1.getSelectedItem();
            //search the name of the meal and retrieve an object of it for the meal selection
            String nameOfDessert = (String) dessert1.getSelectedItem();
            //search the name of the dessert and retrieve an object of it for the meal selection
            String nameOfBeverage = (String) beverage1.getSelectedItem();
            //search the name of the beverage and retrieve an object of it for the meal selection
            
            //meals
            boolean exits = false;
            int i = 0;
            while(true){
                
                if(mealList.get(i).getName().equals(nameOfMeal)){
                    exits = true;
                    break;
                }
                i++;
            }
            
            Meal meal = mealList.get(i);
           
            
            boolean exitss = false;
            int is = 0;
            while(true){
                
                if(dessertList.get(is).getName().equals(nameOfDessert)){
                    exitss = true;
                    break;
                }
                is++;
            }
            
            Dessert dessert = dessertList.get(is);
            
            boolean exitsss = false;
            int iss = 0;
            while(true){
                
                if(beverageList.get(iss).getName().equals(nameOfBeverage)){
                    exitsss = true;
                    break;
                }
                iss++;
            }
            
            Beverage beverage = beverageList.get(iss);
            
            
            
            MealSelection selection = new MealSelection(1, meal, dessert, beverage);
            selectionsList.add(selection);
            
            Order order = new Order(1, guestAmount, tableNum);
            
            //pass the selection and the order to the database class and adds to relevant tables.
            main.db.insertOrder(order, selectionsList);
            
            newOrderModel.addData(order);
            
            System.out.println("Success");
            
        }
        else if(guestAmount == 2){
            
             String nameOfMeal = (String) meal1.getSelectedItem();
            //search the name of the meal and retrieve an object of it for the meal selection
            String nameOfDessert = (String) dessert1.getSelectedItem();
            //search the name of the dessert and retrieve an object of it for the meal selection
            String nameOfBeverage = (String) beverage1.getSelectedItem();
            //search the name of the beverage and retrieve an object of it for the meal selection
            
            String nameOfMeal2 = (String) meal2.getSelectedItem();
            //search the name of the meal and retrieve an object of it for the meal selection
            String nameOfDessert2 = (String) dessert2.getSelectedItem();
            //search the name of the dessert and retrieve an object of it for the meal selection
            String nameOfBeverage2 = (String) beverage2.getSelectedItem();
            //search the name of the beverage and retrieve an object of it for the meal selection
            
            //meals
            boolean exits = false;
            int i = 0;
            while(true){
                
                if(mealList.get(i).getName().equals(nameOfMeal)){
                    exits = true;
                    break;
                }
                i++;
            }
            
            Meal meal1 = mealList.get(i);
           
            
            boolean exitss = false;
            int is = 0;
            while(true){
                
                if(dessertList.get(is).getName().equals(nameOfDessert)){
                    exitss = true;
                    break;
                }
                is++;
            }
            
            Dessert dessert1 = dessertList.get(is);
            
            boolean exitsss = false;
            int iss = 0;
            while(true){
                
                if(beverageList.get(iss).getName().equals(nameOfBeverage)){
                    exitsss = true;
                    break;
                }
                iss++;
            }
            
            Beverage beverage1 = beverageList.get(iss);
            MealSelection selection = new MealSelection(1, meal1, dessert1, beverage1);
            selectionsList.add(selection);
            
            
             //meals
            boolean exitse = false;
            int ie = 0;
            while(true){
                
                if(mealList.get(ie).getName().equals(nameOfMeal2)){
                    exitse = true;
                    break;
                }
                ie++;
            }
            
            Meal meal2 = mealList.get(ie);
           
            
            boolean exitsse = false;
            int ise = 0;
            while(true){
                
                if(dessertList.get(ise).getName().equals(nameOfDessert2)){
                    exitsse = true;
                    break;
                }
                ise++;
            }
            
            Dessert dessert2 = dessertList.get(ise);
            
            boolean exitssse = false;
            int isse = 0;
            while(true){
                
                if(beverageList.get(isse).getName().equals(nameOfBeverage2)){
                    exitssse = true;
                    break;
                }
                isse++;
            }
            
            Beverage beverage2 = beverageList.get(isse);
            MealSelection selection2 = new MealSelection(2, meal2, dessert2, beverage2);
            selectionsList.add(selection2);
           
            
            Order order = new Order(2, guestAmount, tableNum);
            
            //pass the selection and the order to the database class and adds to relevant tables.
            main.db.insertOrder(order, selectionsList);
            
             newOrderModel.addData(order);
            
        }
         else if(guestAmount == 3){
            
            String nameOfMeal = (String) meal1.getSelectedItem();
            //search the name of the meal and retrieve an object of it for the meal selection
            String nameOfDessert = (String) dessert1.getSelectedItem();
            //search the name of the dessert and retrieve an object of it for the meal selection
            String nameOfBeverage = (String) beverage1.getSelectedItem();
            //search the name of the beverage and retrieve an object of it for the meal selection
            
            String nameOfMeal2 = (String) meal2.getSelectedItem();
            //search the name of the meal and retrieve an object of it for the meal selection
            String nameOfDessert2 = (String) dessert2.getSelectedItem();
            //search the name of the dessert and retrieve an object of it for the meal selection
            String nameOfBeverage2 = (String) beverage2.getSelectedItem();
            //search the name of the beverage and retrieve an object of it for the meal selection
            
            String nameOfMeal3 = (String) meal3.getSelectedItem();
            //search the name of the meal and retrieve an object of it for the meal selection
            String nameOfDessert3 = (String) dessert3.getSelectedItem();
            //search the name of the dessert and retrieve an object of it for the meal selection
            String nameOfBeverage3 = (String) beverage3.getSelectedItem();
            //search the name of the beverage and retrieve an object of it for the meal selection
             
           //meals
            boolean exits = false;
            int i = 0;
            while(true){
                
                if(mealList.get(i).getName().equals(nameOfMeal)){
                    exits = true;
                    break;
                }
                i++;
            }
            
            Meal meal1 = mealList.get(i);
           
            
            boolean exitss = false;
            int is = 0;
            while(true){
                
                if(dessertList.get(is).getName().equals(nameOfDessert)){
                    exitss = true;
                    break;
                }
                is++;
            }
            
            Dessert dessert1 = dessertList.get(is);
            
            boolean exitsss = false;
            int iss = 0;
            while(true){
                
                if(beverageList.get(iss).getName().equals(nameOfBeverage)){
                    exitsss = true;
                    break;
                }
                iss++;
            }
            
            Beverage beverage1 = beverageList.get(iss);
            MealSelection selection = new MealSelection(1, meal1, dessert1, beverage1);
            selectionsList.add(selection);
            
            
             //meals
            boolean exitse = false;
            int ie = 0;
            while(true){
                
                if(mealList.get(ie).getName().equals(nameOfMeal2)){
                    exitse = true;
                    break;
                }
                ie++;
            }
            
            Meal meal2 = mealList.get(ie);
           
            
            boolean exitsse = false;
            int ise = 0;
            while(true){
                
                if(dessertList.get(ise).getName().equals(nameOfDessert2)){
                    exitsse = true;
                    break;
                }
                ise++;
            }
            
            Dessert dessert2 = dessertList.get(ise);
            
            boolean exitssse = false;
            int isse = 0;
            while(true){
                
                if(beverageList.get(isse).getName().equals(nameOfBeverage2)){
                    exitssse = true;
                    break;
                }
                isse++;
            }
            
            Beverage beverage2 = beverageList.get(isse);
            MealSelection selection2 = new MealSelection(2, meal2, dessert2, beverage2);
            selectionsList.add(selection2);
            
            //meals
            boolean exitse3 = false;
            int ie3 = 0;
            while(true){
                
                if(mealList.get(ie3).getName().equals(nameOfMeal3)){
                    exitse3 = true;
                    break;
                }
                ie3++;
            }
            
            Meal meal3 = mealList.get(ie3);
           
            
            boolean exitsse3 = false;
            int ise3 = 0;
            while(true){
                
                if(dessertList.get(ise3).getName().equals(nameOfDessert3)){
                    exitsse3 = true;
                    break;
                }
                ise3++;
            }
            
            Dessert dessert3 = dessertList.get(ise3);
            
            boolean exitssse3 = false;
            int isse3 = 0;
            while(true){
                
                if(beverageList.get(isse3).getName().equals(nameOfBeverage3)){
                    exitssse3 = true;
                    break;
                }
                isse3++;
            }
            
            Beverage beverage3 = beverageList.get(isse3);
            
            MealSelection selection3 = new MealSelection(3, meal3, dessert3, beverage3);
            selectionsList.add(selection3);
           
            
            Order order = new Order(3, guestAmount, tableNum);
            
            //pass the selection and the order to the database class and adds to relevant tables.
            main.db.insertOrder(order, selectionsList);
            
            
             newOrderModel.addData(order);
        }
        else if(guestAmount == 4){
            
             String nameOfMeal = (String) meal1.getSelectedItem();
            //search the name of the meal and retrieve an object of it for the meal selection
            String nameOfDessert = (String) dessert1.getSelectedItem();
            //search the name of the dessert and retrieve an object of it for the meal selection
            String nameOfBeverage = (String) beverage1.getSelectedItem();
            //search the name of the beverage and retrieve an object of it for the meal selection
            
            String nameOfMeal2 = (String) meal2.getSelectedItem();
            //search the name of the meal and retrieve an object of it for the meal selection
            String nameOfDessert2 = (String) dessert2.getSelectedItem();
            //search the name of the dessert and retrieve an object of it for the meal selection
            String nameOfBeverage2 = (String) beverage2.getSelectedItem();
            //search the name of the beverage and retrieve an object of it for the meal selection
            
            String nameOfMeal3 = (String) meal3.getSelectedItem();
            //search the name of the meal and retrieve an object of it for the meal selection
            String nameOfDessert3 = (String) dessert3.getSelectedItem();
            //search the name of the dessert and retrieve an object of it for the meal selection
            String nameOfBeverage3 = (String) beverage3.getSelectedItem();
            //search the name of the beverage and retrieve an object of it for the meal selection
            
            String nameOfMeal4 = (String) meal4.getSelectedItem();
            //search the name of the meal and retrieve an object of it for the meal selection
            String nameOfDessert4 = (String) dessert4.getSelectedItem();
            //search the name of the dessert and retrieve an object of it for the meal selection
            String nameOfBeverage4 = (String) beverage4.getSelectedItem();
            //search the name of the beverage and retrieve an object of it for the meal selection
            
            
         //meals
            boolean exits = false;
            int i = 0;
            while(true){
                
                if(mealList.get(i).getName().equals(nameOfMeal)){
                    exits = true;
                    break;
                }
                i++;
            }
            
            Meal meal1 = mealList.get(i);
           
            
            boolean exitss = false;
            int is = 0;
            while(true){
                
                if(dessertList.get(is).getName().equals(nameOfDessert)){
                    exitss = true;
                    break;
                }
                is++;
            }
            
            Dessert dessert1 = dessertList.get(is);
            
            boolean exitsss = false;
            int iss = 0;
            while(true){
                
                if(beverageList.get(iss).getName().equals(nameOfBeverage)){
                    exitsss = true;
                    break;
                }
                iss++;
            }
            
            Beverage beverage1 = beverageList.get(iss);
            MealSelection selection = new MealSelection(1, meal1, dessert1, beverage1);
            selectionsList.add(selection);
            
            
             //meals
            boolean exitse = false;
            int ie = 0;
            while(true){
                
                if(mealList.get(ie).getName().equals(nameOfMeal2)){
                    exitse = true;
                    break;
                }
                ie++;
            }
            
            Meal meal2 = mealList.get(ie);
           
            
            boolean exitsse = false;
            int ise = 0;
            while(true){
                
                if(dessertList.get(ise).getName().equals(nameOfDessert2)){
                    exitsse = true;
                    break;
                }
                ise++;
            }
            
            Dessert dessert2 = dessertList.get(ise);
            
            boolean exitssse = false;
            int isse = 0;
            while(true){
                
                if(beverageList.get(isse).getName().equals(nameOfBeverage2)){
                    exitssse = true;
                    break;
                }
                isse++;
            }
            
            Beverage beverage2 = beverageList.get(isse);
            MealSelection selection2 = new MealSelection(2, meal2, dessert2, beverage2);
            selectionsList.add(selection2);
            
            //meals
            boolean exitse3 = false;
            int ie3 = 0;
            while(true){
                
                if(mealList.get(ie3).getName().equals(nameOfMeal3)){
                    exitse3 = true;
                    break;
                }
                ie3++;
            }
            
            Meal meal3 = mealList.get(ie3);
           
            
            boolean exitsse3 = false;
            int ise3 = 0;
            while(true){
                
                if(dessertList.get(ise3).getName().equals(nameOfDessert3)){
                    exitsse3 = true;
                    break;
                }
                ise3++;
            }
            
            Dessert dessert3 = dessertList.get(ise3);
            
            boolean exitssse3 = false;
            int isse3 = 0;
            while(true){
                
                if(beverageList.get(isse3).getName().equals(nameOfBeverage3)){
                    exitssse3 = true;
                    break;
                }
                isse3++;
            }
            
            Beverage beverage3 = beverageList.get(isse3);
            
            MealSelection selection3 = new MealSelection(3, meal3, dessert3, beverage3);
            selectionsList.add(selection3);
             //meal4
             //meals
            boolean exitse4 = false;
            int ie4 = 0;
            while(true){
                
                if(mealList.get(ie4).getName().equals(nameOfMeal4)){
                    exitse4 = true;
                    break;
                }
                ie4++;
            }
            
            Meal meal4 = mealList.get(ie4);
           
            
            boolean exitsse4 = false;
            int ise4 = 0;
            while(true){
                
                if(dessertList.get(ise4).getName().equals(nameOfDessert4)){
                    exitsse4 = true;
                    break;
                }
                ise4++;
            }
            
            Dessert dessert4 = dessertList.get(ise4);
            
            boolean exitssse4 = false;
            int isse4 = 0;
            while(true){
                
                if(beverageList.get(isse4).getName().equals(nameOfBeverage4)){
                    exitssse4 = true;
                    break;
                }
                isse4++;
            }
            
            Beverage beverage4 = beverageList.get(isse4);
            MealSelection selection4 = new MealSelection(4, meal4, dessert4, beverage4);
            selectionsList.add(selection4);
          
            Order order = new Order(4, guestAmount, tableNum);
            
            //pass the selection and the order to the database class and adds to relevant tables.
            main.db.insertOrder(order, selectionsList);
             newOrderModel.addData(order);
        }  
    }//GEN-LAST:event_createOrderActionPerformed

    private void meal1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_meal1ItemStateChanged
       
        int selectedItem = (int) meal1.getSelectedIndex();
        
        meal1Id = selectedItem;
        
        
    }//GEN-LAST:event_meal1ItemStateChanged

    private void meal2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_meal2ItemStateChanged
        
        int selectedItem = (int) meal2.getSelectedIndex();
        
        meal2Id = selectedItem;
        
    }//GEN-LAST:event_meal2ItemStateChanged

    private void meal3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_meal3ItemStateChanged
       
        int selectedItem = (int) meal3.getSelectedIndex();
        
        meal3Id = selectedItem;
        
    }//GEN-LAST:event_meal3ItemStateChanged

    private void meal4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_meal4ItemStateChanged
       
        int selectedItem = (int) meal3.getSelectedIndex();
        
        meal4Id = selectedItem;
        
    }//GEN-LAST:event_meal4ItemStateChanged

    private void dessert1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dessert1ItemStateChanged
         int selectedItem = (int) dessert1.getSelectedIndex();
        
        dessert1Id = selectedItem;
    }//GEN-LAST:event_dessert1ItemStateChanged

    private void dessert2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dessert2ItemStateChanged
       int selectedItem = (int) dessert2.getSelectedIndex();
        
        dessert2Id = selectedItem;
        
    }//GEN-LAST:event_dessert2ItemStateChanged

    private void dessert3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dessert3ItemStateChanged
        
        int selectedItem = (int) dessert3.getSelectedIndex();
        
        dessert3Id = selectedItem;
        
    }//GEN-LAST:event_dessert3ItemStateChanged

    private void dessert4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_dessert4ItemStateChanged
       
        int selectedItem = (int) dessert4.getSelectedIndex();
        
        dessert4Id = selectedItem;
        
    }//GEN-LAST:event_dessert4ItemStateChanged

    private void beverage1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_beverage1ItemStateChanged
       
        int selectedItem = (int) beverage1.getSelectedIndex();
        
        bev1Id = selectedItem;
        
    }//GEN-LAST:event_beverage1ItemStateChanged

    private void beverage2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_beverage2ItemStateChanged
       
       int selectedItem = (int) beverage2.getSelectedIndex();
        
        bev2Id = selectedItem;
        
    }//GEN-LAST:event_beverage2ItemStateChanged

    private void beverage3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_beverage3ItemStateChanged
       
        int selectedItem = (int) beverage3.getSelectedIndex();
        
        bev3Id = selectedItem;
        
    }//GEN-LAST:event_beverage3ItemStateChanged

    private void beverage4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_beverage4ItemStateChanged
       
        int selectedItem = (int) beverage4.getSelectedIndex();
        
        bev4Id = selectedItem;
        
    }//GEN-LAST:event_beverage4ItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateOrder;
    private javax.swing.JPanel LeftPanel;
    private javax.swing.JButton ViewOrder;
    private javax.swing.JComboBox<String> beverage1;
    private javax.swing.JComboBox<String> beverage2;
    private javax.swing.JComboBox<String> beverage3;
    private javax.swing.JComboBox<String> beverage4;
    private javax.swing.JPanel create;
    private javax.swing.JButton createOrder;
    private javax.swing.JComboBox<String> dessert1;
    private javax.swing.JComboBox<String> dessert2;
    private javax.swing.JComboBox<String> dessert3;
    private javax.swing.JComboBox<String> dessert4;
    private javax.swing.JPanel guest1Selection;
    private javax.swing.JPanel guest2Selection;
    private javax.swing.JPanel guest3Selection;
    private javax.swing.JPanel guest4Selection;
    private javax.swing.JComboBox<String> guests;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    private javax.swing.JComboBox<String> meal1;
    private javax.swing.JComboBox<String> meal2;
    private javax.swing.JComboBox<String> meal3;
    private javax.swing.JComboBox<String> meal4;
    private javax.swing.JLabel name;
    private javax.swing.JComboBox<String> table;
    private javax.swing.JPanel view;
    // End of variables declaration//GEN-END:variables
}
