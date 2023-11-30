package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.User;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;


@DisplayName("UserRepository Test")
@SpringBootTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;
    @DisplayName("유저이름으로 유저조회 테스트")
    @Test
    void Test1() {
        // given
        String username = "배규태";

        // when
        Optional<User> user = userRepository.findByUsername(username);


        // then
        assertThat(user.isPresent()).isFalse();

        // 메소드 호출 , 변수값 할당
    }
}
