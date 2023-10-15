import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Text implements ActionListener{
 JFrame frame;
 JTextField textfield;
 JButton[] numberButtons = new JButton[10];
 JButton[] functionButtons = new JButton[10];
 JButton addButton,subButton,mulButton,divButton;
 JButton decButton, equButton, delButton, clrButton, negButton,scientificButton;
 JPanel panel;
 Font myFont = new Font("Ink Free",Font.BOLD,30);
 double num1=0,num2=0,result=0;
 char operator;
 Text(){
 frame = new JFrame("Calculator");
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 frame.setSize(420, 550);
 frame.setLayout(null);
 textfield = new JTextField();
 textfield.setBounds(50, 25, 350, 50);
 textfield.setFont(myFont);
 textfield.setEditable(false);
 addButton = new JButton("+");
 subButton = new JButton("-");
 mulButton = new JButton("*");
 divButton = new JButton("/");
 decButton = new JButton(".");
 equButton = new JButton("=");
 delButton = new JButton("(-)");
 clrButton = new JButton("C");
 negButton = new JButton("N");
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
 functionButtons[i].setBackground(new Color(51,204,255));
 functionButtons[i].setForeground(Color.white);
 functionButtons[i].setFont(myFont);
 functionButtons[i].setFocusable(false);
 }
 for(int i =0;i<10;i++) {
 numberButtons[i] = new JButton(String.valueOf(i));
 numberButtons[i].addActionListener(this);
 numberButtons[i].setBackground(new Color(51,204,255));
 numberButtons[i].setForeground(Color.white);
 numberButtons[i].setFont(myFont);
 numberButtons[i].setFocusable(false);
 }
 // negButton.setBounds(50,430,100,50);
 // delButton.setBounds(150,430,100,50);
 // clrButton.setBounds(250,430,100,50);
 addButton.setBackground(Color.black);
 subButton.setBackground(Color.black);
 mulButton.setBackground(Color.black);
 divButton.setBackground(Color.black);
 scientificButton.setBackground(Color.black);
 negButton.setBackground(Color.black);
 clrButton.setBackground(Color.black);
 panel = new JPanel();
 panel.setBounds(50, 100, 350, 350);
 panel.setLayout(new GridLayout(5,4,10,10));
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
 panel.add(scientificButton);
 frame.add(panel);
 frame.add(textfield);
 frame.setVisible(true);
 }
 public void actionPerformed(ActionEvent e) {
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
}