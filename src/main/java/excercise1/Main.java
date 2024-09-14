package excercise1;

public class Main {
    public static void main(String[] args) {
        Singers mina = new Singers();

        mina.printSinger();

        mina.setId(301083944);
        mina.setName("Mina Choi");
        mina.setAddress("2333 danforth ave");
        mina.setBirthday("1993-07-17");
        mina.setAlbumsCount(2);

        mina.printSinger();
    }
}
