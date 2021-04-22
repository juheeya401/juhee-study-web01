# juhee-study-web01
[스프링 부트와 AWS로 혼자 구현하는 웹 서비스] 를 기본으로 하여 웹서비스 구현하기         
   
   
> ### 추가기능
>	* 첫 화면과 게시글 목록화면 분리하기 -> OK
>	* 글 신규등록 : oauth로그인 후 얻어온 name으로 자동 세팅하기(변경가능) -> OK
>	* 글 수정 : 작성자만 수정 가능하도록(posts 테이블에 USER_ID 추가)
>	   * 신규등록 시 POSTS 테이블 USER_ID 컬럼에 USER테이블의 ID 저장
>	   * 수정화면 로드시 글의 USER_ID와 sessionUser.id가 다르면 onlyRead 모드로 표출
