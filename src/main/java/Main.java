import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        //Створення екземпляра Person
        Person originalPerson = new Person("Шевченко", "Тарас", 47);
        System.out.println("Початковий об'єкт: " + originalPerson);

        //Старт
        Gson gson = new Gson();

        //Конвертація в JSON
        String json = gson.toJson(originalPerson);
        System.out.println("Об'єкт у форматі JSON: " + json);

        //Конвертація назад в об’єкт
        Person deserializedPerson = gson.fromJson(json, Person.class);
        System.out.println("Відновлений об'єкт: " + deserializedPerson);

        //Перевірка equals-ом початковий і одержаний об'єкти
        boolean isEqual = originalPerson.equals(deserializedPerson);
        System.out.println("\nЧи рівні об'єкти (equals)? -> " + isEqual);
    }
}