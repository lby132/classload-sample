package me.whiteship;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        final ClassLoader classLoader = App.class.getClassLoader();
        System.out.println("classLoader = " + classLoader);
        System.out.println("classLoader.getParent = " + classLoader.getParent());
        System.out.println("classLoader.getParent.getParent = " + classLoader.getParent().getParent());

    }
}
