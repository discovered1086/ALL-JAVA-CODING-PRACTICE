package tutorials.ioprogramming.charset;
import java.awt.*;
import javax.swing.*;


public class ModePanel2 extends JPanel {

  JCheckBox bigEndian = new JCheckBox("Big Endian", true);
  JCheckBox deflated  = new JCheckBox("Deflated", false);
  JCheckBox gzipped   = new JCheckBox("GZipped", false);
  
  ButtonGroup dataTypes     = new ButtonGroup();
  JRadioButton asciiRadio   = new JRadioButton("Text");
  JRadioButton decimalRadio = new JRadioButton("Decimal");
  JRadioButton hexRadio     = new JRadioButton("Hexadecimal");
  JRadioButton shortRadio   = new JRadioButton("Short");
  JRadioButton intRadio     = new JRadioButton("Int");
  JRadioButton longRadio    = new JRadioButton("Long");
  JRadioButton floatRadio   = new JRadioButton("Float");
  JRadioButton doubleRadio  = new JRadioButton("Double");
  
  JTextField password = new JTextField();
  
  // compress
  final static String[] encodings = {"8859_1", "8859_2", "8859_3", "8859_4", 
   "8859_5", "8859_6", "8859_7", "8859_8", "8859_9", "Big5", "CNS11643", 
   "Cp037", "Cp273", "Cp277", "Cp278", "Cp280", "Cp284", "Cp285", "Cp297", 
   "Cp420", "Cp424", "Cp437", "Cp500", "Cp737", "Cp775", "Cp850", "Cp852", 
   "Cp855", "Cp856", "Cp857", "Cp860", "Cp861", "Cp862", "Cp863", "Cp864", 
   "Cp865", "Cp866", "Cp868", "Cp869", "Cp870", "Cp871", "Cp874", "Cp875", 
   "Cp918", "Cp921", "Cp922", "Cp1006", "Cp1025", "Cp1026", "Cp1046", 
   "Cp1097", "Cp1098", "Cp1112", "Cp1122", "Cp1123", "Cp1124", "Cp1250", 
   "Cp1251", "Cp1252", "Cp1253", "Cp1254", "Cp1255", "Cp1256", "Cp1257", 
   "Cp1258", "EUCJIS", "GB2312", "JIS", "JIS0208", "KSC5601", "MacArabic", 
   "MacCentralEurope", "MacCroatian", "MacCyrillic", "MacDingbat", "MacGreek", 
   "MacHebrew", "MacIceland", "MacRoman", "MacRomania", "MacSymbol", "MacThai", 
   "MacTurkish", "MacUkraine", "SJIS", "UTF8", "Unicode" };
  
  JList theEncoding = new JList(encodings);
  
  public ModePanel2() {
  
    this.setLayout(new GridLayout(1, 2));
    
    JPanel left = new JPanel();
    JScrollPane right = new JScrollPane(theEncoding);
    left.setLayout(new GridLayout(13, 1));
    left.add(bigEndian);
    left.add(deflated);
    left.add(gzipped);
    
    left.add(asciiRadio);
    asciiRadio.setSelected(true);
    left.add(decimalRadio);
    left.add(hexRadio);
    left.add(shortRadio);
    left.add(intRadio);
    left.add(longRadio);
    left.add(floatRadio);
    left.add(doubleRadio);
    
    
    dataTypes.add(asciiRadio);
    dataTypes.add(decimalRadio);
    dataTypes.add(hexRadio);
    dataTypes.add(shortRadio);
    dataTypes.add(intRadio);
    dataTypes.add(longRadio);
    dataTypes.add(floatRadio);
    dataTypes.add(doubleRadio);
    
    left.add(password);
    this.add(left);
    this.add(right);
    
  }

  public boolean isBigEndian() {
    return bigEndian.isSelected();
  }
  
  public boolean isDeflated() {
    return deflated.isSelected();
  }
  
  public boolean isGZipped() {
    return gzipped.isSelected();
  }
  
  public boolean isText() {
    if (this.getMode() == FileDumper6.ASC) return true;
    return false;
  }
  
  public String getEncoding() {
    return (String) theEncoding.getSelectedValue();
  }
  
  public int getMode() {

    if (asciiRadio.isSelected()) return FileDumper6.ASC;
    else if (decimalRadio.isSelected()) return FileDumper6.DEC;
    else if (hexRadio.isSelected()) return FileDumper6.HEX;
    else if (shortRadio.isSelected()) return FileDumper6.SHORT;
    else if (intRadio.isSelected()) return FileDumper6.INT;
    else if (longRadio.isSelected()) return FileDumper6.LONG;
    else if (floatRadio.isSelected()) return FileDumper6.FLOAT;
    else if (doubleRadio.isSelected()) return FileDumper6.DOUBLE;
    else return FileDumper6.ASC;
    
  }
  
  public String getPassword() {
    return password.getText();
  }
  
  // a simple test method
  public static void main(String[] args) {
  
    JFrame jf = new JFrame("Test Mode Panel");
    ModePanel2 mp2 = new ModePanel2();
    jf.getContentPane().add(mp2);
    jf.pack();
    jf.show();
    System.out.println("done");
    
  }

}
