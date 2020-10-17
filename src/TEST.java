import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.time.LocalDate;
import java.util.List;

public class TEST {
    public static void main(String[] args) throws IOException {
        plm plm=new plm();
        StringBuffer jpsStringBuffer = plm.getJpsStringBuffer();
        System.out.println(jpsStringBuffer.toString());
        List<?> javaPidList = plm.getJavaPidList(jpsStringBuffer);
        System.out.println(javaPidList.get(0));
        LocalDate now = LocalDate.now();
        System.out.println(now);
        int da = now.getDayOfMonth();
        System.out.println(da);
        System.out.printf("%3d\n",da);
        now = now.minusDays(da - 1);
        System.out.println(now);

        InetAddress localHost = Inet4Address.getLocalHost();
        System.out.println(localHost.getHostAddress());
    }
}
