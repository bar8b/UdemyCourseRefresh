# 1. Operatory
## 1.1 == =  equals.

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

# 4. Overloading / Overridding

- **Overloading** - ta sama nazwa metody -> inne parametry. (odwołuje się to do polimorfismu javy)
  - **Stosowane do metod STATIC oraz INSTANCE.**
  - Overloaded methods...:
    - mogą zwracać inne typy parametrów
    - mogą mieć inne modyfikatory dostępu
    - mogą sprawdzać inne wyjątki
- **Overridding** - implementowana metoda z klasy nadrzędnej do klasy podrzędnej
  - **Stosowane tylko do metody INSTANCE.**
  - Metoda nadpisana ma taką samą nazwę i takie same argumenty,
  - Metody nadpisane można oznaczać znacznikiem @Override
  - Method Overriding (Runtime Polymorphism/Dynamic Mothod Dispatch)
  - Overrided methods...:
    - muszą zwracać ten sam typ parametru jak w parents class
    - nie moga mieć mniejszego dostępu (modyfikatory dostępu) niż w parents class
      tj. jeżeli w subklasie jest protected, to klasa podrzędna może być protected lub public.
    - nie mogą sprawdzać innych wyjątków niż w parent class
  - można nadpisywać metody tylko w subklasach
  - konstruktory (constructors), final methods i private methods nie mogą być nadpisywane.
  - 

# 5 Switch case:

**typ zmiennej w () nie może być double i long**

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
obiekty danej klasy miały jakąś część wspólną. Taką częścią może być właśnie jakaś 
wartość pola statycznego.

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
- Wywołanie w konstruktorze innych konstruktorów.
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

# 11. super() / super / this / this()

**Stosowane tylko w metodach instancji. Nie można używać ich w elementach static**

- this. - odwołuje się do pól klasy. Dzięki zastosowaniu w metodzie:
this.poleKlasy = poleMetody

Przypisujemy polu zadeklarowanej w klasie parametr zadeklarowany w metodzie o tej samej nazwie.

Stosuje się je dla parametrów i pól tej samej klasy.

- super. - wywoływanie metod klas nadrzędnych w klasie podrzędnej. 
Metody mają taką samą nazwę.

- this() stosowany do odwoływania się w konstruktorze do innego konstruktora tej samej klasy.
Musi być użyte, na początku konstruktora.

- super () ma podobne zastosowanie jak this().
Musi być użyte, na początku konstruktora.
Super pozwala się odwołać do konstruktora klasy nadrzędnej.

## super() vs. this() 

Super oraz this nie może być wywołane jednocześnie w tym samym konstruktorze.

Jeżeli nie odniesiemy się do konstruktora poprzez wywołanie super(), java domyślnie stworzy taki
konstruktor, odwołując się do klasy nadrzędnej.

Jeżeli klasa nadrzędna nie ma domyślnego konstruktora, wówczas trzeba specjalnie wywołać super()
konstruktorze, podając odpowiednie argumenty dla tego konstruktora.

# 12 Polimorfizm

jedna klasa sprawia ze obiekty tej klasy moga mieć różne postacie.   

# 13 toString ()

    class Main Extends Object{
        psvm(){
            Student max = new Student ("Max", 21);
            sout(max.toString());
        }   
    }
    class Student{
        private String name;
        private int age;
    
        Student (String name, int age){
            this.name = name;
            this.age = age;
        }
    }

When an instance is created, it's assigned  a hashCode, and that hashCode is what can
tell us if our multiple references,  are pointing to a single instance.
It's a mechanism for comparison, in other words. This really is like an address for a house,
which we talked about in our  examples, to explain the difference
between references and objects or instances. Anyway, this isn't what we want printed out,  
we really want to print out the  name and age of our student. 

W takim przypadku otrzymamy Student @65as776 gdzie @...jest "adresem" obiektu.
Aby wyświetlała się prawidłowa nazwa, należy do clasy student overrideować metodę toString() i ją zmodyfikować

    class Main Extends Object{
        psvm(){
            Student max = new Student ("Max", 21);
            sout(max.toString());
        }   
    }

    class Student{
        private String name;
        private int age;
    
        Student (String name, int age){
            this.name = name;
            this.age = age;
        }
        
        @Override
        public String toString (){
        return name + "is" + age;
        }
    }

Wówczas wyświetli się Max is 21. Nadpisywanie klas bez ich modyfikacji nie ma sensu.

# 14 Kopiowanie płytkie i głębokie (shallow copy / deep copy)

Klonowanie polega na stworzeniu nowego obiektu (nowej referencji) w oparciu, o istniejący już obiekt.
- W metodzie main, w której wywoływany jest metoda clone() musi znaleźć się - throws CloneNotSupportedException
- Klonowanie obiektów odbywa się za pomocą metody clone().
- Należy w klasie kolowanej zaimplementować interface Clonable i override metode wywoływaną przez ten interface.
- Domyślnie metoda clone() jest dostępna w obrębie pakietu, ale można zmienić modyfikator na public.
- Utworzony sklonowany obiekt będzie typu Object dlatego aby był typu obiektu, który klonowaliśmy, należy go rzutować:
  np. klonowanie punktu 1 i nadanie punktowi 2 typu klasu Punkt

    Punkt punkt2 = (Punkt) punkt1.clone();  

- **Płytkie kopiowanie obiektów**
Płytkie klonowanie sprawdz się w przypadku gdy klonujemy obiekt, w którym zadeklarowane są pola o prymitywnych typach.
Płytkie kopiowanie obiektów tworzy co prawda nowy obiekt i kopiuje pola, ale pola kopiuje jedynie na zasadzie
przepisania wartości pól typów prostych oraz przypisania tych samych referencji w przypadku pól typów obiektowych.
Nie występują żadne problemy, ponieważ przechowuje ona jedynie dwa pola typu int (typ prosty).
Jeżeli zostanie sklonowany obiekt, w którym zadeklarowane są pola typu Obiektowego, wówczas zaczną wyskakiwać błędy
wynikające z braku utworznoych nowych refentencji do pól obiektowych. 

- **Głebokie klonowanie**
Poprzez wpisanie innej deklaracji w nadpisanej metodzie Object w klonowanej klasie (Odcinek), zostaną sklonowane również
pola w obiektach typu obiektowego w niniejszej klasie. Aby to zostało zrobione należy w @ sklonować poszczególne pola klasy niżej:


    @Override
        public Object clone() throws CloneNotSupportedException {
            Odcinek odcinek = new Odcinek();
            Punkt pStart = (Punkt) this.getStart().clone();
            Punkt pKoniec =  (Punkt) this.getKoniec().clone();
            odcinek.setStart(pStart);
            odcinek.setKoniec(pKoniec);

             return odcinek;
     }

# 15 Formatowanie tekstu w kodzie:

- \t - tabulator
- \n - enter
- \" - cudzysłów w tekst
- \\ - ukośnik
- \u2022 - kropka(punktor)
- " " " - rozpoczęcie i zakończenie bloku tekstu (nie potrzebuje + i "")
- System.out.printf("Masz %d lat", age); - w miejsce %d wprowadzi wcześniej zadeklarowaną zmienną age;
  - 'f' - %f - stosowane do zmienno przecinkowych, 
  - 'd' - %d - stosowane do całkowitych
  - 'n' - %n - podobne działanie do \n 
  - %.2f - wyświetli dwa miejsca po przecinku
  - 'c' - %c - char
  - System.out.printf("Age = %d, Birth year = %d", age, yearOfBirth); <- działa to też tak
  - formattedString = "Your age is %d".formatted(age); <- działa to też tak

# 16 Kompozycja a dziedziczenie

Kompozycja oznacza, że "obiekt jest zawarty w innym obiekcie". 
Jest to relacja "całość – część" ( B "zawiera" A). Np. obiekty typu Pojazd zawierają obiekty typu Rozmiar, Koła, Silnik itd..
Kompozycję uzyskujemy poprzez definiowanie w klasie (np Pojazd )pól, które są obiektami istniejących klas (np. Koła, Rozmiar, Silnik).

Aby klasa dziedziczyła po klasie, należy przy deklaracji subklasy dodać "extends ... klasa nadrzędna".
Wówczas klasa podrzędna nabiera "umiejętności i cechy" wszystkich klas nadrzędnych.
Można dziedziczyć tylko z jednej klasy.

- kompozycja - działa na zasadzie "B HAS A"
- dziedziczenie - działa na zasadzie "B IS A"

# 17 Array vs ArrayList 

![](ArrayvsArayList2.jpg)
![](ArrayvsArayList1.jpg)
![](ArrayvsArayList.jpg)

# 18 Enum

Typ wyliczeniowy, który umożliwia zadeklarowanie ograniczonej liczby możliwości wartości
Immutable

    public enum Topping {

        MUSTARD, PICKLES, BACON, CHEDDAR, TOMATO;

        public double getPrice() {
            return switch (this) {
                case BACON -> 1.5;
                case CHEDDAR -> 1.0;
                default -> 0.0;
            };
        }
    }

Można w enumach tworzyć konstruktory, metody i pola.

# 19 Interfejsy

Jest to zbiór metod i pól, które musi implementować dana klasa.
Trzeba podczytać wszystkie metody do klasy w której implementowany jest interface.
Metody zadeklarowane w interfejsach są abstrakcyjne - nie ma definicji.
Interfejsy dają możliwość utworzenia zbioru cech które musi posiadać dany element,
ale ich realizaję można zastosować w różny sposób np: 
np interface Zwierze:

        public void ruszaSie();
        public void wydajeDźwięki();
        public void oddycha();

dla klas Pies i Ryba implementacja będzie zupełnie inna, pomimo że oba typy mają te same zdolności

Jeżeli zostanie stworzony interfejs np "Interfejs" i w innej klasie w
metodzie użyty zostanie taki zapis:

    public static void method (Interfejs interfejs){
    //linijka kodu
    }

to znaczy -> (Interfejs interfejs), że w tej metodzie mogą być uzyte tylko te obiekty,
które są instancją klasy implementującej dany interfejs.

Interfejsy mogą dziedziczyć po innych interfejsacvh, wówczas interfejs dziedziczący zawiera wszystkie metody z tych interfejsów.
Dziedziczenie oznaczane jest słowem kluczowym extends. 

## 1. Moc Interfejsów!!!

Dzięki zastosowaniu interfejsu w wielu klasach, później można np przeiterować po każdej z klas wywołując metody,
które są w nich zawarte: (Stworzony interfejs Informacje oraz klasy i obiekty tych klas robot i czałowie)

    Informacje informacje = new Informacje [] {robot , czlowiek};
    for (Informacje i : informacje){
        i.pokazInformacje();
    }
metoda pokażInformacje zostanie wykonana dla obu obiektów implementujących interfejs Informacje.

## 2. Moc Interfejsów!!!
Jeżeli stworzę metodę któa implementuje zmienną typu Interfejsu, wówczas z tej metody może skorzystać każdy obiekt klasy,
która implementuje interfejs.

    public static void metoda (Interfejs interfejs){}



# 20 Big O Notation
Notacja dużego o mówi nam nie ile czasu zajmie pewna operacja, 
ale jak ten czas się zmienia w zależności od ilości danych, na których pracujemy.

Przykład
Weźmy dla przykładu algorytm, który losuje liczbę z przedziału (a, b). Dla uproszczenia pomyślmy o tym jako o człowieku,
który z worka wszystkich możliwych liczb z tego przedziału wybiera jedną. Czy czas potrzebny na wybranie tej liczby 
zmieni się w zależności od tego czy w worku będzie 5, 50 czy 500000 liczb? Nie! Oznacza to, że algorytm ten działa
w czasie stałym, który oznaczamy jako O(1). A dlaczego O(1) a nie np. O(3) ? Ponieważ interesuje nas jedynie sposób,
w jaki ten czas rośnie, a nie sam czas. Jeśli jest stały, używamy po prostu jednostki, aby pokazać, że się nie zmienia.

Jako drugi przykład weźmy algorytm, który dla każdej liczby od zera do x wypisuje ją na konsoli. W zależności 
od wejścia (x w tym wypadku) nasz algorytm będzie musiał wykonać różną ilość operacji — w tym wypadku
dla każdej jednej liczby będzie to określona, stała liczba operacji (ponownie, nie ma znaczenia, czy będą to 
3 operacje czy 50, ważne, że jest to stała ilość). Dlatego algorytm ten ma złożoność obliczeniową O(n).

![](BigONotation.jpg)

# 21 Klasy zagnieżdżone-wewnętrzne -> Inner classes (nested)

Dobrym pomysłem użycia klas wewnętrznych jest sytuacja, w której klasa wewnętrzna nie ma sensu bez
klasy zewnętrznej i jest z nią ściśle związana np karta sieciowa-komputer.

Stosowanie klas wewnętrznych to lepsza enkapsulacja kodu (ukrywanie szczegółów działania klasy wewnątrz). 
Dzięki temu, że klasy wewnętrzne mają dostęp nawet do prywatnych zasobów klas otaczających, te drugie 
możemy bardziej „opakować”. Ukryć więcej szczegółów wewnątrz.

## Klasy zagnieżdżone statyczne
Klasy zagnieżdżone statyczne mają dostęp jedynie do statycznych pól klasy zewnętrznej.

    public class OuterClass2 {
        public static class InnerClass2 {
        }
    
        private InnerClass2 instantiate() {
            return new InnerClass2();
        }   
    }

Tworzenie instancji klasy wew:

    private static void staticInnerClassInstantiation() {
        OuterClass2 outerClass = new OuterClass2();
        OuterClass2.InnerClass2 instance1 = outerClass.instantiate();
        OuterClass2.InnerClass2 instance2 = new OuterClass2.InnerClass2();      //tu jest różnica!!!
    }

## Klasy zagnieżdżone niestatyczne 
Tworząc klasę wewnętrzną, do naszej dyspozycji są zarówno jej własne pola, jak i pola klasy zewnętrznej,
nawet jeśli są prywatne i nie posiadają metody dostępowej (działa to także w drugą stronę – z klasy zewnętrznej 
można sięgać do pól klasy wewnętrznej)

### Klasy wewnętrzne - "normalne"

    public class OuterClass {
        private String message = "Hello from outer class!";
        public class InnerClass {
            public void printMessage(){
            System.out.println(message);           
            }
        }
    
        public InnerClass instantiate() {
            return new InnerClass();
        }
    }

Tworzenie instancji klasy wew:

    private static void innerClassInstantiation() {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass instance1 = outerClass.instantiate();
        OuterClass.InnerClass instance2 = outerClass.new InnerClass();
lub po prostu:

        OuterClass.InnerClass innerClass = new outerClass.new InnerClass();
        innerClass.InnerClass();
    }

Klasy wewnętrzne zawierać mogą pola o takich samych nazwach, jak pola klasy zewnętrznej.
Rozwiązaniem problemu powielających się nazw może być użycie słowa this, które w przypadku
odwołania się do pola klasy zewnętrznej, należy poprzedzić jej nazwą:

    public class OuterClass {
        private String message = "Hello from outer class!";
        
        public class InnerClass {
            private String message = "Hello from inner class!";
            
            public void printMessage(){
                System.out.println(OuterClass.this.message);     //Hello from outer class!
                System.out.println(this.message);                //Hello from inner class!
            }
        }
    }

### Klasy lokalne
Zdefiniowana jest w ciele metody klasy zewnętrznej. Możemy je zdefiniować wewnątrz bloku 
(wewnątrz metody, bloku if itp.) i nie poprzedzają ich modyfikatory dostępu 
(public, private, protected).
Z poziomu klasy lokalnej mamy dostęp do pól klasy zewnętrznej oraz do zmiennych lokalnych metody,
w której są zagnieżdżone. W tym ostatnim przypadku zmienne muszą być jednak finalne 
(przed Javą 8 konieczne było jawne oznaczanie takich zmiennych jako final, 
od Javy 8 wystarczy, że są efektywnie finalne, czyli nie zmieniają wartości po tym, jak 
zostały raz zainicjalizowane).

    private static void localClassInstantiation(String[] args) {
        class LocalClass {
            @Override
            public String toString() {
            return "Argumenty metody: " + Arrays.toString(args);
            }
        }   
        LocalClass localClassInstance = new LocalClass();
        System.out.println(localClassInstance);
    }

### Klasy anonimowe 
Klasy anonimowe to klasy definiowane w kodzie, które mają dokładnie jedną instancję.
Klasa taka nie ma nazwy. W dalszej części kodu możemy już normalnie korzystać z utworzonej zmiennej. 
W klasach anonimowych, podobnie, jak we wcześniejszym przykładzie, można korzystać ze zmiennych klasy 
zewnętrznej oraz finalnych zmiennych metody, w której zdefiniowano klasę anonimową.

    public interface GreetingModule {
        void sayHello();
    }
    
    public void someMethod() {
        GreetingModule greeting = new GreetingModule() {
        @Override
            public void sayHello() {
                System.out.println("good morning");
            }
        };
    }

Klasa anonimowa implementować musi wszystkie metody interfejsu; może ona dodatkowo definiować własne pola lub metody.

    public interface Printer {
        public void print (String message);
    }
Implementacja interfejsu:

    Printer printerImpl = new Printer(){
        @Override
        public void print(String message);
            System.out.println(message);
        }
    };

Warto wspomnieć, że od Javy 8 takie proste implementacje w postaci klas anonimowych straciły na
znaczeniu, ponieważ mogą być zastępowane wyrażeniami lambda. Powyższy przykład można byłoby uprościć
np. do:

    Printer printerImpl = message -> System.out.println(message) 
lub

    Printer printerImpl = System.out::println;

# 22 Klasy abstrakcyjne

Jest to klasa tworząca pewien schemat ogólny, w której znajdują się metody abstrakcyjne (niezdefiniowane) i zwykłe metody
pełniące już jakieś swoje funkcje.

Klasa dziedzicząca po klasie abstrakcyjnej, musi nadpisać wszystkie abstrakcyjne metody i przypisać działanie w subklasie.
Obiekty subklasy mogą wywoływać metody klasy nadrzędnej tak jak w normalnym działaniu dziedziczenia.

Nie można utworzyć obiektu tej klasy.

## **Interface vs klasa abstrakcyjna**
|                                                            Klasa abstrakcyjna                                                            |                                                                                                                                              Interface                                                                                                                                               |
|:----------------------------------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------:|
| ogólny wzór który daje pewne funkcjonalności klasie dziedziczącej ale również definiuje jakie funkcjonalności musza być zpersonalizowane |                                                                                               daje zestaw metod jakie muszą być spersonalizowane dla każdego przypadku klasy implementującej interfejs                                                                                               |
 |                                             nie da się stworzyć obiektu klasy abstrakcyjnej                                              |                                                                                                                                 nie można stworzyć obiekt interfejsu                                                                                                                                 |  
|                                    trzeba nadpisać w klasie dziedziczącej  tylko metody abstrakcyjne                                     |                                                                                                                      trzeba nadpisać wszystkie metody w klasie implementującej                                                                                                                       | 
 |             użycie obiektu subklasy dziedziczącej po klasie abstrakcyjnej działa jak dziedziczenie w przypadku zwykłych klas             | 
|                                                          mogą mieć konstruktor                                                           |                                                                                                                                    nie mogą posiadać konstruktora                                                                                                                                    | 
 |                                        może posiadać zmienne składowe dziedziczone z innej klasy                                         |                                                                                                                         moze posiadać zmienne ale tylko public static final                                                                                                                          |
|                                         może mieć private i protected methods, nie tlyko public                                          |                                                                                                                                wszystkie metody interfejsu są public                                                                                                                                 |
|                                                       można dziedziczyć tylko jedną klasę (abstrakcyjną lub nie)                         |                                                                                                                        można implementować wiele interfejsów w jednej klasie                                                                                                                         |
|                                                                                                                                          |                                                                                                          od java 8 mogą być implementowane metody (posiadają swoją definicję w interfejsie)                                                                                                          |
|                                                                                                                                          |                                                                                                                               od java 9 mogą posiadam private methods                                                                                                                                |
|                                                                                                                                          | używa się go gdzy: <br/>- wiele niezwiązanych ze sobą klas używa jednej funkcjonalności np interface comparable i Clonable <br/>- chcemy spersonalizować zachowanie wybranego typu danych ale nie zwracasz uwagi na to, co będzie implementowało ten interface<br/>- chcesz oddzielić fukncjonalność |
|                                                                                                                                          |                                                                                                                                                                                                                                                                                                      |
|                                                                                                                                          |                                                                                                          

# ***Do ogarnięcia***
- java.time


# ***Pytania do zadania komuś mądremu!***
1. Jak działa HashMap?
2. W jaki sposób odwoływać się do obiektów bez referencji?
3. Czy jeżeli stworzę pętlę, która tworzy obiekty i nie stworze listy gdzie będą one zapisywane, 
to co się stanie z obiektami i jak je potem wywołać?
4. Po co tworzy się referencje do obiektu innego typu niż typ obiektu?
5. Po co definiuje się typ zmiennej referencji obiektu? 
6. po co definiuje się interfejs w klasie? 