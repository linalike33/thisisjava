package com.mjc813.petap.pet.svc;

import com.mjc813.petap.pet.dto.petDto;
import com.mjc813.petap.pet.dto.petEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //내가 진짜 로직을 처리하는 사람이라고 선언하는것
public class petService { //가장 중요한 비지니스 로직을 처리한다 Dto를 받아서 Entity로 변환 하거나 데이터를 가공(내가 넣는 Dto 가벼운 주문서를 Dto에 저장할수 있도록 정식 규격인 Entity로 바꾸어서 다시 포장해 전달하는 역할을 한다
    @Autowired //petRepository 이걸 자동으로 불어와 옆에 두고 이제 필요한때마다 petRepository 에게 저장하라고 시킬수있다
    private  petRepository petRepositoryy;

    public petDto insert(petDto petDtoo){
        petEntity petEntityy = new petEntity(); //정식규격상자
        petEntityy.setId(null); // Dto로 받은 주문서를 이름을 읽어 상자로 옮겨담는다
        petEntityy.setName(petDtoo.getName());
        petEntityy.setBirth(petDtoo.getBirth());
        petEntityy.setBreedy(petDtoo.getBreedy());
        petEntityy.setGender(petDtoo.getGender());
        petEntityy.setImgFile(petDtoo.getImgFile());
        petEntityy.setSpecies(petDtoo.getSpecies());

        this.petRepositoryy.save(petEntityy); //데이터베이스로 들어가는순간
        //자바 객체(Entity)를 로봇(Repository)에게 건네주면, 로봇이 이걸 **SQL(DB 언어)**로 찰떡같이 번역해서 MySQL 창고에 넣어준다

        petDtoo.setId(petEntityy.getId()); //저장이끝나면 이게 몇번째로 등록이됐는가를 알려주는
        return petDtoo;
    }
}
