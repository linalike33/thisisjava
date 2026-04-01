package com.mjc813.petap.pet.svc;

import com.mjc813.petap.pet.dto.petDto;
import com.mjc813.petap.pet.dto.petEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service //내가 진짜 로직을 처리하는 사람이라고 선언하는것
public class petService { //가장 중요한 비지니스 로직을 처리한다 Dto를 받아서 Entity로 변환 하거나 데이터를 가공(내가 넣는 Dto 가벼운 주문서를 Dto에 저장할수 있도록 정식 규격인 Entity로 바꾸어서 다시 포장해 전달하는 역할을 한다
    @Autowired //petRepository 이걸 자동으로 불어와 옆에 두고 이제 필요한때마다 petRepository 에게 저장하라고 시킬수있다
    private  petRepository petRepositoryy;

    public petDto insert(petDto petDtoo){//데이터 등록하기
        petEntity petEntityy = new petEntity(); //정식규격상자
        petEntityy.setId(petDtoo.getId()); // Dto로 받은 주문서를 이름을 읽어 상자로 옮겨담는다
        petEntityy.setName(petDtoo.getName());
        petEntityy.setBirth(petDtoo.getBirth());
        petEntityy.setBreed(petDtoo.getBreed());
        petEntityy.setGender(petDtoo.getGender());
        petEntityy.setImgFile(petDtoo.getImgFile());
        petEntityy.setSpecies(petDtoo.getSpecies());

        this.petRepositoryy.save(petEntityy); //데이터베이스로 들어가는순간
        //자바 객체(Entity)를 로봇(Repository)에게 건네주면, 로봇이 이걸 **SQL(DB 언어)**로 찰떡같이 번역해서 MySQL 창고에 넣어준다

        petDtoo.setId(petEntityy.getId()); //저장이끝나면 이게 몇번째로 등록이됐는가를 알려주는
        return petDtoo;
    }
    public petDto update(petDto petDtoo){//petDto 가 데려온 데이터를  정보 수정
        //	PetEntity petEntity = new PetEntity();
        petEntity petEntityy = this.petRepositoryy.findById(petDtoo.getId()).orElseThrow(); //DB열쇠를 가지고 있는 petRepositoryy 이걸 호출하여 기존 데이터를 꺼내서 ID 번호로 검색 한다 만약 없다면
//		1. findById(id) jpa 메소드로 id 의 행 객체를 가져온다.
//		petEntity.setId(petDto.getId());
        if(petDtoo.getName() != null) {
            petEntityy.setName(petDtoo.getName()); //보낸 petDtoo 여기에 해당하는 이름이 적혀있을 경우에만 바꾸고 아닐때는 바꾸지 않음
        }
        if(petDtoo.getBirth() != null) {
            petEntityy.setBirth(petDtoo.getBirth());
        }
        if(petDtoo.getBreed() != null) {
            petEntityy.setBreed(petDtoo.getBreed());
        }
        if(petDtoo.getGender() != null) {
            petEntityy.setGender(petDtoo.getGender());
        }
        if(petDtoo.getImgFile() != null) {
            petEntityy.setImgFile(petDtoo.getImgFile());
        }
        if(petDtoo.getSpecies() != null) {
            petEntityy.setSpecies(petDtoo.getSpecies());
        }
        // 2. 가져온 객체에서 원하는 컬럼의 값을 수정한다. 다만 id를 수정하면 절대 안된다.

        this.petRepositoryy.save(petEntityy); //다 수정한 원본을 petEntityy 여기에 저장한다 save 이건 창고지기(petRepositoryy)에게 내리는 저장/수정 명령 번호가 있으면 수정하고 없다면 새로 저장해주는 역할을 한다 상황에 맞춰서 다해줌
        // 3. save 를 한다.

        petDto result = new petDto(); //마지막으로 수정된걸 새로 만들어서 리턴함 데이터가 DB에 제대로 들어갓는지를 확인하기위해
        result.setId(petEntityy.getId());
        result.setName(petEntityy.getName());
        result.setBirth(petEntityy.getBirth());
        result.setBreed(petEntityy.getBreed());
        result.setGender(petEntityy.getGender());
        result.setImgFile(petEntityy.getImgFile());
        result.setSpecies(petEntityy.getSpecies());

        return result;
        // 밑에 있는 주석처리한 코드와 위에 있는 코드에 다른 점은 위에 코드는 기존 데이터를 꺼내와서 바꾸지만 밑에는 새 빈 상자를 만들어서 넣는다(수정의 역할X)
        //이름만 보내면 이름만 바뀌고 나머지는 그대로 유지	 밑에는 이름만 보내면 나머지 정보는 전부 null(삭제) 처리됨
//        petEntity petEntityy = new petEntity();
//        petEntityy.setId(petDtoo.getId());
//        petEntityy.setName(petDtoo.getName());
//        petEntityy.setBirth(petDtoo.getBirth());
//        petEntityy.setBreed(petDtoo.getBreed());
//        petEntityy.setGender(petDtoo.getGender());
//        petEntityy.setImgFile(petDtoo.getImgFile());
//        petEntityy.setSpecies(petDtoo.getSpecies());
//
//        this.petRepositoryy.save(petEntityy);
//
//        petDto resultDto = new petDto();
//        resultDto.setId(petEntityy.getId());
//        resultDto.setName(petEntityy.getName());
//        resultDto.setBirth(petEntityy.getBirth());
//        resultDto.setBreed(petEntityy.getBreed());
//        resultDto.setGender(petEntityy.getGender());
//        resultDto.setImgFile(petEntityy.getImgFile());
//        resultDto.setSpecies(petEntityy.getSpecies());
//        resultDto.setId(petDtoo.getId()); //저장이끝나면 이게 몇번째로 등록이됐는가를 알려주는
//        return resultDto;
    }
}
