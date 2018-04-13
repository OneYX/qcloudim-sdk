import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

/**
 * @author Yipd
 * @date 2018/4/13
 */
public class EnvTest {

    public static void main(String[] args) {
        Properties properties = System.getProperties();
        Iterator it =  properties.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry entry = (Map.Entry)it.next();
            System.out.print(entry.getKey()+"=");
            System.out.println(entry.getValue());
        }
        System.out.println(System.getenv("BINTRAY_USER"));
        System.out.println(System.getenv("BINTRAY_KEY"));
    }
}
