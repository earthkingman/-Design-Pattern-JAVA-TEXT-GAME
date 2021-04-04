# -Design-Pattern-JAVA-TEXT-GAME

### 목적 ###
SW **재사용성**, **호환성**, **유지 보수성**을 보장

### 특징 ###
디자인 패턴은 아이디어, 특정한 구현이 아니다.
프로젝트에 항상 적용해야 하는 것은 아니지만, 추후 재사용, 호환, 유지 보수시 발생하는 문제 해결을 예방하기 위해 패턴을 만들어 둔것이다.

### 원칙 - SOLID (객체지향 설계 원칙) 

**SRP(Single Responsibility Principle) : 단일 책임 원칙**
<br>
클래스는 단 하나의 책임을 가져야 하며 클래스를 변경하는 이유는 단 하나의 이유이어야 한다.

**OCP(Open-Closed Principle) : 개방-폐쇄 원칙**
<br>
확장에는 열려 있어야 하고 변경에는 닫혀 있어야 한다.

**Liskov Substitution Principle  : 리스코프 치환 원칙**
<br>
자식이 부모의 자리에 항상 교체될 수 있어야 함.

**ISP(Interface Segregation Principle) : 인터페이스 분리 원칙**
<br>
인터페이스는 그 인터페이스를 사용하는 클라이언트를 기준으로 분리해야 한다.

**DIP(Dependency Inversion Principle) : 의존 역전 원칙**
<br>
고수준 모듈은 저수준 모듈의 구현에 의존해서는 안된다.
