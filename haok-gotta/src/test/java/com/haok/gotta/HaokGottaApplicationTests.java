package com.haok.gotta;

import com.haok.gotta.serializable.Host;
import com.haok.gotta.serializable.Person;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;

@SpringBootTest
class HaokGottaApplicationTests {

    private static final String filePath = System.getProperty("user.dir") + "/fff.txt";

    public static void main(String[] args) {
//        System.out.println(ObjectStreamClass.lookup(Person.class).getSerialVersionUID());
//        writeFile();
        readFile();
    }

    public static void writeFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath))) {
            objectOutputStream.writeObject(new Person().setName("123").setHost("333"));
            System.out.println("序列化成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(filePath))) {
            Person transform = (Person) objectInputStream.readObject();
            System.out.println(transform);
            System.out.println("反序列化成功");
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void contextLoads() {

    }

}
