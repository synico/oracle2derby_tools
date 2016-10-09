import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) {
        try {
            Class cl = Class.forName("com.avn.dataload.model.emdi.Catentry");
            Object t = cl.newInstance();
            Field fields[] = t.getClass().getDeclaredFields();
            Method methods[] = t.getClass().getDeclaredMethods();
            String regex = "([a-z])([A-Z]+)";
            String replacement = "$1_$2";
            for(Field field : fields) {
//                System.out.println("get" + field.getType().getSimpleName() + " " + field.getName().replaceAll(regex, replacement).toUpperCase());
            }
            for(Method method : methods) {
            	if(method.getName().startsWith("set")) {
            		System.out.println(method.getName().replace("set", "").replaceAll(regex, replacement).toUpperCase());
            	}
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
