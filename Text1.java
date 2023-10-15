import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Text1 implements ActionListener{
 JFrame frame;
 JTextField textfield;
 JButton onButton=new JButton("On");
 JButton onButton1=new JButton("Off");
 JButton[] numberButtons = new JButton[10];
 JButton[] functionButtons = new JButton[10];
 JButton[] ScButton=new JButton[9];
 JButton sinButton,cosButton,tanButton,sqButton,logButton,xButton,powerButton,powerbutton1;
 JButton addButton,subButton,mulButton,divButton,decButton, equButton, delButton, clrButton, negButton,scientificButton,factButton;
 JPanel panel;
 Font myFont = new Font("Ink Free",Font.PLAIN,20);
 double num1=0,num2=0,result=0;
 char operator;
 Text1(){
 frame = new JFrame("Calculator");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(420, 550);
 frame.setLayout(null);
 onButton.setBounds(10,70,120,60);
 onButton.addActionListener(this);
 onButton.setBackground(Color.white);
 onButton.setFont(new Font("MV Boli",Font.BOLD,20));
 onButton.setFocusable(false);
 onButton1.setBounds(300,70,120,60);
 onButton1.addActionListener(this);
 onButton1.setBackground(Color.white);
 onButton1.setFont(new Font("MV Boli",Font.BOLD,20));
 onButton1.setFocusable(false);
 textfield = new JTextField();
 textfield.setBounds(10, 10, 420, 50);
 textfield.setFont(myFont);
 textfield.setEditable(false);
 sinButton = new JButton("Sin");
 cosButton = new JButton("Cos");
 tanButton = new JButton("Tan");
 sqButton = new JButton("Sq");
 logButton = new JButton("log");
 xButton = new JButton("1/x");
 factButton=new JButton("n!");
 powerButton=new JButton("x^2");
 powerbutton1=new JButton("x^3");
 ScButton[0]=sinButton;
 ScButton[0].setBackground(Color.red);
 ScButton[0].setOpaque(true);
 ScButton[1]=cosButton;
 ScButton[2]=tanButton;
 ScButton[3]=sqButton;
 ScButton[4]=logButton;
 ScButton[5]=xButton;
 ScButton[6]=factButton;
 ScButton[7]=powerButton;
 ScButton[8]=powerbutton1;
 addButton = new JButton("+");
 subButton = new JButton("-");
 mulButton = new JButton("*");
 divButton = new JButton("/");
 decButton = new JButton(".");
 equButton = new JButton("=");
 delButton = new JButton("Del");
 clrButton = new JButton("Clr");
 negButton = new JButton("Ng");
 scientificButton= new JButton("sc");
 functionButtons[0] = addButton;
 functionButtons[1] = subButton;
 functionButtons[2] = mulButton;
 functionButtons[3] = divButton;
 functionButtons[4] = decButton;
 functionButtons[5] = equButton;
 functionButtons[6] = delButton;
 functionButtons[7] = clrButton;
 functionButtons[8] = negButton;
 functionButtons[9] = scientificButton;
 for(int i =0;i<10;i++) {
 functionButtons[i].addActionListener(this);
 functionButtons[i].setFont(myFont);
 functionButtons[i].setFocusable(false);
 functionButtons[i].setBackground(Color.black);
 functionButtons[i].setForeground(Color.white);
 }
 for(int i =0;i<9;i++) {
 ScButton[i].addActionListener(this);
 ScButton[i].setFont(myFont);
 ScButton[i].setBackground(Color.red);
 ScButton[i].setForeground(Color.white);
 ScButton[i].setFocusable(false);
 }
 // negButton.setBounds(50,430,100,50);
 // delButton.setBounds(150,430,100,50);
 // clrButton.setBounds(250,430,100,50);
 for(int i =0;i<10;i++) {
 numberButtons[i] = new JButton(String.valueOf(i));
 numberButtons[i].addActionListener(this);
 numberButtons[i].setFont(myFont);
 numberButtons[i].setFocusable(false);
 numberButtons[i].setBackground(Color.black);
 numberButtons[i].setForeground(Color.white);
 }
 factButton.setBackground(Color.black);
 factButton.setOpaque(true);
 factButton.setForeground(Color.white);
 powerButton.setBackground(Color.black);
 powerButton.setOpaque(true);
 powerButton.setForeground(Color.white);
 xButton.setBackground(Color.black);
 xButton.setOpaque(true);
 xButton.setForeground(Color.white);
 logButton.setBackground(Color.yellow);
 logButton.setOpaque(true);
 logButton.setForeground(Color.black);
 sqButton.setBackground(Color.yellow);
 sqButton.setOpaque(true);
 sqButton.setForeground(Color.black);
 powerbutton1.setBackground(Color.yellow);
 powerbutton1.setOpaque(true);
 powerbutton1.setForeground(Color.black);
 divButton.setBackground(Color.yellow);
 divButton.setOpaque(true);
 divButton.setForeground(Color.black);
 subButton.setBackground(Color.yellow);
 subButton.setOpaque(true);
 subButton.setForeground(Color.black);
 mulButton.setBackground(Color.yellow);
 mulButton.setOpaque(true);
 mulButton.setForeground(Color.black);
 addButton.setBackground(Color.yellow);
 addButton.setOpaque(true);
 addButton.setForeground(Color.black);
 panel = new JPanel();
 panel.setForeground(Color.black);
 panel.setBackground(Color.gray);
 panel.setBounds(10, 140, 420, 500);
 panel.setLayout(new GridLayout(9,4,5,5));
 panel.add(sinButton);
 panel.add(cosButton);
 panel.add(tanButton);
 panel.add(sqButton);
 panel.add(numberButtons[1]);
 panel.add(numberButtons[2]);
 panel.add(numberButtons[3]);
 panel.add(addButton);
 panel.add(numberButtons[4]);
 panel.add(numberButtons[5]);
 panel.add(numberButtons[6]);
 panel.add(subButton);
 panel.add(numberButtons[7]);
 panel.add(numberButtons[8]);
 panel.add(numberButtons[9]);
 panel.add(mulButton);
 panel.add(decButton);
 panel.add(numberButtons[0]);
 panel.add(equButton);
 panel.add(divButton);
 panel.add(negButton);
 panel.add(delButton);
 panel.add(clrButton);
 panel.add(logButton);
 panel.add(xButton);
 panel.add(factButton);
 panel.add(powerButton);
 panel.add(powerbutton1);
 frame.add(onButton);
 frame.add(onButton1);
 frame.add(panel);
 frame.add(textfield);
 frame.setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
 if(e.getSource()==onButton1){
 onButton.setBackground(Color.red);
 // onButton.setText("On");
 // onButton.setEditable(false);
 for(int i=0;i<10;i++) {
 numberButtons[i].setEnabled(false);
 functionButtons[i].setEnabled(false);
 }
 for(int j=0;j<9;j++){
 ScButton[j].setEnabled(false);
 }
 }
 else if(e.getSource()==onButton){
 onButton.setBackground(Color.green);
 onButton.setText("On");
 // onButton1.setEditable(false);
 for(int i=0;i<10;i++) {
 numberButtons[i].setEnabled(true);
 functionButtons[i].setEnabled(true);
 }
 for(int j=0;j<9;j++){
 ScButton[j].setEnabled(true);
 }
 }
 for(int i=0;i<10;i++) {
 if(e.getSource() == numberButtons[i]) {
 textfield.setText(textfield.getText().concat(String.valueOf(i)));
 }
 }
 if(e.getSource()==decButton) {
 textfield.setText(textfield.getText().concat("."));
 }
 if(e.getSource()==addButton) {
 num1 = Double.parseDouble(textfield.getText());
 operator ='+';
 textfield.setText("");
 }
 if(e.getSource()==subButton) {
 num1 = Double.parseDouble(textfield.getText());
 operator ='-';
 textfield.setText("");
 }
 if(e.getSource()==mulButton) {
 num1 = Double.parseDouble(textfield.getText());
 operator ='*';
 textfield.setText("");
 }
 if(e.getSource()==divButton) {
 num1 = Double.parseDouble(textfield.getText());
 operator ='/';
 textfield.setText("");
 }
 if(e.getSource()==sinButton) {
 if (textfield.getText().equals("")) {
 textfield.setText("");
 } else {
 double a = Math.sin(Double.parseDouble(textfield.getText()));
 textfield.setText("");
 textfield.setText(textfield.getText() + a);
 }
 }
 if(e.getSource()==cosButton) {
 if (textfield.getText().equals("")) {
 textfield.setText("");
 } else {
 double a = Math.cos(Double.parseDouble(textfield.getText()));
 textfield.setText("");
 textfield.setText(textfield.getText() + a);
 }
 }
 if(e.getSource()==tanButton) {
 if (textfield.getText().equals("")) {
 textfield.setText("");
 } else {
 double a = Math.tan(Double.parseDouble(textfield.getText()));
 textfield.setText("");
 textfield.setText(textfield.getText() + a);
 }
 }
 if(e.getSource()==sqButton) {
 if (textfield.getText().equals("")) {
 textfield.setText("");
 } else {
 double a =Math.sqrt(Double.parseDouble(textfield.getText()));
 textfield.setText("");
 textfield.setText(textfield.getText() + a);
 }
 }
 if(e.getSource()==logButton) {
 if (textfield.getText().equals("")) {
 textfield.setText("");
 } else {
 double a =Double.parseDouble(textfield.getText());
 double result= (Math.log10(a));
 textfield.setText("");
 textfield.setText(textfield.getText() + result);
 }
 }
 if(e.getSource()==factButton) {
 if (textfield.getText().equals("")) {
 textfield.setText("");
 } else {
 double a=fact(Double.parseDouble(textfield.getText()));
 textfield.setText("");
 textfield.setText(textfield.getText() + a);
 }
 }
 if(e.getSource()==xButton) {
 if (textfield.getText().equals("")) {
 textfield.setText("");
 } else {
 double a=1/Double.parseDouble(textfield.getText());
 textfield.setText("");
 textfield.setText(textfield.getText() + a);
 }
 }
 if(e.getSource()==powerButton) {
 if (textfield.getText().equals("")) {
 textfield.setText("");
 } else {
 double a=Math.pow(Double.parseDouble(textfield.getText()),2);
 textfield.setText("");
 textfield.setText(textfield.getText() + a);
 }
 }
 if(e.getSource()==powerbutton1) {
 if (textfield.getText().equals("")) {
 textfield.setText("");
 } else {
 double a=Math.pow(Double.parseDouble(textfield.getText()),3);
 textfield.setText("");
 textfield.setText(textfield.getText() + a);
 }
 }
 if(e.getSource()==equButton) {
 num2=Double.parseDouble(textfield.getText());
 switch(operator) {
 case'+':
 result=num1+num2;
 break;
 case'-':
 result=num1-num2;
 break;
 case'*':
 result=num1*num2;
 break;
 case'/':
 result=num1/num2;
 break;
 }
 textfield.setText(String.valueOf(result));
 num1=result;
 }
 if(e.getSource()==clrButton) {
 textfield.setText("");
 }
 if(e.getSource()==scientificButton) {
 Text1 t=new Text1();
 }
 if(e.getSource()==delButton) {
 String string = textfield.getText();
 textfield.setText("");
 for(int i=0;i<string.length()-1;i++) {
 textfield.setText(textfield.getText()+string.charAt(i));
 }
 }
 if(e.getSource()==negButton) {
 double temp = Double.parseDouble(textfield.getText());
 temp*=-1;
 textfield.setText(String.valueOf(temp));
 }
 }
 Double fact(double x){
 int er = 0;
 if (x < 0) {
 er = 20;
 return 0.0;
 }
 double i,s=1;
 for(i=2;i<=x;i++)
 s*=i;
 return s;
 }
}