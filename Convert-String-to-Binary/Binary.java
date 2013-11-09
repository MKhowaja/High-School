import java.io.*;
public class Binary {

  public static void main(String[] args) throws IOException {
    String a = "000101010100010101000101010101010010101000001010";
    int x, z=0;
    String temp="";
    int total=0;
    StringBuilder message=new StringBuilder();
    for (int i = 0; i < a.length()/8;i++){
      temp = a.substring(i*8,i*8+8);
      for (int j = 7; j>=0;j--){
        x = (int) temp.charAt(j)-'0';
        if (x==1){
          total += Math.pow(2, z);
        }
        z++;
      }
    message.append((char)total);
    total = 0;
    z=0;
    }
  System.out.println(message);
  }
}
