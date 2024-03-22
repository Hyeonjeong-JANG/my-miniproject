# 미니프로젝트2 - 이력서 관리 사이트
## 1. 시연영상

## 2. 발표자료
[미니프로젝트1조.pptx](https://github.com/Kongjiyoung/miniproject/files/14600963/1.pptx)

## 3. 팀소개 및 각자 맡은 기능
### 공지영
+ 메인 화면, 메인 공고 디테일, 메인 이력서 디테일
+ 공고 지원하기 기능
+ 이력서 제안하기 기능
+ 공고, 이력서 스크랩하기
+ 기업 지원 받은 이력서 확인 및 합격/불합격처리
+ 개인 지원한 이력서 결과 확인 및 지원 취소
+ 기업, 개인 스크랩 확인 및 취소
+ 기업 맞춤 공고
### 김하형
+ 개인 이력서 목록 보기
+ 개인 이력서보기
+ 개인 이력서 작성
+ 개인 이력서 삭제
+ 개인 이력서 수정
### 양승호
+ 제안받은 공고 목록 보기
+ 제안받은 공고  보기
+ 제안한 이력서 목록보기
+ 제안한 이력서 보기
+ 이력서 제안 철회하기
### 이서현
+ 개인, 기업 회원가입
+ 개인, 기업 로그인
+ 개인, 기업 로그아웃
+ 개인, 기업 회원정보 수정
+ 사진 업로드
### 장현정
+ 기업 공고 작성
+ 기업 공고 수정
+ 기업 공고 삭제
+ 기업  공고 목록보기
+ 기업 공고 보기
+ 사진 업로드 및 수정
## 4. 기술스택
+ JDK 11

+ Springboot 3.2.3

+ 테스트 h2 디비

+ HTML

+ CSS

+ JAVAScript

+ Bootstrap
## 5. 기능
#### MANY는 구인하는 기업과 구직하는 구직자의 매칭 기능 제공하는 사이트입니다.
### 공통 기능
+ 로그인 및 회원 가입 가능
+ 구인 공고, 구직 공고 열람 가능
### 기업
+ 공고 작성 및 저장 기능
+ 등록한 공고 수정 및 삭제 기능
+ 지원한 구직자 검토중, 합격, 불합격 선택 기능
+ 기업 제안하기 철회 가능
+ 이력서 제안 기능
+ 관심 있는 이력서 스크랩
+ 공고별 맞춤 이력서 조회 가능 
### 구직자
+ 이력서 작성 및 저장 기능
+ 등록한 이력서 수정 및 삭제 기능
+ 채용 합/불합격시 실시간 조회가능 
+ 공고 지원 기능
+ 공고 지원 철회 가능
+ 제안받은 공고 열람 기능
+ 관심 있는 공고 스크랩
## 6. 주요 기능 시연
## 7. 테이블
![image](https://github.com/Kongjiyoung/miniproject/assets/52162820/fe8f21df-8ff8-4c20-a38b-bcb612843ab0)
## 8. 협업 전략
### Git 전략
+ 각 기능 또는 작업에 대한 새로운 브랜치를 생성하고, 완료 시 'master'에 병합
+ 새로운 기능이나 버그 수정은 브랜치를 생성하고, 해당 브랜치에서 작업 후 Pull Request를 통해 'master'로 병합
+ 'master' 브랜치에 대한 push 권한을 일반 팀원에게 제한하여 안정성을 유지
+ 브랜치 네이밍으로 초기에 이니셜/날짜-회차 형식을 사용, 이후에는 이니셜/기능-회차 형식으로 전환하여 사용
+ 도메인에 따라 패키지로 나누어 구조화
+ 패키지는 각 도메인의 핵심 기능을 담당하며, 서로 간의 의존성을 최소화
