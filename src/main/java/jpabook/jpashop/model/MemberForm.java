package jpabook.jpashop.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class MemberForm {

    @NotEmpty(message = "회원 이름은 필수 값입니다.")
    private String name;
    private String city;
    private String street;
    private String zipCode;

}
