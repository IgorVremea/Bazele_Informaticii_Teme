package tema7.task2;
// O carte este caracterizata printr-un numar de pagini. Spunem ca doua carti sunt
// identice daca acestea au acelasi numar de pagini. Creati clasa Carte si atasati-i o
// metoda potrivita pentru compararea a doua carti. Apelati metoda care realizeaza
// compararea a doua carti ıntr-o metoda main.
public class Book {
    private int numOfPages;
    public Book(int numOfPages){
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book){
            return ((Book)obj).numOfPages == this.numOfPages;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book(200);
        Book b2 = new Book(300);

        if(b1.equals(b2)){
            System.out.println("Carti sunt identice");
        } else {
            System.out.println("Carti NU sunt identice");
        }
    }
}
