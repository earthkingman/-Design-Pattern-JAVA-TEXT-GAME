# -Design-Pattern-JAVA-TEXT-GAME

# 목적
본 소프트웨어 ‘낚시왕 어드벤처’는 텍스트 기반의 입출력을 사용하는 텍스트 어드벤쳐(인터랙티브 픽션)게임입니다. 
통합적 문제 인식을 통해 단순한 코드 생성이 아닌 개발 프로세스와 프로젝트 관리를 중요시 했습니다.
주제에 디자인패턴을 입히고 프로세스 모델을 선정하여 문서화와 효율적인 프로젝트 관리, 변경이나 재사용을 염두에 둔 작업을 하는 것이 목표입니다.

# 분석

## 스테이트 패턴 적용
<br>
스테이트 패턴은 객체가 특정 상태에 따라 행위를 달리하는 상황에서, 상태를 객체화 하여 상태가 행동을 할 수 있도록 위임하는 패턴이다. <br>본 프로젝트에서는 날씨 상태를 객체화 하여 날씨 상태에서 행동을 가능케 한다.
<br>
**문제점**
<br>
프로그램 내부적으로 낚시하기 행동을 시행할 때 마다 날씨 변화가 필요하다. <br>날씨 변화는 현실 세계의 변덕스러운 날씨를 반영하기 위하여 날씨가 밝아지면 화창한 날이 되고 화창한 날에서 흐려지면 선선한 날이 되는 것과 같이 동일하게 구현하기 위하여 스테이트 패턴을 사용하게 되었다. <br>
해결 방안


<img width="610" alt="스크린샷 2021-04-09 오후 4 33 36" src="https://user-images.githubusercontent.com/48669085/114145856-db904d00-9951-11eb-921f-497af936307b.png">

<br>
스테이트 패턴을 사용하여 날씨 특정 상태가 행동을 할 수 있도록 구현한다 날씨가 좋아지는 함수와 날씨가 악화되는 함수 shining(), cool(), clouding() 를 구현하여 특정 상태가 변할 수 있도록 한다. 상태가 변화할 때 원하는 상태로 변하기 위하여 State 인터페이스를 상속받는 클래스 CoolDay , RainyDay, SunnyDay 즉 날씨 상태 클래스에서 알맞게 구현한다




<img width="530" alt="스크린샷 2021-04-09 오후 4 33 42" src="https://user-images.githubusercontent.com/48669085/114145862-df23d400-9951-11eb-84b7-a109508a68a2.png">

<img width="610" alt="스크린샷 2021-04-09 오후 4 33 51" src="https://user-images.githubusercontent.com/48669085/114145868-e0550100-9951-11eb-916f-28ace3a47aa5.png">

<img width="539" alt="스크린샷 2021-04-09 오후 4 33 59" src="https://user-images.githubusercontent.com/48669085/114145877-e0ed9780-9951-11eb-8431-b9f6abcc1e46.png">

<img width="602" alt="스크린샷 2021-04-09 오후 4 34 08" src="https://user-images.githubusercontent.com/48669085/114145881-e1862e00-9951-11eb-8881-76c2628fe9a8.png">

<img width="503" alt="스크린샷 2021-04-09 오후 4 34 13" src="https://user-images.githubusercontent.com/48669085/114145885-e2b75b00-9951-11eb-87ba-e39386307f27.png">

<img width="611" alt="스크린샷 2021-04-09 오후 4 34 21" src="https://user-images.githubusercontent.com/48669085/114145889-e2b75b00-9951-11eb-80c6-8f56c5b0da2b.png">

<img width="457" alt="스크린샷 2021-04-09 오후 4 34 33" src="https://user-images.githubusercontent.com/48669085/114145891-e34ff180-9951-11eb-9d52-316b5132a95b.png">

<img width="602" alt="스크린샷 2021-04-09 오후 4 34 40" src="https://user-images.githubusercontent.com/48669085/114145894-e34ff180-9951-11eb-88c1-400cc46e493e.png">

<img width="392" alt="스크린샷 2021-04-09 오후 4 34 46" src="https://user-images.githubusercontent.com/48669085/114145895-e3e88800-9951-11eb-922d-6383052c9fd5.png">




# 설계

# 결과

# 회고
