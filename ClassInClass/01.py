#파이썬 반올림 구현 

# 파이썬 판올림 함수
print(round(1.5))
print(round(2.5))
print(round(3.5))
#답 2 2 4 

#우리가 아는 반올립은 사사오입 
#4이하는 내림 5이상은 올림 

#오사오입 
#소수점 5의 앞 숫자가 홀수면 올림 
#소수점 5의 앞 숫자가 짝수면 내림 

#파이썬 내림 함수 floor
import math 
print(math.floor(1.5 + 0.5))
print(math.floor(2.5 + 0.5))
#결과 2  3

# 파이썬 동시 할당 
# 한 줄에서 두개 이상의 변수에 값을 할당하는 방법 
a, b = 2, 1
a,b,c = 3,2,1

a,b,c = [1,2,3] #언패킹 
print(a,b,c)
# 결과 1 2 3

#사용자 입력 
#백준 , SWEA -> 입력을 위한 코드 필요 

#숫자가 n개 있을때 ~~~  (입력받을때)
#테스트케이스가 T개 있다. 

#하나의 값에 대해 입력 
N = int(input())  # 입력을 받는 함수  N = input() 
print(type(N))
# 입력 주의 사항 - 입력으로 받은 데이터는 문자열(str)이다. 
# 정수 입력이 필요한 경우 형변환 필수  N = int(input())

###
# 연산자 
# 산술 - 사칙 연산 , 몫  계산 , 나머지 계산 , 제곱계산 
print( 9 // 6)  # 몫을 계산 
print (9 % 6) # 나머지 계산 
print ( 9 ** 6) # 제곱  
# 비교
# 같다 , 다르다 , 초과 , 미만 , 이상 ,이하
x = 2
print( 1< x < 3)
print(2 <= x <=3) 
#결과 True True

# 논리 
# and , or , not
print (True and True) # and : 두 값이 참이면 참을 생성 
print (True or False) # or : 하나의 값이 참이면 참 생성 

print(not True)
print(not False)

# print(1 and 0) #True and False -> False 
# print(2 and 3) # 참이면 뒤에꺼 
# print(2 or 1 ) 
#결과 0  2  


# 반복 가능한(interavble) 자료형
#컨테이너 자료형 0개 이상의 자료를 저상할수 있는 
# 순서가 있는 자료형 
# 리스트 , 문자열, 튜플, range() 

# 파이썬 리스트 , 동적 배열을 기반으로 만든 자료형 
#
# 파이썬 리스트 생성 [] 대괄호 / list() 
# 리스트 내부의 원소들은 쉼표  ,  로 구분해서 작성
list_ = [1,2,3,4]

#자료형 구분없이 데이터를 저장할 수 있다. 
list_4 = [1, 1.0, "1", True, [1,2]]

# 원소 추가 / 삭제
# 추가  .append(값)
list_ = []
list_.append(1)
#한번에 하나의 값만 추가할 수 있다.
# list_.append(1,2,3,4) #오류 발생 

#리스트에 다른 리스트의 원소를 추가하는 메서드 
#리스트 .extend(다른 리스트)
list_2 = [2,3,4,5]
#리스트를 append() 로 추가하면 리스트 자체가 추가된다
list_.extend(list_2)
print(list_)
#결과 [1, 2, 3, 4, 5]


# 리스트 더하기 (+) / 곱하기  (*)
#새로운 리스트를 생성한다.
list_ = [1, 2]
print(list_ * 10)
# [1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2]
print(list_ + list_)
# [1, 2, 1, 2]


#리스트의 인덱싱(원소에 대한 접근) 
list_ = [1,2,3]
#인덱스는 0부터 시작이다.
#마지막 인덱스는 리스트 길이(원소의 개수) - 1

#파이썬 음수 인덱스, 뒤에서부터 위치를 찾아간다.  
print(list_[0]) # 1
print(list_[-1]) # 3
print(list_[-2]) # 2 

#len(반복 가능한 자료형 ) : 원소의 개수를 반환한다. 
end_index = len(list_) -1 
print(list_[end_index]) # 3
prunt(list[99]) # 오류 발생 


#파이썬 리스트 슬라이싱 자바의 copyOfRange() 
# 일정 부분을 분할하는 ( 자르는 ) 방법 
list_=[1,2,3,4,5]

#슬라이싱 문법 [start : end : step]
#start 위치 ~ end - 1 위치까지 step 만큼 분할 

#첫 번쨰부터 세번째 까지 분할 
print(list_[0:3]) # [1,2,3]
#step 생략,  기본값 1이 적용된다.

#범위를 벗어난 슬라이싱 ? -> 오류가 x  
print(list_[0:99]) # [1,2,3,4,5 ]
print(list_[1:99]) # [2,3,4,5]
#처음부터 마지막까지 간경이 2인 슬라이싱 
print(list_[0:5:2]) # [1,3,5]

#음수 인덱스를 통해 슬라이싱 
list_=[1,2,3,4,5]
#음수  -5 -4 -3 -2 -1
#[3, 4] 음수 인덱스를 통해 슬라이싱 
print (list_[-3:-1]) # [3 ,4]
# 간격도 음수로 넣어야 하는건 아닐까?
print(list_[-3:-1:-1]) # [] 공백 발생 

#음수로 슬라이싱을 하려면?
print(list_[-1:-4:-1]) # [5,4,3]
#step이 음수면 반대로 분할이 된다. 
print(list_[::])  # 전체를 의미  [1, 2, 3, 4, 5]
print(list_[::-1])  # 빈대를 의미  [5, 4, 3, 2, 1]



#파이썬 리스트(참조 자료형)의 복사
# 얕은 복사 
list_A = [1,2,3]
list_B = list_A
print(list_A,list_B)
list_A[0] = 0
list_A[-1] = 99
print(list_A)
print(list_B)


#깊은 복사 deepcopy
list_A = [1,2,3]
# 슬라이싱은 새로운 리스트를 생성 
list_B = list_A[::]

list_B[0] = 0
print(list_A, list_B)
#[1, 2, 3]  [0, 2, 3] 



#원소 삭제 
list_A = [1,2,3]
#리스트.pop() : 마지막 원소를 꺼낸다. 
list_A.pop() 
print(list_A) # [1, 2]

#pop() 메서드는 원소를 반환한다. 
number= list_A.pop() 
print(number) # 2

list_A.append(2)
#pop(위치) 메서드는 위치에 해당하는 원소를 꺼낸다. 
number = list_A.pop(0)
print(number) # 1


# 반복 가능한 자료형 문자열
string = "1 2 3 4"
# 문자열도 인덱싱과 슬라이싱 가능하다.

# 문자열은 원소의 수정(추가 , 삭제)이 불가능하다. 
# string[0] = 0 

# 더하기 연산을 통해 추가하는것 처럼 보이게 할 수 있다. 
string2 = "5 6 7"
#더하기 연산은 새로운 문자열을 생성 
string3 = stirng + string2
print(string3)

#알고리즘 풀이에 유용한 문자열 메서드 
# 문자열.split("기준 문자열")
# 기분 문자열을 기분으로 문자열을 분힐 후 리스트를 셍성 
string ="1,2,3,4,5"
print(string.split(",")) #['1', '2', '3', '4', '5']  리스트임. 

#기준 문자열을 생략하면 공백을 기준으로 분할 
string2 = "1 2 3 4 5 6"
print(string2.split()) # ['1', '2', '3', '4', '5', '6']




# "기준 문자열".join(리스트)
# 리스트 원소들을 기준문자열로 구분해서 새로운 문자열을 생성한다. 
# 리스트는 문자열로 이루어져야한다. 
string = ",".join(["1","2","3"]) # '1,2,3'
print(string.type(string))

#리스트 -> 문자얄 향 뱐환 , 우리가 원하는 방식 x
string = "".join(["1","2","3"]) 




#컨트롤 D 





