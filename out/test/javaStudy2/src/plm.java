import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class plm {
    public StringBuffer getJpsStringBuffer() throws IOException {
        Runtime runtime = Runtime.getRuntime();
        BufferedReader br = new BufferedReader(new InputStreamReader(runtime.exec("jps").getInputStream()));
        String line = null;
        StringBuffer b = new StringBuffer();
        while ((line = br.readLine()) != null) {
            b.append(line + "\n");
        }
        return b;
    }

    public List<?> getJavaPidList(StringBuffer jpsInfomation){
        String jpsinfo=jpsInfomation.toString();
        String[] pidAndName = jpsinfo.split("\n");
        List<String> pidList=new ArrayList<>();
        for(String eachone:pidAndName){
            if(eachone.contains("Jps")){
                pidList.add(eachone.substring(0,eachone.indexOf(" ")));
            }
        }
        return pidList;
    }
}
