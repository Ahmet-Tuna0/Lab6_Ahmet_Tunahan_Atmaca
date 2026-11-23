public class Homework {

    /*


      Varsayimlar:
      - Singly Linked List: sadece 'head' referansina sahip
      - Doubly Linked List: 'head' ve 'tail' referanslarina sahip
      - Stack (bagli liste ile): 'top' referansina sahip
      - Queue (bagli liste ile): 'front' ve 'rear' referanslarina sahip
      - Tum yapilarda baslangicta n eleman var ve islemler tek tek yapiliyor.


      A. OPERATION COMPLEXITY ANALYSIS

      Operation                | Singly LL | Doubly LL | Stack   | Queue

      Insert at beginning      | O(1)      | O(1)      | O(1)    | O(1)*
      Insert at end            | O(n)      | O(1)      | O(n)    | O(1)
      Delete from beginning    | O(1)      | O(1)      | O(1)    | O(1)
      Delete from end          | O(n)      | O(1)      | O(n)    | O(n)*
      Access the middle element| O(n)      | O(n)      | O(n)    | O(n)
      Search for a value       | O(n)      | O(n)      | O(n)    | O(n)
      Peek at first/top element| O(1)      | O(1)      | O(1)    | O(1)

     Notlar:
      - Stack ve Queue temel arayuz islemleri (push/pop/peek, enqueue/dequeue) O(1)'dir;
        ancak yapinin ortasina/sonuna/baska ucuna erisme veya silme gerekiyorsa O(n) olur.


      B. SCENARIO ANALYSIS


      Scenario 1: Bastan sik ekleme ve bastan sik silme
      - Secilecek veri yapisi: Singly Linked List (veya Stack)
      - Karmasikliklar:
        * Bastan ekleme: O(1)
        * Bastan silme:  O(1)
        * Aciklama: head (veya top) referansi dogrudan guncellenir.

      Scenario 2: Muzik calmali liste (ileri/geri gecis ve sondan sik silme)
      - Secilecek veri yapisi: Doubly Linked List
      - Neden Singly Linked List'ten daha uygun?
        * Her dugumde next ve prev isaretcileri oldugu icin ileri/geri gidilebilir.
        * tail isaretcisi sayesinde son dugume dogrudan erisilir ve prev ile
        yeni son dugum hizlica bulunur.
       - Sondan silme karmasikligi:
       * Doubly Linked List: O(1)
       * Singly Linked List: O(n) (sondan bir onceki dugumu bulmak icin gezilir)

      Scenario 3: Yazici kuyrugu (ilk gelen is once basilacak)
      - Secilecek veri yapisi: Queue (FIFO - First-In, First-Out)
      - Ekleme ve silme karmasikliklari:
        * Ekleme (enqueue):  O(1)
        * Silme (dequeue):   O(1)
      - Stack neden uygun degil?
        * Stack LIFO calisir; en son gelen belge once basilirdi ve ilk gelen
          belgeler siranin en sonunda kalirdi.

      C. SEQUENCE ANALYSIS
      Baslangic listesi: (Head) 10 -> 20 -> 30 -> 40 -> 50 -> null
      Onemli: 'tail' isaretcisi YOKTUR!

      Sirali islemler:
      1. Insert 5 at the beginning
      2. Insert 60 at the end
      3. Delete the node containing 30
      4. Search for 40
      5. Delete the last node
      6. Access the middle element

      a. Her islemin zaman karmasikligi:
         1) Insert 5 at beginning:  O(1) -> head onune baglanir, head guncellenir.
         2) Insert 60 at end:        O(n) -> tail olmadigi icin sona kadar gidilir.
         3) Delete node 30:          O(n) -> 30'u ve onceki dugumu bulmak icin taranir.
         4) Search for 40:           O(n) -> dogrusal arama ile dugumler gezilir.
         5) Delete last node:        O(n) -> sondan bir onceki dugume kadar gidilir.
         6) Access middle element:   O(n) -> ortadaki dugume ulasmak icin gezilir.

       b. Hangi islemler listede gezinme (traversing) gerektirir?
         - 1. islem (basa 5 ekleme) HARIC tum islemler (2, 3, 4, 5 ve 6) gezinme gerektirir.

      c. head ve tail referansli Doubly Linked List olsaydi sondan silme nasil degisirdi?
         - Zaman karmasikligi O(n)'den O(1)'e duserdi; tail dogrudan son dugumu gosterir.

      d. Liste 5 yerine 10.000 eleman icerseydi hangileri daha maliyetli olurdu?
         - O(n) olan tum islemler (sona ekleme, 30'u silme, 40'i arama, son dugumu silme,
           ortadaki elemana erisme) 10.000 adima kadar cikabilecegi icin cok daha maliyetli
           olurdu. Sadece basa ekleme (1. islem) O(1) olarak ayni kalirdi.

     */

}
