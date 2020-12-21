package BT;

public class Programme {
    public static void main(String[] args) {
        Books[] booksList = new Books[10];
        Menus menus = new Menus();
        ProgrammingBook programmingBook1 = new ProgrammingBook("TDP123", "Lap Trinh", 12000, "Noname", "Java", "COIIOIOI");
        ProgrammingBook programmingBook2 = new ProgrammingBook("TDP123", "Lap Trinh", 13000, "Noname", "Java", "COIIOIOI");
        ProgrammingBook programmingBook3 = new ProgrammingBook("TDP123", "Lap Trinh", 14000, "Noname", "Java", "COIIOIOI");
        ProgrammingBook programmingBook4 = new ProgrammingBook("TDP123", "Lap Trinh", 15000, "Noname", "Java", "COIIOIOI");
        ProgrammingBook programmingBook5 = new ProgrammingBook("TDP123", "Lap Trinh", 16000, "Noname", "Java", "COIIOIOI");
        booksList[0] = programmingBook1;
        booksList[1] = programmingBook2;
        booksList[2] = programmingBook3;
        booksList[3] = programmingBook4;
        booksList[4] = programmingBook5;
        FictionBook fictionBook1 = new FictionBook("TDP1122", "Hoc Lap Trinh", 17000, "Noname", "Javalanguage", 5);
        FictionBook fictionBook2 = new FictionBook("TDP1122", "Hoc Lap Trinh", 17000, "Noname", "Javalanguage", 5);
        FictionBook fictionBook3 = new FictionBook("TDP1122", "Hoc Lap Trinh", 17000, "Noname", "Javalanguage", 5);
        FictionBook fictionBook4 = new FictionBook("TDP1122", "Hoc Lap Trinh", 17000, "Noname", "Javalanguage", 5);
        FictionBook fictionBook5 = new FictionBook("TDP1122", "Hoc Lap Trinh", 17000, "Noname", "Javalanguage", 5);
        booksList[5] = fictionBook1;
        booksList[6] = fictionBook2;
        booksList[7] = fictionBook3;
        booksList[8] = fictionBook4;
        booksList[9] = fictionBook5;
        System.out.println("Tong So Tien Trong Thu Vien Sach");
        menus.totalMoney(booksList);
        System.out.println("Tong So Sach Co Ten Java");
        menus.bookCount(booksList);
        System.out.println("Tong 5% Thu Vien");
        menus.percent(booksList);
    }
}
