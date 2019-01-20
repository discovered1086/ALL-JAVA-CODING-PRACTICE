package tutorials.ioprogramming.printstream;


import java.io.DataInputStream;
import java.io.IOException;

import tutorials.ioprogramming.filterstream.DumpFilter;


public abstract class DataFilter extends DumpFilter {

  // The use of DataInputStream here is a little forced.
  // It would be more natural (though more complicated)
  // to read the bytes and manually convert them to an int
  DataInputStream din;

  public DataFilter(DataInputStream din) {
    super(din);
    this.din = din;
  }
  
  public int available() throws IOException {
    return (buf.length - index) + in.available();
  }
  
}
