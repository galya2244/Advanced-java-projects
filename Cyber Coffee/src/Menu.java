
public class Menu extends javax.swing.JFrame{
int EspressoNum, AeroPressNum,DripNum,HOTLatteNum,HotFlatwhiteNum,HotSpanishLatteNum;//اسماءالمشروبات(labl)
int HoneyCakeNum,PistachioCakeNum,BrownieNum;//اسماء الحلى(labl)
double EspressoPrice,AeroPressPrice,DripPrice,HOTLattePrice,HotFlatwhitePrice,HotSpanishLattePrice,HoneyCakePrice,PistachioCakePrice,BrowniePrice;//حقت الاسعار ريال
double billaccount , tax , total,subtotal;
final double Espresso_cost=18 ,AeroPress_cost=23, Drip_cost=23,HOTLatte_cost=18;//تكلفة كل منتج ثابت 
final double HotFlatwhite_cost=18,HotSpanishLatte_cost=22,HoneyCake_cost=27,PistachioCake_cost=27,Brownie_cost=14;//تكلفة كل منتج ثابت
    
  
    
    
    
    
    
    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Brownietext = new javax.swing.JLabel();
        HotFlattext = new javax.swing.JLabel();
        HotSpanishtext = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Honeytext = new javax.swing.JLabel();
        Pistachiotext = new javax.swing.JLabel();
        Driptext = new javax.swing.JLabel();
        Aerotext = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        HotLattetext = new javax.swing.JLabel();
        Espresso = new javax.swing.JLabel();
        EspressoCounter = new javax.swing.JSpinner();
        AeroPressCounter = new javax.swing.JSpinner();
        DripCounter = new javax.swing.JSpinner();
        HotLatteCounter = new javax.swing.JSpinner();
        HotflatwhiteCounter = new javax.swing.JSpinner();
        HotspanishlatteCounter = new javax.swing.JSpinner();
        HoneycakeCounter = new javax.swing.JSpinner();
        PistachiocakeCounter = new javax.swing.JSpinner();
        BrownieCounter = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        BillAccount = new javax.swing.JButton();
        Tax = new javax.swing.JLabel();
        Total = new javax.swing.JLabel();
        Subtotal = new javax.swing.JLabel();
        PriceE = new javax.swing.JLabel();
        PriceA = new javax.swing.JLabel();
        PriceD = new javax.swing.JLabel();
        PriceHL = new javax.swing.JLabel();
        PriceHF = new javax.swing.JLabel();
        PriceHS = new javax.swing.JLabel();
        PriceHC = new javax.swing.JLabel();
        PriceB = new javax.swing.JLabel();
        PricePC = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 48)); // NOI18N
        jLabel1.setText("Menu ..");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 16, 241, 98));

        jLabel19.setText("18 SR");

        jLabel20.setText("23 SR");

        jLabel23.setText("23 SR");

        jLabel24.setText("18 SR");

        jLabel27.setText("18 SR");

        jLabel28.setText("22 SR");

        jLabel29.setText("27 SR");

        jLabel31.setText("27 SR");

        jLabel32.setText("14 SR");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel29)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel23)
                    .addComponent(jLabel20))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel19)
                .addGap(26, 26, 26)
                .addComponent(jLabel20)
                .addGap(29, 29, 29)
                .addComponent(jLabel23)
                .addGap(42, 42, 42)
                .addComponent(jLabel24)
                .addGap(35, 35, 35)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(70, 70, 70)
                .addComponent(jLabel29)
                .addGap(28, 28, 28)
                .addComponent(jLabel31)
                .addGap(46, 46, 46)
                .addComponent(jLabel32)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(733, 120, -1, 530));

        jLabel2.setFont(new java.awt.Font("Verdana Pro Cond Semibold", 0, 24)); // NOI18N
        jLabel2.setText("BLACK");

        Brownietext.setText("Brownie");

        HotFlattext.setText("Hot Flat white");

        HotSpanishtext.setText("Hot Spanish Latte");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("DESSERTS");

        Honeytext.setText("Honey Cake");

        Pistachiotext.setText("Pistachio Cake");

        Driptext.setText("Drip");

        Aerotext.setText("Aero Press");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel8.setText("WHITE");

        HotLattetext.setText("HOT Latte");

        Espresso.setText("Espresso");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(HotFlattext)
                        .addComponent(HotSpanishtext)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Honeytext)
                            .addComponent(Pistachiotext)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Espresso)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(Driptext))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Aerotext))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Brownietext))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(HotLattetext))
                            .addComponent(jLabel8))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(Espresso)
                .addGap(26, 26, 26)
                .addComponent(Aerotext)
                .addGap(18, 18, 18)
                .addComponent(Driptext)
                .addGap(30, 30, 30)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HotLattetext)
                .addGap(20, 20, 20)
                .addComponent(HotFlattext)
                .addGap(33, 33, 33)
                .addComponent(HotSpanishtext)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Honeytext, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Pistachiotext)
                .addGap(26, 26, 26)
                .addComponent(Brownietext)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 130, 540));

        EspressoCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        EspressoCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                EspressoCounterStateChanged(evt);
            }
        });
        getContentPane().add(EspressoCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 50, -1));

        AeroPressCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        AeroPressCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AeroPressCounterStateChanged(evt);
            }
        });
        getContentPane().add(AeroPressCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 50, -1));

        DripCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        DripCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                DripCounterStateChanged(evt);
            }
        });
        getContentPane().add(DripCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 50, -1));

        HotLatteCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        HotLatteCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HotLatteCounterStateChanged(evt);
            }
        });
        getContentPane().add(HotLatteCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 50, 30));

        HotflatwhiteCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        HotflatwhiteCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HotflatwhiteCounterStateChanged(evt);
            }
        });
        getContentPane().add(HotflatwhiteCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        HotspanishlatteCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        HotspanishlatteCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HotspanishlatteCounterStateChanged(evt);
            }
        });
        getContentPane().add(HotspanishlatteCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 50, -1));

        HoneycakeCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        HoneycakeCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                HoneycakeCounterStateChanged(evt);
            }
        });
        getContentPane().add(HoneycakeCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 50, -1));

        PistachiocakeCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        PistachiocakeCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                PistachiocakeCounterStateChanged(evt);
            }
        });
        getContentPane().add(PistachiocakeCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, 50, -1));

        BrownieCounter.setModel(new javax.swing.SpinnerNumberModel(0, 0, 50, 1));
        BrownieCounter.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                BrownieCounterStateChanged(evt);
            }
        });
        getContentPane().add(BrownieCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 50, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Bill", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        BillAccount.setText("Bill account");
        BillAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillAccountActionPerformed(evt);
            }
        });

        Tax.setText("Tax:    0.0 SR");

        Total.setText("Total:  0.0 SR");

        Subtotal.setText("Subtotal: 0.0 SR");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(136, 136, 136)
                            .addComponent(BillAccount))
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(Tax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(56, 56, 56)))
                    .addComponent(Subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel35)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tax)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Subtotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Total)
                .addGap(4, 4, 4)
                .addComponent(BillAccount))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 580, 400, 150));

        PriceE.setText("0.0SR");
        getContentPane().add(PriceE, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 50, 20));

        PriceA.setText("0.0SR");
        getContentPane().add(PriceA, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 200, 53, -1));

        PriceD.setText("0.0SR");
        getContentPane().add(PriceD, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 57, -1));

        PriceHL.setText("0.0SR");
        getContentPane().add(PriceHL, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, -1, -1));

        PriceHF.setText("0.0SR");
        getContentPane().add(PriceHF, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        PriceHS.setText("0.0SR");
        getContentPane().add(PriceHS, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, -1, 30));

        PriceHC.setText("0.0SR");
        getContentPane().add(PriceHC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, -1, 30));

        PriceB.setText("0.0SR");
        getContentPane().add(PriceB, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, -1, -1));

        PricePC.setText("0.0SR");
        getContentPane().add(PricePC, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 550, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imge/WhatsApp Image 2021-11-24 at 3.01.48 PM.jpeg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BillAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillAccountActionPerformed
    subtotal=EspressoPrice+AeroPressPrice+DripPrice+HOTLattePrice+HotFlatwhitePrice+HotSpanishLattePrice+HoneyCakePrice+PistachioCakePrice+BrowniePrice;
    Subtotal.setText("Subtotal"+ subtotal+"SR");
    
     tax = subtotal *0.05;
     Tax.setText("Tax"+ tax+"SR");
     
     total=subtotal+ tax;
      Total.setText("Total"+total +"SR");
     
    }//GEN-LAST:event_BillAccountActionPerformed

    private void EspressoCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_EspressoCounterStateChanged
        EspressoNum = (Integer) EspressoCounter.getValue();//يرجع عدد كم قهوة
        EspressoPrice  = Espresso_cost * EspressoNum;//عدد كل قهوةضرب تكلفة كل قهوة=السعر الاجمالي
        PriceE.setText(EspressoPrice +"SR");//تظهر السعر وكلمة SR

        
    }//GEN-LAST:event_EspressoCounterStateChanged

    private void AeroPressCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AeroPressCounterStateChanged
        AeroPressNum = (Integer) AeroPressCounter.getValue();
        AeroPressPrice  = AeroPress_cost *AeroPressNum;//عدد كل قهوةضرب تكلفة كل قهوة=السعر الاجمالي
        PriceA.setText(AeroPressPrice +"SR");
    }//GEN-LAST:event_AeroPressCounterStateChanged

    private void DripCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_DripCounterStateChanged
        DripNum = (Integer)  DripCounter.getValue();
        DripPrice  =  Drip_cost *DripNum;//عدد كل قهوةضرب تكلفة كل قهوة=السعر الاجمالي
        PriceD.setText(DripPrice +"SR");
    }//GEN-LAST:event_DripCounterStateChanged

    private void HotLatteCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HotLatteCounterStateChanged
        HOTLatteNum = (Integer)  HotLatteCounter.getValue();
        HOTLattePrice  =  HOTLatte_cost *HOTLatteNum;//عدد كل قهوةضرب تكلفة كل قهوة=السعر الاجمالي
        PriceHL.setText( HOTLattePrice +"SR");
    }//GEN-LAST:event_HotLatteCounterStateChanged

    private void HotflatwhiteCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HotflatwhiteCounterStateChanged
         HotFlatwhiteNum= (Integer) HotflatwhiteCounter.getValue();
         HotFlatwhitePrice =   HotFlatwhite_cost * HotFlatwhiteNum;//عدد كل قهوةضرب تكلفة كل قهوة=السعر الاجمالي
         PriceHF.setText( HotFlatwhitePrice +"SR");
    }//GEN-LAST:event_HotflatwhiteCounterStateChanged

    private void HotspanishlatteCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HotspanishlatteCounterStateChanged
         HotSpanishLatteNum= (Integer)HotspanishlatteCounter .getValue();
         HotSpanishLattePrice =  HotSpanishLatte_cost *HotSpanishLatteNum ;//عدد كل قهوةضرب تكلفة كل قهوة=السعر الاجمالي
         PriceHS.setText( HotSpanishLattePrice +"SR");
    }//GEN-LAST:event_HotspanishlatteCounterStateChanged

    private void HoneycakeCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_HoneycakeCounterStateChanged
         HoneyCakeNum= (Integer)HoneycakeCounter .getValue();
         HoneyCakePrice =  HoneyCake_cost *HoneyCakeNum ;//عدد كل قهوةضرب تكلفة كل قهوة=السعر الاجمالي
         PriceHC.setText( HoneyCakePrice +"SR");
    }//GEN-LAST:event_HoneycakeCounterStateChanged

    private void PistachiocakeCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_PistachiocakeCounterStateChanged
       PistachioCakeNum= (Integer)PistachiocakeCounter .getValue();
       PistachioCakePrice =  PistachioCake_cost *PistachioCakeNum ;//عدد كل قهوةضرب تكلفة كل قهوة=السعر الاجمالي
       PricePC.setText( PistachioCakePrice +"SR");
    }//GEN-LAST:event_PistachiocakeCounterStateChanged

    private void BrownieCounterStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_BrownieCounterStateChanged
      BrownieNum=  (Integer)BrownieCounter .getValue();
     BrowniePrice  =  Brownie_cost *BrownieNum;//عدد كل قهوةضرب تكلفة كل قهوة=السعر الاجمالي
       PriceB.setText(  BrowniePrice+"SR");
    }//GEN-LAST:event_BrownieCounterStateChanged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner AeroPressCounter;
    private javax.swing.JLabel Aerotext;
    private javax.swing.JButton BillAccount;
    private javax.swing.JSpinner BrownieCounter;
    private javax.swing.JLabel Brownietext;
    private javax.swing.JSpinner DripCounter;
    private javax.swing.JLabel Driptext;
    private javax.swing.JLabel Espresso;
    private javax.swing.JSpinner EspressoCounter;
    private javax.swing.JSpinner HoneycakeCounter;
    private javax.swing.JLabel Honeytext;
    private javax.swing.JLabel HotFlattext;
    private javax.swing.JSpinner HotLatteCounter;
    private javax.swing.JLabel HotLattetext;
    private javax.swing.JLabel HotSpanishtext;
    private javax.swing.JSpinner HotflatwhiteCounter;
    private javax.swing.JSpinner HotspanishlatteCounter;
    private javax.swing.JSpinner PistachiocakeCounter;
    private javax.swing.JLabel Pistachiotext;
    private javax.swing.JLabel PriceA;
    private javax.swing.JLabel PriceB;
    private javax.swing.JLabel PriceD;
    private javax.swing.JLabel PriceE;
    private javax.swing.JLabel PriceHC;
    private javax.swing.JLabel PriceHF;
    private javax.swing.JLabel PriceHL;
    private javax.swing.JLabel PriceHS;
    private javax.swing.JLabel PricePC;
    private javax.swing.JLabel Subtotal;
    private javax.swing.JLabel Tax;
    private javax.swing.JLabel Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
