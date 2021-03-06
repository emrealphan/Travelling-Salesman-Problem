/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proje;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.awt.Image;


import javax.swing.ImageIcon;



public class MainMenu extends javax.swing.JFrame {

    /**
     *
     */
    private static final long serialVersionUID = -9212969232651255336L;
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public static int[][] adjacencyMatrix = new int[81][81];

    public static ArrayList<String> cityNames = new ArrayList<>();
    public static ArrayList<String> plateNumber = new ArrayList<>();
    public static ArrayList<String> matrix = new ArrayList<>();
    public static ArrayList<String> cities = new ArrayList<>();

    public static ArrayList<String> tut = new ArrayList<>();
    public static ArrayList<String> kisaTut = new ArrayList<>();
    public static ArrayList<Integer> toplamYol = new ArrayList<>();

    public MainMenu() {
        initComponents();
        scaleImage();
        //mapOperations();
        
        textArea.setText("Sayı girdikten sonra Enter'e bas\n");
        textArea.setEditable(false);
        enKisaYolBul.setVisible(false);
    }

    public void scaleImage() {
        ImageIcon icon = new ImageIcon("src\\turkiye-iller-3.png");
        //scaling image to fit label
        Image img = icon.getImage();
        Image imgScale = img.getScaledInstance(label.getWidth(),
                label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(imgScale);
        label.setIcon(scaledIcon);
        setResizable(false);

    }

    public void mapOperations() {
        //TO DO MAP OPERATIONS

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label = new javax.swing.JLabel();
        soru1 = new javax.swing.JTextField();
        cevap1 = new javax.swing.JTextField();
        soru2 = new javax.swing.JTextField();
        enKisaYolBul = new javax.swing.JButton();
        list1 = new java.awt.List();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        soru1.setEditable(false);
        soru1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        soru1.setText("Kaç şehir eklenecek?");
        soru1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soru1ActionPerformed(evt);
            }
        });

        cevap1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cevap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cevap1ActionPerformed(evt);
            }
        });

        soru2.setEditable(false);
        soru2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        soru2.setText("Şehirleri seçiniz:");
        soru2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soru2ActionPerformed(evt);
            }
        });

        enKisaYolBul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enKisaYolBul.setText("En kısa yolları bul");
        enKisaYolBul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enKisaYolBulActionPerformed(evt);
            }
        });

        list1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        list1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list1ActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        textArea.setRows(5);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cevap1)
                    .addComponent(soru1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(enKisaYolBul, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                        .addComponent(soru2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(list1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 1482, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(soru1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cevap1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(soru2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(list1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enKisaYolBul, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        list1.add("Adana");
        list1.add("Adıyaman");
        list1.add("Afyonkarahisar");
        list1.add("Agri");
        list1.add("Amasya");
        list1.add("Ankara");
        list1.add("Antalya");
        list1.add("Artvin");
        list1.add("Aydin");
        list1.add("Balikesir");
        list1.add("Bilecik");
        list1.add("Bingol");
        list1.add("Bitlis");
        list1.add("Bolu");
        list1.add("Burdur");
        list1.add("Bursa");
        list1.add("Canakkale");
        list1.add("Cankiri");
        list1.add("Corum");
        list1.add("Denizli");
        list1.add("Diyarbakir");
        list1.add("Edirne");
        list1.add("Elazig");
        list1.add("Erzincan");
        list1.add("Erzurum");
        list1.add("Eskisehir");
        list1.add("Gaziantep");
        list1.add("Giresun");
        list1.add("Gumushane");
        list1.add("Hakkari");
        list1.add("Hatay");
        list1.add("Isparta");
        list1.add("Mersin");
        list1.add("Istanbul");
        list1.add("Izmir");
        list1.add("Kars");
        list1.add("Kastamonu");
        list1.add("Kayseri");
        list1.add("Kirklareli");
        list1.add("Kirsehir");
        list1.add("Kocaeli");
        list1.add("Konya");
        list1.add("Kutahya");
        list1.add("Malatya");
        list1.add("Manisa");
        list1.add("Kahramanmaras");
        list1.add("Mardin");
        list1.add("Mugla");
        list1.add("Mus");
        list1.add("Nevsehir");
        list1.add("Nigde");
        list1.add("Ordu");
        list1.add("Rize");
        list1.add("Sakarya");
        list1.add("Samsun");
        list1.add("Siirt");
        list1.add("Sinop");
        list1.add("Sivas");
        list1.add("Tekirdag");
        list1.add("Tokat");
        list1.add("Trabzon");
        list1.add("Tunceli");
        list1.add("Sanliurfa");
        list1.add("Usak");
        list1.add("Van");
        list1.add("Yozgat");
        list1.add("Zonguldak");
        list1.add("Aksaray");
        list1.add("Bayburt");
        list1.add("Karaman");
        list1.add("Kirikkale");
        list1.add("Batman");
        list1.add("Sirnak");
        list1.add("Bartin");
        list1.add("Ardahan");
        list1.add("Igdir");
        list1.add("Yalova");
        list1.add("Karabuk");
        list1.add("Kilis");
        list1.add("Osmaniye");
        list1.add("Duzce");
        list1.setMultipleSelections(true);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void soru1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soru1ActionPerformed

    }//GEN-LAST:event_soru1ActionPerformed

    private void cevap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cevap1ActionPerformed
        int cevap = Integer.parseInt(cevap1.getText());
        if (cevap < 3 || cevap > 10) {
            System.out.println("Eklemen gereken sayı 3'ten büyük"
                    + " 10'dan küçük olmak zorunda.");
        } else {
            System.out.println(cevap + " tane şehir işaretledin.");
            enKisaYolBul.setVisible(true);
        }
    }//GEN-LAST:event_cevap1ActionPerformed

    private void soru2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soru2ActionPerformed
    }//GEN-LAST:event_soru2ActionPerformed

    private void enKisaYolBulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enKisaYolBulActionPerformed
        
        int indices = list1.getSelectedIndexes().length;
        if (indices != Integer.parseInt(cevap1.getText())) {
            System.out.println("Aynı sayıda işaretlemen lazım");
            textArea.setText("Girilen sayı ile aynı sayıda şehir "+
                    "işaretlemen lazım.");
        } else {
            System.out.println("Doğru");
           
            for (String selectedIndex : list1.getSelectedItems()) {
                System.out.println("Secilen sehir: " + selectedIndex);
                textArea.append("Seçilen şehir: " + selectedIndex+"\n");
                    
            }
            try {
                
                //komsulukMatrisi.txt okunma işlemi
                File matrixFile = new File("src\\komsulukMatrisi.txt");
                Scanner matrixScanner = new Scanner(matrixFile);

                while (matrixScanner.hasNextLine()) {
                    matrix.add(matrixScanner.nextLine());
                }

                //sehir.txt okunma işlemi
                File cityFile = new File("src\\sehir.txt");
                Scanner cityScanner = new Scanner(cityFile);

                while (cityScanner.hasNextLine()) {
                    cities.add(cityScanner.nextLine());
                }

                matrixScanner.close();
                cityScanner.close();

                String[] temp;

                for (int i = 0; i < cities.size(); i++) {
                    temp = cities.get(i).split(",");
                    plateNumber.add(temp[0]);
                    cityNames.add(temp[1]);
                }

                for (int i = 0; i < 81; i++) {
                    temp = matrix.get(i).split(",");
                    for (int j = 0; j < 81; j++) {
                        adjacencyMatrix[i][j] = Integer.parseInt(temp[j]);
                    }
                }

            } catch (IOException e) {
                e.printStackTrace();
            }

            
            shortestpathfile dene = new shortestpathfile();

            

            System.out.println("\n kac sehir olsun:");
            int N = Integer.parseInt(cevap1.getText());
            int[] sequence = new int[N];
            int indeks = 0;
            for (int selectedIndex : list1.getSelectedIndexes()) {
                sequence[indeks] = selectedIndex;
                indeks++;
            }

            System.out.println("\n girilen sehirlerin plakalari: ");
            for (int i = 0; i < N; i++) {
                System.out.print(sequence[i] + 1 + " ");
            }

          

            Permute_All_List_Numbers.permute4(N, adjacencyMatrix, sequence, 0);

            int yolSayisi = 1;
            for (int i = N; i > 0; i--) {
                yolSayisi = yolSayisi * i;
            }

            int[][] yollar = new int[yolSayisi][81];

            int k = 0;
            for (int i = 0; i < yolSayisi; i++) {

                for (int j = 0; j < N; j++) {

                    yollar[i][j] = Permute_All_List_Numbers.yolTut.get(k);
                    k++;
                }

            }

            int[] yol = new int[yolSayisi];

            int sinir;
            sinir = Permute_All_List_Numbers.sortedArrayList.get(4);

            System.out.println("\n   ----------En kisa yollar----------(mavi '" + ANSI_BLUE + ">" + ANSI_RESET
                    + "' isaretleri istenen sehre gidildigini göstermek icindir)\n");

            int[] siralama = new int[5];
            for (int i = 0; i < 5; i++) {
                siralama[i] = Permute_All_List_Numbers.sortedArrayList.get(i);
                toplamYol.add(siralama[i]);
                System.out.println("en kisa "+(i+1)+". mesafe="+siralama[i]);

            }
            Boolean aynivarmi = false;
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (i != j) {
                        if (siralama[i] == siralama[j]) {
                            aynivarmi = true;
                        }
                    }
                }

            }

            int d = 1;

            for (int p = 0; p < 5; p++) {
                for (int i = 0; i < yolSayisi; i++) {
                    yol[i] = 0;
                    if (Permute_All_List_Numbers.arrayList.get(i) > sinir) {
                        continue;
                    } else if (p == 0 && Permute_All_List_Numbers.arrayList.get(i) != siralama[0]) {
                        continue;
                    } else if (p == 1 && Permute_All_List_Numbers.arrayList.get(i) != siralama[1]) {
                        continue;
                    } else if (p == 2 && Permute_All_List_Numbers.arrayList.get(i) != siralama[2]) {
                        continue;
                    } else if (p == 3 && Permute_All_List_Numbers.arrayList.get(i) != siralama[3]) {
                        continue;
                    } else if (p == 4 && Permute_All_List_Numbers.arrayList.get(i) != siralama[4]) {
                        continue;
                    }

                    if (aynivarmi == true) {
                        p++;
                    }

                    for (int j = 0; j < N; j++) {

                        if (j == 0) {
                            if (d > 5) {
                                break;
                            }
                            System.out.print("[En kisa " + d + ".rota]=");
                            d++;

                            dene.dijkstra(adjacencyMatrix, 40, yollar[i][j]);
                            yol[i] += dene.yol[yollar[i][j]];
                        }

                        if (j > 0) {
                            dene.dijkstra(adjacencyMatrix, yollar[i][j - 1], yollar[i][j]);
                            yol[i] += dene.yol[yollar[i][j]];
                        }

                        if (j != N - 1) {
                            System.out.print(ANSI_BLUE + ">" + ANSI_RESET);
                        } else {
                            System.out.print(ANSI_BLUE + ">" + ANSI_RESET);
                            dene.dijkstra(adjacencyMatrix, yollar[i][j], 40);
                            {
                                try {
                                    File sonuc = new File("src\\sonuc.txt");

                                    FileWriter fileWriter;

                                    fileWriter = new FileWriter(sonuc, true);

                                    fileWriter.write("41\n");

                                    fileWriter.close();

                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                            }
                            yol[i] += dene.yol[40];

                            System.out.print("[41]");

                            System.out.print(" toplam yol = [" + yol[i] + "]");

                        }

                    }
                    System.out.println(" ");

                }
            }
            System.out.println("\n\n");

            {
                try {
                    File sonucFile = new File("src\\sonuc.txt");
                    Scanner sonucScanner = new Scanner(sonucFile);

                    while (sonucScanner.hasNextLine()) {

                        kisaTut.add(sonucScanner.nextLine());
                    }
                    sonucScanner.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            
            PathFrame pathFrame = new PathFrame();
            pathFrame.setVisible(true);
        }

    }//GEN-LAST:event_enKisaYolBulActionPerformed

    private void list1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list1ActionPerformed

    }//GEN-LAST:event_list1ActionPerformed
//    public static void main(String args[]){
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MainMenu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cevap1;
    private javax.swing.JButton enKisaYolBul;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label;
    private java.awt.List list1;
    private javax.swing.JTextField soru1;
    private javax.swing.JTextField soru2;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
