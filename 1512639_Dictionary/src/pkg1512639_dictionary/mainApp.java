/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1512639_dictionary;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author phamanhtuan
 */
public class mainApp extends javax.swing.JFrame {

    private DictionaryController  dicController = new DictionaryController();
    private List<Word> listFavoriteWords = FileIO.readObjects(NameDefine.NAME_FAVORITEWORDS);
    private List<HistorySearch> listHistorySearchs = FileIO.readObjects(NameDefine.NAME_HISTORY_SEARCH);
    private boolean isFavoriteWoddsChanged = false; 
    private String   currentWord = "";
  
    /**
     * Creates new form main
     */
    public mainApp() {
       
        /*Map temp =  DataLetterDefine.getInstance().listLettersIndexs;
        for(Object key : temp.keySet()){
            System.out.println("KEY :" + key + "INDEX : " + temp.get(key));
        }*/
        initComponents();
        loadHistorySearch();
        for(HistorySearch object : listHistorySearchs){
            System.out.println(object.word.word +  "-"+ object.frequence);
        }
        
        setLocationRelativeTo(null);
        mainTab.setBackground(new Color(0,0,0,50));
        navigaPanel.setBackground(new Color(0,0,0,150));
        historySearchTab.setBackground(new Color(0,0,0,150));
        searchTab.setBackground(new Color(0,0,0,150));
        addFavoriteWordPanel.setBackground(new Color(0,0,0,0));
        favoriteWordsTab.setBackground(new Color(0,0,0,150));
        
        searchTab.show();
        favoriteWordsTab.hide();
        historySearchTab.hide();
        
        DefaultListCellRenderer renderer =  (DefaultListCellRenderer)JListEnglishFavoriteWords.getCellRenderer();  
        renderer.setHorizontalAlignment(JLabel.CENTER); 
        
        
        DefaultListCellRenderer renderer2 =  (DefaultListCellRenderer)JListVietnamesFavoriteWords.getCellRenderer();  
        renderer2.setHorizontalAlignment(JLabel.CENTER); 
        //wordLabel.setBackground(new Color(0,0,0,0));
        
        //
        historyTable.setBackground(new Color(0,0,0,0));
        ((DefaultTableCellRenderer)historyTable.getDefaultRenderer(Object.class)).setBackground(new Color(0,0,0,0));
        historyTable.setGridColor(Color.WHITE);
        
        scrollHistoryTable.setBackground(new Color(0,0,0,0));
        scrollHistoryTable.setOpaque(false);
        
        ((DefaultTableCellRenderer)historyTable.getDefaultRenderer(Object.class)).setOpaque(true);
        scrollHistoryTable.getViewport().setOpaque(false);
        
        historyTable.setShowGrid(true);
        
        
        
        
        translateButton.setBackground(ButtonColorDefine.TRANSLATE_BUTTON_COLOR);
        favoriteButton.setBackground(ButtonColorDefine.FAVORITE_BUTTON_COLOR);
        historyButton.setBackground(ButtonColorDefine.HISTORY_BUTTON_COLOR);
    
        initButtonColor(ButtonType.TRANSLATE_BUTTON, translateButton);
        initButtonColor(ButtonType.HISTORY_BUTTON, historyButton);
        initButtonColor(ButtonType.FAVORITE_BUTTON, favoriteButton);
        initButtonColor(ButtonType.TRANSLATE_BUTTON, btnSearch);
        
        autocompletedPanel.setVisible(false);
        
        
        loadFavoriteWords();
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                FileIO.writeObjects(listFavoriteWords,NameDefine.NAME_FAVORITEWORDS);
                FileIO.writeObjects(listHistorySearchs,NameDefine.NAME_HISTORY_SEARCH);
            }       
        });
        
        addJListMouseListenerFor(JListEnglishFavoriteWords,DictionaryType.ENGLISH_VIETNAMES);
        addJListMouseListenerFor(JListVietnamesFavoriteWords,DictionaryType.VIETNAMES_ENGLISH);
        
    }
    
    private void addJListMouseListenerFor(JList jlist,DictionaryType typeOfDictionary){
        jlist.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
                JList jlistComponent = (JList) e.getSource();
                if(e.getClickCount() == 2){
                    int x = e.getLocationOnScreen().x;
                    int y = e.getLocationOnScreen().y;
                    
                    int index = jlistComponent.locationToIndex(e.getPoint());
                    String word = jlistComponent.getModel().getElementAt(index).toString();
                    String mean = "";
                    WordTranslate notifaication =  new WordTranslate();
                    
                    if(typeOfDictionary == DictionaryType.ENGLISH_VIETNAMES){
                        mean = dicController.getMeanOfWord(word, DictionaryType.ENGLISH_VIETNAMES);
                    }
                    else{
                        mean = dicController.getMeanOfWord(word, DictionaryType.VIETNAMES_ENGLISH);
                    }
                    notifaication.setContent(word,mean);
                    notifaication.setLocation(x, y);
                    System.out.println(mean);
                    notifaication.setVisible(true);
                    //notifaication.setEnabled(true);
                }
            }
            
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tfWordSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        autocompletedPanel = new javax.swing.JPanel();
        srollAutoCompleted = new javax.swing.JScrollPane();
        listWordAutoCompleted = new javax.swing.JList<>();
        cbboxDictionaryType = new javax.swing.JComboBox<>();
        mainTab = new javax.swing.JPanel();
        navigaPanel = new javax.swing.JPanel();
        translateButton = new javax.swing.JButton();
        favoriteButton = new javax.swing.JButton();
        historyButton = new javax.swing.JButton();
        historySearchTab = new javax.swing.JPanel();
        scrollHistoryTable = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        calenderStartDate = new com.toedter.calendar.JDateChooser();
        calendarEndDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        favoriteWordsTab = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JListEnglishFavoriteWords = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        JListVietnamesFavoriteWords = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        searchTab = new javax.swing.JPanel();
        contentScroll = new javax.swing.JScrollPane();
        contentText = new javax.swing.JTextArea();
        wordLabel = new javax.swing.JLabel();
        addFavoriteWordPanel = new javax.swing.JPanel();
        addFavortieWordLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfWordSearch.setBackground(new java.awt.Color(255, 255, 255));
        tfWordSearch.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        tfWordSearch.setForeground(new java.awt.Color(102, 102, 102));
        tfWordSearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfWordSearch.setToolTipText("researh your word");
        tfWordSearch.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));
        tfWordSearch.setCaretColor(new java.awt.Color(0, 0, 0));
        tfWordSearch.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        tfWordSearch.setSelectionColor(new java.awt.Color(255, 51, 102));
        tfWordSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfWordSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfWordSearchKeyReleased(evt);
            }
        });
        jPanel1.add(tfWordSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 200, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon("/Users/phamanhtuan/Downloads/icons8-search-32.png")); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        srollAutoCompleted.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        srollAutoCompleted.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        srollAutoCompleted.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        listWordAutoCompleted.setBackground(new java.awt.Color(255, 255, 255));
        listWordAutoCompleted.setFont(new java.awt.Font("Lucida Grande", 0, 15)); // NOI18N
        listWordAutoCompleted.setForeground(new java.awt.Color(51, 51, 51));
        listWordAutoCompleted.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listWordAutoCompleted.setBounds(new java.awt.Rectangle(0, 0, 39, 141));
        listWordAutoCompleted.setMaximumSize(new java.awt.Dimension(60, 441));
        listWordAutoCompleted.setMinimumSize(new java.awt.Dimension(60, 441));
        listWordAutoCompleted.setSelectionBackground(new java.awt.Color(255, 51, 102));
        listWordAutoCompleted.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                listWordAutoCompletedKeyReleased(evt);
            }
        });
        srollAutoCompleted.setViewportView(listWordAutoCompleted);

        javax.swing.GroupLayout autocompletedPanelLayout = new javax.swing.GroupLayout(autocompletedPanel);
        autocompletedPanel.setLayout(autocompletedPanelLayout);
        autocompletedPanelLayout.setHorizontalGroup(
            autocompletedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srollAutoCompleted, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        autocompletedPanelLayout.setVerticalGroup(
            autocompletedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(srollAutoCompleted, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        jPanel1.add(autocompletedPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 200, 520));

        cbboxDictionaryType.setBackground(new java.awt.Color(255, 153, 102));
        cbboxDictionaryType.setForeground(new java.awt.Color(51, 51, 51));
        cbboxDictionaryType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ENGLISH - VIETNAMES", "VIETNAMES - ENGLISH" }));
        cbboxDictionaryType.setBorder(null);
        jPanel1.add(cbboxDictionaryType, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 26, 200, 30));

        mainTab.setBackground(new java.awt.Color(153, 153, 153));
        mainTab.setOpaque(false);
        mainTab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navigaPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 0, 0));

        translateButton.setBackground(new java.awt.Color(255, 102, 153));
        translateButton.setForeground(new java.awt.Color(255, 255, 255));
        translateButton.setText("TRANSLATE WORD");
        translateButton.setBorderPainted(false);
        translateButton.setContentAreaFilled(false);
        translateButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        translateButton.setOpaque(true);
        translateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                translateButtonActionPerformed(evt);
            }
        });
        navigaPanel.add(translateButton);

        favoriteButton.setBackground(new java.awt.Color(255, 102, 153));
        favoriteButton.setForeground(new java.awt.Color(255, 255, 255));
        favoriteButton.setText("FAVORITE WORDS");
        favoriteButton.setBorderPainted(false);
        favoriteButton.setContentAreaFilled(false);
        favoriteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        favoriteButton.setOpaque(true);
        favoriteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                favoriteButtonActionPerformed(evt);
            }
        });
        navigaPanel.add(favoriteButton);

        historyButton.setBackground(new java.awt.Color(255, 102, 153));
        historyButton.setForeground(new java.awt.Color(255, 255, 255));
        historyButton.setText("HISTORY SEARCH");
        historyButton.setBorderPainted(false);
        historyButton.setContentAreaFilled(false);
        historyButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        historyButton.setOpaque(true);
        historyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyButtonActionPerformed(evt);
            }
        });
        navigaPanel.add(historyButton);

        mainTab.add(navigaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, -1));

        historySearchTab.setBackground(new java.awt.Color(255, 153, 51));

        scrollHistoryTable.setBorder(null);

        historyTable.setForeground(new java.awt.Color(255, 255, 255));
        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Word", "Frequence"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        historyTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        historyTable.setColumnSelectionAllowed(true);
        scrollHistoryTable.setViewportView(historyTable);
        historyTable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        calenderStartDate.setForeground(new java.awt.Color(51, 51, 51));

        calendarEndDate.setForeground(new java.awt.Color(102, 102, 102));

        jLabel5.setBackground(new java.awt.Color(255, 0, 102));
        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("START DATE");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("END DATE");

        btnSearch.setBackground(new java.awt.Color(255, 0, 102));
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH HISTORY");
        btnSearch.setBorderPainted(false);
        btnSearch.setContentAreaFilled(false);
        btnSearch.setOpaque(true);
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout historySearchTabLayout = new javax.swing.GroupLayout(historySearchTab);
        historySearchTab.setLayout(historySearchTabLayout);
        historySearchTabLayout.setHorizontalGroup(
            historySearchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollHistoryTable)
            .addGroup(historySearchTabLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addGroup(historySearchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(calenderStartDate, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50)
                .addGroup(historySearchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calendarEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, historySearchTabLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
        );
        historySearchTabLayout.setVerticalGroup(
            historySearchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(historySearchTabLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(historySearchTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(historySearchTabLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calenderStartDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(historySearchTabLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(calendarEndDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollHistoryTable, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        mainTab.add(historySearchTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 770, 620));

        favoriteWordsTab.setBackground(new java.awt.Color(255, 204, 204));
        favoriteWordsTab.setLayout(null);

        jScrollPane1.setBorder(null);

        JListEnglishFavoriteWords.setBackground(new java.awt.Color(255, 255, 255));
        JListEnglishFavoriteWords.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        JListEnglishFavoriteWords.setForeground(new java.awt.Color(51, 51, 51));
        JListEnglishFavoriteWords.setSelectionBackground(new java.awt.Color(255, 51, 102));
        jScrollPane1.setViewportView(JListEnglishFavoriteWords);

        favoriteWordsTab.add(jScrollPane1);
        jScrollPane1.setBounds(80, 70, 310, 500);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ENGLISH");
        favoriteWordsTab.add(jLabel3);
        jLabel3.setBounds(80, 40, 310, 22);

        jScrollPane4.setBorder(null);

        JListVietnamesFavoriteWords.setBackground(new java.awt.Color(255, 255, 255));
        JListVietnamesFavoriteWords.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        JListVietnamesFavoriteWords.setForeground(new java.awt.Color(51, 51, 51));
        JListVietnamesFavoriteWords.setSelectionBackground(new java.awt.Color(255, 153, 51));
        jScrollPane4.setViewportView(JListVietnamesFavoriteWords);

        favoriteWordsTab.add(jScrollPane4);
        jScrollPane4.setBounds(396, 70, 300, 500);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("VIETNAMES");
        favoriteWordsTab.add(jLabel4);
        jLabel4.setBounds(400, 40, 290, 22);

        mainTab.add(favoriteWordsTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 770, 620));

        searchTab.setBackground(new java.awt.Color(51, 51, 51));
        searchTab.setLayout(null);

        contentScroll.setBackground(new java.awt.Color(255, 255, 255));
        contentScroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        contentText.setBackground(new java.awt.Color(255, 255, 255));
        contentText.setColumns(20);
        contentText.setForeground(new java.awt.Color(51, 51, 51));
        contentText.setLineWrap(true);
        contentText.setRows(5);
        contentText.setWrapStyleWord(true);
        contentText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        contentText.setCaretColor(new java.awt.Color(255, 255, 255));
        contentText.setDisabledTextColor(new java.awt.Color(255, 51, 153));
        contentScroll.setViewportView(contentText);

        searchTab.add(contentScroll);
        contentScroll.setBounds(0, 60, 770, 470);

        wordLabel.setBackground(new java.awt.Color(255, 51, 102));
        wordLabel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        wordLabel.setForeground(new java.awt.Color(255, 255, 255));
        wordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wordLabel.setIcon(new javax.swing.ImageIcon("/Users/phamanhtuan/Downloads/big-dictionary.png")); // NOI18N
        wordLabel.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        wordLabel.setOpaque(true);
        searchTab.add(wordLabel);
        wordLabel.setBounds(0, 0, 770, 60);

        addFavoriteWordPanel.setLayout(new java.awt.CardLayout());

        addFavortieWordLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        addFavortieWordLabel.setForeground(new java.awt.Color(255, 0, 102));
        addFavortieWordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addFavortieWordLabel.setText("+ ADD TO FAVORITE WORDS");
        addFavortieWordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                addFavortieWordLabelMousePressed(evt);
            }
        });
        addFavoriteWordPanel.add(addFavortieWordLabel, "card2");

        searchTab.add(addFavoriteWordPanel);
        addFavoriteWordPanel.setBounds(0, 530, 770, 50);

        mainTab.add(searchTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 770, 670));

        jPanel1.add(mainTab, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 770, 610));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pkg1512639_dictionary/Atlas.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1130, 650));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1050, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void tfWordSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWordSearchKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String word = tfWordSearch.getText().toString();
            String mean = "";
            int  dictionaryType  = cbboxDictionaryType.getSelectedIndex();
            DictionaryType typeOfDictionary = null;
            switch(dictionaryType)
            {
                case 0:
                {
                    typeOfDictionary = DictionaryType.ENGLISH_VIETNAMES;
                    break;
                }
                case 1:
                {
                    typeOfDictionary = DictionaryType.VIETNAMES_ENGLISH;
                    break;
                }
                
                default:break;
                    
            }
            contentText.selectAll(); contentText.replaceSelection("");
            mean = dicController.getMeanOfWord(word,typeOfDictionary);
            

            
            updateHistorySearchByWord(word, typeOfDictionary);
            currentWord = word;
            wordLabel.setText(word.toUpperCase());
            contentText.append(mean);
        }

        
    }//GEN-LAST:event_tfWordSearchKeyPressed

    private void tfWordSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfWordSearchKeyReleased
        // TODO add your handling code here:
                
        if(evt.getKeyCode() == KeyEvent.VK_DOWN){
            if(tfWordSearch.getText().length() > 0){
                listWordAutoCompleted.requestFocusInWindow();
              
            }
        }
        
        
        if(evt.getKeyCode() != KeyEvent.VK_ENTER){
            String word = tfWordSearch.getText().toString();

            if(word.length() == 0){
                DefaultListModel<String> newlist = new  DefaultListModel<>();
                listWordAutoCompleted.setModel(newlist);
                autocompletedPanel.setVisible(false);

                return;

            }
            if(word.length() < 1){
               return;
            }

            int dicType = cbboxDictionaryType.getSelectedIndex();
            List<String> listWords = null;
            if(dicType == 0){
                listWords = dicController.listWordEnglishVietnames.getListWordsAutoSuggestions(word);
            }
            else{

                listWords = dicController.listWordVietnamesEnglish.getListWordsAutoSuggestions(word);
            }
            DefaultListModel<String> newlist = new  DefaultListModel<>();
            for(String key : listWords){
                newlist.addElement(key);
            }

            listWordAutoCompleted.setModel(newlist);
            autocompletedPanel.setVisible(true);
        }        
    }//GEN-LAST:event_tfWordSearchKeyReleased

    private void listWordAutoCompletedKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listWordAutoCompletedKeyReleased
        // TODO add your handling code here:
        int keyReleased = evt.getKeyCode();
        if(keyReleased == KeyEvent.VK_UP || keyReleased == KeyEvent.VK_DOWN){
            String selectedItemString = listWordAutoCompleted.getSelectedValue();
            tfWordSearch.setText(selectedItemString);
        }
        
        if(keyReleased == KeyEvent.VK_ENTER){
            tfWordSearch.requestFocusInWindow();
            autocompletedPanel.setVisible(false);
        }
    }//GEN-LAST:event_listWordAutoCompletedKeyReleased
    
    private void translateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_translateButtonActionPerformed
        // TODO add your handling code here:
        showSelectedPanel(ButtonType.TRANSLATE_BUTTON);
    }//GEN-LAST:event_translateButtonActionPerformed

    private void favoriteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_favoriteButtonActionPerformed
        // TODO add your handling code here:
        showSelectedPanel(ButtonType.FAVORITE_BUTTON);
        reloadFavoriteWords();
    }//GEN-LAST:event_favoriteButtonActionPerformed

    private void historyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyButtonActionPerformed
        // TODO add your handling code here:
        showSelectedPanel(ButtonType.HISTORY_BUTTON);
        loadHistorySearch();
        for(HistorySearch object : listHistorySearchs){
            System.out.println(object.word.word + object.frequence);
        }

    }//GEN-LAST:event_historyButtonActionPerformed

    private void reloadFavoriteWords(){
        if(isFavoriteWoddsChanged){
            
            isFavoriteWoddsChanged = false;
            DefaultListModel<String> englishModel = new DefaultListModel<>();
            DefaultListModel<String> vietnamesModel = new DefaultListModel<>();
            
            
            for(Word word : listFavoriteWords){
                if(word.typeOfDictionary == DictionaryType.ENGLISH_VIETNAMES){
                    englishModel.addElement(word.word);
                }
                
                if(word.typeOfDictionary == DictionaryType.VIETNAMES_ENGLISH){
                   vietnamesModel.addElement(word.word);
                }
            }
            
            JListEnglishFavoriteWords.setModel(englishModel);
            JListVietnamesFavoriteWords.setModel(vietnamesModel);
        }
        
        
    }
    
    public void loadFavoriteWords(){
            DefaultListModel<String> englishModel = new DefaultListModel<>();
            DefaultListModel<String> vietnamesModel = new DefaultListModel<>();
            
            
            for(Word word : listFavoriteWords){
                if(word.typeOfDictionary == DictionaryType.ENGLISH_VIETNAMES){
                    englishModel.addElement(word.word);
                }
                
                if(word.typeOfDictionary == DictionaryType.VIETNAMES_ENGLISH){
                   vietnamesModel.addElement(word.word);
                }
            }
            
            JListEnglishFavoriteWords.setModel(englishModel);
            JListVietnamesFavoriteWords.setModel(vietnamesModel);    
    
    }
    
    private void addFavortieWordLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addFavortieWordLabelMousePressed
        // TODO add your handling code here:
        
        DictionaryType typeOfDictioanry  = cbboxDictionaryType.getSelectedIndex() == 0? DictionaryType.ENGLISH_VIETNAMES: DictionaryType.VIETNAMES_ENGLISH;
        if(!isFavoriteWordContains(currentWord)){
            isFavoriteWoddsChanged = true;
            listFavoriteWords.add(new Word(currentWord,typeOfDictioanry));
        }
    }//GEN-LAST:event_addFavortieWordLabelMousePressed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        
        Date startDate = calenderStartDate.getDate();
        Date endDate = calendarEndDate.getDate();
        
        loadHistorySearchTableByTime(startDate, endDate);
    }//GEN-LAST:event_btnSearchActionPerformed
    
    boolean isFavoriteWordContains(String word){
        
        for(Word favoriteWord : listFavoriteWords){
            if(favoriteWord.word.equals(word)){
                return true;
            }
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(mainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainApp().setVisible(true);
            }
        });
    }
 
    private void initButtonColor(ButtonType typeOfButtonType,JButton button){
        button.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                //button.setBackground(ButtonColorDefine.CLICKED_BUTTON_COLOR);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                button.setBackground(ButtonColorDefine.PRESSED_BUTTON_COLOR);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                innitDefautButtonColor(button,typeOfButtonType);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                button.setBackground(ButtonColorDefine.ENTERED_BUTTON_COLOR);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                innitDefautButtonColor(button,typeOfButtonType);
                
            }
        });     
    }
    
    private void innitDefautButtonColor(JButton button, ButtonType typeOfButton){
                switch(typeOfButton){
                    case TRANSLATE_BUTTON:
                        button.setBackground(ButtonColorDefine.TRANSLATE_BUTTON_COLOR);
                        break;
                        
                    case FAVORITE_BUTTON:
                        button.setBackground(ButtonColorDefine.FAVORITE_BUTTON_COLOR);
                        break;
                    
                    case HISTORY_BUTTON:
                        button.setBackground(ButtonColorDefine.HISTORY_BUTTON_COLOR);
                        break;
                    
                        default: break;
                    
                }
    }
    
    public void showSelectedPanel(ButtonType typeOfButon){
        
        historySearchTab.hide();
        searchTab.hide();
        favoriteWordsTab.hide();
        switch(typeOfButon){
            case TRANSLATE_BUTTON:
                searchTab.show();
                break;
            
            case FAVORITE_BUTTON:
                favoriteWordsTab.show();
                break;
                
            case HISTORY_BUTTON:
                historySearchTab.show();
                break;
                
            default: break;
               
        }
    
    }
    
    public void loadHistorySearch(){
       
        DefaultTableModel  model = (DefaultTableModel)historyTable.getModel();

        for(HistorySearch object : listHistorySearchs){
            
            String word = object.word.word;
            int freq = object.frequence;
            
            model.addRow(new Object[]{word,freq});
            
        }
        
        
    }
    
    public  void loadHistorySearchTableByTime(Date startDate, Date endDate){
        
        List<HistorySearch> listHistory = new ArrayList();
        DefaultTableModel newModel = new DefaultTableModel();
        newModel.addColumn("Word");
        newModel.addColumn("Frequece");
        
        if(startDate == null || endDate == null){
            return;
        }
        if(startDate.before(endDate)){
            for(HistorySearch object : listHistorySearchs){
                if(object.time.after(startDate) && object.time.before(endDate)){
                   
                    System.out.println("CHECK :" + object.word.word);
                    
                    newModel.addRow(new Object[]{object.word.word,object.frequence});
                }
            }
        }
        
        System.out.println("SIZE : " + newModel.getRowCount());
        
        historyTable.setModel(newModel);
        historyTable.setGridColor(Color.white);
        historyTable.setForeground(Color.white);

        
    }
      
    private boolean isListHistorySearchContains(String word,DictionaryType typeOfDictionary){
        for(HistorySearch object : listHistorySearchs){
            if(object.word.word.equals(word) && typeOfDictionary == object.word.typeOfDictionary){
                return true;
            }
        }
        
        return false;
    }
    
    private void updateHistorySearchByWord(String word, DictionaryType typeOfDictionary){
    
        //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date currentDate = new Date();
       
        
        if(!isListHistorySearchContains(word, typeOfDictionary)){
                listHistorySearchs.add(new HistorySearch(new Word(word, typeOfDictionary), currentDate,1));
                addRowToHistorySearchTable(new Object[]{word,1});
                return;
        }
        
        for(int index = 0; index < listHistorySearchs.size(); index++){
            if(listHistorySearchs.get(index).word.word.equals(word) &&
               listHistorySearchs.get(index).word.typeOfDictionary == typeOfDictionary){
               
               listHistorySearchs.get(index).frequence++;
               int rowIndex = getRowIndexOfHistorySearchTableByWord(word);
               int colIndex = ((DefaultTableModel)historyTable.getModel()).findColumn("Frequence");
               if(rowIndex >= 0){
                   updateRowHistorySearchTableByIndex(listHistorySearchs.get(index).frequence,rowIndex,colIndex);
               }
               
               break;
            }
        }
    }
    
    private int getRowIndexOfHistorySearchTableByWord(String word){
        
        DefaultTableModel model = (DefaultTableModel) historyTable.getModel();
        int numberRows = model.getRowCount();
        int columnIndex =  model.findColumn("Word");
        
        for(int rowIndex =0; rowIndex < numberRows; rowIndex++){
            String value = model.getValueAt(rowIndex, columnIndex).toString();
            if(value.equals(word)){
                return  rowIndex;
            }
        }
        return -1;
    }
   
    private void addRowToHistorySearchTable(Object[] objects){
        ((DefaultTableModel)historyTable.getModel()).addRow(objects);
    }
    
    private void updateRowHistorySearchTableByIndex(Object object,int rowIndex,int colIndex){
        
        DefaultTableModel model = (DefaultTableModel) historyTable.getModel();
        int numberRows = model.getRowCount();        
        if(rowIndex >= numberRows || rowIndex < 0)
            return;
        
        model.setValueAt(object,rowIndex , colIndex);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JListEnglishFavoriteWords;
    private javax.swing.JList<String> JListVietnamesFavoriteWords;
    private javax.swing.JPanel addFavoriteWordPanel;
    private javax.swing.JLabel addFavortieWordLabel;
    private javax.swing.JPanel autocompletedPanel;
    private javax.swing.JButton btnSearch;
    private com.toedter.calendar.JDateChooser calendarEndDate;
    private com.toedter.calendar.JDateChooser calenderStartDate;
    private javax.swing.JComboBox<String> cbboxDictionaryType;
    private javax.swing.JScrollPane contentScroll;
    private javax.swing.JTextArea contentText;
    private javax.swing.JButton favoriteButton;
    private javax.swing.JPanel favoriteWordsTab;
    private javax.swing.JButton historyButton;
    private javax.swing.JPanel historySearchTab;
    private javax.swing.JTable historyTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JList<String> listWordAutoCompleted;
    private javax.swing.JPanel mainTab;
    private javax.swing.JPanel navigaPanel;
    private javax.swing.JScrollPane scrollHistoryTable;
    private javax.swing.JPanel searchTab;
    private javax.swing.JScrollPane srollAutoCompleted;
    private javax.swing.JTextField tfWordSearch;
    private javax.swing.JButton translateButton;
    private javax.swing.JLabel wordLabel;
    // End of variables declaration//GEN-END:variables
}
