package coursera.pattern.template;

/*
  * The template method is best used when you can generalize between two classes into a new superclass.
  * Think of it like another technique to use when you notice you have two separate classes with very similar functionality and order of operations.
  * You can choose to use a template method, so that changes to these algorithms only need to be applied in one place instead of two.
  * The template method would be within the superclass, and would therefore be inherited by the subclasses. Differences in algorithms would be done through calls
  * to abstract methods whose implementations are provided by the subclass. After using generalization, objects can be more effectively reused.
  * Inheritance allows functionality to be shared between classes, and enables clearer and more self-explanatory code.
*/

public abstract class PastaDish {
    final void makeRecipe() {
        boilWater();
        addPasta();
        addSauce();
        addProtein();
        addGarnish();
    }
    abstract void addPasta();
    abstract void addSauce();
    abstract void addProtein();
    abstract void addGarnish();
    private void boilWater() {
        System.out.println("Boiling water");
    }
}
