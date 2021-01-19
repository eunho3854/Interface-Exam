
# 인터페이스구현 시험

1. 전체 영화 가져오기
![Screenshot_382](https://user-images.githubusercontent.com/74044226/104999885-efbe5f80-5a70-11eb-98fc-c5aea1a892f0.png)

GetMapping으로 /movie 주소가 들어오면 GET 방식으로 Movie 데이터들 전체 검색.



2. 영화 1건 가져오기 (id 값으로 구분)
![Screenshot_383](https://user-images.githubusercontent.com/74044226/105000015-25fbdf00-5a71-11eb-8f30-b13105938b99.png)

{id} 값을 @PathVariable 어노테이션을 사용하여 int id 값과 같아진다. 그래서 주소에 입력된 id 값으로 id를 구분하여 Movie 데이터가 나타난다.



3. 영화 등록하기 (title, rating)
- 성공했을 때
![Screenshot_384](https://user-images.githubusercontent.com/74044226/105000343-8e4ac080-5a71-11eb-9653-888e73e9e1bb.png)

- 오류가 있을 때
![Screenshot_385](https://user-images.githubusercontent.com/74044226/105000682-f4cfde80-5a71-11eb-9996-9cf409869fb9.png)

Post 방식으로 요청하고 InsertReqDto에서 Valid를 체크한다. BindingResult가 오류가 있는지 확인하고 오류가 있다면 if문을 실행시켜 statusCode : 500 과 "fail"을 출력한다.



4. 영화 삭제하기
- 성공했을 때
![Screenshot_388](https://user-images.githubusercontent.com/74044226/105000823-2f397b80-5a72-11eb-8c0c-11c10803dc1c.png)

- 오류가 있을 때
![Screenshot_389](https://user-images.githubusercontent.com/74044226/105000854-3d879780-5a72-11eb-8368-6ca4ecc52af3.png)

Delete 방식으로 요청하고 현재 DB에 연결한 상태가 아니기 때문에 임의로 오류를 만들어 오류가 있는 상황과 없는 상황을 구분하였다.



5. 영화 수정하기 (title, rating)
- 성공했을 때
![Screenshot_386](https://user-images.githubusercontent.com/74044226/105000973-6b6cdc00-5a72-11eb-83c2-fa7cdcbcfddb.png)

- 실패했을 때
![Screenshot_387](https://user-images.githubusercontent.com/74044226/105001009-77589e00-5a72-11eb-9b73-66e82bdd0386.png)

Put 방식으로 요청하였고 영화 등록하기와 마찬가지로 valid를 체크하여 오류가 있는지 없는지 확인하고 그에 맞는 결과 값을 구현하였다.
