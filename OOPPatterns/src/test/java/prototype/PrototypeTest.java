package prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        Request request = new Request("lordrp", 20, "coder");
        System.out.println("Request:" + request);
        try {
            Request userRequest = request.clone();
            //изменение параметров
            userRequest.setAge(30);
            System.out.println("Request:" + userRequest);
            //тут мог бы осуществляться какой - нить поиск
            //search(userRequest)
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();//объект не поддерживает клонирование
        }

        System.out.println("Request:" + request);
    }
}