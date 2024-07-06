import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class cal extends Frame implements ActionListener {

    Label lb; // Label is Class , lb is Object
    TextField txtInputA,txtInputB,txtResult;
    Button btnSum , btnMin , btnDiv , btnMul;

    // create function for label
    public void setlb(Label lb){

        lb.setFont(new Font("Calibri (Body)",Font.BOLD,28)); // set Font
        lb.setForeground(new Color(222,49,99)); // set text color
        add(lb);

    }

    // create function for textfield
    public void setTextField(TextField txt){

        // design text in textfield

        txt.setFont(new Font("Calibri (Body)",Font.PLAIN,25)); // set Font
        txt.setForeground(new Color(222,49,99)); // set text color
        add(txt); // add txt to show on frame
    }

    public  void setBtn(Button button){
        button.setFont(new Font("Calibri (Body)",Font.BOLD,25)); // set Font
        button.setForeground(new Color(222,49,99)); // set text color
        add(button); // add txt to show on frame
    }

    DecimalFormat df = new DecimalFormat("#,###0.00"); // ប្រើសម្រាប់កាត់ខ្ទង់

    // create method
    public cal(){

        // create label Title
        lb = new Label("Calculate"); // set text
        lb.setBounds(267,30,150,50); // set location label
        setlb(lb); // setlb is function that create , lb is object for create title not param in function

        // create label input A
        lb = new Label("Input A:"); // set text
        lb.setBounds(130,110,130,50); // set location label
        setlb(lb);

        // create textfield Input A
        txtInputA = new TextField();
        txtInputA.setBounds(270,116,200,40);
        setTextField(txtInputA); // setTextField is function , txtInputA is obj for text field A not param in function

        // create label Input B
        lb = new Label("Input B:"); // set text
        lb.setBounds(130,180,130,50); // set location label
        setlb(lb);

        // create textfield Input B
        txtInputB = new TextField();
        txtInputB.setBounds(270,186,200,40);
        setTextField(txtInputB); // setTextField is function , txtInputB is obj for text field A not param in function

        // create label Result
        lb = new Label("Result :"); // set text
        lb.setBounds(130,250,130,50); // set location label
        setlb(lb);

        // create textfield result
        txtResult = new TextField();
        txtResult.setBounds(270,256,200,40);
        setTextField(txtResult); // setTextField is function , txtResult is obj for text field A not param in function

        // create button Sum
        btnSum = new Button("Sum");
        btnSum.setBounds(80,326,100,40);
        btnSum.setFocusable(false); // delete border around text in button
        setBtn(btnSum);

        // create button Minus
        btnMin = new Button("Min");
        btnMin.setBounds(210,326,100,40);
        btnMin.setFocusable(false); // delete border around text in button
        setBtn(btnMin);

        // create button Mul
        btnMul = new Button("Multi");
        btnMul.setBounds(340,326,100,40);
        btnMul.setFocusable(false); // delete border around text in button
        setBtn(btnMul);

        // create button Dev
        btnDiv = new Button("Dev");
        btnDiv.setBounds(470,326,100,40);
        btnDiv.setFocusable(false); // delete border around text in button
        setBtn(btnDiv);

        // action Sum
        btnSum.addActionListener(this); // set button action on frame
        btnMin.addActionListener(this);
        btnMul.addActionListener(this);
        btnDiv.addActionListener(this);

        // frame
        setLayout(null);
        setSize(700,500); // set size on frame
        setBackground(Color.GRAY);
        setLocationRelativeTo(this); // show frame center on screen laptop
        setVisible(true); // show frame
    }

    public static void main(String[] args) {
        new cal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // មានន័យថាប្រសិនបើយើង click button Sum condition ដែរយើងសរសេរនិងដំណើរការ បូកលេខ
        if(e.getSource()==btnSum){ // e.getSource is object that event work on btnSum
            float numA = Float.parseFloat(txtInputA.getText()); // convert string that in textField to float
            float numB = Float.parseFloat(txtInputB.getText());
            float total = numA+numB;
            txtResult.setText(String.valueOf(df.format(total))); // convert result float to string
        }
        // create condition for Minus
        else if(e.getSource()==btnMin){
            float numA = Float.parseFloat(txtInputA.getText()); // convert string that in textField to float
            float numB = Float.parseFloat(txtInputB.getText());
            float total = numA-numB;
            txtResult.setText(String.valueOf(df.format(total)));
        }
        // create condition for Multi
        else if(e.getSource()==btnMul){
            float numA = Float.parseFloat(txtInputA.getText()); // convert string that in textField to float
            float numB = Float.parseFloat(txtInputB.getText());
            float total = numA*numB;
            txtResult.setText(String.valueOf(df.format(total)));
        }
        // create button for div
        else if(e.getSource()==btnDiv){
            float numA = Float.parseFloat(txtInputA.getText()); // convert string that in textField to float
            float numB = Float.parseFloat(txtInputB.getText());
            float total = numA/numB;
            txtResult.setText(String.valueOf(df.format(total)));
        }
    }
}
// df.format(total) យើងត្រូវដាក់ក្នុង txtResult ទាំងអស់ដើម្បីអោយវាដំណើការ