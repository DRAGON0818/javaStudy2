import java.io.IOException;
import java.util.List;

public class TEST {
    public static void main(String[] args) throws IOException {
        plm plm=new plm();
        StringBuffer jpsStringBuffer = plm.getJpsStringBuffer();
        System.out.println(jpsStringBuffer.toString());
        List<?> javaPidList = plm.getJavaPidList(jpsStringBuffer);
        System.out.println(javaPidList.get(0));
    }
}
