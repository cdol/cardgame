public final class GameManager {
    final int fact;

    public GameManager() 
    {
        fact = 5;
    }

    public int multWithConst(int a)
    {
        return a * fact;
    }

    public static int add(int a, int b)
    {
        return a + b;
    }

    public static void main(String[] args) 
    {
        GameManager app = new GameManager();
        System.out.println(app.multWithConst(5));
    }

}


//TODO: Klassen, Tests, Methoden, UserInput, toStr/Output;
