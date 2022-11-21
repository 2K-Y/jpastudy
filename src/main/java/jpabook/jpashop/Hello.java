package jpabook.jpashop;

import lombok.Getter;
import lombok.Setter;

// Getter @Setter 로 선언해놓으면 가져오기 좋음
// 객체지향 프로그래밍에서 객체의 데이터는 객체 오부에서 직접적으로 접근하는 것을 막음.
// 외부에서 메소드를 통해 데이터에 접근하도록 유도하는데 그게 setter
@Getter @Setter
public class Hello {
    private String data;
}
