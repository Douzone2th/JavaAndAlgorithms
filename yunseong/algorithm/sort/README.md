
# π μ λ ¬
    π‘ μ λ ¬μ ν΅μ¬ν­λͺ©μ λμ κ΄κ³μ λ°λΌ λ°μ΄ν° μ§ν©μ μΌμ ν μμλ‘ μ€μ§μ΄ λμ΄μλλ‘ λ°κΎΈλ μμμ λ§ν©λλ€.
---

:: βπ»INDEX ::

[1. κ°λ λ° μ©μ΄](#κ°λ-λ°-μ©μ΄)</br>
[2. μ λ ¬μ’λ₯](#π€-μ λ ¬μ’λ₯)</br>

---

# κ°λ λ° μ©μ΄

#### π <u>μ λ ¬μκ³ λ¦¬μ¦μ μμ μ±</u>
- μμ λ μ λ ¬μ΄λ κ°μ κ°μ ν€λ₯Ό κ°μ§ μμμ μμκ° μ λ ¬ μ νμλ μ μ§λλ κ² μλλ€.
- μμ λμ§ μμ μ λ ¬μ νλμ ν€ κ°λ§μ κ°κ³  μ λ ¬μ ν©λλ€.
#### π <u>λ΄λΆμ λ ¬κ³Ό μΈλΆμ λ ¬</u>
- νλμ λ°°μ΄μμ μμν  μ μλ κ²½μ°μλ λ΄λΆμ λ ¬
- μ¬λ¬ λ°°μ΄μμ μμνλ κ²½μ°λ μΈλΆμ λ ¬
- μΈλΆμ λ ¬μ λ΄λΆμ λ ¬μ μμ©ν κ²μΌλ‘, μμμ μν νμΌ λ±μ΄ νμνκ³  μκ³ λ¦¬μ¦λ λ³΅μ‘ν©λλ€.
#### π <u>μ λ ¬μκ³ λ¦¬μ¦μ ν΅μ¬μμ</u>
- μ λ ¬ μκ³ λ¦¬μ¦μ ν΅μ¬μμλ κ΅ν, μ ν, μ½μμ΄λ©° λλΆλΆμ μ λ ¬ μκ³ λ¦¬μ¦μ μ΄ μΈκ°μ§ μμ€λ₯Ό μμ©ν κ² μλλ€.

#### π μκ°λ³΅μ‘λμ BigOνκΈ°λ²
- **μκ°λ³΅μ‘λ**β μλ ₯κ°μ λ³νμ λ°λΌ μΌλ§νΌ μκ°μ΄ κ±Έλ¦¬λμ§μ λν μ λ
- **BigOνκΈ°λ²**β μκ°λ³΅μ‘λλ₯Ό λνλ΄λ λ°©λ²<br>

**:: μκ°λ³΅μ‘λ ν ::**</br>

|  μκ°/n   |  1  |  2  |  3   |  4   |   8   |        16         |          32           |           64           |          1000          |
|:-------:|:---:|:---:|:----:|:----:|:-----:|:-----------------:|:---------------------:|:----------------------:|:----------------------:|
|    1    |  1  |  1  |  1   |  1   |   1   |         1         |           1           |           1            |           1            |
|  log n  |  0  |  1  | 1.58 |  2   |   3   |         4         |           5           |           6            |          9.97          |
|    n    |  1  |  2  |  3   |  4   |   8   |        16         |          32           |           64           |          1000          |
| n log n |  0  |  2  | 4.75 |  8   |  24   |        64         |          160          |          384           |          9966          |
|   n^2   |  1  |  4  |  9   |  16  |  64   |        256        |         1024          |          4096          |        1000000         |
|   n^3   |  1  |  8  |  27  |  64  |  512  |       4096        |         32768         |         262144         |       1000000000       |
|   2^n   |  2  |  4  |  8   |  16  |  256  |       65536       |      4294967296       |        μ½ 1844κ²½         |     μ½ 1.07 x 10301     |
|   n!    |  1  |  2  |  6   |  24  | 40320 |  20922789888000   |     μ½ 2.63 x 1035     |     μ½ 1.27 x 1089      |    μ½ 4.02 x 102567     |

---
# π€ μ λ ¬μ’λ₯

---

## π λ²λΈμ λ ¬
<details>
<summary>:: π νμ΅λ΄μ© νμΈνκΈ° :: </summary>
<div markdown="1">

- λ¨μνκΈ° λλ¬Έμ μμ£Όμ¬μ©λλ€
- μμμ μ΄λμ΄ κ±°νμ΄ μλ©΄μΌλ‘ μ¬λΌμ€λ λ―ν λͺ¨μ΅
- O(n^2)
- λ°©λ²
  1. μλ‘ μΈμ ν λμμ ν¬κΈ°λ₯Ό κ²μ¬νλ€.
  2. μΈμ ν λμλ₯Ό κ³μ λΉκ΅ν΄ κ°μ₯ ν° μλ£κ° λ§¨λ€λ‘ κ°λλ‘ νλ€.



</div>
</details>

## π λ¨μμ νμ λ ¬
<details>
<summary>:: π νμ΅λ΄μ© νμΈνκΈ° :: </summary>
<div markdown="1">

- μ μλ¦¬μ λ ¬ μκ³ λ¦¬μ¦
- λ¨μνκ² μ¬μ©ν  μ μλ€.
- λ©λͺ¨λ¦¬ ν¨μ¨μ΄ μ’λ€
- O(n^2)
- λ°©λ²
    1. μ£Όμ΄μ§ λ¦¬μ€νΈ μ€ μ΅μκ°μ μ°Ύλλ€</br>
    2. κ·Έ κ°μ λ§¨μμ μμΉν κ°κ³Ό κ΅μ²΄
    3. λ§¨μ²μ μμΉλ₯Ό λΊ λλ¨Έμ§ λ¦¬μ€νΈλ₯Ό κ°μ λ°©λ²μΌλ‘ κ΅μ²΄
</div>
</details>

## π λ¨μμ½μμ λ ¬

<details>
<summary>:: π νμ΅λ΄μ© νμΈνκΈ° :: </summary>
<div markdown="1">

- λ°μ΄ν°λ₯Ό **λΉκ΅**νλ©΄μ μ°ΎκΈ° λλ¬Έμ **λΉκ΅μ λ ¬**μ΄λΌκ³  ν©λλ€.
- μ½μ μ λ ¬μ λ λ²μ§Έ μλ£λΆν° μμνμ¬ κ·Έ μμ μλ£λ€κ³Ό λΉκ΅νμ¬ μ½μν  μμΉλ₯Ό μ§μ ν ν 
  </br>μλ£λ₯Ό λ€λ‘ μ?κΈ°κ³  μ§μ ν μλ¦¬μ μλ£λ₯Ό μ½μνμ¬ μ λ ¬νλ μκ³ λ¦¬μ¦μ΄λ€.
-  μ΅μ  : O(N), μ΅μ : O(n^2)
</div>
</details>

## π μΈμ λ ¬

<details>
<summary>:: π νμ΅λ΄μ© νμΈνκΈ° :: </summary>
<div markdown="1">

- μΈ μ λ ¬μ **μ½μ μ λ ¬**μ κΈ°λ°μΌλ‘ νλ€
- μ λ ¬μ λμμ΄ λλ λ°μ΄ν° μΈμ μΆκ°μ μΈ κ³΅κ°μ νμλ‘ νμ§ μκΈ° λλ¬Έμ **'μ μλ¦¬ μ λ ¬(in-place sort)'** μ΄κΈ°λ νλ€.
- μ½μμ λ ¬κ³Όλ λ€λ₯΄κ² μΌμ  κ°κ²©μ μ£ΌκΈ°λ‘ νμ¬ λΉκ΅ λ° κ΅νμ΄ μΌμ΄λκΈ° λλ¬Έμ κ΅¬μ‘°μ **μμ μ λ ¬(Stable Sort)μ μλλ€.**
-  μ΅μ  : O(N), μ΅μ : O(n^2)
- λ°©λ²
  1. κ°κ²©(gap)μ μ€μ νλ€.
  2. κ° κ°κ²©λ³λ‘ λΆλ₯ λ μλΈ(λΆλΆ) λ¦¬μ€νΈμ λν΄ μ½μμ λ ¬μ νλ€.
  3. κ° μλΈ(λΆλΆ) λ¦¬μ€νΈμ μ λ ¬μ΄ λλλ©΄ κ°κ²©μ μ€μΈλ€.
  4. κ°κ²©μ΄ 1μ΄ λ  λ κΉμ§ 2λ² κ³Όμ μΌλ‘ λλμκ°λ©° λ°λ³΅νλ€.

</div>
</details>

## π ν΅μ λ ¬

<details>
<summary>:: π νμ΅λ΄μ© νμΈνκΈ° :: </summary>
<div markdown="1">

- ν΅ μ λ ¬μ **λΆμμ μ λ ¬** μ μνλ©°, λ€λ₯Έ μμμμ λΉκ΅λ§μΌλ‘ μ λ ¬μ μννλ **λΉκ΅μ λ ¬** μ μνλ€.
- **λΆν  μ λ³΅ μκ³ λ¦¬μ¦**μ νλλ‘, νκ· μ μΌλ‘ **λ§€μ° λΉ λ₯Έ** μν μλ
- ν©λ³ μ λ ¬(merge sort)κ³Ό λ¬λ¦¬ ν΅ μ λ ¬μ λ¦¬μ€νΈλ₯Ό **λΉκ· λ±**νκ² λΆν νλ€.
- O(nlogn)
- λ°©λ²
  1. λ¦¬μ€νΈ μμ μλ ν μμλ₯Ό μ ννλ€. μ΄λ κ² κ³ λ₯Έ μμλ₯Ό νΌλ²(pivot) μ΄λΌκ³  νλ€.
  2. νΌλ²μ κΈ°μ€μΌλ‘ νΌλ²λ³΄λ€ μμ μμλ€μ λͺ¨λ νΌλ²μ μΌμͺ½μΌλ‘ μ?κ²¨μ§κ³  νΌλ²λ³΄λ€ ν° μμλ€μ λͺ¨λ νΌλ²μ μ€λ₯Έμͺ½μΌλ‘ μ?κ²¨μ§λ€.
  </br> (νΌλ²μ μ€μ¬μΌλ‘ μΌμͺ½: νΌλ²λ³΄λ€ μμ μμλ€, μ€λ₯Έμͺ½: νΌλ²λ³΄λ€ ν° μμλ€)
  3. νΌλ²μ μ μΈν μΌμͺ½ λ¦¬μ€νΈμ μ€λ₯Έμͺ½ λ¦¬μ€νΈλ₯Ό λ€μ μ λ ¬νλ€.
     - λΆν λ λΆλΆ λ¦¬μ€νΈμ λνμ¬ μν νΈμΆ μ μ΄μ©νμ¬ μ λ ¬μ λ°λ³΅νλ€.
     - λΆλΆ λ¦¬μ€νΈμμλ λ€μ νΌλ²μ μ νκ³  νΌλ²μ κΈ°μ€μΌλ‘ 2κ°μ λΆλΆ λ¦¬μ€νΈλ‘ λλλ κ³Όμ μ λ°λ³΅νλ€.
  4. λΆλΆ λ¦¬μ€νΈλ€μ΄ λ μ΄μ λΆν μ΄ λΆκ°λ₯ν  λκΉμ§ λ°λ³΅νλ€.
     - λ¦¬μ€νΈμ ν¬κΈ°κ° 0μ΄λ 1μ΄ λ  λκΉμ§ λ°λ³΅νλ€.
  
</div>
</details>

## π νμ λ ¬

<details>
<summary>:: π νμ΅λ΄μ© νμΈνκΈ° :: </summary>
<div markdown="1">

- μ΅λ ν νΈλ¦¬λ μ΅μ ν νΈλ¦¬λ₯Ό κ΅¬μ±ν΄ μ λ ¬μ νλ λ°©λ²
- λ΄λ¦Όμ°¨μ μ λ ¬μ μν΄μλ μ΅λ νμ κ΅¬μ±νκ³  μ€λ¦μ°¨μ μ λ ¬μ μν΄μλ μ΅μ νμ κ΅¬μ±νλ©΄ λλ€.
- O(nlogn)
- λ°©λ²
  1. μ λ ¬ν΄μΌ ν  nκ°μ μμλ€λ‘ μ΅λ ν(μμ  μ΄μ§ νΈλ¦¬ νν)μ λ§λ λ€.
     - λ΄λ¦Όμ°¨μμ κΈ°μ€μΌλ‘ μ λ ¬
  2. κ·Έ λ€μμΌλ‘ ν λ²μ νλμ© μμλ₯Ό νμμ κΊΌλ΄μ λ°°μ΄μ λ€λΆν° μ μ₯νλ©΄ λλ€.
  3. μ­μ λλ μμλ€(μ΅λκ°λΆν° μ­μ )μ κ°μ΄ κ°μλλ μμλ‘ μ λ ¬λκ² λλ€.
     
</div>
</details>

# λ¬Έμ 

---

## π μΉ λ¬΄ν΄

1. μΉ΄μ΄ν μ λ ¬ μ¬μ©
2. 7λͺλ§ μΆλ ₯
3. BufferedReader μ¬μ©

## π μ’νμ λ ¬νκΈ°2

1. comparator λ§λ€μ΄μ νμ΄μ£Όλ©΄λ©λλ€.
2. μ΅λͺν΄λμ€μ΄κΈ° λλ¬Έμ λλ€μμΌλ‘ μ€λ²λΌμ΄λ λ©μλλ₯Ό κ°λ¨νκ² κ΅¬νν΄μ€¬μ΅λλ€.

## π νλ³΅μ μΉμ

1. μ΄λ»κ² λ¬Άμ΄μ μ°¨μ΄λ₯Ό κ³μ°ν μ§ λ³΄λ€λ λμ΄ν΄μ μΌμ ν κ·μΉμ΄ λμ€λμ§ νμΈν΄λ³΄λ©΄ λ©λλ€.
2. μ²μμλ μμμ μ΄λ»κ² μΈμμΌν κΉ κ³ λ―Όνμ΅λλ€.
3. μ΅μλ₯Ό κ΅¬νλ κ²μ΄κΈ° λλ¬Έμ κ° μ«μκ° μ°¨μ΄λ₯Ό μ λ ¬ν©λλ€.
4. kλ¬Άμμμ kκ° μ»€μ§μλ‘ νκ° = νλ¬Άμμ΄ λ§μμ Έμ μ΅μ μ«μκ° μμμ§λλ€.
5. μ΄κ·μΉμ νμ©ν΄ kλ¬ΆμμΌ λ κ° μ«μκ° μ°¨μ΄λ₯Ό λν΄μ μΆλ ₯ν΄μ£Όλ©΄ λ©λλ€.

## π μνλ

1. κ°μ΄λ° μλ κ² κ°μ₯ ν¨μ¨μ μλλ€.
2. λ°°μ΄μ κ°μ΄λ° κ°μ μ μΆ ν΄μ£Όλ©΄ λ©λλ€.


