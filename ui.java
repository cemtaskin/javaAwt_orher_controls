import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.*;

public class ui extends Frame{

    public ui(){
        TextArea textArea = new TextArea(4,4);
        textArea.setBounds(100, 50, 300, 300);
        add(textArea);

        
        Checkbox checkbox = new Checkbox("Do you accept rules about registraion");
        checkbox.setBounds(100,220,300,300);
        add(checkbox);

        checkbox.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                System.out.println(e.getStateChange());
            }
            
        });
        


        setTitle("Text Area Sample");
        setSize(500, 400);
        setLayout(null);
        setVisible(true);
      
    }
    
}
