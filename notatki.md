# 1. Operatory
## 1.1 **==** **=**  **equals**.

- dla zmiennych liczbowych
int linia = 50;
if (linia == 50){   
    \\dla wartości liczbowych musi być ==
    ...
}

- dla zmiennych logicznych
boolean linia = false;
if (linia = true){   
    \\**=** oznacza przypisanie zmiennej nowej warości -> "zmienna od teraz = true". 
    \\**==** będzie oznaczać "jeżeli linia = true, to zrób to i tamto" 
}

## 1. 2 Ternary operand -> boolean y = x ? true : false (potrójnuy operator)
Stosowane dla wszystkich rodzajów zmiennych ale obie zmienne byszą być tego samego typu

boolean *samochód* = false;

boolean *rower* = *samochód* ? true : false;

- *samochód* jest wartością którą testujemy.
- po ? (true) - jest wartością którą przypiszemy wartości testowanej (*samochód*) jeżeli ma wartość true.
- po : (false) - jest wartością jaką przypiszemy jeżeli wartość testowanej(*samochód*) ma wartość false.

# 2. pętla IF 

Jeżeli nie napiszemy {}, to wg zasad określonych w pętli, wykona sie pierwsza linija kodu zaraz po zainicjalizowaniu pętli: 

int score = 50;
if (score == 50)
System.out.println("to się wykona");

System.out.println("to się wykona niezależnie od pętli")

# 3. Metody

można nie podawać wartości a jeżeli to boolean. Jeżeli wartość a = true to wykona się return z:

public static int calculate(int a, int b){
    if(a){
        return z;
    }
    return y;
}

jeżeli a == true to metoda zakończy działanie na "return z". jeżlei a == false to wyświetli się "return y"

# 4. Overloaded / overridden

- Overloaded - ta sama nazwa metody -> inne parametry
- Overridden - implementowana przez inne klasy z znacznikiem @Overriden

# 5 Switch case:

**nie może być double i long**

    **switch **               vs.       **switch statement**

    switch (value){                     switch (value){
    case x:                             case x -> code for x;
        // code for x;                  case y -> code for y;
        break;                          case 1, 2, 3 -> {
    case y:                                     System.out.println("Was a 3, a 4 or  a 5");
        //code for y                            System.out.println("It was a" + value);
        break;                          }
    case 1: case 2: case 3:             default -> code for resst;
        //code for three cases;         }
        brak;
    default:
        //code for resst;
        break;
    }
 
dla String można używać:
    return      lub     **yield**
    -> "1st";    /      -> {yield "1st"}

    switch (month){
        case "January";
        case "February";
        case "March";
            return "1st"; / {yield "1st"}
    }
return "bad"; -> jeżeli chcemy zwrócić z metody 

**Switch statement**

    switch (month) {
        case "January", "February", "March" -> "1st"; //  {yield "1st"}
        default -> "bad"
    }

# 6. Identyfikatory dostępu 
- Class:
  - public - any other class in any package can access this class
  - protected - dla class brak
  - private - dla class brak
  - none - tzw. package access - class is accessible only to classes in the same package
- Methods / variables:
  - public - any other class in any package can access this class
  - protected - allows classes in the same package, and any subclasses in other packages to have access to the member
  - none - tzw. package access - class is accessible only to classes in the same package
  - private - no other class can access this member.
  
# 7. Enkapsulacja
- Zdolność chowania pól i metod przed publicznym dostępem - gettery i settery
- Building of behavior and attributes on a single object

# 8. słowo kluczowe STATIC

- Static sprawia, że nadane pole będzie przypisane do klasy, a nie do danej instacji (obiektu) tej klasy.
sprawia, że coś jest wspólne dla wszystkich obektów tej klasy.
- jeżeli zmieni się parametr static, w jednej instancji, to zmieni się on również w pozostałych.

- Może to być przydatne np w sytuacji, gdy wiemy i chcemy zrobić tak, żeby wszystkie
obiekty danej klasy miały jakąś część wspólną.
Taką częścią może być właśnie jakaś wartość pola statycznego.

  - Pola Statyczne:

      Pola statyczne różnią się od pól instancji (obiektów) tym, że są one współdzielone 
  przez wszystkie obiekty tej klasy, tzn. przynależą one do całej klasy, a nie konkretnie utworzonego obiektu.
  używane najczęściej do przechowywania "counters", stałych jak np PI, tworzenia i kontrolowania
  dostępu do źródeł.

  - Metody statyczne (te przypisane do klasy) nie mogą korzystać z pól i metod niestatycznych (tych przypisanych 
  tylko do konkretnego obiektu).

      Wszystkie obiekty klasy mają dostęp do pól i metody statycznych. Mało tego – do pól i 
  statycznych mamy dostęp nawet wtedy, gdy nie utworzymy żadnego obiektu klasy. 
  Wartości pól statycznych są współdzielone przez wszystkie obiekty klasy – w przeciwieństwie 
  do pól niestatycznych (instancji), których własne egzemplarze ma każdy obiekt klasy, pola 
  statyczne są tworzone jako pojedyncze wartości/obiekty.

      Metody statyczne mają dostęp jedynie do metod i pól, które także są statyczne. 
  Nie mogą one odnosić się do niestatycznych pól – nie operują one na konkretnych obiektach 
  klasy, lecz w kontekście całej klasy – nie mają one dostępu do obiektu this, który wskazuje 
  na obiekt, na rzecz którego metoda została wywołana.

      Zobaczymy teraz przykłady każdej z powyżej opisanych cech pól i metod statycznych.

          public class PrzykladStatic {
              private int poleInstancji;
    
              private static int poleStatyczne = 5;
    
              public PrzykladStatic(int poleInstancji) {
                  this.poleInstancji = poleInstancji;
              }
    
              public static void main(String[] args) {
                  System.out.println("Pole statyczne (przez klase): " +
                      PrzykladStatic.poleStatyczne // 1
                  );
                  PrzykladStatic obiekt1 = new PrzykladStatic(10);
                  System.out.println("Pole statyczne (przez obiekt1): " +
                      obiekt1.poleStatyczne // 2
                  );
              }
          }
    - Metoda Static 
  Jeżeli definiujesz metodę, która jest bezstanowa, czyli nie musisz się w niej odwoływać do pól obiektu, 
  to możesz ją zdefiniować jako metodę statyczną. Przykładowo, jeżeli tworzymy metodę, która ma sumować dwie liczby, 
  to najlepiej będzie ją zdefiniować właśnie jako statyczną. Metoda taka ma jasne wejście, np. dwie 
  liczby i wyjście, czyli wynik sumowania.

          class Calc {
             static int sum(int a, int b) {
                return a + b;
             }
          }
Dzięki temu, że metoda jest statyczna, to w celu jej wywołania, nie musimy tworzyć obiektu:

        class CalcTest {
            public static void main(String[] args) {
                int sum = Calc.sum(5, 10);
                System.out.println("Suma: " + sum); //15
            }
        }

Gdyby metoda nie była statyczna, to musielibyśmy to zapisać tak:

        class CalcTest {
            public static void main(String[] args) {
                Calc calc = new Calc();
                int sum = calc.sum(5, 10);
                System.out.println("Suma: " + sum); //15
            }
        }

# 9. Konstruktor (pckage b_inheritance -> Ex1_bankAccount)
- służy do przypisania parametrów obiektu klasy,
- używany przy tworzeniu obiektu - instancja klasy np:
    Class obiekt = new Class (parametr 1, parametr 2);
- nazwa ta sama co nazwa klasy,
- nie zwraca żadnych wartości,
- jezeli nie ma zadeklarowanego konstruktora, to tworzony
jest default constructor,
- liczba parametrów, ich kolejnosć lub typ w nadpisywanych konstruktorach musi się różnić.

## 9.1 Constructor chaining - łańcuch konstruktorów
- Wywołanie w konstruktorze overloaded constructor
- można wywołać konstruktor tylko za pomocą innego konstruktora,
- nalezy użyć this(innyConstruktor), aby wywołać inny construktor jako parametr,
- this musi być pierwszym wymaganym elementem, jeżeli używamy z innego contruktora np:
            `public bankAccount(){
                this("0000",2.5,"default Name",
                    "default email", "default phone number");
                System.out.println("Empty constructor");
            }`

# 10. POJO - Plain Old Java Object (bean/JavaBean)

- posiada tylko pola instancji
- służy do przechowywania danych i podawania ich między kolejnymi klasami
- zazwyczaj ma mało o ile jakiekolwiek metody nie będące getterami i setterami
- A JavaBean is just POJO, with some extra rules applied to it
- A POJO is sometimes calles an Entity, because it mirrors database entieties,
- Another acronim is DTO, for Data Transfer Object. it's an object that can be modeled as just data.

## 10.1 The Records - immytable

Tworzy POJO - bez definiowania jego zawartości: 

`public record RecordStudent(String id, String name, String dateOfBirth, String classList) {
}`

Poprzez zadeklarowanie pól w nawiasach, Records sam tworzy ciało, ale nie pokazując go tj 
- pole final dla każdego komponentu z nawiasu
- metody dające dostęp do danych, w nazwie nie ma getName wystarczy name  
- metodę toString().

Różnica między POJO a Record:
- recordów nie da się modyfikować - są immutable.

# 11. super() / this. / this()

- This - odwołuje się do pól klasy. Dzięki zastosowaniu w metodzie:
this.poleKlasy = poleMetody

przypisujemy polu zadeklarowanej w klasie parametr pola zadeklarowanego w metodzie 

- this() stosowany do odwoływania się w konstruktorze do innego konstruktora, opisane w 9.1

- super () ma podobne zastosowanie jak this().
Super pozwala się odwołać do konstruktora klasy nadrzędnej.

## super() vs. this() 

Super oraz this nie może być wywołane jednocześnie w tym samym konstruktorze.
Super oraz this nie może być wywołane jednocześnie w tym samym konstruktorze.

Jeżeli nie odniesiemy się do konstruktora poprzez wywołanie super(), java domyślnie stworzy taki
konstruktor, odwołując się do klasy nadrzędnej. 

Jeżeli klasa nadrzędna nie ma domyślnego konstruktora, wówczas trzeba specjalnie wywołać super() w każdym
konstruktorze, podając odpowiednie argumenty dla tego konstruktora.


# 12 Polimorfizm

jedna klasa sprawia ze obiekty tej klasy moga mieć różne postaci.   