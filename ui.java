import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;

import org.w3c.dom.Text;

import java.awt.*;

public class ui extends Frame{

    public ui(){
        Frame frame = this;

        TextArea textArea = new TextArea(4,4);
        textArea.setBounds(100, 50, 300, 150);
        add(textArea);

        
        Checkbox checkbox = new Checkbox("Do you accept rules about registraion");
        checkbox.setBounds(100,280,300,20);
        add(checkbox);

        checkbox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                System.out.println(e.getStateChange());
            }
            
        });
        
        Choice choice = new Choice();
        choice.add("Male");
        choice.add("Female");
        choice.setBounds(100, 300, 100, 50);   
        choice.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                System.out.println(e.getItem().toString());
            }
            
        }); 
        add(choice);

        TextField text= new TextField();
        text.setBounds(500, 70, 200, 30);
        add(text);

        List list = new List();
        list.setBounds(500, 100, 200, 300);
        
        list.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {

                if (e.getClickCount()==2){
                    System.out.println(list.getSelectedIndex());
                    System.out.println("mouse clicked");
                    System.out.println(e.getPoint());
                    list.remove(list.getSelectedIndex());
                }
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'mouseClicked'");
               
            }

            @Override
            public void mousePressed(MouseEvent e) {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'mousePressed'");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'mouseReleased'");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'mouseEntered'");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'mouseExited'");
            }
            
        });
        add(list);
    
        text.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                // TODO Auto-generated method stub
                if (e.getKeyCode()==KeyEvent.VK_ENTER){ //return key
                    String inputValue = text.getText();
                    if (inputValue.trim().length()==0){ //empty string
                        Dialog dialog = new Dialog(frame, "Error",true);
                        dialog.setLayout(new FlowLayout());
                        dialog.setBounds(10, 10, 250, 250);
                        Label label = new Label("You can not add an empty value");
                        label.setBounds(10, 10, 100, 20);
                        Button button = new Button("Close");
                        button.setBounds(10, 100, 100, 20);
                        button.addActionListener(new ActionListener() {

                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // TODO Auto-generated method stub
                                dialog.setVisible(false);
                            }
                            
                        });
                        dialog.add(label);
                        dialog.add(button);
                        dialog.setVisible(true);
                        
                       

                        return;
                    }
                    
                    list.add(text.getText());
                    text.setText("");
                }       
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // TODO Auto-generated method stub
                //throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
            }
            
        });

    
        
        



        setTitle("Text Area Sample");
        setSize(900, 400);
        setLayout(null);
        setVisible(true);
      
    }
    
}
