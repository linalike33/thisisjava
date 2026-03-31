package com.mjc813.petap.pet.cntr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDateTime;

@Controller

public class petController { //화면 안내 웹 브라우저 주소를 치고 들어온 사람에게 실제화면을 보여주는 각각 다른 페이지를 전환해야하니깐
    @RequestMapping("/")
    public String homePet(Model model){ //바구니 섭버의 데이터를 화면으로 전달하는
        LocalDateTime now = LocalDateTime.now();
        // 2. 쟁반에 "serverTime"이라는 이름으로 시간을 담는다
        model.addAttribute("serverTime", now);
        return "home";
        //ex)http://localhost:8080/ 주소창에 / 라고 치고 들어오면 home이라는 이름의 화면 파일을 찾아서 보여준다는 뜻
        //만약 이 코드가 없으면? 손님이 "뉴스 좀 보여줘!" 하고 /news 주소를 치고 들어와도, 서버는 "어... 뉴스 주소는 누가 담당하지? 난 모르는데?"
       // 하고 문을 닫아버립니다. (이게 바로 그 유명한 404 에러입니다.) 주소를 구분하는
    }
}
