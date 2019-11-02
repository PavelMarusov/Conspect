import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello, word");
//        String name = "Tomy";
//        String name2 = "Sofi";
//        System.out.println(name + " " + name2);
//        System.out.println(name);
//        System.out.println(name2);
//        final String name3 = "PAsha";
//        System.out.println(name3);
//        System.out.println("___________________");
//        test();
//        int[] num = {5, 6, 4, 6, 3,};
//        System.out.println(num[4]);
//        for (int i = 0; i < num.length; i++) {
//            System.out.println(i);
//        }
//        System.out.println(multiply(2, 2.1) + multiply(3, 3.1));
//        System.out.println("_____________________");
//
//        for (int i = 9; i > 0; i--) {  /* for переводится пока, т.е пока 9 польше 0 цикл будет работать, если мы
//        инкрементируем цикл(I++, тогда меньшее на большее), если дикриментируем (I--, тогда большее на меньшее) иначе
//        цикл будет безконечным */
//
//
//            System.out.println(" 5 +" + " " + i + " = " + (5 + i));
//        }
//
//        System.out.println("_____________");
//        int rtn = 0;
//        while (rtn <= 10) { // whle переаодится если в скобках написано, если rtn равен 10 печатай F и значение rtn
//            System.out.println("f" + rtn);
//
//            rtn++;
//        }
//        System.out.println("_____________");
//        String str = "/"; // когда работаем с циклом вайл переменную создаем вне цикла
//        while (str.length() < 10) {
//            str = str + "."; // каждый последующий круг к значению переменной стр будет добавляться точка
//            System.out.println(str);
//
//        }
//        System.out.println("_____________");
//        int limit = 1; // на эту переменную будет ссылаться наша условная конструкция иф
//        while (true) { //  если запустить сразу то получим безконечный цикл, т.к слово всегда правда
//            System.out.println("Bye");
//            limit++;
//            if (limit == 10) { // эта конструкция нужна чтобы цикл  прерывался через 10 кругов
//                break;
//            }
//        }
//        System.out.println("_______________");
//        int[] someNum = {5, 6, 544, 522, 5633, 2566355, 566, 852, 4,};
//        for (int i = 0; i < someNum.length; i++) {
//            System.out.println(someNum[i]);
//
//            System.out.println("Privet");
//            if (i == 5) {
//                break;
//            }
//
//            System.out.println("Poka");
//
//        }

//        for (int i = 0; i < 5 ; i++) {
//            System.out.println(i);
//            for (int j = 0; j < 2 ; j++) {
//                System.out.println("Sveta");
//
//            }
//
//        }
        random();



    }
    public static int random(){
        int random = (int) ( Math.random() *5);
        System.out.println(random);
        return random;

    }

    public static void test() {
        String name = "Pasha";
        int age = 35;
        int temperatyre = 40;
        boolean isGood = true;
        if (temperatyre > 20) {
            System.out.println("Можно идти гулять.");

        } else if (age < 20) {
            System.out.println("Нельзя идти гулять");
        } else if (isGood) {
            System.out.println("Это хорошо");
        }

    }

    public static double multiply(int number1, double number2) {
        double result = number1 * number2;
        return result;
    }


}
