package tutorials.ioprogramming.charset;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

import tutorials.ioprogramming.basicio.JStreamedTextArea;


public class FileViewer2 extends JFrame 
 implements WindowListener, ActionListener {

  JFileChooser fc = new JFileChooser();
  JStreamedTextArea theView = new JStreamedTextArea();
  ModePanel2 mp = new ModePanel2();

  public FileViewer2() {
    super("FileViewer");
  }

  public void init() {
  
    this.addWindowListener(this);
   
    fc.setApproveButtonText("View File");
    fc.setApproveButtonMnemonic('V');
    fc.addActionListener(this);
    
    this.getContentPane().add("Center", fc);
    JScrollPane sp = new JScrollPane(theView);
    this.getContentPane().add("South", sp);
    this.getContentPane().add("West", mp);
    this.pack();
    
    // center on display
    Dimension display = getToolkit().getScreenSize();
    Dimension bounds = this.getSize();   
    
    int x = (display.width - bounds.width)/2;
    int y = (display.height - bounds.height)/2;
    if (x < 0) x = 10;
    if (y < 0) y = 15;
    this.setLocation(x, y);
    
  }
  
  public void actionPerformed(ActionEvent e) {
  
    if (e.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
      File f = fc.getSelectedFile();
      if (f != null) {
        theView.setText("");
        try {
          InputStream in = new FileInputStream(f);
          OutputStream out = theView.getOutputStream();
          if (!mp.isText()) {
            FileDumper6.dump(in, out, mp.getMode(), mp.isBigEndian(),
             mp.isDeflated(), mp.isGZipped(), mp.getPassword());
          }
          else {
            FileDumper6.dump(in, out, mp.getEncoding(), null,
             mp.isDeflated(), mp.isGZipped(), mp.getPassword());        
          }
        }
        catch (IOException ex) {
        }
      }
      
    }
    else if (e.getActionCommand().equals(JFileChooser.CANCEL_SELECTION)) {
      this.closeAndQuit();
    }
    
  }

  public void windowClosing(WindowEvent e) {
    this.closeAndQuit();
  }
  
  // Do-nothing methods for WindowListener
  public void windowOpened(WindowEvent e) {}
  
  public void windowClosed(WindowEvent e) {}
  public void windowIconified(WindowEvent e) {}
  public void windowDeiconified(WindowEvent e) {}
  public void windowActivated(WindowEvent e) {}  
  public void windowDeactivated(WindowEvent e) {}

  private void closeAndQuit() {
  
    this.setVisible(false);
    this.dispose();
    
    //
    System.exit(0);
  
  }

  public static void main(String[] args) {
  
    FileViewer2 fv = new FileViewer2();
    fv.init();
    fv.show();
    
  }

}
