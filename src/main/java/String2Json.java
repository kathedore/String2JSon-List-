import com.google.gson.Gson;

import java.util.Arrays;
import java.util.List;

final class String2JSon {
    public List<Parameters> getParameters(){
        return Arrays.asList(new Parameters("????","15.50","15.00","1","15.00","0.500000","0.000000"), new Parameters("??-??","143.50","125.00","123","151.00","0.5230","0.500"), new Parameters("??-??","13.50","125.00","1.02","15.00","0.50","0.90"));
    }
    Gson gson = new Gson();
    String param = gson.toJson(getParameters());
    public List<MyRes> getMyRes(){
        return Arrays.asList(new MyRes("GetReport","ok",param));
    }
}
