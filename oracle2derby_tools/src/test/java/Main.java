import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) {
        try {
            Class cl = Class.forName("com.dataload.model.emdi.Catentry");
            Object t = cl.newInstance();
            Field fields[] = t.getClass().getDeclaredFields();
            String regex = "([a-z])([A-Z]+)";
            String replacement = "$1_$2";
            for(Field field : fields) {
                System.out.println("get" + field.getType().getSimpleName() + " " + field.getName().replaceAll(regex, replacement).toUpperCase());
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
