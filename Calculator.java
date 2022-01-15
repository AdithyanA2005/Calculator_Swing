import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//VERSION 1.0

public class Calculator implements ActionListener {



    //BOOBLEAN DECLERATION
    boolean isoperatorClicked = true;
    boolean dotInDisplay=false;
    boolean ActionPerformed=false;



    //FLOAT DECLARATION
    float F_Value=0f;
    float S_Value=0f;
    float Result;



    //INT DECLERATION
    int OperationIdentifier=0;



    //JFrame DECLERATION
    JFrame jf;



    //JLabel DECLERATION
    JLabel displayLabel;



    //JButton DECLERATION
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton dotButton;
    JButton zeroButton;
    JButton equalButton;
    JButton divButton;
    JButton multiButton;
    JButton minusButton;
    JButton plusButton;
    JButton clearButton;


    public Calculator() {

        jf = new JFrame("ADCALARATOR");
        jf.setLayout(null);
        jf.setSize(600, 600);
        jf.setLocation(400, 130);



        displayLabel = new JLabel();
        displayLabel.setBounds(30, 25, 540, 75);
        displayLabel.setBackground(Color.gray);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
        displayLabel.setForeground(Color.black);
        displayLabel.setFont(new Font("Rockwell Extra Bold", Font.PLAIN, 50));
        jf.add(displayLabel);

/*
          *  *  *  *  *  *  *  *
          *  *  *  *  *  *  *  *
          * * * ||BUTTONS| * * *
          *  *  *  *  *  *  *  *
          *  *  *  *  *  *  *  *

 */


        //CHARACTER BUTTONS

        //7
        sevenButton = new JButton("7");
        sevenButton.setBounds(30, 130, 80, 80);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sevenButton.addActionListener(this);
        jf.add(sevenButton);



        //8
        eightButton = new JButton("8");
        eightButton.setBounds(130, 130, 80, 80);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 40));
        eightButton.addActionListener(this);
        jf.add(eightButton);



        //9
        nineButton = new JButton("9");
        nineButton.setBounds(230, 130, 80, 80);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 40));
        nineButton.addActionListener(this);
        jf.add(nineButton);



        //4
        fourButton = new JButton("4");
        fourButton.setBounds(30, 230, 80, 80);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fourButton.addActionListener(this);
        jf.add(fourButton);



        //5
        fiveButton = new JButton("5");
        fiveButton.setBounds(130, 230, 80, 80);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 40));
        fiveButton.addActionListener(this);
        jf.add(fiveButton);



        //6
        sixButton = new JButton("6");
        sixButton.setBounds(230, 230, 80, 80);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 40));
        sixButton.addActionListener(this);
        jf.add(sixButton);



        //1
        oneButton = new JButton("1");
        oneButton.setBounds(30, 330, 80, 80);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 40));
        oneButton.addActionListener(this);
        jf.add(oneButton);



        //2
        twoButton = new JButton("2");
        twoButton.setBounds(130, 330, 80, 80);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 40));
        twoButton.addActionListener(this);
        jf.add(twoButton);



        //3
        threeButton = new JButton("3");
        threeButton.setBounds(230, 330, 80, 80);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 40));
        threeButton.addActionListener(this);
        jf.add(threeButton);



        //.  (dot)
        dotButton = new JButton(".");
        dotButton.setBounds(30, 430, 80, 80);
        dotButton.setFont(new Font("Arial", Font.PLAIN, 40));
        dotButton.addActionListener(this);
        jf.add(dotButton);



        //0
        zeroButton = new JButton("0");
        zeroButton.setBounds(130, 430, 80, 80);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 40));
        zeroButton.addActionListener(this);
        jf.add(zeroButton);


        //OPERATORS BUTTONS

        /*   =_EqualTo   */
        equalButton = new JButton("=");
        equalButton.setBounds(230, 430, 80, 80);
        equalButton.setFont(new Font("Arial", Font.PLAIN, 40));
        equalButton.addActionListener(this);
        jf.add(equalButton);



        /*   =_Addition    */
        plusButton = new JButton("+");
        plusButton.setBounds(330, 430, 80, 80);
        plusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        plusButton.addActionListener(this);
        jf.add(plusButton);



        /*   x_Multiplication   */
        multiButton = new JButton("x");
        multiButton.setBounds(330, 230, 80, 80);
        multiButton.setFont(new Font("Arial", Font.PLAIN, 40));
        multiButton.addActionListener(this);
        jf.add(multiButton);




        /*  /_Division   */
        divButton = new JButton("/");
        divButton.setBounds(330, 130, 80, 80);
        divButton.setFont(new Font("Arial", Font.PLAIN, 40));
        divButton.addActionListener(this);
        jf.add(divButton);



        /*   -_Substration   */
        minusButton = new JButton("-");
        minusButton.setBounds(330, 330, 80, 80);
        minusButton.setFont(new Font("Arial", Font.PLAIN, 40));
        minusButton.addActionListener(this);
        jf.add(minusButton);



        // Clear
        clearButton = new JButton("Clear");
        clearButton.setBounds(430, 430, 80, 80);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 15));
        clearButton.addActionListener(this);
        jf.add(clearButton);


        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    //DIGIT BUTTONS
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sevenButton) {
            if (isoperatorClicked) {
                displayLabel.setText("7");
                isoperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "7");
            }


        } else if (e.getSource() == eightButton) {
            if (isoperatorClicked) {
                displayLabel.setText("8");
                isoperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "8");
            }


        } else if (e.getSource() == nineButton) {
            if (isoperatorClicked) {
                displayLabel.setText("9");
                isoperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "9");
            }


        } else if (e.getSource() == fourButton) {
            if (isoperatorClicked) {
                displayLabel.setText("4");
                isoperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "4");
            }


        } else if (e.getSource() == fiveButton) {
            if (isoperatorClicked) {
                displayLabel.setText("5");
                isoperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "5");
            }


        } else if (e.getSource() == sixButton) {
            if (isoperatorClicked) {
                displayLabel.setText("6");
                isoperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "6");
            }


        } else if (e.getSource() == oneButton) {
            if (isoperatorClicked) {
                displayLabel.setText("1");
                isoperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "1");
            }


        } else if (e.getSource() == twoButton) {
            if (isoperatorClicked) {
                displayLabel.setText("2");
                isoperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "2");
            }


        } else if (e.getSource() == threeButton) {
            if (isoperatorClicked) {
                displayLabel.setText("3");
                isoperatorClicked = false;
            } else {
                displayLabel.setText(displayLabel.getText() + "3");
            }


        } else if (e.getSource() == zeroButton) {
            if (isoperatorClicked) {
                displayLabel.setText("0");
            } else {
                if ((dotInDisplay || isoperatorClicked) == false)
                    displayLabel.setText(displayLabel.getText() + "0");
            }


        } else if (e.getSource() == dotButton) {
            if (isoperatorClicked) {
                displayLabel.setText("0.");
                isoperatorClicked = false;
                dotInDisplay = true;

            } else {
                if (dotInDisplay) {
                    displayLabel.setText(displayLabel.getText() + ".");
                    dotInDisplay = true;
                }
            }


        } else if (e.getSource() == clearButton) {
            displayLabel.setText("0");
            isoperatorClicked = true;
            dotInDisplay = false;
            Result = 0f;
            OperationIdentifier = 0;
            F_Value = 0;
            S_Value = 0;




/*

                                  // \\
                               //       \\
                            //--||-----||--\\
                         //     ||  /  ||     \\
                      //--------||-----||--------\\
                   //           ||  +  ||           \\
                //--------------||-----||--------------\\
             //             /--/\|=--=|/\--\              \\
          //               ||===OPERATOR===||                \\
         ||----------------||------||------||--------------- ||
          \\               ||===OPERATOR===||                //
             \\             \--\/|=--=|\/--/              //
                \\--------------||-----||--------------//
                   \\           ||  -  ||           //
                      \\--------||-----||--------//
                         \\     ||  x  ||     //
                            \\--||-----||--//
                               \\       //
                                  \\ //

 */


        } else if (e.getSource() == plusButton) {
            if (OperationIdentifier != 1 && F_Value != 0 && !isoperatorClicked)
                Func_FinalResultMaker();

            OperationIdentifier = 1;
            if (!isoperatorClicked)
                Func_FinalResultMaker();


        }else if (e.getSource() == multiButton) {
            if (OperationIdentifier != 2 && F_Value != 0 && !isoperatorClicked)
                Func_FinalResultMaker();

            OperationIdentifier = 2;
            if (!isoperatorClicked)
                Func_FinalResultMaker();


        } else if (e.getSource() == divButton) {

            if(OperationIdentifier != 3 && F_Value != 0 && !isoperatorClicked)
                Func_FinalResultMaker();

            OperationIdentifier = 3;
            if (!isoperatorClicked)
                Func_FinalResultMaker();


        } else if (e.getSource() == minusButton) {

            if (OperationIdentifier != 4 && F_Value != 0 && !isoperatorClicked)
                Func_FinalResultMaker();

            OperationIdentifier = 4;
            if (isoperatorClicked)
                Func_FinalResultMaker();


        } else if (e.getSource() == equalButton) {

            Func_FinalResultMaker();
            OperationIdentifier = 5;
        }
    }



    //Main Calculator Function
    void Func_FinalResultMaker() {

        switch (OperationIdentifier) {



            //ADDITION
            case 1:
                if (Result != 0)
                    F_Value = Result;

                if (F_Value == 0)
                    F_Value = Float.parseFloat(displayLabel.getText());
                else
                    S_Value = Float.parseFloat(displayLabel.getText());

                if (S_Value != 0) {
                    ActionPerformed = true;
                    Result = F_Value + S_Value;
                    displayLabel.setText("" + fmt(Result));
                }

                else {
                    ActionPerformed = false;
                    displayLabel.setText("" + fmt(F_Value));
                }

                S_Value = 0f;
                break;




                //MULTIPLICATION
                case 2:
                if (Result != 0)
                    F_Value = Result;

                if (F_Value == 0)
                    F_Value = Float.parseFloat(displayLabel.getText());
                else
                    S_Value = Float.parseFloat(displayLabel.getText());


                if (S_Value != 0.0f)
                    Result = F_Value * S_Value;
                else
                    Result = F_Value;

                if (S_Value != 0) {
                    ActionPerformed = true;
                    Result = F_Value * S_Value;
                    displayLabel.setText("" + fmt(Result));
                }
                else {
                    ActionPerformed = false;
                    displayLabel.setText("" + fmt(F_Value));
                }
                S_Value = 0;
                break;




            // DIVISION
            case 3:
                if (Result != 0)
                    F_Value = Result;

                if (F_Value == 0)
                    F_Value = Float.parseFloat(displayLabel.getText());
                else
                    S_Value = Float.parseFloat(displayLabel.getText());



                if (F_Value!=0 && S_Value!=0) {
                    Result = F_Value / S_Value;
                    displayLabel.setText("" + fmt(Result));

                    if (S_Value != 0) {
                        ActionPerformed = true;
                    }
                    else
                        ActionPerformed = false;
                }
                S_Value = 0f;
                break;



            //SUBSTRACTOIN
            case 4:
                if (Result != 0)
                    F_Value = Result;

                if (F_Value == 0)
                    F_Value = Float.parseFloat(displayLabel.getText());
                else
                    S_Value = Float.parseFloat(displayLabel.getText());

                if (S_Value!=0) {
                    ActionPerformed = true;
                    Result = F_Value - S_Value;
                    displayLabel.setText("" + fmt(Result));

                }
                else {
                    ActionPerformed = false;
                    displayLabel.setText("" + fmt(F_Value));
                }

                S_Value = 0f;
                break;
        }



        isoperatorClicked = true;
        dotInDisplay = false;
    }

    //FUNCTION FOR FORMATTING ,UNWANTED DECIMAL ZEROS IF REQUIRED
    //(for:eg:::, 5+2 = WILL BE 5.0, THIS MODIFIES AS 5 )
    public static String fmt(double d)
    {

        if (d == (long) d)
            return String.format("%d", (long) d);
        else
            return String.format("%s", d);

    }

}

/*

                                *
                              * * *
                            * * * * *
                          * * * * * * *
                        * * * * * * * * *
                      * * * * * * * * * * *
        *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *
         * * * * * * * * * * * * * * * * * * * * * * * *
          * * * * * * * * * * * * * * * * * * * * * * *
           * * * * * * * * * * * * * * * * * * * * * *
            * * * * * * * * * * * * * * * * * * * * *
          *  * * * * * * * * * * * * * * * * * * * *  *
        * * * * * * * * * * * * * * * * * * * * * * * * *
      * * * * *** * * * * * * * * * * * * * * * *** * * * *
    * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
                  * * * * * * * * * * * * * * *
                   * * * * * * * * * * * * * *
                    * * * * * * * * * * * * *
                     * * * * * * * * * * * *
                      * * * * * * * * * * *
                       * * * * * * * * * *
                        * * * * * * * * *
                         * * * * * * * *
                          * * * * * * *
                           * * * * * *
                            * * * * *
                             * * * *
                              * * *
                               * *
                                *
 */