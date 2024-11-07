import structural_patterns.StructuralPatterns;

public class SPProgram {

    public static void main(String[] args) {

        System.out.println("\n---------------------- PROXY PATTERN ------------------\n");
        StructuralPatterns.proxyDemo();

        System.out.println("\n---------------------- Decorator PATTERN ---------------\n");
        StructuralPatterns.decoratorDemo();

        System.out.println("\n---------------------- Adapter PATTERN -----------------\n");
        StructuralPatterns.adapterDemo();

        System.out.println("\n---------------------- Facade PATTERN ------------------\n");
        StructuralPatterns.facadeDemo();

        System.out.println("\n---------------------- FlyWeight PATTERN ----------------\n");
        StructuralPatterns.flyWeightDemo();

        System.out.println("\n---------------------- Composite PATTERN ----------------\n");
        StructuralPatterns.compositeDemo();

        System.out.println("\n---------------------- Bridge PATTERN -------------------\n");
        StructuralPatterns.bridgeDemo();
    }
}