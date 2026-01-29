package com.sist.web.vo;

import lombok.Data;

/*
 * 		부트 :
 * 			@SpringBootApplication => 구동
 * 			Controller : @RestController / Controller
 * 			Service : @Service
 * 			Repository : @Repository
 * 			Entity : 데이터베이스 연동 => 컬럼명 동일 => JPA
 * 			등록 : 동작에 필요한
 * 				  application.properties / application.yml
 * 			WebFlux : @GetMapping
 * 					  @PostMapping / @PutMapping / @DeleteMapping
 * 			   | 멀티미디어 전송 => 실시간 스트리밍, Spring AI
 * 
 * 			Dependency / Injection (DI)
 * 				=> @Autowired => 객체 주소값 주입
 *  			=> @RequiredArgsConstructor (lombok) => 생성자를 통해서 주입
 *  		-----------------------------------------------------------
 *  		user = controller = service = mapper = db
 *  
 *  	Spring-Boot
 *  		1. 메인 클래스 실행
 *  		2. Bean 생성 + DI
 *  		3. Controller 요청 처리
 *  		4. Service
 *  		5. SQL 문장 => Repository
 *  		6. 응답 => 브라우저 UI 갱신
 *  				 -------------  Pinia
 *  	Spring-Boot
 *  		=> Spring 프레임워크 기반의 빠른 애플리케이션 개발 도구
 *  		=> 설정 최소화
 *  		=> 내장 서버 (Tomcat)
 *  		   ---------------- CI / CD
 *  	=> WebSocket / Security (JWT)
 *  		MyBatis / JPA
 *  		JSP / ThymeLeaf
 *  	=> SpringFramework (유지 보수) => 전자 정부 프레임워크
 *  	=> 자바 / 오라클
 *  		| 코틀린
 *  	--------------------------
 *  	Pinia : 동작
 *  		Vue3 => 상태 관리
 *  		데이터, 로딩 상태 유지
 *  		UI 자동 갱신
 *  
 *  	---------------------------
 *  	Minikube => dashboard ==> 1
 *  	Jenkins => dashboard
 *  	---------------------------
 *  	docker / docker-compose
 */

@Data
public class FoodVO {
	private double score;
	private int fno, hit;
	private String name, type, phone, address, theme, price, time, parking, poster, images, content;
}
