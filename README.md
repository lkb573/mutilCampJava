README



10/19

zulu jdk > Azul 회사에서 제공(Azul.com)

설정시 bin file path 값 설정

web 프로젝트 최적화의 유지유무 확인
java perspective 

ctrl+shi+F >개행처리

plug-in > 내장할수있는 프로그램
>> 프로그램 별 jar 파일을 통해 첨삭 가능


톰캣 연동
2.5 버전으로 되어야 web.xml 제공

resources > 환경설정 파일
test > 그외소스


기본 파일 포맷 설정 가능 > windows - prefernce - web - jsp files - templates


이클립스 tomcat != 컴퓨터내 설치한 tomcat
> 설치한 서버를 복사한 내용이 이클립스에 적용(plug-in)
>> C:\DEV\eclipse-workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0 카피본이 적용
>> 테스트 서버를 적용시키는 경량화된 설정



h2 데이터베이스???(오픈소스)
Java 로 만들어진 db > 메모리, 일반db 까지 전체 적용
>> 오라클 SQL 지원(시퀀스까지)
※오라클XE 교육용으로 풀었으나 현재 막힘 > h2 로 변경 적용


이클립스 = 통합개발환경
> 이클립스이전에는 혼란
>> Java-.NET 선택의 시절 | .NET이 결국 패배(비주얼스튜디오 통합환경 존재)
>WSAD(IBM이 개발한 개발툴이 존재 - 이클립스 전신개념) / 무료로 풀어주면서 이클립스로 명칭 변경
>> 이클립스는 오픈소스 - 라이센스제약이없다 | (스프링4.0 까지는 무료였지만 이후 버전은 금액 지불)
★ 오픈소스 장점=커스터텀한 나만의 최적화된 환경 개발 가능
※ 부모클래스의 기능을 자식이 상속+자식이 신규로 추가+override 가능




---------------------------------------------------------------------------------------------------------------

10/20

create table users(
id varchar2(8) primary key,
password varchar2(8),
name varchar2(20),
role varchar2(5)
);

insert into users values('test', 'test123', '관리자', 'Admin');

select * from users;



@ ?
변수/메서드/클래스 상단에 붙이는 메타데이터(정보를전달)
함수, 내장함수개념 > 기능
(ex : @Override = java.lang)


ANT & MAVEN
빌드자동화 도구


---------------------------------------------------------------------------------------------------------------

10/21

Maven 

ANT
- 절차적인 모든 과정을 개발자가 작업 / build.xml 작업 포함
Maven
- 정형화된 구조를 강제한 가이드 형태에서 진행
- 라이브러리 의존성/편의성 해결 및 자동화


Maven 라이프사이클
단계는 Ant 의 target 흐름과 동일

validate ~~~ deploy


Maven build... > 지정IPdp redeploy/deploy 작업가능



Framework - Persistence > Java code 1줄로 sql 처리를 지원
Hibernate
- sql 관련 작업을 프레임워크가 처리
- DBMS 변경에도 설정작업만하면 즉시 적용가능
- Java 개발자의 경우 언젠간 해야할 단계...?
iBatis
- 직접 튜닝하며 작업가능


Spring IoC


@Autowired > TypeInjection 타입인젝션
타입이존재해야하고 유니크해야함


IoC(역제어) - 컨테이너가 작업을 제어
> 객체생성
>> <bean> = 유지보수과정에서 변경이 없는 class
>> @Component = 유지보수과정에서 변경이 있는 class
> 의존관계
>> 생성자 <constructor-arg>
>> setter <property> = 직접 작업하지 않은 class
>> type @Autowired = 직접 작업한 class



---------------------------------------------------------------------------------------------------------------

10/22


tomcat = java 로 만들어진 서버
> new Tomcat() 실행 / 이클립스내 서버 구동시
>> Servlet Engine 생성 > new ServletContainer("web.xml)"
>>> DispatcherServlet


servlet > lazy 
컨테이너 생성이후 클라이언트 요청에 의해 생성
spring > pre 
컨테이너가 생성될때 미리 객체를 생성


기능 순서
등록 수정 삭제 상세목록


---------------------------------------------------------------------------------------------------------------

10/23

controller > POJO 형태/타입으로 생성

ModelAndViewv / Model 에 객체를 등록하면 자동으로 request 등록
※ request 가 아닌 session에서 데이터를 받는 경우도 있음


business-layer.xml > ??? > @Service / @Repository

action-servlet.xml > Servlet > @Controller

※ Listener 는 Servlet과 다르게 Servlet 컨테이너가 web.xml 파일을 읽어서 구동될때
자동으로 메모리에 생성되는 객체 > Pre loading

