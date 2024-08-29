package cat;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.setName("AICat");
        cat.setBreeds("Persian");
        cat.setWeight(3.1);

        System.out.print(cat.getName()+"(이)가 ");
        cat.claw();

        System.out.print(cat.getName()+"(이)가 ");
        cat.meow();

        //System.out.printf("%s (이)가 %d Kg 입니다.",cat.getName(),cat.getWeight());

        System.out.printf("고양이 이름 : %s\n",cat.getName());
        System.out.printf("고양이 품종 : %s\n",cat.getBreeds());
        System.out.printf("고양이 무게 : %.1f kg\n",cat.getWeight());
    }
}