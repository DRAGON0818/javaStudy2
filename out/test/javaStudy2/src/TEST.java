import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TEST {
    public static void main(String[] args) throws IOException {
       /* plm plm=new plm();
        StringBuffer jpsStringBuffer = plm.getJpsStringBuffer();
        System.out.println(jpsStringBuffer.toString());
        List<?> javaPidList = plm.getJavaPidList(jpsStringBuffer);
        System.out.println(javaPidList.get(0));*/

        /*String querySql="select d.no,a.no,a.suser01,a.creator,a.cause,a.jtsm  from\n" +
                "desf2 d,altno a,althis al where --d.del=0 and d.wkaid<>'3'  and \n" +
                "to_char(d.ctime,'yyyy-mm-dd')>='"+"***"+"' and to_char(d.ctime,'yyyy-mm-dd')<='"+"***"+"'" +
                "and --d.no='0-NAAB-A004' and\n" +
                " a.del=0 and al.del=0 and a.wkaid<>'3' and al.del<>'3' and al.preobjid=d.id \n" +
                "and al.altnoid=a.id and a.no like '%TFI%' \n";

        System.out.println(querySql);
         */

        String path="C:\\Users\\donglxa\\Desktop\\2020\\B.txt";
        try (Scanner in = new Scanner(new File(path),"UTF-8")) {
            while(in.hasNextLine()){
                System.out.println(in.nextLine());
            }
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
