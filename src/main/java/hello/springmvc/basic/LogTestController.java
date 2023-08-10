package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());   // @Slf4j가 대신 넣어줌.

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        System.out.println("name = " + name);
        log.info(" info log="+name);    //  이렇게 사용하지 않는 이유 : +가 있기 떄문에 문자열을 더하는 쓸모없는 연산 -> 쓸모없는 리소스를 사용하게 됨.

        log.trace("trace log={}", name);
        log.debug("debug log={}", name);    // 개발 환경
        log.info("info log={}", name);      // 운영 환경
        log.warn("warn log={}", name);
        log.error("error log={}", name);

        return "ok";
    }
}
