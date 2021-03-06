# Design-Pattern-JAVA-TEXT-GAME

# 목적
본 소프트웨어 ‘낚시왕 어드벤처’는 텍스트 기반의 입출력을 사용하는 텍스트 어드벤쳐(인터랙티브 픽션)게임입니다. 
통합적 문제 인식을 통해 단순한 코드 생성이 아닌 개발 프로세스와 프로젝트 관리를 중요시 했습니다.
주제에 디자인패턴을 입히고 프로세스 모델을 선정하여 문서화와 효율적인 프로젝트 관리, 변경이나 재사용을 염두에 둔 작업을 하는 것이 목표입니다.

# 분석 및 설계



## 유스케이스


<img width="610" alt="스크린샷 2021-04-09 오후 4 33 51" src="https://user-images.githubusercontent.com/48669085/114145868-e0550100-9951-11eb-916f-28ace3a47aa5.png">


### 스트레티지 패턴 적용


스트래티지 패턴은 같은 문제를 해결하는 여러 알고리즘이 클래스별로 캡슐화돼있습니다. 행동을 상속받는 대신 올바른 행동 객체로 구성되면서 행동을 부여 받고, 다시 컴파일 하지 않아도 객체의 행동을 바꿀 수 있습니다.


**문제점**


유스케이스 ‘미끼’를 적용한 패턴입니다. 
낚시대에 여러가지 미끼들을 사용할 수 있습니다. 
미끼마다 낚시 능력이 달라지는 상황을 계속 상속으로 구현하면, 프로그램을 확장할 필요가 생길 때 모든 상속 클래스들 내 기존 코드의 내용을 수정하는 문제가 생깁니다.

**해결 방안**


변경되는 부분을 분리해 인터페이스로 구현합니다. 미끼를 사용하는 기능은 낚시 능력이 높아지고 돈을 차감한다는 큰 부분은 같지만 각각의 미끼마다 올라가는 낚시 능력과 가격은 다릅니다. 따라서 FishingStrategy인터페이스를  EarthwormStrategy와 ShrimpStrategy, SquidStrategy가 각각 구현했습니다.

<img width="539" alt="스크린샷 2021-04-09 오후 4 33 59" src="https://user-images.githubusercontent.com/48669085/114145877-e0ed9780-9951-11eb-8431-b9f6abcc1e46.png">

### 코드

<img width="240" alt="스크린샷 2021-04-11 오후 4 44 03" src="https://user-images.githubusercontent.com/48669085/114296283-740b0680-9ae5-11eb-9ff2-70439489bb13.png">

<img width="575" alt="스크린샷 2021-04-11 오후 4 44 19" src="https://user-images.githubusercontent.com/48669085/114296287-75d4ca00-9ae5-11eb-8521-8c10d272a80d.png">

<img width="636" alt="스크린샷 2021-04-11 오후 4 44 25" src="https://user-images.githubusercontent.com/48669085/114296290-779e8d80-9ae5-11eb-9579-5a7031b7686a.png">


추상클래스 Man클래스이다. 캐릭터에 기본적으로 들어가야 할 이름, 낚시 능력, 돈이 인스턴스 변수로 들어가 있고 FishingStrategy 인터페이스 형식의 fishingStrategy 레퍼런스 변수를 선언한다. FishMan클래스에서 이 변수를 상속받는다.



<img width="588" alt="스크린샷 2021-04-11 오후 4 49 05" src="https://user-images.githubusercontent.com/48669085/114296378-1925df00-9ae6-11eb-8017-1e73d1b13526.png">
Man클래스를 상속받는 FishMan클래스이다.
<img width="335" alt="스크린샷 2021-04-11 오후 4 49 23" src="https://user-images.githubusercontent.com/48669085/114296381-1b883900-9ae6-11eb-877c-7eb4815df8d9.png">
변경되는 부분인 미끼를 사용하는 기능을 따로 분리하여 인터페이스로 구현한다.
하위클래스에서 fishing()메소드를 구현한다.
<img width="494" alt="스크린샷 2021-04-11 오후 4 49 31" src="https://user-images.githubusercontent.com/48669085/114296382-1c20cf80-9ae6-11eb-85c2-f1cea564fe4a.png">
EarthwormStrategy클래스는 지렁이 미끼를 사용한다.
man.setMoney(-50)으로 50원을 지불하게 하고 man.setFishing()으로 낚시 능력을 1 증가하게 한다.

<img width="610" alt="스크린샷 2021-04-11 오후 4 49 50" src="https://user-images.githubusercontent.com/48669085/114296383-1cb96600-9ae6-11eb-86f0-5e0f5b1d2729.png">
ShrimpStrategy메소드는 새우 미끼를 사용한다.
지불하는 돈과 올라가는 낚시 능력만 달라질뿐 메소드는 위와 거의 동일하다.

<img width="631" alt="스크린샷 2021-04-11 오후 4 50 06" src="https://user-images.githubusercontent.com/48669085/114296384-1dea9300-9ae6-11eb-9f62-3fdc60338a4f.png">
 SquidStrategy클래스는 오징어 미끼를 사용한다.
마찬가지로 지불하는 돈과 올라가는 낚시 능력만 달라질뿐 메소드는 거의 동일하다.

## 유스케이스

<img width="602" alt="스크린샷 2021-04-09 오후 4 34 08" src="https://user-images.githubusercontent.com/48669085/114145881-e1862e00-9951-11eb-8881-76c2628fe9a8.png">


### 데코레이터 패턴 적용


데코레이터 패턴에서는 객체에 추가적인 요건을 동적으로 첨가합니다. 데코레이터는 서브 클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공합니다.

**문제점**


도구를 향상하는 과정에서 상속을 사용할 수 있습니다.
하지만 도구를 향상하는 과정에서 변경사항이 생길 경우 코드를 직접 수정하는 문제가 생길 수 있습니다. 또한 버프를 하나만 거는 것이 아니라 2개 이상 조합하여 걸고 싶을 때 각 조합별로 하위클래스를 구현해야 하는 문제점도 생깁니다.


**해결 방안**


개별 기능을 하는 클래스들의 공통 기능들을 Tool객체가 들어있는 AddDecorator추상 클래스로 제공합니다. 데코레이터들의 형식이 그 데코레이터로 감싸는 객체의 형식과 같아야 하기 때문에 AddDecorator는 Tool클래스를 상속을 통해 확장합니다.
각 구체적인 추가 기능을 하는 개별 클래스들(Masterhand, KangTaeGonghand, LeeJongMin hand)은 이 AddDecorator클래스를 구현합니다. 새로운 기능이 필요할 때에는 데코레이터을 새로 구현해서 기능을 추가할 수도 있습니다.
객체 구성방식을 활용했기 때문에 실행 중에 데코레이터를 마음대로 조합해서 사용할 수 있습니다.


<img width="503" alt="스크린샷 2021-04-09 오후 4 34 13" src="https://user-images.githubusercontent.com/48669085/114145885-e2b75b00-9951-11eb-87ba-e39386307f27.png">

### 코드


<img width="235" alt="스크린샷 2021-04-11 오후 4 57 06" src="https://user-images.githubusercontent.com/48669085/114296612-46bf5800-9ae7-11eb-808e-5a19620dc2ce.png">
<img width="447" alt="스크린샷 2021-04-11 오후 4 57 12" src="https://user-images.githubusercontent.com/48669085/114296618-4921b200-9ae7-11eb-8dba-e946ec2b72b8.png">
Tool클래스는 추상 구성요소이다.
getDescription()은 구현되어 있지만 Cost()와 Increase_fishing()은 서브 클래스에서 구현해야 한다.
<img width="340" alt="스크린샷 2021-04-11 오후 4 57 18" src="https://user-images.githubusercontent.com/48669085/114296619-4a52df00-9ae7-11eb-9676-713b2980c7a0.png">
구상 구성요소 Tool_FishingRod클래스는 Tool클래스를 확장한다. 낚시도구Tool 중 낚시대 클래스이다.
클래스 생성자 부분에서 Tool로부터 상속받은 Description, cost, upgrade 변수 값을 설정한다.
Cost()에서는 낚시대 가격을 Increase_fishing()에서는 업그레이드되는 낚시능력치를 리턴한다.
<img width="293" alt="스크린샷 2021-04-11 오후 4 57 24" src="https://user-images.githubusercontent.com/48669085/114296620-4b840c00-9ae7-11eb-9161-295fb2cbaa9c.png">
위의 Too_fishingRod 클래스와 동일하다. 낚시도구 Tool 중에 찌 클래스이다.
클래스 생성자에서 Tool에서 상속받은 Description, cost, upgrade 변수를 설정해주고 Cost(), Increase_fishing()에서 cost와 upgrade변수를 리턴한다.
<img width="337" alt="스크린샷 2021-04-11 오후 4 57 30" src="https://user-images.githubusercontent.com/48669085/114296621-4b840c00-9ae7-11eb-9062-514a0847c4a7.png">
마찬가지로 낚시도구 Tool클래스를 상속받아 확장하는 Tool_reel 릴 클래스 이다.
클래스 생성자에서 상속받은 인스턴스 변수인 Description, Cost, Increase_fishing 값을 설정하고, Cost(), Increase_fishing()에서 cost, upgrade를 리턴한다.
<img width="390" alt="스크린샷 2021-04-11 오후 4 57 34" src="https://user-images.githubusercontent.com/48669085/114296623-4c1ca280-9ae7-11eb-8285-eedf7dcd1612.png">
AddDecorator클래스는 추상 데코레이터 클래스이다.
Tool 객체가 들어갈 자리에 들어갈 수 있어야 하므로 Tool객체를 확장한다.
AddDecrorator을 구현하는 서브 클래스들이 getDescription()메소드를 새로 구현하게 하기 위해 추상 메소드로 선언한다.
<img width="576" alt="스크린샷 2021-04-11 오후 4 58 00" src="https://user-images.githubusercontent.com/48669085/114296624-4cb53900-9ae7-11eb-8e66-ba069051cfea.png">
Masterhand 클래스는 구상 데코레이터 클래스이다.
Masterhand 내 인스턴스에는 감싸고자 하는 낚시도구, Tool을 저장하기 위한 인스턴스 변수가 있고, 인스턴스 변수를 감싸고자 하는 객체로 설정하기 위한 생성자가 있다.
데코레이터의 생성자에 감싸고자하는 낚시도구 개체를 전달하는 방식을 사용한다.
GetDescription()은 장식하고 있는 객체에 작업을 위임한 다음 그 결과에 “장인의 손길이 담긴”을 더한 결과를 리턴한다.
Cost()와 Increase_fishing()은 Tool클래스에서 추상 메소드였기 때문에 각각 구현해준다.


## 유스케이스


<img width="611" alt="스크린샷 2021-04-09 오후 4 34 21" src="https://user-images.githubusercontent.com/48669085/114145889-e2b75b00-9951-11eb-80c6-8f56c5b0da2b.png">


### 팩토리메서드 패턴 적용


팩토리 메소드 패턴은 객체를 생성하기 위한 인터페이스를 정의하는데, 어떤 클래스의 인스턴스를 만들어지는 서브 클래스에서 결정하게 만듭니다. 
팩토리 메소드 패턴에서 사용하는 팩토리 메소드는 객체 생성을 처리하며, 객체를 생성하는 작업을 서브 클래스에 캡슐화 시킬수 있습니다. 이렇게 하면 수퍼 클래스에 있는 클라이언트 코드와 서브클래스에 있는 객체 생성 코드를 분리시킬 수 있습니다.

**문제점**

낚시하기를 선택하면 강과 바다, 호수 중 낚시 장소를 정해야 합니다.
 그리고 잡히는 물고기 종류와 특징은 낚시 장소마다 달라져야 합니다.
하지만 낚시터에 낚시대를 던져서 물고기를 잡는 일련의 행동은 변하지 않습니다.
팩토리 메소드 패턴을 이용해 물고기 객체를 생성하기 위한 인터페이스를 정의하고, 어떤 클래스의 인스턴스를 만들지는 하위 클래스인 bass, goldfish등이 결정하게 합니다.

**해결 방안**


물고기를 생성해 잡을 수 있게 해주는 catchFish() 팩토리 메소드와 Fishing()메소드를 결합해 하나의 프레임워크로 만듭니다. 물고기가 생성되는 낚시터 클래스와 물고기 클래스를 추상클래스로 만들고 그 클래스들을 확장하는 구상 클래스들을 만듭니다. 각각의 낚시터 클래스들에서는 그 낚시터에서 잡히는 물고기들을 생성하는데 관한 것들이 캡슐화돼 있습니다.

<img width="457" alt="스크린샷 2021-04-09 오후 4 34 33" src="https://user-images.githubusercontent.com/48669085/114145891-e34ff180-9951-11eb-9d52-316b5132a95b.png">


### 코드

<img width="357" alt="스크린샷 2021-04-11 오후 5 10 03" src="https://user-images.githubusercontent.com/48669085/114297006-3ad49580-9ae9-11eb-9070-28f45de9011a.png">
<img width="629" alt="스크린샷 2021-04-11 오후 5 10 08" src="https://user-images.githubusercontent.com/48669085/114297008-3c9e5900-9ae9-11eb-83a9-91927fb625f9.png">
Sea, river, lake 각 서브 클래스에서는 catchFish()메소드를 오버라이드 하지만, Fishing()메소드는 FishingPlace에서 정의했던 것을 그대로 사용한다.
Fishing()메소드에는 낚시를 시작하고 끝낼때까지의 전 과정이 기술되어 있다.
낚시대를 낚시터에 던지고 물고기를 잡았을 경우 fish.tryToCatchFish()가 1을 반환해 물고기의 가격과 이름을 출력하게 하였으며, 각각의 낚시터마다 잡히는 물고기들의 특징(주의점)을
<img width="303" alt="스크린샷 2021-04-11 오후 5 10 13" src="https://user-images.githubusercontent.com/48669085/114297009-3f00b300-9ae9-11eb-987f-c1aa4a15ad98.png">
sea클래스는 FishingPlace클래스를 상속 받고, 추상 오퍼레이션인 catchFish()메소드를 구현한다.
낚시 능력인 ability가 10보다 작을 경우 Shad() 물고기 객체를 반환한다.
ability가 10보다 클 경우에는 Tuna()객체를 반환한다.
<img width="486" alt="스크린샷 2021-04-11 오후 5 10 18" src="https://user-images.githubusercontent.com/48669085/114297011-41fba380-9ae9-11eb-8382-36e423173593.png">
Lake클래스도 마찬가지로 FishingPlace클래스를 상속받고 catchFish()를 구현한다.
낚시 능력이 10보다 작을 경우에는 Catfish()객체를 반환한다.
<img width="486" alt="스크린샷 2021-04-11 오후 5 10 28" src="https://user-images.githubusercontent.com/48669085/114297013-42943a00-9ae9-11eb-998f-5b4ab83a8794.png">
River클래스도 FishingPlace클래스를 상속받고 catchFish()메소드를 구현한다.
ability가 10보다 작을 경우 Carp() 객체를 반환한다.
<img width="542" alt="스크린샷 2021-04-11 오후 5 10 41" src="https://user-images.githubusercontent.com/48669085/114297014-432cd080-9ae9-11eb-9529-ee9056532850.png">
<img width="530" alt="스크린샷 2021-04-11 오후 5 11 17" src="https://user-images.githubusercontent.com/48669085/114297015-432cd080-9ae9-11eb-9b5d-15ff9bbf4053.png">
Fish클래스 안의 tryToCatchFish()메소드는 랜덤함수를 실행시켜 40%로 확률로 success()메소드를, 60% 확률로 fail()메소드를 반환한다. 
Success()메소드는 1을 반환하고 fail()메소드는 0을 반환한다. success()메소드가 실행될 경우에만 물고기를 잡았다고 출력된다.
Note()메소드는 각 낚시터에서 잡히는 물고기들의 주의점을 알려준다. 강물고기의 경우에 추상 클래스에 구현되어 있는 “이 물고기는 기생충이 있을 확률이 있습니다”를 오버라이딩 하지 않고 바로 출력한다.
<img width="599" alt="스크린샷 2021-04-11 오후 5 11 34" src="https://user-images.githubusercontent.com/48669085/114297016-43c56700-9ae9-11eb-9552-139ee2cd3df8.png">
<img width="614" alt="스크린샷 2021-04-11 오후 5 11 42" src="https://user-images.githubusercontent.com/48669085/114297017-445dfd80-9ae9-11eb-9cd0-bc2f7e990493.png">
TryToCatchFish()안의 if문에서 n>5일 경우 success()메소드가 실행된다.
Catfish()를 잡을 확률을 낮춰주기 위해서 if문 안의 조건을 n>5로 변경해 메소드를 오버라이딩 하였다.
잡기 어려워 졌기 때문에 succes()메소드와 fail()메소드도 오버라이딩 해준다.
낚시터에 따라 출력되는 주의사항이 다르기 때문에 note()메소드를 오버라이딩 하여 호수물고기는 “호수에서 낚시하면 경찰에 잡혀갑니다. 조심하세요”를 출력하게 한다.
<img width="425" alt="스크린샷 2021-04-11 오후 5 12 02" src="https://user-images.githubusercontent.com/48669085/114297022-49bb4800-9ae9-11eb-8ee8-641502224b17.png">
<img width="570" alt="스크린샷 2021-04-11 오후 5 12 06" src="https://user-images.githubusercontent.com/48669085/114297024-4aec7500-9ae9-11eb-9603-0ef5b07f99f8.png">
Note()메소드만 오버라이딩 하여 바다 낚시터에서 잡히는 물고기에 맞게 구현해준다.
“이 물고기는 바다에 살아서 찌린내가 많이 납니다”라고 출력된다.


## 유스케이스

<img width="602" alt="스크린샷 2021-04-09 오후 4 34 40" src="https://user-images.githubusercontent.com/48669085/114145894-e34ff180-9951-11eb-88c1-400cc46e493e.png">


### 템플릿메소드 패턴 적용


템플릿 메소드 패턴에서는 알고리즘의 골격을 정의한다. 알고리즘의 여러 단계 중 일부는 서브클래스에서 구현할 수 있다. 템플릿 메소드를 이용하면 알고리즘의 구조는 그대로 유지하면서 서브클래스에서 특정 단계를 재정의할 수 있다.

**문제점**


생선 요리는 기본적으로 생선을 가지고 하는 요리이기 때문에 요리 과정이 비슷하다. 따라서 생선조림 레시피, 생선구이 레시피, 스시를 만드는 레시피 클래스를 각각 만들면 코드가 중복된다.


**해결 방안**


공통적인 부분을 추상화시켜서 베이스 클래스를 만들고, 각 레시피가 조금씩 다르게 만뜨는 단계의 알고리즘을 추상 메소드로 선언한다.
템플릿 메소드 패턴을 적용하면 템플릿 메소드인 prepareRecipe()에서 요리과정 알고리즘의 골격을 정의하고, 바뀌는 특정 단계만 서브 클래스 BraisedFish, GrilledFish, Sushi에서 구현한다.

<img width="392" alt="스크린샷 2021-04-09 오후 4 34 46" src="https://user-images.githubusercontent.com/48669085/114145895-e3e88800-9951-11eb-922d-6383052c9fd5.png">




## 유스케이스


<img width="610" alt="스크린샷 2021-04-09 오후 4 33 36" src="https://user-images.githubusercontent.com/48669085/114145856-db904d00-9951-11eb-921f-497af936307b.png">

### 스테이트 패턴 적용


스테이트 패턴은 객체가 특정 상태에 따라 행위를 달리하는 상황에서, 상태를 객체화 하여 상태가 행동을 할 수 있도록 위임하는 패턴이다. <br>본 프로젝트에서는 날씨 상태를 객체화 하여 날씨 상태에서 행동을 가능케 한다.


**문제점**


프로그램 내부적으로 낚시하기 행동을 시행할 때 마다 날씨 변화가 필요하다.

날씨 변화는 현실 세계의 변덕스러운 날씨를 반영하기 위하여 날씨가 밝아지면 화창한 날이 되고 화창한 날에서 흐려지면 선선한 날이 되는 것과 같이 동일하게 구현하기 위하여 스테이트 패턴을 사용하게 되었다.


**해결 방안**


스테이트 패턴을 사용하여 날씨 특정 상태가 행동을 할 수 있도록 구현한다 날씨가 좋아지는 함수와 날씨가 악화되는 함수 shining(), cool(), clouding() 를 구현하여 특정 상태가 변할 수 있도록 한다. 상태가 변화할 때 원하는 상태로 변하기 위하여 State 인터페이스를 상속받는 클래스 CoolDay , RainyDay, SunnyDay 즉 날씨 상태 클래스에서 알맞게 구현한다.


<img width="530" alt="스크린샷 2021-04-09 오후 4 33 42" src="https://user-images.githubusercontent.com/48669085/114145862-df23d400-9951-11eb-84b7-a109508a68a2.png">



# 회고 및 개선점

|패턴|완성도|미완성 부분|
|--------|--------|--------|
|Strategy 패턴|90%|생성할 수 있는 캐릭터가 Man하나였는데,  FishMan구상 클래스를 상속받는 서브클래스들을 조금 다양하게 생성해 기본 능력치나 특징이 다른 캐릭터를 만들었으면 더 좋았을 것 같다. |
|Factory Method패턴|90%|낚시 게임인데도 불구하고 생성할 수 있는 물고기를 6마리 밖에 못 만들었다.|
|State 패턴|80%|스테이트 패턴을 구현하면서 내부 객체 상태가 직접 행동함으로써 내부적으로 출력값변경은 이루어졌지만 인스턴스 변수가 없기에 변수는 변경되지 않았다. 또한 코드를 잘못 작성한 부분이 많다. 꼭 리펙토링이 필요하다|
|Decorator 패턴|80%|좀더 버프를 다양하게 만들고, 특별한 능력이 부여되는 버프 기능을 넣지 못한 점이 아쉽다. 또 버프를 여러 가지로 조합해서 걸면 새로운 능력이 주어지거나 하여 데코레이터를 다양하게 사용하게 만들지 못한 점도 아쉽다.|
|Template Method 패턴|80%||


쏘나큐브를 사용해서  미사용 변수, 비어있는 코드 블락, 변수명, 함수명 부분들을 고쳤다.


하지만 메인함수에서 캡슐화를 방해하는 몇몇 코드는 아직 수정하지 못했다.
 



 

