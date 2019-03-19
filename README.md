# shopAngular  
* spring-boot로 구현한 웹 애플리케이션을 Angular를 추가하여 REST API 프로젝트로 만들기
* spring-boot 프로젝트는 API(Back-end)로, Angular 프로젝트는 WEB(Front-end)으로서 동작
## 1. Angular CLI로 간단한 웹 페이지 만들기  
### 1-1. Node.js 설치  
* Node Package Manager(NPM)을 이용해서 Angular가 만들어졌기 때문에 Angular 기능을 이용하기 위해서는 Node.js를 설치해야 한다.
* Node.js란?  
    > 프레임워크이며 라이브러리이고 실행 환경이기도 하다. Node.js 환경을 직접 사용해서 서버를 실행하기도 하고, Node.js를 설치할 때 같이 설치되는 npm을 사용해서 개발에 필요한 라이브러리를 설치할수도 있다. (Angular, TypeScript 모두 npm으로 설치가 가능하다)  
    크롬 브라우저에서 사용하는 JavaScript 엔진은 구글이 개발한 고성능 V8 JavaScript 엔진이며, 이 엔진은 Node.js에도 도입되어 Node.js API를 통해 활용할 수 있다. V8 JavaScript엔진 기능 외에도 Node.js 프레임워크는 파일 시스템을 다루거나 DB에 접속하고, HTTP 요청을 보내는 수많은 API를 제공한다.  
    >

### 1-2. Angular의 특장점들  
* Angular는 NgModule이라는 묶음 단위로 코드를 모듈화한다. (ex. CustomerModule, ProductModule, ImageModule, OrderModule...)
* 모듈의 가장 최상위 모듈인 AppModule에 하위 모듈을 import하여 기능을 사용할 준비를 할 수 있다.
* 각각의 모듈(NgModule) 내에는 컴포넌트라는 것이 있는데, 클래스(TypeScript)와 템플릿(HTML)을 포함한 개념이다.
* 클래스에 내부 및 외부 패키지를 불러와서 여러가지 기능을 구현할 수 있고, 템플릿에 데이터를 양방향으로 연결하여 실시간으로 표현할 수 있다.  
(단, 양방향 연결 데이터가 많을수록 화면 응답속도는 느려진다. Angular는 기본적으로 단방향 데이터 연결을 제공한다.)  

### 1-3. Angular 입문 (https://angular.kr/guide/quickstart)
* Angular는 TypeScript와 특정 프로젝트 구조를 갖고 있기에 프로젝트 초기 셋팅이 힘듦.
* Angular CLI 설치하기
* Angular CLI를 통해 새 애플리케이션 프로젝트 생성 (터미널에서 ng 명령어로 생성할 수도 있고, IntelliJ에서도 생성 가능)

## 2. Bootstrap css 포함한 웹 디자인 변경
* Bootstrap css 파일을 프로젝트 assets/css 폴더에 추가

## 3. REST API Spring-boot 서버 소스 만들기
* dependency: web, jdbc, devtools, mysql, lombok
* application.properties: datasource, map-underscore-to-camel-case=true
* 로그인을 위한 MVC 클래스 및 매퍼 생성

## 4. web에서 api로 로그인 호출하도록 하기
* login 컴포넌트 생성
* login 컴포넌트를 모달에서 띄울 수 있도록 navigation에 설정
* 인증 모듈 생성
* 인증 모듈을 최상위 AppModule에서 사용할 수 있도록 import 추가
