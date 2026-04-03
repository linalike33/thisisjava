package com.mjc813.petap.pet.svc;

import com.mjc813.petap.pet.dto.petEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
//interface 선언알아서다만들어줌
public interface petRepository extends JpaRepository<petEntity, Integer> { // 상속받은 인터페스로 DB에 접근 하는 유일한 통로 원래 DB에서 데이터를 찾으려면 코드가
    //많아지지만 메소드만 생성하면 알아서 가져온다 창고관리느낌
    Slice<petEntity> findByNameContains(String searchName, Pageable pageable);
    //이름에 searchName 이 들어간걸 다 찾고 pageable에 적힌데로 5개씩 잘라서 가져온다 이걸 Slice 에 담아서 다음 페이지 여부와 함께 리턴
}
//petEntity, Integer>:
//첫 번째(petEntity): "내가 관리할 창고 물건은 **강아지(Entity)**야!"
//두 번째(Integer): "그 강아지들 번호표(ID)는 **숫자(Integer)**로 되어 있어!"