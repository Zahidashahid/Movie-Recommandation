/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BusinessLogic.RecommenderEngineController;
import DTOs.MovieDTO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Java @Xiumin
 */
public class Home extends javax.swing.JFrame {

    
    /**
     * Creates new form Try
     */
    public Home() throws SQLException 
    {
        initComponents();

        recentReleasesMovie1ScrollPane.setVisible(false);
        recentReleasesMovie2ScrollPane.setVisible(false);
        recentReleasesMovie4ScrollPane.setVisible(false);
        recentReleasesMovie5ScrollPane.setVisible(false);
        recentReleasesMovie6ScrollPane.setVisible(false);
        allTimeFamousMovie1ScrollPane.setVisible(false);
        allTimeFamousMovie2ScrollPane.setVisible(false);
        allTimeFamousMovie4ScrollPane.setVisible(false);
        allTimeFamousMovie5ScrollPane.setVisible(false);
        allTimeFamousMovie6ScrollPane.setVisible(false);
        
        recentReleasesMovie1Label.setVisible(false);
        recentReleasesMovie2Label.setVisible(false);
        recentReleasesMovie4Label.setVisible(false);
        recentReleasesMovie5Label.setVisible(false);
        recentReleasesMovie6Label.setVisible(false);
        allTimeFamousMovie1Label.setVisible(false);
        allTimeFamousMovie2Label.setVisible(false);
        allTimeFamousMovie4Label.setVisible(false);
        allTimeFamousMovie5Label.setVisible(false);
        allTimeFamousMovie6Label.setVisible(false);
        
        recentReleasesMovie1TitleScrollPane.setVisible(false);
        recentReleasesMovie2TitleScrollPane.setVisible(false);
        recentReleasesMovie3TitleScrollPane.setVisible(false);
        recentReleasesMovie4TitleScrollPane.setVisible(false);
        recentReleasesMovie5TitleScrollPane.setVisible(false);
        recentReleasesMovie6TitleScrollPane.setVisible(false);
        allTimeFamousMovie1TitleScrollPane.setVisible(false);
        allTimeFamousMovie2TitleScrollPane.setVisible(false); 
        allTimeFamousMovie3TitleScrollPane.setVisible(false);
        allTimeFamousMovie4TitleScrollPane.setVisible(false);
        allTimeFamousMovie5TitleScrollPane.setVisible(false);
        allTimeFamousMovie6TitleScrollPane.setVisible(false);
        
        recentReleasesMovie1TitleLabel.setVisible(false);
        recentReleasesMovie2TitleLabel.setVisible(false);
        recentReleasesMovie3TitleLabel.setVisible(false);
        recentReleasesMovie4TitleLabel.setVisible(false);
        recentReleasesMovie5TitleLabel.setVisible(false);
        recentReleasesMovie6TitleLabel.setVisible(false);
        allTimeFamousMovie1TitleLabel.setVisible(false);
        allTimeFamousMovie2TitleLabel.setVisible(false);       
        allTimeFamousMovie3TitleLabel.setVisible(false);
        allTimeFamousMovie4TitleLabel.setVisible(false);
        allTimeFamousMovie5TitleLabel.setVisible(false);
        allTimeFamousMovie6TitleLabel.setVisible(false);
        
    }
    
    
    
    public void getRecentAndPopularMovies() throws SQLException
    {
        RecommenderEngineController objRecommenderEngineController = new RecommenderEngineController();
        ArrayList<MovieDTO> top10RecentMovies = objRecommenderEngineController.getTop10RecentMovies();                                 
       
        System.out.println(top10RecentMovies.get(0).movieId);
        System.out.println(top10RecentMovies.get(1).movieId);
        System.out.println(top10RecentMovies.get(2).movieId);
        System.out.println(top10RecentMovies.get(3).movieId);
        System.out.println(top10RecentMovies.get(4).movieId);
        System.out.println(top10RecentMovies.get(5).movieId);
        System.out.println(top10RecentMovies.get(6).movieId);
        System.out.println(top10RecentMovies.get(7).movieId);
        System.out.println(top10RecentMovies.get(8).movieId);
        System.out.println(top10RecentMovies.get(9).movieId);
        
        //set Path for movie Images
        String movie1Image1Path = "" + top10RecentMovies.get(2).movieId;
        String movie1Image2Path = "" + top10RecentMovies.get(2).movieId;
        String movie2Image1Path = "" + top10RecentMovies.get(7).movieId;
        String movie2Image2Path = "" + top10RecentMovies.get(7).movieId;
        String movie3Image1Path = "" + top10RecentMovies.get(9).movieId;
        String movie3Image2Path = "" + top10RecentMovies.get(9).movieId;
        String movie4Image1Path = "" + top10RecentMovies.get(4).movieId;
        String movie4Image2Path = "" + top10RecentMovies.get(4).movieId;
        String movie5Image1Path = "" + top10RecentMovies.get(6).movieId;
        String movie5Image2Path = "" + top10RecentMovies.get(6).movieId;
        String movie6Image1Path = "" + top10RecentMovies.get(3).movieId;
        String movie6Image2Path = "" + top10RecentMovies.get(3).movieId;
        
        

        ImageIcon movie1Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie1Image1Path + "\\pic 1.jpg");
        ImageIcon movie1Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie1Image2Path + "\\pic 2.jpg");
        ImageIcon movie2Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie2Image1Path + "\\pic 1.jpg");
        ImageIcon movie2Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie2Image2Path + "\\pic 2.jpg");
        ImageIcon movie3Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie3Image1Path + "\\pic 1.jpg");
        ImageIcon movie3Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie3Image2Path + "\\pic 2.jpg");
        ImageIcon movie4Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie4Image1Path + "\\pic 1.jpg");
        ImageIcon movie4Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie4Image2Path + "\\pic 2.jpg");
        ImageIcon movie5Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie5Image1Path + "\\pic 1.jpg");
        ImageIcon movie5Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie5Image2Path + "\\pic 2.jpg");
        ImageIcon movie6Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie6Image1Path + "\\pic 1.jpg");
        ImageIcon movie6Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + movie6Image2Path + "\\pic 2.jpg");
        
        
        recentReleasesMovie1Label.setIcon(movie1Image1);
        recentReleasesMovie2Label.setIcon(movie2Image1);
        recentReleasesMovie3Label.setIcon(movie3Image1);
        recentReleasesMovie4Label.setIcon(movie4Image1);
        recentReleasesMovie5Label.setIcon(movie5Image1);
        recentReleasesMovie6Label.setIcon(movie6Image1);
        

        recentReleasesMovie1Label.setVisible(true);
        recentReleasesMovie1Label.setOpaque(true);
        recentReleasesMovie1ScrollPane.setVisible(true);
        recentReleasesMovie2Label.setVisible(true);
        recentReleasesMovie2Label.setOpaque(true);
        recentReleasesMovie2ScrollPane.setVisible(true);
        recentReleasesMovie3Label.setVisible(true);
        recentReleasesMovie3Label.setOpaque(true);
        recentReleasesMovie3ScrollPane.setVisible(true);
        recentReleasesMovie4Label.setVisible(true);
        recentReleasesMovie4Label.setOpaque(true);
        recentReleasesMovie4ScrollPane.setVisible(true);
        recentReleasesMovie5Label.setVisible(true);
        recentReleasesMovie5Label.setOpaque(true);
        recentReleasesMovie5ScrollPane.setVisible(true);
        recentReleasesMovie6Label.setVisible(true);
        recentReleasesMovie6Label.setOpaque(true);
        recentReleasesMovie6ScrollPane.setVisible(true);


        recentReleasesMovie1TitleLabel.setText(" " + top10RecentMovies.get(2).title);
        recentReleasesMovie1TitleLabel.setOpaque(true);
        recentReleasesMovie1TitleLabel.setVisible(true);
        recentReleasesMovie2TitleLabel.setText(" " + top10RecentMovies.get(7).title);
        recentReleasesMovie2TitleLabel.setOpaque(true);
        recentReleasesMovie2TitleLabel.setVisible(true);
        recentReleasesMovie3TitleLabel.setText(" " + top10RecentMovies.get(9).title);
        recentReleasesMovie3TitleLabel.setOpaque(true);
        recentReleasesMovie3TitleLabel.setVisible(true);
        recentReleasesMovie4TitleLabel.setText(" " + top10RecentMovies.get(4).title);
        recentReleasesMovie4TitleLabel.setOpaque(true);
        recentReleasesMovie4TitleLabel.setVisible(true);
        recentReleasesMovie5TitleLabel.setText(" " + top10RecentMovies.get(6).title);
        recentReleasesMovie5TitleLabel.setOpaque(true);
        recentReleasesMovie5TitleLabel.setVisible(true);
        recentReleasesMovie6TitleLabel.setText(" " + top10RecentMovies.get(3).title);
        recentReleasesMovie6TitleLabel.setOpaque(true);
        recentReleasesMovie6TitleLabel.setVisible(true);
        
        recentReleasesMovie1TitleScrollPane.setVisible(true);
        recentReleasesMovie2TitleScrollPane.setVisible(true);
        recentReleasesMovie3TitleScrollPane.setVisible(true);
        recentReleasesMovie4TitleScrollPane.setVisible(true);
        recentReleasesMovie5TitleScrollPane.setVisible(true);
        recentReleasesMovie6TitleScrollPane.setVisible(true);
        

        //________________________________________set popular Movies________________________________________________
         
        ArrayList<MovieDTO> top30PopularMovies = objRecommenderEngineController.getTop30PopularMovies();
                
        System.out.println(top30PopularMovies.get(0).movieId);
        System.out.println(top30PopularMovies.get(1).movieId);
        System.out.println(top30PopularMovies.get(2).movieId);
        System.out.println(top30PopularMovies.get(3).movieId);
        System.out.println(top30PopularMovies.get(4).movieId);
        System.out.println(top30PopularMovies.get(5).movieId);
        System.out.println(top30PopularMovies.get(6).movieId);
        System.out.println(top30PopularMovies.get(7).movieId);
        System.out.println(top30PopularMovies.get(8).movieId);
        System.out.println(top30PopularMovies.get(9).movieId);
        
        //set Path for movie Images
        String popularMovie1Image1Path = "" + top30PopularMovies.get(0).movieId;
        String popularMovie1Image2Path = "" + top30PopularMovies.get(0).movieId;
        String popularMovie2Image1Path = "" + top30PopularMovies.get(1).movieId;
        String popularMovie2Image2Path = "" + top30PopularMovies.get(1).movieId;
        String popularMovie3Image1Path = "" + top30PopularMovies.get(2).movieId;
        String popularMovie3Image2Path = "" + top30PopularMovies.get(2).movieId;
        String popularMovie4Image1Path = "" + top30PopularMovies.get(3).movieId;
        String popularMovie4Image2Path = "" + top30PopularMovies.get(3).movieId;
        String popularMovie5Image1Path = "" + top30PopularMovies.get(7).movieId;
        String popularMovie5Image2Path = "" + top30PopularMovies.get(7).movieId;
        String popularMovie6Image1Path = "" + top30PopularMovies.get(9).movieId;
        String popularMovie6Image2Path = "" + top30PopularMovies.get(9).movieId;
        
        

        ImageIcon popularMovie1Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie1Image1Path + "\\pic 1.jpg");
        ImageIcon popularMovie1Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie1Image2Path + "\\pic 2.jpg");
        ImageIcon popularMovie2Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie2Image1Path + "\\pic 1.jpg");
        ImageIcon popularMovie2Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie2Image2Path + "\\pic 2.jpg");
        ImageIcon popularMovie3Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie3Image1Path + "\\pic 1.jpg");
        ImageIcon popularMovie3Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie3Image2Path + "\\pic 2.jpg");
        ImageIcon popularMovie4Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie4Image1Path + "\\pic 1.jpg");
        ImageIcon popularMovie4Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie4Image2Path + "\\pic 2.jpg");
        ImageIcon popularMovie5Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie5Image1Path + "\\pic 1.jpg");
        ImageIcon popularMovie5Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie5Image2Path + "\\pic 2.jpg");
        ImageIcon popularMovie6Image1 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie6Image1Path + "\\pic 1.jpg");
        ImageIcon popularMovie6Image2 = new ImageIcon("F:\\_BSE\\4th Semester\\Database Systems I\\Project\\Pictures\\" + popularMovie6Image2Path + "\\pic 2.jpg");
        
        
        allTimeFamousMovie1Label.setIcon(popularMovie1Image1);
        allTimeFamousMovie2Label.setIcon(popularMovie2Image1);
        allTimeFamousMovie3Label.setIcon(popularMovie3Image1);
        allTimeFamousMovie4Label.setIcon(popularMovie4Image1);
        allTimeFamousMovie5Label.setIcon(popularMovie5Image1);
        allTimeFamousMovie6Label.setIcon(popularMovie6Image1);
        

        allTimeFamousMovie1Label.setVisible(true);
        allTimeFamousMovie1Label.setOpaque(true);
        allTimeFamousMovie1ScrollPane.setVisible(true);
        allTimeFamousMovie2Label.setVisible(true);
        allTimeFamousMovie2Label.setOpaque(true);
        allTimeFamousMovie2ScrollPane.setVisible(true);
        allTimeFamousMovie3Label.setVisible(true);
        allTimeFamousMovie3Label.setOpaque(true);
        allTimeFamousMovie3ScrollPane.setVisible(true);
        allTimeFamousMovie4Label.setVisible(true);
        allTimeFamousMovie4Label.setOpaque(true);
        allTimeFamousMovie4ScrollPane.setVisible(true);
        allTimeFamousMovie5Label.setVisible(true);
        allTimeFamousMovie5Label.setOpaque(true);
        allTimeFamousMovie5ScrollPane.setVisible(true);
        allTimeFamousMovie6Label.setVisible(true);
        allTimeFamousMovie6Label.setOpaque(true);
        allTimeFamousMovie6ScrollPane.setVisible(true);


        allTimeFamousMovie1TitleLabel.setText(" " + top30PopularMovies.get(0).title);
        allTimeFamousMovie1TitleLabel.setVisible(true);
        allTimeFamousMovie2TitleLabel.setText(" " + top30PopularMovies.get(1).title);
        allTimeFamousMovie2TitleLabel.setVisible(true);
        allTimeFamousMovie3TitleLabel.setText(" " + top30PopularMovies.get(2).title);
        allTimeFamousMovie3TitleLabel.setVisible(true);
        allTimeFamousMovie4TitleLabel.setText(" " + top30PopularMovies.get(3).title);
        allTimeFamousMovie4TitleLabel.setVisible(true);
        allTimeFamousMovie5TitleLabel.setText(" " + top30PopularMovies.get(7).title);
        allTimeFamousMovie5TitleLabel.setVisible(true);
        allTimeFamousMovie6TitleLabel.setText(" " + top30PopularMovies.get(9).title);
        allTimeFamousMovie6TitleLabel.setVisible(true);
        
                
        allTimeFamousMovie1TitleScrollPane.setVisible(true);
        allTimeFamousMovie2TitleScrollPane.setVisible(true);
        allTimeFamousMovie3TitleScrollPane.setVisible(true);
        allTimeFamousMovie4TitleScrollPane.setVisible(true);
        allTimeFamousMovie5TitleScrollPane.setVisible(true);
        allTimeFamousMovie6TitleScrollPane.setVisible(true);
    }


    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        logoScrollPane = new javax.swing.JScrollPane();
        logoLabel = new javax.swing.JLabel();
        namePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchTextField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        recentReleasesMovie2ScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie2Label = new javax.swing.JLabel();
        recentReleasesMovie1ScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie1Label = new javax.swing.JLabel();
        recentReleasesMovie3ScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie3Label = new javax.swing.JLabel();
        recentReleasesMovie4ScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie4Label = new javax.swing.JLabel();
        recentReleasesMovie6ScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie6Label = new javax.swing.JLabel();
        recentReleasesMovie5ScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie5Label = new javax.swing.JLabel();
        allTimeFamousMovie5ScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie5Label = new javax.swing.JLabel();
        allTimeFamousMovie6ScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie6Label = new javax.swing.JLabel();
        allTimeFamousMovie4ScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie4Label = new javax.swing.JLabel();
        allTimeFamousMovie1ScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie1Label = new javax.swing.JLabel();
        allTimeFamousMovie3ScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie3Label = new javax.swing.JLabel();
        allTimeFamousMovie2ScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie2Label = new javax.swing.JLabel();
        allTimeFamousHeadingPanel = new javax.swing.JPanel();
        allTimeFamousHeadingLabel = new javax.swing.JLabel();
        recentReleasesHeadingPanel = new javax.swing.JPanel();
        recentReleasesHeadingLabel = new javax.swing.JLabel();
        recentReleasesMovie1TitleScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie1TitleLabel = new javax.swing.JLabel();
        recentReleasesMovie2TitleScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie2TitleLabel = new javax.swing.JLabel();
        recentReleasesMovie4TitleScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie4TitleLabel = new javax.swing.JLabel();
        recentReleasesMovie3TitleScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie3TitleLabel = new javax.swing.JLabel();
        recentReleasesMovie6TitleScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie6TitleLabel = new javax.swing.JLabel();
        recentReleasesMovie5TitleScrollPane = new javax.swing.JScrollPane();
        recentReleasesMovie5TitleLabel = new javax.swing.JLabel();
        allTimeFamousMovie1TitleScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie1TitleLabel = new javax.swing.JLabel();
        allTimeFamousMovie2TitleScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie2TitleLabel = new javax.swing.JLabel();
        allTimeFamousMovie4TitleScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie4TitleLabel = new javax.swing.JLabel();
        allTimeFamousMovie3TitleScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie3TitleLabel = new javax.swing.JLabel();
        allTimeFamousMovie6TitleScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie6TitleLabel = new javax.swing.JLabel();
        allTimeFamousMovie5TitleScrollPane = new javax.swing.JScrollPane();
        allTimeFamousMovie5TitleLabel = new javax.swing.JLabel();
        backgroundImageLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1362, 728));
        setMinimumSize(new java.awt.Dimension(1362, 728));
        setPreferredSize(new java.awt.Dimension(1362, 728));
        getContentPane().setLayout(null);

        logoScrollPane.setViewportBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 2, true));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/logo.png"))); // NOI18N
        logoLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        logoScrollPane.setViewportView(logoLabel);

        getContentPane().add(logoScrollPane);
        logoScrollPane.setBounds(0, 0, 240, 140);

        namePanel.setBackground(new java.awt.Color(138, 6, 81));
        namePanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 255), java.awt.Color.white));
        namePanel.setForeground(new java.awt.Color(255, 204, 0));
        namePanel.setOpaque(false);

        jLabel1.setFont(new java.awt.Font("vtks morning rain 3D", 2, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Movies");

        jLabel2.setFont(new java.awt.Font("vtks morning rain 3D", 2, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Recommendation Engine");

        javax.swing.GroupLayout namePanelLayout = new javax.swing.GroupLayout(namePanel);
        namePanel.setLayout(namePanelLayout);
        namePanelLayout.setHorizontalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, namePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
        );
        namePanelLayout.setVerticalGroup(
            namePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(namePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(namePanel);
        namePanel.setBounds(253, 10, 530, 118);

        searchTextField.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchTextField.setText(" Type here to Search...");
        getContentPane().add(searchTextField);
        searchTextField.setBounds(800, 20, 415, 51);

        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/search.png"))); // NOI18N
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton);
        searchButton.setBounds(1220, 20, 51, 51);

        recentReleasesMovie2ScrollPane.setViewportView(recentReleasesMovie2Label);

        getContentPane().add(recentReleasesMovie2ScrollPane);
        recentReleasesMovie2ScrollPane.setBounds(270, 200, 172, 162);

        recentReleasesMovie1ScrollPane.setViewportView(recentReleasesMovie1Label);

        getContentPane().add(recentReleasesMovie1ScrollPane);
        recentReleasesMovie1ScrollPane.setBounds(70, 200, 172, 162);

        recentReleasesMovie3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/onLoad2(small).gif"))); // NOI18N
        recentReleasesMovie3ScrollPane.setViewportView(recentReleasesMovie3Label);

        getContentPane().add(recentReleasesMovie3ScrollPane);
        recentReleasesMovie3ScrollPane.setBounds(480, 200, 172, 162);

        recentReleasesMovie4ScrollPane.setViewportView(recentReleasesMovie4Label);

        getContentPane().add(recentReleasesMovie4ScrollPane);
        recentReleasesMovie4ScrollPane.setBounds(690, 200, 172, 162);

        recentReleasesMovie6ScrollPane.setViewportView(recentReleasesMovie6Label);

        getContentPane().add(recentReleasesMovie6ScrollPane);
        recentReleasesMovie6ScrollPane.setBounds(1100, 200, 172, 162);

        recentReleasesMovie5ScrollPane.setViewportView(recentReleasesMovie5Label);

        getContentPane().add(recentReleasesMovie5ScrollPane);
        recentReleasesMovie5ScrollPane.setBounds(890, 200, 172, 162);

        allTimeFamousMovie5ScrollPane.setViewportView(allTimeFamousMovie5Label);

        getContentPane().add(allTimeFamousMovie5ScrollPane);
        allTimeFamousMovie5ScrollPane.setBounds(900, 480, 172, 162);

        allTimeFamousMovie6ScrollPane.setViewportView(allTimeFamousMovie6Label);

        getContentPane().add(allTimeFamousMovie6ScrollPane);
        allTimeFamousMovie6ScrollPane.setBounds(1100, 480, 172, 162);

        allTimeFamousMovie4ScrollPane.setViewportView(allTimeFamousMovie4Label);

        getContentPane().add(allTimeFamousMovie4ScrollPane);
        allTimeFamousMovie4ScrollPane.setBounds(690, 480, 172, 162);

        allTimeFamousMovie1Label.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        allTimeFamousMovie1Label.setMaximumSize(new java.awt.Dimension(1363, 728));
        allTimeFamousMovie1Label.setMinimumSize(new java.awt.Dimension(1363, 728));
        allTimeFamousMovie1Label.setPreferredSize(new java.awt.Dimension(1363, 728));
        allTimeFamousMovie1ScrollPane.setViewportView(allTimeFamousMovie1Label);

        getContentPane().add(allTimeFamousMovie1ScrollPane);
        allTimeFamousMovie1ScrollPane.setBounds(70, 480, 172, 162);

        allTimeFamousMovie3Label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/onLoad2(small).gif"))); // NOI18N
        allTimeFamousMovie3ScrollPane.setViewportView(allTimeFamousMovie3Label);

        getContentPane().add(allTimeFamousMovie3ScrollPane);
        allTimeFamousMovie3ScrollPane.setBounds(480, 480, 172, 162);

        allTimeFamousMovie2ScrollPane.setViewportView(allTimeFamousMovie2Label);

        getContentPane().add(allTimeFamousMovie2ScrollPane);
        allTimeFamousMovie2ScrollPane.setBounds(270, 480, 172, 162);

        allTimeFamousHeadingPanel.setBackground(new java.awt.Color(66, 66, 66));
        allTimeFamousHeadingPanel.setForeground(new java.awt.Color(255, 255, 255));

        allTimeFamousHeadingLabel.setBackground(new java.awt.Color(66, 66, 66));
        allTimeFamousHeadingLabel.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        allTimeFamousHeadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        allTimeFamousHeadingLabel.setText(" All Time Famous");

        javax.swing.GroupLayout allTimeFamousHeadingPanelLayout = new javax.swing.GroupLayout(allTimeFamousHeadingPanel);
        allTimeFamousHeadingPanel.setLayout(allTimeFamousHeadingPanelLayout);
        allTimeFamousHeadingPanelLayout.setHorizontalGroup(
            allTimeFamousHeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allTimeFamousHeadingPanelLayout.createSequentialGroup()
                .addComponent(allTimeFamousHeadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        allTimeFamousHeadingPanelLayout.setVerticalGroup(
            allTimeFamousHeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(allTimeFamousHeadingPanelLayout.createSequentialGroup()
                .addComponent(allTimeFamousHeadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        getContentPane().add(allTimeFamousHeadingPanel);
        allTimeFamousHeadingPanel.setBounds(30, 430, 190, 40);

        recentReleasesHeadingPanel.setBackground(new java.awt.Color(66, 66, 66));
        recentReleasesHeadingPanel.setForeground(new java.awt.Color(255, 255, 255));

        recentReleasesHeadingLabel.setBackground(new java.awt.Color(66, 66, 66));
        recentReleasesHeadingLabel.setFont(new java.awt.Font("Sitka Heading", 1, 24)); // NOI18N
        recentReleasesHeadingLabel.setForeground(new java.awt.Color(255, 255, 255));
        recentReleasesHeadingLabel.setText(" Recent Releases");

        javax.swing.GroupLayout recentReleasesHeadingPanelLayout = new javax.swing.GroupLayout(recentReleasesHeadingPanel);
        recentReleasesHeadingPanel.setLayout(recentReleasesHeadingPanelLayout);
        recentReleasesHeadingPanelLayout.setHorizontalGroup(
            recentReleasesHeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recentReleasesHeadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
        );
        recentReleasesHeadingPanelLayout.setVerticalGroup(
            recentReleasesHeadingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(recentReleasesHeadingLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        getContentPane().add(recentReleasesHeadingPanel);
        recentReleasesHeadingPanel.setBounds(30, 150, 184, 40);

        recentReleasesMovie1TitleLabel.setBackground(new java.awt.Color(153, 153, 0));
        recentReleasesMovie1TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recentReleasesMovie1TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        recentReleasesMovie1TitleLabel.setText("zsdasd");
        recentReleasesMovie1TitleLabel.setOpaque(true);
        recentReleasesMovie1TitleScrollPane.setViewportView(recentReleasesMovie1TitleLabel);

        getContentPane().add(recentReleasesMovie1TitleScrollPane);
        recentReleasesMovie1TitleScrollPane.setBounds(70, 370, 170, 50);

        recentReleasesMovie2TitleLabel.setBackground(new java.awt.Color(255, 153, 0));
        recentReleasesMovie2TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recentReleasesMovie2TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        recentReleasesMovie2TitleLabel.setText("zsdasd");
        recentReleasesMovie2TitleLabel.setOpaque(true);
        recentReleasesMovie2TitleScrollPane.setViewportView(recentReleasesMovie2TitleLabel);

        getContentPane().add(recentReleasesMovie2TitleScrollPane);
        recentReleasesMovie2TitleScrollPane.setBounds(270, 370, 170, 50);

        recentReleasesMovie4TitleLabel.setBackground(new java.awt.Color(255, 51, 51));
        recentReleasesMovie4TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recentReleasesMovie4TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        recentReleasesMovie4TitleLabel.setText("zsdasd");
        recentReleasesMovie4TitleLabel.setOpaque(true);
        recentReleasesMovie4TitleScrollPane.setViewportView(recentReleasesMovie4TitleLabel);

        getContentPane().add(recentReleasesMovie4TitleScrollPane);
        recentReleasesMovie4TitleScrollPane.setBounds(690, 370, 170, 50);

        recentReleasesMovie3TitleLabel.setBackground(new java.awt.Color(204, 102, 0));
        recentReleasesMovie3TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recentReleasesMovie3TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        recentReleasesMovie3TitleLabel.setText("zsdasd");
        recentReleasesMovie3TitleLabel.setOpaque(true);
        recentReleasesMovie3TitleScrollPane.setViewportView(recentReleasesMovie3TitleLabel);

        getContentPane().add(recentReleasesMovie3TitleScrollPane);
        recentReleasesMovie3TitleScrollPane.setBounds(480, 370, 170, 50);

        recentReleasesMovie6TitleLabel.setBackground(new java.awt.Color(102, 102, 255));
        recentReleasesMovie6TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recentReleasesMovie6TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        recentReleasesMovie6TitleLabel.setText("zsdasd");
        recentReleasesMovie6TitleLabel.setOpaque(true);
        recentReleasesMovie6TitleScrollPane.setViewportView(recentReleasesMovie6TitleLabel);

        getContentPane().add(recentReleasesMovie6TitleScrollPane);
        recentReleasesMovie6TitleScrollPane.setBounds(1100, 370, 170, 50);

        recentReleasesMovie5TitleLabel.setBackground(new java.awt.Color(204, 0, 255));
        recentReleasesMovie5TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        recentReleasesMovie5TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        recentReleasesMovie5TitleLabel.setText("zsdasd");
        recentReleasesMovie5TitleLabel.setOpaque(true);
        recentReleasesMovie5TitleScrollPane.setViewportView(recentReleasesMovie5TitleLabel);

        getContentPane().add(recentReleasesMovie5TitleScrollPane);
        recentReleasesMovie5TitleScrollPane.setBounds(890, 370, 170, 50);

        allTimeFamousMovie1TitleLabel.setBackground(new java.awt.Color(153, 153, 0));
        allTimeFamousMovie1TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allTimeFamousMovie1TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        allTimeFamousMovie1TitleLabel.setText("zsdasd");
        allTimeFamousMovie1TitleLabel.setOpaque(true);
        allTimeFamousMovie1TitleScrollPane.setViewportView(allTimeFamousMovie1TitleLabel);

        getContentPane().add(allTimeFamousMovie1TitleScrollPane);
        allTimeFamousMovie1TitleScrollPane.setBounds(70, 650, 170, 50);

        allTimeFamousMovie2TitleLabel.setBackground(new java.awt.Color(255, 153, 0));
        allTimeFamousMovie2TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allTimeFamousMovie2TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        allTimeFamousMovie2TitleLabel.setText("zsdasd");
        allTimeFamousMovie2TitleLabel.setOpaque(true);
        allTimeFamousMovie2TitleScrollPane.setViewportView(allTimeFamousMovie2TitleLabel);

        getContentPane().add(allTimeFamousMovie2TitleScrollPane);
        allTimeFamousMovie2TitleScrollPane.setBounds(270, 650, 170, 50);

        allTimeFamousMovie4TitleLabel.setBackground(new java.awt.Color(255, 51, 51));
        allTimeFamousMovie4TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allTimeFamousMovie4TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        allTimeFamousMovie4TitleLabel.setText("zsdasd");
        allTimeFamousMovie4TitleLabel.setOpaque(true);
        allTimeFamousMovie4TitleScrollPane.setViewportView(allTimeFamousMovie4TitleLabel);

        getContentPane().add(allTimeFamousMovie4TitleScrollPane);
        allTimeFamousMovie4TitleScrollPane.setBounds(690, 650, 170, 50);

        allTimeFamousMovie3TitleLabel.setBackground(new java.awt.Color(204, 102, 0));
        allTimeFamousMovie3TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allTimeFamousMovie3TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        allTimeFamousMovie3TitleLabel.setText("zsdasd");
        allTimeFamousMovie3TitleLabel.setOpaque(true);
        allTimeFamousMovie3TitleScrollPane.setViewportView(allTimeFamousMovie3TitleLabel);

        getContentPane().add(allTimeFamousMovie3TitleScrollPane);
        allTimeFamousMovie3TitleScrollPane.setBounds(480, 650, 180, 50);

        allTimeFamousMovie6TitleLabel.setBackground(new java.awt.Color(102, 102, 255));
        allTimeFamousMovie6TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allTimeFamousMovie6TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        allTimeFamousMovie6TitleLabel.setText("zsdasd");
        allTimeFamousMovie6TitleLabel.setOpaque(true);
        allTimeFamousMovie6TitleScrollPane.setViewportView(allTimeFamousMovie6TitleLabel);

        getContentPane().add(allTimeFamousMovie6TitleScrollPane);
        allTimeFamousMovie6TitleScrollPane.setBounds(1100, 650, 170, 50);

        allTimeFamousMovie5TitleLabel.setBackground(new java.awt.Color(204, 0, 255));
        allTimeFamousMovie5TitleLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        allTimeFamousMovie5TitleLabel.setForeground(new java.awt.Color(255, 255, 255));
        allTimeFamousMovie5TitleLabel.setText("zsdasd");
        allTimeFamousMovie5TitleLabel.setOpaque(true);
        allTimeFamousMovie5TitleScrollPane.setViewportView(allTimeFamousMovie5TitleLabel);

        getContentPane().add(allTimeFamousMovie5TitleScrollPane);
        allTimeFamousMovie5TitleScrollPane.setBounds(900, 650, 170, 50);

        backgroundImageLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/background4.jpg"))); // NOI18N
        backgroundImageLabel.setText("jLabel3");
        getContentPane().add(backgroundImageLabel);
        backgroundImageLabel.setBounds(0, -6, 1360, 740);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Home().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel allTimeFamousHeadingLabel;
    private javax.swing.JPanel allTimeFamousHeadingPanel;
    public javax.swing.JLabel allTimeFamousMovie1Label;
    public javax.swing.JScrollPane allTimeFamousMovie1ScrollPane;
    private javax.swing.JLabel allTimeFamousMovie1TitleLabel;
    private javax.swing.JScrollPane allTimeFamousMovie1TitleScrollPane;
    public javax.swing.JLabel allTimeFamousMovie2Label;
    public javax.swing.JScrollPane allTimeFamousMovie2ScrollPane;
    private javax.swing.JLabel allTimeFamousMovie2TitleLabel;
    private javax.swing.JScrollPane allTimeFamousMovie2TitleScrollPane;
    public javax.swing.JLabel allTimeFamousMovie3Label;
    public javax.swing.JScrollPane allTimeFamousMovie3ScrollPane;
    private javax.swing.JLabel allTimeFamousMovie3TitleLabel;
    private javax.swing.JScrollPane allTimeFamousMovie3TitleScrollPane;
    public javax.swing.JLabel allTimeFamousMovie4Label;
    public javax.swing.JScrollPane allTimeFamousMovie4ScrollPane;
    private javax.swing.JLabel allTimeFamousMovie4TitleLabel;
    private javax.swing.JScrollPane allTimeFamousMovie4TitleScrollPane;
    public javax.swing.JLabel allTimeFamousMovie5Label;
    public javax.swing.JScrollPane allTimeFamousMovie5ScrollPane;
    private javax.swing.JLabel allTimeFamousMovie5TitleLabel;
    private javax.swing.JScrollPane allTimeFamousMovie5TitleScrollPane;
    public javax.swing.JLabel allTimeFamousMovie6Label;
    public javax.swing.JScrollPane allTimeFamousMovie6ScrollPane;
    private javax.swing.JLabel allTimeFamousMovie6TitleLabel;
    private javax.swing.JScrollPane allTimeFamousMovie6TitleScrollPane;
    private javax.swing.JLabel backgroundImageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel logoLabel;
    public javax.swing.JScrollPane logoScrollPane;
    private javax.swing.JPanel namePanel;
    private javax.swing.JLabel recentReleasesHeadingLabel;
    private javax.swing.JPanel recentReleasesHeadingPanel;
    public javax.swing.JLabel recentReleasesMovie1Label;
    public javax.swing.JScrollPane recentReleasesMovie1ScrollPane;
    private javax.swing.JLabel recentReleasesMovie1TitleLabel;
    private javax.swing.JScrollPane recentReleasesMovie1TitleScrollPane;
    public javax.swing.JLabel recentReleasesMovie2Label;
    public javax.swing.JScrollPane recentReleasesMovie2ScrollPane;
    private javax.swing.JLabel recentReleasesMovie2TitleLabel;
    private javax.swing.JScrollPane recentReleasesMovie2TitleScrollPane;
    public javax.swing.JLabel recentReleasesMovie3Label;
    public javax.swing.JScrollPane recentReleasesMovie3ScrollPane;
    private javax.swing.JLabel recentReleasesMovie3TitleLabel;
    private javax.swing.JScrollPane recentReleasesMovie3TitleScrollPane;
    public javax.swing.JLabel recentReleasesMovie4Label;
    public javax.swing.JScrollPane recentReleasesMovie4ScrollPane;
    private javax.swing.JLabel recentReleasesMovie4TitleLabel;
    private javax.swing.JScrollPane recentReleasesMovie4TitleScrollPane;
    public javax.swing.JLabel recentReleasesMovie5Label;
    public javax.swing.JScrollPane recentReleasesMovie5ScrollPane;
    private javax.swing.JLabel recentReleasesMovie5TitleLabel;
    private javax.swing.JScrollPane recentReleasesMovie5TitleScrollPane;
    public javax.swing.JLabel recentReleasesMovie6Label;
    public javax.swing.JScrollPane recentReleasesMovie6ScrollPane;
    private javax.swing.JLabel recentReleasesMovie6TitleLabel;
    private javax.swing.JScrollPane recentReleasesMovie6TitleScrollPane;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchTextField;
    // End of variables declaration//GEN-END:variables
}
