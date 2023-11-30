package com.sparta.myselectshop.entity;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


@DisplayName("UserEntity 관련 테스트")
public class UserTest {
    @Test
    @DisplayName("Hello")
    void test(){
        // given
        String username = "배규태";
        String password = "1234";
        String email = "qorbxo@gmail.com";
        UserRoleEnum role = UserRoleEnum.USER;

        // when(유저를 생성할때)
        User user = new User(username, password, email, role);


        // then(결과)
        assertThat(user.getUsername()).isEqualTo("배규태");
    }
}
