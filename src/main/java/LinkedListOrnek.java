//LinkedList kod örneği
import java.util.LinkedList;
public class LinkedListOrnek {
	public static void main(String[] args) {
	LinkedList<String> bagliListem = new LinkedList<String>();
	bagliListem.addFirst("A");
	bagliListem.add("B");
	bagliListem.add("C");
	bagliListem.add("D");
	bagliListem.add(2, "K"); //2. indekse K harfini ekledim
	bagliListem.addLast("Z");

	System.out.println("Listedeki elemanları silmeden önceki hâli");
	System.out.println(bagliListem);

	bagliListem.remove();
	bagliListem.removeLast();
	bagliListem.remove("C");

	System.out.println("Listedeki elemanları sildikten sonraki hâli");
	System.out.println(bagliListem);
	System.out.println("Bağlı listedeki ilk eleman: "+ bagliListem.getFirst());
	System.out.println("Bağlı listedeki son eleman: "+ bagliListem.peekLast());
	}
}
