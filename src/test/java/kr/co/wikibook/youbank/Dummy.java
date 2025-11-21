package kr.co.wikibook.youbank;

import net.datafaker.Faker;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;
import org.springframework.boot.jdbc.test.autoconfigure.AutoConfigureTestDatabase;
import org.springframework.context.annotation.Import;

import java.util.Locale;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class Dummy {
    public Faker kofaker = new Faker(new Locale("ko")); //한글
    public Faker enfaker = new Faker(new Locale("en")); //영어
}
