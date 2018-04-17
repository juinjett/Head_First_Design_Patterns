package templateMethod;

public class BeverageTestDrive {
    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Tea tea = new Tea();

        coffee.prepareRecipe();
        tea.prepareRecipe();

        CaffeineBeverageWithHook coffee2 = new Coffee();
        coffee2.prepareRecipe();
    }
}
