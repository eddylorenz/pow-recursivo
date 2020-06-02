package com.bankaya;


public class Main {

    private static int recursiveCounter;
    private static int recursiveExponent;
    private static int recursiveCollector;
    static final int EXPONENT_CERO = 0;
    static final int EXPONENT_CERO_RULE = 1;

    public static void main(String[] args) {
        System.out.println("Base proporcionada: " + args[0]);
        System.out.println("Exponente proporcionado: " + args[1]);
        System.out.println("Resultado POW (recursividad): " + customPow(Integer.valueOf(args[0]), Integer.valueOf(args[1])) );
    }

    public static long customPow(int base, int exponent){
        long result = 0;
        int i;
        recursiveCounter = 1;
        recursiveExponent = exponent;
        recursiveCollector = 0;
        if (exponent == EXPONENT_CERO){
            result = EXPONENT_CERO_RULE;
        } else {
            result = base;
            for (i=1; i<exponent;i++){
                result = recursivePlus(result, base);
            }
        }
        return result;
    }

    public static Long recursivePlus(long sumatory, int base){
         base = base - 1;
        if (base > 0){
            sumatory = sumatory + sumatory;
            sumatory = recursivePlus(sumatory, base);
        }
        return sumatory;
    }
}
