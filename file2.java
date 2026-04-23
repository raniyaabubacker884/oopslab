import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file2 {
public static void main(String[] args) throws IOException {
        
FileInputStream source = new FileInputStream("source1.txt");
FileOutputStream odd = new FileOutputStream("odd.txt");
FileOutputStream even = new FileOutputStream("even.txt");
int t;
while ((t = source.read()) != -1) {
if (t % 2 == 0) {
even.write(t);
} else {
odd.write(t);
}
}
System.out.println("copied");
source.close();
even.close();
odd.close();
}
}
