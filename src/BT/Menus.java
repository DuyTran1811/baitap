package BT;

public class Menus {

    public void totalMoney(Books[] booksList) {
        var total = 0;
        for (var index : booksList) {
            total += index.getPrice();
        }
        System.out.println(total);
    }

    public void bookCount(Books[] booksList) {
        var totalBook = 0;
        for (var index : booksList) {
            if (index instanceof ProgrammingBook) {
                ((ProgrammingBook) index).getFramework().equals("Java");
                totalBook++;
            }
        }
        System.out.println(totalBook);
    }

    public void percent(Books[] booksList) {
        var total = 0;
        for (var index : booksList) {
            if (index instanceof FictionBook) {
                total += ((FictionBook) index).setDiscount(5);
            }
        }
        System.out.println(total);
    }
}
